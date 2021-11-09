package AbstractFactory.Flower;

public abstract class Flower {
    protected int petalCount;
    protected boolean fragrant;
    protected Color color;

    public abstract void grow();

    public Color getColor() {
        return color;
    }

    public int getPetalCount() {
        return petalCount;
    }

    public boolean isFragrant() {
        return fragrant;
    }
}
