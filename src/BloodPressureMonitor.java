import java.util.Random;
public class BloodPressureMonitor extends Device{
    Random rand_bp = new Random();
    int time = Main.sim.getTime();
    public Observation read(){
        double rbp = rand_bp.nextDouble(120.0,1000.0);
        BloodPressure bp = new BloodPressure(rbp,time);
        return bp;
    }
}
