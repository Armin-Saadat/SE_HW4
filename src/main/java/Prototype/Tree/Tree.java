package Prototype.Tree;

public abstract class Tree {
    protected int height;
    protected int age;
    protected Color leafColor;

    public abstract Tree clone();

    Tree(Tree source) {
        this.height = source.getHeight();
        this.age = source.getAge();
    }

    Tree(int height, int age) {
        this.height = height;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeafColor(Color leafColor) {
        this.leafColor = leafColor;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public Color getLeafColor() {
        return leafColor;
    }
}
