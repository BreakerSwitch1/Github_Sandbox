import java.util.Random;
public class TemperatureMonitor extends Device {
    Random rand_temp = new Random();
    int time = Main.sim.getTime();
    public Observation read(){
        double t = rand_temp.nextDouble(98.0,102.0);
        Temperature temp = new Temperature(t,time);
        return temp;
    }
}
