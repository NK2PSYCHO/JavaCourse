package classcasting;

// Creating a super class which we can then inherit
class super_class{
    // Declaring a function that tells that we're in super class
    public void super_function(){
        System.out.println("We're in super class");
    } 
}

// Creating a sub class to inherit the superclass
class sub_class extends super_class{
    // Declaring a function that tells that we're in sub class
    public void sub_function(){
        System.out.println("We're in sub class");
    }
}

public class ClassCasting {
    public static void main(String[] args) {

        // Creating a variable of super class and
        // assigning it the object of sub class also
        // known as upcasting
        super_class var = new sub_class();

        // Note that you cannot do the reverse, assigning an object of 
        // super class to the reference variable of sub class it will throw
        // an error at compile time (Type mismatch cannot convert super to sub)
        //sub_class var_teach = new super_class();

        // As the fucntions are inherited as well we can 
        // call the fucntion of super class with the 
        // reference variable of super class and object of sub class
        var.super_function();
        // As the reference variable is of type super class which has
        // no idea that the sub class exists, even having the object of
        // sub class we cannot call the fucntion from it as it'll throw 
        // an error at compile time (The methos is undefined for the type
        // super class)
        //var.sub_function();

        // What we can do is typecast the reference variable of super class
        // to that of subclass what it'll do is create a reference variable 
        // for sub class and type cast the reference variable of super class 
        // into ti also known as downcasting.
        sub_class var_sub = (sub_class)var;
        // Now as the reference varaible is also of type sub class similar 
        // to the object we can call both the fucntions from super anc sub class
        var_sub.super_function();
        var_sub.sub_function();
    }
}
