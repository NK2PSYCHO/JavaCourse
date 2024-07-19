package abstractkeyword;

// We'll be creating an abstract class which serves as a blueprint for other classes allowing them to 
// share abstractions and implementations. As it is only a blueprint you cannot create object of this class.
// This class needs to be inherited by other class and implemented.
// Abstract Methods needs that the class they are defined in is abstract.
abstract class abstractor{
    // Abstract methods are only the definition of the methods they do not implement anything
    // they do not have a body, any class that inherits the abstarct class of the abstract method
    // needs to implement the abstract method or be declared as abstract class itself
    public abstract void show_something();

    // Abstract methods needs to be declared in abstract class but an abstract class do not 
    // require to have abstract methods at all. Making it abstract means you cannot instantiate it
    // and have to implement it using another class.
    // Normal method to print inside of abstract class.
    public void inside_abstract(){
        System.out.println("We're insisde abstract class");
    } 
}

// We've created another class that inherits the abstractor class but as it does not implement the
// abstract method it is declared as an abstract itself, so another class will have to inherit this class
// and implement both the abstract classes.
abstract class abstractor_inherit extends abstractor{
    // Normal method to print inside of inherited class
    public void inside_inherited(){
        System.out.println("We're insisde inherited class");
    }

}

// This class inherits both the abstract classes and implements the required abstract methods
class inherit_all extends abstractor_inherit{
    // Implementing the abstract method so the class does not need to be an abstract class
    // and we can instantiate it.
    public void show_something() {
        System.out.println("We're insisde implementing class");
        
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // Trying to do the following will throw an error at compile time
        // (Cannot instantiate the type abstract class)
        //abstractor abs = new abstractor();
        // Trying to do the following will throw an error at compile time
        // (Cannot instantiate the type abstract class)
        //abstractor_inherit abs = new abstractor_inherit ();
        // We create an object of the implementing class and call all the methods
        inherit_all all = new inherit_all();
        // The methoid that prints, inside abstract is called
        all.inside_abstract();
        // The method that prints, inside inherited is called
        all.inside_inherited();
        // The implemented method, which prints inside
        // implementing class is called
        all.show_something();
    }
}
