abstract class Konda{
	void police(){ //concrete method
		System.out.println(" Konda became police and i wanted to become a IAS officer");
	}
	abstract void ias();// abstract method
}
abstract class Chandra extends Konda{
	void bekari(){
		System.out.println(" Chandra is a bekari");
	}
	
}
class ChinChandra extends Chandra {
		public void ias(){
		System.out.println("I am a IAS officer");
	}
}
class Abstract{
	public static void main(String args[]){
		ChinChandra ch = new ChinChandra();
		ch.ias();
	}
}