class Twodimensional{
public static void main(String args[]){
int num[][]=new int[3][3];
num[0][0]=3;
num[0][1]=6;
num[0][2]=8;
num[1][0]=2;
num[1][1]=0;
num[1][2]=90;
num[2][0]=38;
num[2][1]=37;
num[2][2]=32;
for(int i=0;i<num.length;i++){
for(int j=0;j<num[i].length;j++){
System.out.print(num[i][j] +" ");
}
System.out.println();
}}}