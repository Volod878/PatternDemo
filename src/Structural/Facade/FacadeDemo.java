package Structural.Facade;

import Structural.Facade.some_libraly.ImageFile;

public class FacadeDemo {
    public static void main(String[] args) {
        ImageFile file = new ImageFile("picture.jpeg");
        System.out.println("Имя файла до конвертации: " + file.getName());
        System.out.println("Расширение файла до конвертации: " + file.getFileType());
        System.out.println();

        ConversionFacade conversionFacade = new ConversionFacade();
        file = conversionFacade.convertImage(file.getFullName(), "gif");

        System.out.println();
        System.out.println("Имя файла после конвертации: " + file.getName());
        System.out.println("Расширение файла после конвертации: " + file.getFileType());
    }
}
