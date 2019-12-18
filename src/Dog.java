/*
This is a dog class
It has 3 variables that is breed, color and age
And this is an encapsulation demo
Where variables are encapsulated within class so its not accesible from others
*/

/**
* EXAMPLE -- Inheritance 
* This class inherits the Animal class
* therefore having properties and behavior of the Animal class
*/
public class Dog extends Animal {
    private int barkCount;

    //Constructor
    public Dog(String name, String type, String color, int age){
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
        this.barkCount = 0;
    }


    public int getAge(){
        //Assuming 1 year in any other animal age
        //is 5 dog years
        return this.age*5;
    }

    /**
     * @return the barkCount
     */
    public int getBarkCount() {
        return barkCount;
    }


    /**
    * EXAMPLE -- Compile-Time Polymorphism
    * The method Bark have two definitions
    * which method would be called is 
    * determined by the parameter
    * list at compile time.
    */

    
    //Makes the dog bark
    public void Bark(){
        System.out.println("Woof!");
        this.barkCount++;
    }


    //Makes the dog bark but you can tell how many times
    //they should bark
    public void Bark(int count){
        for(int i=0; i<count; i++){
            System.out.println("Woof!");
        }
        this.barkCount += count;
    }
}