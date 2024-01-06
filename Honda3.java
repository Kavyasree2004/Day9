//final method can be inherited but cannot be override

class Bike{
final void run(){
System.out.println("running...");
}
}
class Honda3 extends Bike{
public static void main(String args[]){
new Honda3().run();
}
}