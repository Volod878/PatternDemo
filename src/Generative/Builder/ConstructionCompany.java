package Generative.Builder;

import Generative.Builder.builders.Builder;
import Generative.Builder.components.HouseType;
import Generative.Builder.components.Roof;
import Generative.Builder.components.Wall;

// Директор знает в какой последовательности заставлять работать строителя. Он
// работает с ним через общий интерфейс Строителя. Из-за этого, он может не
// знать какой конкретно продукт сейчас строится
public class ConstructionCompany {

    public void buildVilla(Builder builder) {
        builder.setHouseType(HouseType.VILLA);
        builder.setWall(Wall.STONE);
        builder.setFloor(2);
        builder.setRoof(Roof.PITCHED);
        builder.setDoor(4);
        builder.setWindow(8);
    }

    public void buildSkyscraper(Builder builder) {
        builder.setHouseType(HouseType.SKYSCRAPER);
        builder.setWall(Wall.REINFORCED_CONCRETE);
        builder.setFloor(100);
        builder.setRoof(Roof.FLAT);
        builder.setDoor(150);
        builder.setWindow(250);
    }
}
