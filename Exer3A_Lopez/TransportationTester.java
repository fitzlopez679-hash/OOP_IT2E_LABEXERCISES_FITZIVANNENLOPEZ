public class TransportationTester {
    public static void main(String[] args) {
        // Land
        Transportation truck = new Truck("Hauler 9000", 2, 120.0f, 10, 18.5f);
        Transportation suv = new SUV("FamilyX", 7, 180.0f, 4, true);
        Transportation tricycle = new Tricycle("TriGo", 2, 25.0f);
        Transportation motorcycle = new Motorcycle("Speedster", 2, 220.0f);
        Transportation kariton = new Kariton("Kariton", 1, 10.0f, true);

        // Water
        Transportation rowBoat = new RowBoat("RowMate", 3, 8.0f);
        Transportation cruiseShip = new CruiseShip("Ocean Dream", 3500, 45.0f, 18);
        Transportation jetSki = new JetSki("WaveRider", 2, 100.0f);
        Transportation ferryBoat = new FerryBoat("City Ferry", 800, 35.0f, 150);

        // Air
        Transportation plane = new Plane("SkyJet", 220, 900.0f, 2, "SkyWays");
        Transportation blimp = new Blimp("SkyFloat", 12, 120.0f, 2, "helium");
        Transportation airBalloon = new AirBalloon("Sunset Flyer", 6, 25.0f, 0, "nylon");
        Transportation helicopter = new Helicopter("ChopperX", 5, 280.0f, 2, 4);

        Transportation[] transports = new Transportation[] {
            truck, suv, tricycle, motorcycle, kariton,
            rowBoat, cruiseShip, jetSki, ferryBoat,
            plane, blimp, airBalloon, helicopter
        };

        for (Transportation t : transports) {
            System.out.println(t.displayInfo());
        }
    }
}

