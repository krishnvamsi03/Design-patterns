import instances.GCPCloudEngine;
import instances.Instance;
import storages.GCPStorage;
import storages.Storage;

public class GCPResourceFactory implements ResourceCreatorFactory {
    @Override
    public Instance createInstance(Instance.CAPACITY capacity) {
        return new GCPCloudEngine(capacity);
    }

    @Override
    public Storage createStorage(int size) {
        return new GCPStorage(size);
    }
}
