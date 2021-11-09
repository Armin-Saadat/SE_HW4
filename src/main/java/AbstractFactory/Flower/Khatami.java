package AbstractFactory.Flower;

public class Khatami extends Flower {
    public void grow() {
        this.color = Color.RED;
        this.petalCount = 30;
        this.fragrant = true;
    }
}
