package AbstractFactory.Flower;

public class JapaneseCherryBlossom extends Flower {
    public void grow() {
        this.color = Color.WHITE;
        this.petalCount = 100;
        this.fragrant = false;
    }
}
