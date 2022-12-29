public class FileSystem {

    public static void main(String[] args) {
        File file1 = new BinaryFile("file1", "10");
        File file2 = new BinaryFile("file2", "20");
        Directory dir = new Directory("root");
        dir.addFile(file1);
        dir.addFile(file2);

        File file3 = new BinaryFile("File 3", "40");
        File file4 = new BinaryFile("File 4", "50");

        Directory dir1 = new Directory("subroot");
        dir1.addFile(file3);
        dir1.addFile(file4);

        System.out.println("Sub root size " + dir1.getSize());

        dir.addFile(dir1);
        System.out.println("** print sub root **");
        dir1.ls();
        System.out.println("** printing root **");
        dir.ls();
    }
}
