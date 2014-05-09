
package source;

/**
 *
 * @author andre
 * 
 * MainClient  -------   int main()
 */
public class MainClient {
    
    public static void main(String[] args) {
        
        //create a new concrete implementation for  assembly
        CarBuilder lowPriceCarBuilder = new LowCostCarBuilder();
        
        //create a Concrete Builder with a concrete implementation of a product to assemble
        MechanicalEngineer engineer = new MechanicalEngineer(lowPriceCarBuilder);
        
        //construct the car
        engineer.buildCar();
        
        //get the newly built car and assign it to 'car' variable
        Car car = engineer.getCar();
        
        System.out.println("Builder Constructed Car: " + car.getName());
    }
    
}
