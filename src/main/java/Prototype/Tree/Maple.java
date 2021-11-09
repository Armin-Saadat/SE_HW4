package Prototype.Tree;

public class Maple extends Tree {
    Maple(int height, int age) {
        super(height, age);
    }

    public Tree clone() {
        Maple newMaple = new Maple(this.height, this.age);
        newMaple.setLeafColor(this.leafColor);
        return newMaple;
    }
}
