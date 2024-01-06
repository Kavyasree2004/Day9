//Aggregation

class Operation{
int sq(int n){
return n*n;
}
}
class Circle{
Operation op;
double pi=3.14;
double area(int radius){
op=new Operation();
int rsq=op.sq(radius);
return pi*rsq;
}
public static void main(String args[]){
Circle c=new Circle();
double res=c.area(5);
System.out.println(res);
}
}