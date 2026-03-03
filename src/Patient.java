public class Patient {
    private String patient_firstname;
    private String patient_lastname;
    public enum Sex{male,female}
    private Sex patient_sex;
    private String  patient_uuid;
    private String patient_date_of_birth;
    Sex getPatient_sex(){return patient_sex;}
    String getPatient_firstname(){return patient_firstname;}
    String getPatient_lastname(){return patient_lastname;}
    String getPatient_uuid(){return patient_uuid;}
    String getPatient_date_of_birth(){return patient_date_of_birth;}

    public Patient(String p_first_name, String p_last_name,Sex p_sex, String p_uuid, String p_dob){
        patient_firstname = p_first_name;
        patient_lastname = p_last_name;
        patient_sex = p_sex;
        patient_uuid = p_uuid;
        patient_date_of_birth = p_dob;
    }
    public String toCSV(){
        String sex = getPatient_sex().toString();
        String first_name  = getPatient_firstname();
        String last_name  = getPatient_lastname();
        String uuid = getPatient_uuid();
        return(""+first_name+ "" +last_name+ "," +sex+ "," +uuid+ " ");

    }

}