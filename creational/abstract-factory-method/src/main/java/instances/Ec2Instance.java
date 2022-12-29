package instances;

import storages.Storage;

public class Ec2Instance implements Instance {

    private CAPACITY capacity;
    private Storage storage;

    public Ec2Instance(CAPACITY capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Starting ec2 instance of " + capacity + " " +
                "capacity");
    }

    @Override
    public void stop() {
        System.out.println("Stopping ec2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attaching storage of size " + storage.getSize());
        this.storage = storage;
    }
}
