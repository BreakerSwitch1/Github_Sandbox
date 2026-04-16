public class BloodPressure extends Observation{
    private double value;
    public BloodPressure(double val){
        value = val;
    }
    public boolean emergency(){
        return false;
    }
    public boolean critical(){
        return false;
    }
}
