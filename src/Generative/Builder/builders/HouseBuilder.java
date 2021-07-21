package Generative.Builder.builders;

import Generative.Builder.components.HouseType;
import Generative.Builder.components.Roof;
import Generative.Builder.components.Wall;
import Generative.Builder.products.House;

// В отличие от других создающих паттернов, Строители могут создавать совершенно
// разные продукты, не имеющие общего интерфейса.
public class HouseBuilder implements Builder {
    private HouseType houseType;
    private Wall wall;
    private int floor;
    private boolean lift;
    private Roof roof;
    private int door;
    private int window;

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
        this.lift = (houseType == HouseType.SKYSCRAPER);
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public void setWindow(int window) {
        this.window = window;
    }

    public House getResult() {
        return new House(houseType, wall, floor, lift, roof, door, window);
    }
}
