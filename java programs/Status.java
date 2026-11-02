enum Statu{
	Running,Singing,Rating,Dancing;
}
public class Status{
	public static void main(String args[]){
		Statu s=Statu.Singing;
		System.out.println(s.ordinal);
	}
}
