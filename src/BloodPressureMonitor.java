public class BloodPressureMonitor extends Device{
    public Observation read(){
        BloodPressure bp = new BloodPressure();
        return bp;
    }
}
