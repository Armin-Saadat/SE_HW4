package AbstractFactory.GardenCreator;

import AbstractFactory.Flower.Khatami;
import AbstractFactory.Tree.Chenar;

public class IranianGardenCreator extends GardenCreator {

    public void createTree() {
        this.tree = new Chenar();
    }

    public void createFlower() {
        this.flower = new Khatami();
    }
}
