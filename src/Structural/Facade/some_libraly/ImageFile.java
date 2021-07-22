package Structural.Facade.some_libraly;

public class ImageFile {
    private final String fullName;
    private final String name;
    private final String fileType;

    public ImageFile(String fullName) {
        this.fullName = fullName;
        this.name = fullName.split("\\.")[0];
        this.fileType = fullName.substring(fullName.indexOf(".") + 1);
    }

    public String getFullName() {
        return fullName;
    }

    public String getName() {
        return name;
    }

    public String getFileType() {
        return fileType;
    }
}
