package Task_1_Clinic;

public class Patient {
    private int treatmentPlan;
    private String doctor;
    public void enter(int a) {
        treatmentPlan = a;
    }
    public int getTreatmentPlan() {
        return treatmentPlan;
    }
    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
    public String getDoctor() {
        return this.doctor;
    }
    public String setDoctor(String doctor) {
        this.doctor = doctor;
        return doctor;
    }
}
