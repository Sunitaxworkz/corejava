abstract class Computer{

boolean working;
int noOfHdmiPort;

Computer(){
System.out.println("invoked Computer default constr");
}
void display(){
System.out.println("invoked display in computer");

}
abstract void wifiConnect();//{ 
//System.out.println("invoked ComputerwifiConnect in computer");

	
//}
}