public class CommandMain {

    public static void main(String[] args) throws InterruptedException {
        EWSService service = new EWSService();
        Command c1 = new AddMemberCommand("c1", "contactGroup", service);
        Command c2 = new AddMemberCommand("c2", "contactGroup2", service);

        System.out.println("*** adding commands to list ***");
        MailTaskRunner.getInstance().addCommands(c1);
        MailTaskRunner.getInstance().addCommands(c2);

        Command c3 = new RemoveMemberCommand("c3", "spam", service);

        MailTaskRunner.getInstance().addCommands(c3);

        Thread.sleep(5000);

        MailTaskRunner.getInstance().stopRunner();
    }
}
