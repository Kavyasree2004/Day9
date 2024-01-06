class Animal{
String name;
void eat(){
System.out.println("Eating...");
}
}
class Dog extends Animal{
void display(){
System.out.println("My name is: "+name);
}
}
class Main{
public static void main(String args[]){
Dog labrador=new Dog();
labrador.name="Tommy";
labrador.eat();
labrador.display();
}
}