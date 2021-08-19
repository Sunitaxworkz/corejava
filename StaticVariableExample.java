public class StaticVariableExample 
{
    // Declaring static variable 
    static int a;
    static int b = 1;
    static String s;
    static String s1 = "Hi";
    
    public static void main(String[] args) 
    {
        // Access of static variable by class name
       System.out.println(StaticVariableExample.a);
        System.out.println(StaticVariableExample.b);
        System.out.println(StaticVariableExample.s);
        System.out.println(StaticVariableExample.s1);
    }    
}