public class CarTester{

   public static void main(String[] args) {
       Car car1 = new Car("Orange","P00l", "299SSS", "Lamborgini");
       car1.displayInfo();

       Car car2 = new Car("Red", "ABC123", "CHS456", "Ferrari");
       car2.displayInfo();

       Car car3 = new Car();
       car3.displayInfo();
   }
}   