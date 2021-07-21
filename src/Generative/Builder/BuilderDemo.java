package Generative.Builder;

import Generative.Builder.builders.BuildingProjectBuilder;
import Generative.Builder.builders.HouseBuilder;
import Generative.Builder.products.BuildingProject;
import Generative.Builder.products.House;

public class BuilderDemo {
    public static void main(String[] args) {
        ConstructionCompany company = new ConstructionCompany();
        BuildingProjectBuilder projectBuilder = new BuildingProjectBuilder();
        company.buildVilla(projectBuilder);
        BuildingProject villa = projectBuilder.getResult();
        System.out.println(villa.print());
        System.out.println();

        HouseBuilder houseBuilder = new HouseBuilder();
        company.buildVilla(houseBuilder);
        House house = houseBuilder.getResult();
        System.out.println("Строительство здания " + house.getHouseType() + " завершено");
        System.out.println();


        company.buildSkyscraper(projectBuilder);
        BuildingProject skyscraper = projectBuilder.getResult();
        System.out.println(skyscraper.print());
    }
}
