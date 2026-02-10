public class Appointment {

    private Doctor doctor;
    private Patient patient;

    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }
}
