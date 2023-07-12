package file;

public class ComputerFile {
    String name;
    double size;
    String extension;
    boolean isOpen;
    String contents;

    public ComputerFile(String name, double size, String extension) {
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.contents = "";
        this.isOpen = false;
    }

    public void open() {
        if (!isOpen) {
            this.isOpen = true;
        } else {
            System.out.println("File already opened!");
        }
    }

    public void close() {
        if (isOpen) {
            this.isOpen = false;
        } else {
            System.out.println("File already closed!");
        }
    }

    public String edit(String content) {
        this.contents = content;
        return this.contents;
    }

    public boolean checkState() {
        if (isOpen) {
            return true;
        } else {
            return false;
        }
    }
}
