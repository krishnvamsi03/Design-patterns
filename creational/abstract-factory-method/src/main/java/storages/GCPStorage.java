package storages;

public class GCPStorage implements Storage {
    private int size;

    public GCPStorage(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
