class addition_method{
int add(int a,int b){
return a+b;}
String add(String a,String b,String c){
return a+b+c;
}
float add(float a,float b){
return a+b;
}
}
class overloading{
public static void main(String args[]){
addition_method obj=new addition_method();
System.out.println("sum of two numbers=" +obj.add(56,90));
System.out.println("sum of two strings=" +obj.add("siddu","sai","triveni"));
System.out.println("sum of two float numbers=" +obj.add(34.89f,90.32f));
}}
 