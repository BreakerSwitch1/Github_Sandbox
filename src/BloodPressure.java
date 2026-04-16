public class BloodPressure extends Observation{
    private double value;
    public BloodPressure(double val, int tm){
        super(tm);
        value = val;
    }
    public boolean emergency(){
        return false;
    }
    public boolean critical(){
        return false;
    }
}
