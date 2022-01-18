package pro.sky.java.homeworks.course2.dz2;

public class Main {
    public static void main(String[] args) {

        Car cars = new Car("car1", 4);
        Car cars2 = new Car("car2", 4);

        Truck trucks = new Truck("truck1", 6);
        Truck trucks2 = new Truck("truck2", 8);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Transport[] vehicles = {cars, cars2, trucks, trucks2, bicycle, bicycle2};

        ServiceStation station = new ServiceStation();

        for (Transport vehicle : vehicles){
            station.check(vehicle);
        }
//



    }
}

