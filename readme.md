# ![Google Code In](https://codein.withgoogle.com/static/img/og-image.png) Create examples of Object Oriented Programming in Java

## Inheritance example
The ```Dog``` class extends the ```Animal``` class therefore making the dog class have properties and behavior of the Animal class

```Dog.java```
```Java
public class Dog extends Animal {}
```

## Polymorphism example
Because ```Dog``` is a child class of ```Animal```, the ```Dog``` object has more than one form.

It could be assigned as a dog, but it could also be an animal. Which makes ```Dog``` has the polymorphism ability.

```Test.java```
```Java
//This will work
Animal dog = new Dog("Marfley", "Chihuahua", "Fawn", 3);

//And this too
Dog marfley = dog;
```

## Compile-Time Polymorphism
In the ```Dog``` class,
the method ```Bark``` have two definitions which method would be called is determined by the parameter list at compile time.

```Dog.java```
```Java
public void Bark(){
    System.out.println("Woof!");
    this.barkCount++;
}

public void Bark(int count){
    for(int i=0; i<count; i++){
        System.out.println("Woof!");
    }
    this.barkCount += count;
}

```

## Runtime Polymorphism
```Animal``` class has a ```getAge``` method, but the ```Dog``` class overriden it with its own ```getAge``` method. Therefore, when you call ```dog.getAge()``` it will call the overriden method instead of the method from the ```Animal``` class. JVM figures out the object type and would run the method that belongs to that particular object.

```Animal.java```
```Java
public int getAge() {
    return age;
}
```

```Dog.java```
```Java
public int getAge(){
    //Assuming 1 year in any other animal age
    //is 5 dog years
    return this.age*5;
}
```
```Java
dog.getAge();    // Will use the overriden method
```

## Encapsulation
In the ```Dog``` class, the barkCount variable is private making it impossible to directly access it other than its own class. So we can only get or set the variable if we implemented a getter or setter method. This is encapsulation.

```Dog.java```
```Java
private int barkCount;

public int getBarkCount() {
    return barkCount;
}
```

```Test.java```
```Java
//This will work
System.out.println(marfley.getBarkCount());

//This will not work
System.out.println(marfley.barkCount);
```