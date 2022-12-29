import instances.Instance;
import storages.Storage;

public interface ResourceCreatorFactory {

    Instance createInstance(Instance.CAPACITY capacity);
    Storage createStorage(int size);
}
