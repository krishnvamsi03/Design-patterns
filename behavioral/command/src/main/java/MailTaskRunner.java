import java.util.LinkedList;
import java.util.List;

public class MailTaskRunner implements Runnable {

    private Thread runner;

    private volatile boolean stop;

    private List<Command> pendingCommands;

    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static MailTaskRunner getInstance() {
        return RUNNER;
    }

    private MailTaskRunner() {
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    @Override
    public void run() {

        while (true) {
            Command cmd = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        System.out.println("waiting for commands");
                        pendingCommands.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted exception");
                        if (stop) {
                            return;
                        }
                    }
                } else {
                    cmd = pendingCommands.remove(0);
                }
            }
            if (cmd == null) {
                return;
            }
            cmd.execute();
        }

    }

    public void addCommands(Command cmd) {
        synchronized (pendingCommands) {
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void stopRunner() {
        stop = true;
        runner.interrupt();
    }
}
