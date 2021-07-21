package Generative.Builder.products;

import Generative.Builder.components.HouseType;
import Generative.Builder.components.Roof;
import Generative.Builder.components.Wall;

public class BuildingProject extends Product {

    public BuildingProject(HouseType houseType, Wall wall, int floor, boolean lift, Roof roof, int door, int window) {
        super(houseType, wall, floor, lift, roof, door, window);
    }

    public String print() {
        return String.format("Проект здания" +
                "\nТип здания: %s" +
                "\nТип стен: %s" +
                "\nКоличество этажей: %d" +
                "\nЛифт: %s" +
                "\nТип крыши: %s" +
                "\nКоличество дверей: %d" +
                "\nКоличество окон: %d",
                houseType, wall, floor, (lift ? "есть" : "отсутствует"), roof, door, window);
    }
}
