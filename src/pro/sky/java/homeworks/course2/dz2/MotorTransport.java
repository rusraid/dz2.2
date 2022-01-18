package pro.sky.java.homeworks.course2.dz2;

public abstract class MotorTransport extends Transport {

    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service() {
        super.service();
        checkEngine();
        }
}


