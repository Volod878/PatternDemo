package Structural.Facade.some_libraly;

public class JpegType implements ImageType {
    public String type = "jpeg";

    @Override
    public String getType() {
        return type;
    }
}
