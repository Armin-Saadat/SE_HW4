package AbstractFactory.Tree;

public class Chenar extends Tree {
    public void grow(double years) {
        this.height = 5 * years * years;
        this.age += years;
    }
}
