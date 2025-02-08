public class Hello {

    // public is the access modifier static is basically you are telling the compiler to load this method in the stack 
    // void is the return type and String args are like default args to your main 
    // int float double char  long --> data types you'll use 
    // Integer String Long are classes that have predefined methods like : Integer.toString (pass some int value here);
    public static void main(String args[])
    {
        System.out.println("This is the first code I ever wrote in java");
        System.err.println(args);
    }
}