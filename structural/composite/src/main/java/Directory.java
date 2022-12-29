import java.util.LinkedList;
import java.util.List;

public class Directory implements File {
    private List<File> children;
    private String name;

    public Directory(String name) {
        this.name = name;
        this.children = new LinkedList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        int sum = 0;
        for (File file : children) {
            sum += Integer.parseInt(file.getSize());
        }
        return String.valueOf(sum);
    }

    @Override
    public void ls() {
        System.out.println(getName() + "/" + "size is " + getSize());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public void removeFile(File file) {
        children.remove(file);
    }

    @Override
    public List<File> getFiles() {
        return children;
    }
}
