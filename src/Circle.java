public class Circle {
    private Point center;
    private double radius;

    public boolean isInCircle(Point pt){
        if(pt.distance(center) <= radius){
            return true;
        } else{
            return false;
        }
    }
}
