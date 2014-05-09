
package source;

/**
 *
 * @author andre
 * 
 * Car -------  Concrete Product
 */
public class Car implements CarPlan {
    
    private String base;
    private String wheels;
    private String engine;
    private String roof;
    private String mirrors;
    private String lights;
    private String interior;
    private String name;
    
    public void setBase(String b) {
        this.base = b;
    }
    
    public void setWheels(String w) {
        this.wheels = w;
    }
    
    public void setEngine(String e) {
        this.engine = e;
    }
    
    public void setRoof(String r) {
        this.roof = r;
    }
    
    public void setMirrors(String m) {
        this.mirrors = m;
    }
    
    public void setLights(String l) {
        this.lights = l;
    }
    
    public void setInterior(String i) {
        this.interior = i;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public String getName() {
        return this.name;
    }
    
    
}
