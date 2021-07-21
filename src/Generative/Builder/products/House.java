package Generative.Builder.products;

import Generative.Builder.components.HouseType;
import Generative.Builder.components.Roof;
import Generative.Builder.components.Wall;

public class House extends Product {

    public House(HouseType houseType, Wall wall, int floor, boolean lift, Roof roof, int door, int window) {
        super(houseType, wall, floor, lift, roof, door, window);
    }

    public HouseType getHouseType() {
        return houseType;
    }
}
