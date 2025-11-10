import java.time.LocalDate;

public class VehicleMaintenanceTracker {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Maruti Swift",12000,LocalDate.of(2024,12,5));

        try{
            car.checkMaintenance();
        }catch (InvalidMileageException e){
            System.out.println("Alert: "+ e.getMessage());
        }
        catch(ServiceOverdueException e){
            System.out.println("Alert: "+e.getMessage());
        }
        finally {
            System.out.println("Maintenance check Complete");
        }
    }
}
class Vehicle {
    private String name;
    private int mileage;
    private LocalDate lastservices;

    public Vehicle(String name, int mileage, LocalDate lastservices) {
        this.name = name;
        this.mileage = mileage;
        this.lastservices = lastservices;

    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) {
            throw new InvalidMileageException("Mileage cannot be negative!");
        }

        LocalDate today = LocalDate.now();
        if(lastservices.isBefore(today.minusMonths(6)))
            throw  new ServiceOverdueException(("Service overdue! Please Schedule Maintenance"));

        System.out.println("All good. "+ name+ " is up to date with maintenance.");
    }
}

class ServiceOverdueException extends Exception{
    public ServiceOverdueException(String message){
        super(message);
    }
}

class InvalidMileageException extends Exception{
    public InvalidMileageException(String message){
        super(message);
    }
}