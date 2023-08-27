package Task_1_Clinic;
public class Therapist extends Doctor {
    private String doc;
    @Override
    public void TreatmentMethod() {
        System.out.println("Treatment method - therapist");
    }
    public String who_will_treat(int a) {

        Therapist therapist = new Therapist();
        Patient patient = new Patient();
        if (a == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.TreatmentMethod();
            return doc = "Surgeon";
        } else if (a == 2) {
            Dentist dantist = new Dentist();
            dantist.TreatmentMethod();
            return doc = "Dantist";
        } else {
            therapist.TreatmentMethod();
            return doc = "Therapist";
        }
    }
    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
}
