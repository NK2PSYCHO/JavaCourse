package wrapperclass;

// In this example only the wrapper class of integer is used
// other can be explored as required

// The class will have some sample wrapper types.
// Wrapper types are basically primitive types converted to classes
// the names are similar just with the capitalisation of the first 
// character i.e. integer -> Integer
class sample_wrapper{
    // An object of wrapper class Integer
    private Integer num_var = 10;
    private int num;
    // A method to print the value in wrapper class object
    public void print_variable(){
        System.out.println("This is the value stored in wrapper object " + num_var);
    }
    // A method to implement boxing (auto boxing) of primitive
    // integer to wrapper class Integer
    public void primitive_boxing(int num){
        // As we assign a variable of primitive type to wrapper class type
        // it will "box" it into wrapper class type hence boxing
        // and as we're not using any wrapper method it is done
        // automatically hence auto boxing.
        num_var = num;
        System.out.println("The new value stored in wrapper object is " + num_var);
    }
    // A method to implement unboxing (auto unboxing) of wrapper
    // class Integer to integer
    public void wrapper_unboxing(){
        // As we assign an object of wrapper class type to primitive type
        // it will "unbox" it into the primitive type hence unboxing
        // and as we're not using any wrapper method it is done
        // automatically hence auto unboxing.
        num = num_var;
        System.out.println("The value in primitive type is same to that of wrapper class type " + num);
    }
}

public class WrapperClass {
    public static void main(String[] args) {
        // An integer primitve varaible we will pass to be boxed by wrapper.
        int i = 5;
        // Reference varaible to the class object so that we can call fucntions.
        sample_wrapper sw = new sample_wrapper();
        // Method is called to print the curent value in wrapper object
        sw.print_variable();
        // Method is called to pass an integer primitive value and box it
        // into the wrapper class object
        sw.primitive_boxing(i);
        // Method is called to show that the wrapper class object can be unboxed 
        // into primitive type varaible
        sw.wrapper_unboxing();
    }
}
