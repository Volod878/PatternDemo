package Generative.Builder.products;

import Generative.Builder.components.HouseType;
import Generative.Builder.components.Roof;
import Generative.Builder.components.Wall;

public abstract class Product {
    final HouseType houseType;
    final Wall wall;
    final int floor;
    final boolean lift;
    final Roof roof;
    final int door;
    final int window;

    public Product(HouseType houseType, Wall wall, int floor, boolean lift, Roof roof, int door, int window) {
        this.houseType = houseType;
        this.wall = wall;
        this.floor = floor;
        this.lift = lift;
        this.roof = roof;
        this.door = door;
        this.window = window;
    }
}