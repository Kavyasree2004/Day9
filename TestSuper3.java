//super is used to invoke parent class constructor

class Animal{
Animal(){
System.out.println("animal is created");
}
}
class Dog extends Animal{
Dog(){
//super(); the output will be same if super is mentioned or not
System.out.println("dog is created");
}
}
class TestSuper3{
public static void main(String args[]){
Dog d=new Dog();
}
}