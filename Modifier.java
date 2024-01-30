package modifier;


public class Modifier {

    public static void main(String[] args) {

        
        //public
        Person person = new Person();
        
        person.name = "Althaf";
        
        System.out.println("Nama saya Public adalah = " + person.name);
        
        //private
        
        Person Person = new Person();
        Person.setName("Althaf");
        
        System.out.println("Nama saya private adalah = " + Person.getName());
    
    
        //Protected
        Person PERSON = new Person();

            PERSON.NAME = "Althaf";
            System.out.println("Nama saya protacted adalah = " + PERSON.NAME);
            
        }
    }

            
    
