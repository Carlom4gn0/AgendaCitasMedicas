public class Patient {
    static int id;
    private String nameP;
    private String email;
    private String Address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private  String blood;


    Patient(String nameP, String email){
        this.nameP = nameP;
        this.email = email;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + "Kg.";
    }

    
}
