package Structural.Facade.some_libraly;

public class ImageConverter {
    public static ImageFile read(ImageFile file, ImageType type) {
        System.out.println("ImageConverter: чтение файла . . .");
        return file;
    }

    public static ImageFile convert(ImageFile buffer, ImageType newType) {
        System.out.println("ImageConverter: запись файла . . .");
        return new ImageFile(buffer.getName() + "." + newType.getType());
    }
}
