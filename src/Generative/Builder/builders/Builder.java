package Generative.Builder.builders;

import Generative.Builder.components.HouseType;
import Generative.Builder.components.Roof;
import Generative.Builder.components.Wall;

// Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации продукта
public interface Builder {
    void setHouseType(HouseType houseType);
    void setWall(Wall wall);
    void setFloor(int floor);
    void setRoof(Roof roof);
    void setDoor(int door);
    void setWindow(int window);
}
