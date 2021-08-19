class StaticConcept{
static int a;
static float value;//static variables or class level variables

static void display()//static method
{
	System.out.println("static method");
}
static void initDisplay()
{
	System.out.println("second static method");
}

static//Static block
{
	a=19;
	value=3.9f;
	System.out.println("Static Block");
}
public static void main(String[]args)
{
	System.out.println(a);
	System.out.println(value);
	StaticConcept.display();
	StaticConcept.initDisplay();
}
}