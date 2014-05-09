
package source;

/**
 *
 * @author andre
 * 
 * CarPlan  -------   Abstract Product class
 */
public interface CarPlan {
    
        public void setBase(String base);
        public void setWheels(String wheels);
        public void setEngine(String engine);
        public void setRoof(String roof);
        public void setMirrors(String mirrors);
        public void setLights(String lights);
        public void setInterior(String interior);
        
        public void setName(String name);
        public String getName();
    
}
