package pro.sky.java.homeworks.course2.dz2;

public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }

}

