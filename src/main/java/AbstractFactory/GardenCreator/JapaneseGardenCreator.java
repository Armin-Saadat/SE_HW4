package AbstractFactory.GardenCreator;

import AbstractFactory.Flower.JapaneseCherryBlossom;
import AbstractFactory.Tree.Bonsai;

public class JapaneseGardenCreator extends GardenCreator {

    public void createTree() {
        this.tree = new Bonsai();
    }

    public void createFlower() {
        this.flower = new JapaneseCherryBlossom();
    }
}
