import javax.print.Doc;

public class Doctor {
   //Atributos
   static int id = 0;
   String name;
   String email;
   String speciality;

   Doctor() {
      System.out.println("Construyendo el Objeto Doctor");

   }
   //constructor
   Doctor(String name, String speciality) {
      id++;
      System.out.println("El nombre del Doctor asignado es: " + name);
      this.name = name;
      this.speciality = speciality;
   }

   public void showName() {
      System.out.println(name);
   }
   public void showId(){
      System.out.println("Id Doctor: "+id);
   }

}
