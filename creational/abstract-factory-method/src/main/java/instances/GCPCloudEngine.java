package instances;

import storages.Storage;

public class GCPCloudEngine implements Instance {
    private CAPACITY capacity;
    private Storage storage;

    public GCPCloudEngine(CAPACITY capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Starting gcp cloud engine with " + capacity + " " +
                "capacity");
    }

    @Override
    public void stop() {
        System.out.println("Stopping gcp cloud");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attaching storage of size " + storage.getSize());
        this.storage = storage;
    }
}
