package modifier;

public class Person {
    
    // Public 
    public String name;
    
    public void setname(String name){
    
        this.name = name;
    
    
    }
    
    public String getname(){
         return this.name;
    }
    
    
    //Private 
    private String Name;
    
    public void setName (String Name){
    
        this.Name = Name;
    }
    
    public String getName(){
        
        return this.Name;
        
    }
    
    //Protected
    protected String NAME;
    
    public void setNAME (String NAME){
    
        this.NAME = NAME;
        
    }
    
    public String getNAME(){
            
        return this.NAME;
        
    }   
    
    
}
