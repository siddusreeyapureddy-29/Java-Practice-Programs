class Calculator{
public int add(int a,int b){
return a+b;
}
public int sub(int a,int b){
return a-b;
}

public calss Main{
public static void main(String args[]){
calculator cal=new calculator();
int sum=calculator.add(56,90);
System.out.println("addition is" +sum);
int sub=calculator.sub(90,34);
System.out.println("substraction is" +sub);
}}


