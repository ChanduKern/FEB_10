public class Patient extends Person {

    private boolean discharged = false;

    public Patient(int id, String name) {
        super(id, name);
    }

    public boolean isDischarged() {
        return discharged;
    }

    public void discharge() {
        discharged = true;
    }
}
