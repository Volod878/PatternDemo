package Structural.Facade;

import Structural.Facade.some_libraly.*;

public class ConversionFacade {
    ImageFile convertImage(String fileName, String format) {
        System.out.println("ConversionFacade: Конвертация изображения началась");
        ImageFile image = new ImageFile(fileName);
        ImageType sourceType = FindOutType.extract(image);
        ImageType destinationType = format.equals("jpg") ? new JpegType() : new GifType();

        ImageFile buffer = ImageConverter.read(image, sourceType);
        ImageFile result = ImageConverter.convert(buffer, destinationType);
        System.out.println("ConversionFacade: Конвертация завершилась успешно");

        return result;
    }
}
