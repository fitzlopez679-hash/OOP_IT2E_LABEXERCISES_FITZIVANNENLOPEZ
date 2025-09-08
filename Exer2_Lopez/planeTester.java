public class planeTester{

   public static void main(String[] args) {
       plane plane1 = new plane("Red and white","SH0928HH", "Boeing 777");
       plane1.displayInfo();

       plane plane2 = new plane("Blue and grey", "CP2990S9", "Airbus A320");
       plane2.displayInfo();

       plane plane3 = new plane();
       plane3.displayInfo();
   }
}   