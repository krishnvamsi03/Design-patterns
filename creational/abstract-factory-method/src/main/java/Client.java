import instances.Instance;
import storages.Storage;

public class Client {
    private static ResourceCreatorFactory factory;

    public Client(ResourceCreatorFactory factory) {
        this.factory = factory;
    }

    public Instance createInstance(Instance.CAPACITY capacity, int size) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(size);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        Client aws = new Client(new AWSResourceFactory());
        var awsI = aws.createInstance(Instance.CAPACITY.MICRO, 10000);
        awsI.start();
        Thread.sleep(100);
        awsI.stop();

        Client gcp = new Client(new GCPResourceFactory());
        var gcpI = gcp.createInstance(Instance.CAPACITY.LARGE, 10000);
        gcpI.start();
        Thread.sleep(100);
        gcpI.stop();
    }
}
