abstract class Observation {
    private int time;
    protected Observation(int tm){time = tm;}
    abstract public boolean emergency();
    abstract public boolean critical();
}
