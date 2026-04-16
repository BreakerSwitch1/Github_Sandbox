import java.util.Random;
public class Temperature extends Observation{
    private double value;
    public Temperature(double v,int tm){
        super(tm);
        value = v;
    }
    public boolean emergency(){
        if(value >= 101.0){
            return true;
        }else{
            return false;
        }
    }
    public boolean critical(){
        return false;
    }
}
