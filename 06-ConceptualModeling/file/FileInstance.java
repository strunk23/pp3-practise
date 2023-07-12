package file;

public class FileInstance extends ComputerFile {
    String path;
    String state;
    boolean permissionRequired;
    public FileInstance(String name, double size, String extension, String path, boolean permissionRequired) {
        super(name, size, extension);
        this.path = path;
        this.permissionRequired = permissionRequired;
        if (checkState()) {
            this.state = "Open";
        } else {
            this.state = "Closed";
        }
    }

    public void changePath(String newPath) {
        this.path = newPath;
    }

    public void displayInfo() {
        String info = String.format("File: %s%s, size: %f, path: %s", name, extension, size, path);
        System.out.println(info);
    }
}
