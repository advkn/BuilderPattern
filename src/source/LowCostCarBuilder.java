
package source;

/**
 *
 * @author andre
 * 
 * LowCostCarBuilder   ----------  Concrete Builder
 */
public class LowCostCarBuilder implements CarBuilder {
    
    private Car car;    //the final product that will be returned after all its properties/parts have been assembled
    
    public LowCostCarBuilder() {
        car = new Car();       //instantiate a new car in order to associate the creation of certain car products to a concrete object.
    }
    
    @Override
    public void buildBase() {
        car.setBase("Low priced base");
    }
    
    @Override
    public void buildWheels() {
        car.setWheels("Cheap tires");
    }
    
    @Override
    public void buildEngine() {
        car.setEngine("Low quality engine");
    }
    
    @Override
    public void buildRoof() {
        car.setRoof("No flexible roof");
    }
    
    @Override
    public void buildMirrors() {
        car.setMirrors("Cheap mirrors");
    }
    
    @Override
    public void buildLights() {
        car.setLights("Cheap lights");
    }
    
    @Override
    public void buildInterior() {
        car.setInterior("Cheap interior");
    }
    
    @Override
    public Car getCar() {
        return this.car;
    }
    
    public void modelName() {
        car.setName("Piece of Shit");
    }
    
}
