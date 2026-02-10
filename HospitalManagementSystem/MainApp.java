public class MainApp {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Doctor d1 = new Doctor(1, "Ramesh", "Cardiology");
        Doctor d2 = new Doctor(2, "Sita", "Neurology");
        Doctor d3 = new Doctor(3, "Anil", "Orthopedics");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addDoctor(d3);

        Patient p1 = new Patient(101, "Rahul");
        Patient p2 = new Patient(102, "Priya");

        hospital.addAppointment(d1, p1);
        hospital.addAppointment(d2, p2);

        hospital.showAppointments();

        hospital.dischargePatient(p1);

        System.out.println("\nDoctors with Cardiology specialization:");
        for (Doctor d : hospital.searchDoctorBySpecialization("Cardiology")) {
            System.out.println("Dr. " + d.getName());
        }
    }
}
