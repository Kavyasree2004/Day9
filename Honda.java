//if you make any method final,you cannot override it

class Bike{
final void run(){
System.out.println("running");
}
}
class Honda extends Bike{
void run(){
System.out.println("running bike safely with 100kmph");
}
public static void main(String args[]){
Honda obh=new Honda();
obh.run();
}
}

/*OUTPUT :
compile time error
*/