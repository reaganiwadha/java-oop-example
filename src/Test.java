//melunian

import java.util.List;
import java.util.ArrayList;

public class Test{
    public static void main(String[] args) {
        /**
        * EXAMPLE -- Polymorphism
        * Dog can be assigned into an animal-type
        */
        Animal dog = new Dog("Marfley", "Chihuahua", "Fawn", 3);

        /**
        * EXAMPLE 2 -- Runtime Polymorphism 
        * dog.getAge() will call the overriden method
        * from the Dog class instead of the method from Animal class.
        * JVM figures out the object type and would run the method 
        * that belongs to that particular object.
        */

        System.out.println(dog.getType()+" , "+dog.getColor()+" , "+dog.getAge());

        /**
        * EXAMPLE -- Encapsulation
        * Since the barkCount variable in the Dog class is private
        * we don't have direct access to the variable
        * and reading the variable is possible only because 
        * a getter method exists in tehe class
        */
        
        // Since the getBarkCount method only exists in the dog class,
        // We need to convert it back to a Dog type
        Dog marfley = dog;
        marfley.Bark();

        //This will work
        System.out.println(marfley.getBarkCount());
        
        //This will not work
        // System.out.println(marfley.barkCount);
    }
}