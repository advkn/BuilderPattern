
package source;

/**
 *
 * @author andre
 * 
 * MechanicalEngineer  ------  Director class.  Creates and maintains the sequence of object construction
 */
public class MechanicalEngineer {
    
    private CarBuilder carBuilder;
    
    public MechanicalEngineer(CarBuilder carBuilder) {
        
        this.carBuilder = carBuilder;
    }
    
    public Car getCar() {
        return carBuilder.getCar();
    }
    
    public void buildCar() {
        carBuilder.buildBase();
        carBuilder.buildWheels();
        carBuilder.buildEngine();
        carBuilder.buildRoof();
        carBuilder.buildMirrors();
        carBuilder.buildLights();
        carBuilder.buildInterior();
        carBuilder.modelName();
    }
    
}
