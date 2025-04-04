
package PatronDiseño;
import SOLID.L.*;
/**
 * PATRON DE DISEÑO APLICADO: FACTORY METHOD:
 * CONSISTE EN UTILIZAR UNA CLASE CONSTRUCTORA ABSTRACTA CON UNOS CUANTOS METODOS DEFINIDOS Y OTRO ABSTRACTO.
 * @author Tuf Gaming
 */

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Vehicle();
    }
}
