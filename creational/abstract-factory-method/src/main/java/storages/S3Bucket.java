package storages;

public class S3Bucket implements Storage {

    private int size;

    public S3Bucket(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
