import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addAppointment(Doctor doctor, Patient patient) {
        appointments.add(new Appointment(doctor, patient));
        System.out.println(
                "Appointment booked: " + patient.name +
                        " with Dr. " + doctor.getName());
    }

    public void dischargePatient(Patient patient) {
        patient.discharge();
        System.out.println(patient.name + " has been discharged");
    }

    public List<Doctor> searchDoctorBySpecialization(String specialization) {
        return doctors.stream()
                .filter(d -> d.getSpecialization()
                        .equalsIgnoreCase(specialization))
                .collect(Collectors.toList());
    }

    public void showAppointments() {
        System.out.println("\n--- Appointments List ---");
        for (Appointment a : appointments) {
            System.out.println(
                    "Patient: " + a.getPatient().name +
                            " → Doctor: " + a.getDoctor().getName());
        }
    }
}
