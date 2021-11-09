package AbstractFactory.GardenCreator;

import AbstractFactory.Flower.Flower;
import AbstractFactory.Tree.Tree;

public abstract class GardenCreator {
    protected Tree tree;
    protected Flower flower;

    public abstract void createTree();
    public abstract void createFlower();

    public Flower getFlower() {
        return flower;
    }

    public Tree getTree() {
        return tree;
    }
}
