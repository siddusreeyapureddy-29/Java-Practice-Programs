import java.io.*;
import java.util.*;
class command{
public static void main(String args[]){
if(args.length>0){
System.out.println("command line arguments");
for(int i=0;i<args.length;i++){
System.out.println("args["+i+"]=" +args[i]);
}}
else{
System.out.println("no command line arguments");
}
}
}
