package Structural.Facade.some_libraly;

public class FindOutType {
    public static ImageType extract(ImageFile imageFile) {
        String type = imageFile.getFileType();
        if(type.equals("jpeg")) {
            System.out.println("FindOutType: Извлечение jpeg файла . . .");
            return new JpegType();
        } else {
            System.out.println("FindOutType: Извлечение gif файла . . .");
            return new GifType();
        }
    }
}
