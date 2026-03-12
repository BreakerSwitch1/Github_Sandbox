public class Simulation {
    private Hospital hospital;
    double StartTime = 0.0;
    double CurrentTime = 0.0;
    double EndTime = 100.0;
    double TimeIncrement = 5;
    int PatientCount = 5;
    public Simulation(){
        run();
    }
    public void create_new_hospital(){
        Hospital hospital = new Hospital();

    public void setup(){
        hospital = new Hospital();
        hospital.hospital_setup(PatientCount);
    }
    public void run(){
        while(CurrentTime<EndTime){
            hospital.update(CurrentTime);
            CurrentTime+=TimeIncrement;
        }
    }
}
