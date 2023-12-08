import Strategy.DriveStrategy;
import Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle() {
    super(new SportsDriveStrategy());
  }
}
