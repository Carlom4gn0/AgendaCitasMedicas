import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("José Carlomagno","pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("juan carlos","juanCar@gmail.com");
        patient.setWeight(68.8);//modiicar dato
        System.out.println(patient.getWeight());//leer o mostrar dato
    }
}