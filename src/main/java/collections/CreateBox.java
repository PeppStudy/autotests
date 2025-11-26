package collections;

public class CreateBox {

    public int randDimension() {
        return (int) Math.round(Math.random() * 50 + 4);
    }

    public Box createBox() {
                return new Box(randDimension(), randDimension(), randDimension());
    }

}
