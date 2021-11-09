package AbstractFactory.Tree;

public class Bonsai extends Tree {

    public void grow(double years) {
        this.height += 0.3 * years;
        this.age += years;
    }
}
