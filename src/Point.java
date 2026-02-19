public class Point {
    private double X_val;
    private double Y_val;
    public  double getX() { return X_val; }
    public  double getY() { return Y_val; }

    public Point( double x, double y ) {
        X_val = x; Y_val = y;
    }
    public boolean lessThan( Point other ) {
        return X_val <= other.getX() && Y_val <= other.getY();
    }
    public double distance(Point other){
        double x_sqr = (X_val - other.getX()* X_val - other.getX());
        double y_sqr = (Y_val - other.getY()* Y_val - other.getY());
        return Math.sqrt(x_sqr+y_sqr);
    }
}