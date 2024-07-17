package finalkeyword;

// This class will be empty as it is created just to show that it cannot be inherited
final class final_class{}

// This class will be empty as it is created just to show that it cannot inherit a final class
// We cannot do the following as it will throw an error at compile time (The type class cannot subclass the final class) 
//class inherited_class extends final_class{}

// The following class implements final variable and the error that it throws when you
// try to assign a new value to it.
class final_variable{
    // Creating the constant variable PIE
    final private double PIE = 3.14;
    // getPIE function will print the value of the constant variable PIE
    // Making it final so that it cannot be overridden
    public final void getPIE(){
        System.out.println("The value of the created constant is " + PIE);
    }

    // setPIE fucntion to check if we can change the value of the constant varaible PIE
    //  setPIE will throw an error at compile time (final field cannot be assigned)
    //public void setPIE(double new_value){
    //    PIE = new_value;
    //}
}

// The following class extends final_variable class and all it's members
// We will try to override the final method of the final_varaible class
class final_method extends final_variable{
    // The following method should override the method with same name
    // from the final_variable class
    // We cannot override a final method as it'll give an error compile time
    // (Cannot override the final method)
    //public void getPIE()
    //{
    //    System.out.println("I've overridden the method");
    //}
}

public class FinalKeyword {

    public static void main(String[] args) {
        // Creating a reference variable for object of final_variable class
        final_variable fin = new final_variable();
        // Calling the getPIE function of final_varaible to print the value of PIE
        fin.getPIE();
        // Trying to set a new value to the constant variable PIE
        // We'll not be able to execute the following because setPIE will throw an error at compile time
        //fin.setPIE(3.14);
    }
}
