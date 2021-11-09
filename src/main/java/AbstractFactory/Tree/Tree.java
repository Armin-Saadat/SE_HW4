package AbstractFactory.Tree;

public abstract class Tree {
    protected double height;
    protected double age;

    public abstract void grow(double years);

    public double getHeight() {
        return height;
    }

    public double getAge() {
        return age;
    }
}
