import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point pt = new Point (1.0, 2.0 );
        double x = pt.getX();
        assertTrue( x == 1.0);
    }

    @Test
    void getY() {
        Point pt = new Point (1.0, 2.0 );
        double y = pt.getY();
        assertTrue( y == 2.0);
    }

    @Test
    void lessThan() {
        Point pt = new Point (1.0, 2.0 );
        double x = pt.getX();
        double y = pt.getY();
        double lessThan = x - y;
        assertTrue( lessThan == -1.0);
    }

    @Test
    void distance() {
        Point pt = new Point (1.0, 2.0 );
        double x = pt.getX();
        double y = pt.getY();
        double distance = x + y;
        assertTrue( distance == 3.0);
    }
}