package polymorphismEx;

public class ToyotaFirmware extends MasterFirmware{
    @Override
    public void abs() {
        System.out.println("Toyota ABS Activated.");
    }
}
