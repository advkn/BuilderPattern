
package source;

/**
 *
 * @author andre
 * 
 * HighEndCarBuilder  --------   Concrete Builder
 */
public class HighEndCarBuilder implements CarBuilder {
    
    private Car car;    //the final product that will be returned after all its properties/parts have been assembled
    
    public HighEndCarBuilder() {
        car = new Car();       //instantiate a new car in order to associate the creation of certain car products to a concrete object.
    }
    
    @Override
    public void buildBase() {
        car.setBase("Quality base");
    }
    
    @Override
    public void buildWheels() {
        car.setWheels("Quality tires");
    }
    
    @Override
    public void buildEngine() {
        car.setEngine("High end engine");
    }
    
    @Override
    public void buildRoof() {
        car.setRoof("Flexible roof");
    }
    
    @Override
    public void buildMirrors() {
        car.setMirrors("Quality mirrors");
    }
    
    @Override
    public void buildLights() {
        car.setLights("Quality lights");
    }
    
    @Override
    public void buildInterior() {
        car.setInterior("High-end interior");
    }
    
    @Override
    public Car getCar() {
        return this.car;
    }
    
    public void modelName() {
        car.setName("Rolls Royce Phantom");
    }
    
}
