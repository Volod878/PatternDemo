package Structural.Facade.some_libraly;

public class GifType implements ImageType {
    public String type = "gif";

    @Override
    public String getType() {
        return type;
    }
}
