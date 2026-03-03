public class TemperatureMonitor extends Device {
    public Observation read(){
        Temperature temp = new Temperature();
        return temp;
    }
}
