
class Calculator{
int add(int a,int b){
return a+b;
}
int sub(int a,int b){
return a-b;
}}
class Main{
public static void main(String args[]){
Calculator cal=new Calculator();
int sum=cal.add(56,90);
System.out.println("addition is" +sum);
int sub=cal.sub(90,34);
System.out.println("substraction is" +sub);
}}



