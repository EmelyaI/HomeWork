package Task_1_Clinic;
public class Therapist extends Doctor {
    private String doc;
    @Override
    public void TreatmentMethod() {
        System.out.println("Treatment method - therapist");
    }
    public void who_will_treat(int a) {

        Therapist therapist = new Therapist();
        if (a == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.TreatmentMethod();
            doc = "Surgeon";
        } else if (a == 2) {
            Dentist dantist = new Dentist();
            dantist.TreatmentMethod();
            doc = "Dantist";
        } else {
            therapist.TreatmentMethod();
            doc = "Therapist";
        }
    }
    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
}
