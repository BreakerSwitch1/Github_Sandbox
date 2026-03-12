import java.util.UUID;

public class Patient {
    private String patient_firstname;
    private String patient_lastname;
    public enum Sex{male,female}
    private Sex patient_sex;
    private UUID  patient_uuid;
    private String patient_date_of_birth;
    private Device[] devices;
    Sex getPatient_sex(){return patient_sex;}
    String getPatient_firstname(){return patient_firstname;}
    String getPatient_lastname(){return patient_lastname;}
    UUID getPatient_uuid(){return patient_uuid;}
    String getPatient_date_of_birth(){return patient_date_of_birth;}
    public Patient(String p_first_name, String p_last_name,Sex p_sex, String p_dob, Device dev){
        patient_firstname = p_first_name;
        patient_lastname = p_last_name;
        patient_sex = p_sex;
        patient_uuid = UUID.randomUUID();
        patient_date_of_birth = p_dob;
        devices = new Device[5];
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
    //Factory
    static Patient makePatient(){
        return new Patient("Joseph","Smith",Sex.male,"06/26/2006",new TemperatureMonitor());
    }

}