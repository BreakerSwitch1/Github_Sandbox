import java.util.Queue;
import java.util.UUID;
import java.util.Random;

public class Patient {
    private String patient_firstname;
    private String patient_lastname;
    public enum Sex{male,female}
    private Sex patient_sex;
    private UUID  patient_uuid;
    private String patient_date_of_birth;
    private Device[] devices;
    public enum ChiefComplaint{flu,headache,naseua};
    private ChiefComplaint patient_complaint;
    Sex getPatient_sex(){return patient_sex;}
    String getPatient_firstname(){return patient_firstname;}
    String getPatient_lastname(){return patient_lastname;}
    UUID getPatient_uuid(){return patient_uuid;}
    String getPatient_date_of_birth(){return patient_date_of_birth;}
    ChiefComplaint get_PatientComplaint(){return patient_complaint;}
    public Patient(String p_first_name, String p_last_name,Sex p_sex, String p_dob, Device dev, ChiefComplaint p_complaint){
        patient_firstname = p_first_name;
        patient_lastname = p_last_name;
        patient_sex = p_sex;
        patient_uuid = UUID.randomUUID();
        patient_date_of_birth = p_dob;
        devices = new Device[5];
        patient_complaint = p_complaint;
    }

    public void addDevice(Device dev){
        for(int i = 0; i<=devices.length; i++){
            if(devices[i] == null){
                devices[i] = dev;
                break;
            }
        }
    }

    public void readDevices() {

    }
    public String toCSV(){
        String sex = getPatient_sex().toString();
        String first_name  = getPatient_firstname();
        String last_name  = getPatient_lastname();
        UUID uuid = getPatient_uuid();
        String dob = getPatient_date_of_birth();
        return(""+first_name+ "" +last_name+ "," +sex+ "," +uuid+ ",");

    }
    public void update(int current_time, Hospital h){
        for(int i = 0; i<devices.length;i++){
            if(devices[i] != null){
                Observation obs = devices[i].read();
                if(obs.emergency()){
                    Alert al = new Alert(obs,current_time,3);
                    h.update(current_time);
                    System.out.println("An alert has been made");

                }
            }
        }
        Random rng_bell_call = new Random();
        int bell_call_chance = rng_bell_call.nextInt(1,4);
        if(bell_call_chance == 2){
            System.out.println("Patient " +patient_firstname+ " rang the bell!");
        }
    }
    //Factory
    static Patient makePatient(){
        return new Patient("Joseph","Smith",Sex.male,"06/26/2006",new TemperatureMonitor(),ChiefComplaint.headache);
    }

}