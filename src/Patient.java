public class Patient {
    private String patient_name;
    public enum Sex{male,female}
    private Sex patient_sex;
    private String  patient_uuid;
    private String patient_date_of_birth;
    Sex getPatient_sex(){return patient_sex;}
    String getPatient_name(){return patient_name;}
    String getPatient_uuid(){return patient_uuid;}
    String getPatient_date_of_birth(){return patient_date_of_birth;}

    public Patient(String p_name,Sex p_sex, String p_uuid, String p_dob){
        patient_name = p_name;
        patient_sex = p_sex;
        patient_uuid = p_uuid;
        patient_date_of_birth = p_dob;
    }
    public String toCSV(){
        String sex = getPatient_sex().toString();
        String name  = getPatient_name();
        String uuid = getPatient_uuid();
        return(""+name+ "," +sex+ "," +uuid+ " ");

    }
}