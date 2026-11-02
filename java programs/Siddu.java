 class Chandra{
     int num=20;
     int insert(int a){
         System.out.println("java programming");
         return num+a;
     }
}
class Siddu{
     public static void main(String args[]){
          Chandra obj=new Chandra();
          int num1=obj.num;
          System.out.println(num1);
          int b=obj.insert(40);
          System.out.println(b);
     }
}