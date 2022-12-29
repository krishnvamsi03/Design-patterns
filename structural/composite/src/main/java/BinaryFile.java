import java.util.List;

public class BinaryFile implements File {
    private String name;
    private String size;

    public BinaryFile(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void ls() {
        System.out.println(name + " " + size);
    }

    @Override
    public void addFile(File file) {
        throw new IllegalArgumentException("add file is not supported for " +
                "file");
    }

    @Override
    public void removeFile(File file) {
        throw new IllegalArgumentException("remove file is not supported for " +
                "file");
    }

    @Override
    public List<File> getFiles() {
        throw new IllegalArgumentException("get files is not supported for " +
                "file");
    }
}
