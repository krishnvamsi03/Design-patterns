import java.util.List;

public interface File {

    String getName();

    String getSize();

    void ls();

    void addFile(File file);

    void removeFile(File file);

    List<File> getFiles();
}
