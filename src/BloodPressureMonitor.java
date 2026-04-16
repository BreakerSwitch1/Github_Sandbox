import java.util.Random;
public class BloodPressureMonitor extends Device{
    Random rand_bp = new Random();
    public Observation read(){
        double t = rand_bp.nextDouble(120.0,1000.0);
        BloodPressure bp = new BloodPressure(t);
        return bp;
    }
}
