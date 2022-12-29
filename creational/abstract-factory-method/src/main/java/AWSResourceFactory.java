import instances.Ec2Instance;
import instances.Instance;
import storages.S3Bucket;
import storages.Storage;

public class AWSResourceFactory implements ResourceCreatorFactory{

    @Override
    public Instance createInstance(Instance.CAPACITY capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int size) {
        return new S3Bucket(size);
    }
}
