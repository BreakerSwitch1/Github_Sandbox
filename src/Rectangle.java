public class Rectangle {

    private Point lowerLeft;
    private Point upperRight;

    public Rectangle( Point ll, Point ur ) {
        lowerLeft = ll; upperRight = ur;
    }

    public boolean contains( Point pt ) {
        return lowerLeft.lessThan(pt) && pt.lessThan( upperRight );
    }
}