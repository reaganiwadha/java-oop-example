# ![Google Code In](https://codein.withgoogle.com/static/img/og-image.png) Create examples of Object Oriented Programming in Java

## [Inheritance](https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming))
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another

### Example

The ```Dog``` class extends the ```Animal``` class therefore making the dog class have properties and behavior of the Animal class

```Dog.java```
```Java
public class Dog extends Animal {}
```

### Advantages and Disadvantages of Inheritance

| Advantages                                                                           | Disadvantages                               |
|--------------------------------------------------------------------------------------|---------------------------------------------|
| It helps in code reuse                                                               | [Tight coupling](https://www.interviewsansar.com/2018/03/24/loose-coupling-and-tight-coupling-in-java/) could be a problem           |
| Provides a clear model structure which is easy to understand without much complexity | Could easily produce "[fragile base classes](https://en.wikipedia.org/wiki/Fragile_base_class)" |
| Saves time and effort as the main code need not be written again.                    |[Could break encapsulation](https://icodemag.com/favor-composition-over-inheritance/)    |

## [Polymorphism](https://en.wikipedia.org/wiki/Polymorphism_(computer_science))

Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in object-oriented programming occurs when a parent class reference is used to refer to a child class object.

### Example

Because ```Dog``` is a child class of ```Animal```, the ```Dog``` object has more than one form.

It could be assigned as a dog, but it could also be an animal. Which makes ```Dog``` has the polymorphism ability.

```Test.java```
```Java
//This will work
Animal dog = new Dog("Marfley", "Chihuahua", "Fawn", 3);

//And this too
Dog marfley = dog;
```

### Compile-Time Polymorphism / Static Polymorphism

Compile-Time Polymorphism is when the polymorphism state of something is determined at Compile-Time. Method overloading is one of the example of how java supports Compile-Time Polymorphism. Since which method to use is determined by the parameter list, which method to use is already known hence it is called Static Polymorphism

#### Example

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

### Runtime Polymorphism

Runtime Polymorphism is when the polymorphism state of something is determined at Runtime. Method overriding is one of the example of how java supports Runtime Polymorphism. When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs.    

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

### Advantages and Disadvantages of Polymorphism

| Advantages                                                                                       | Disadvantages                                           |
|--------------------------------------------------------------------------------------------------|---------------------------------------------------------|
| Method overloading allows closely related function with having a common name                     | Run time polymorphism can lead to the performance issue |
| Method overriding allows a sub class to use the general definitions that a parent class provides | Reduces the readability of the program.                 |
| Polymorphism is flexible                                                                         |                                                         |

## [Encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))
Encapsulation refers to the bundling of data with the methods that operate on that data, or the restricting of direct access to some of an object's components.

### Example

In the ```Dog``` class, the barkCount variable is private making it impossible to directly access it other than its own class. So we can only get or set the variable if we implemented a getter or setter method.

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

### Advantages and Disadvantages of Encapsulation

| Advantages                      | Disadvantages |
|---------------------------------|---------------|
| Useful to hide data             |               |
| Makes the code easy to maintain |               |
|                                 |               |