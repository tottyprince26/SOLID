package PatronDiseño;
import SOLID.L.*;
/**
 *
 * @author Tuf Gaming
 */
public class ElectricCarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricCar();
    }
}