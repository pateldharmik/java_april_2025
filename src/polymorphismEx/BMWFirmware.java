package polymorphismEx;

public class BMWFirmware extends MasterFirmware{
    @Override
    public void abs() {
        System.out.println("BMW ABS Activated.");
    }
}
