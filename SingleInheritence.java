class Person{
	protected String name;
	protected String aadhar;
	Person(String name,String aadhar){
		this.name=name;
		this.aadhar=aadhar;
	}
	public void displayPerson(){
		System.out.println("i am an indian");
		System.out.println("My name is:"+name);
		System.out.println("My aadhar number:" +aadhar);
	}
}
class Programmer extends Person{
	public String s1;
	public String s2;
	public String s3;
	Programmer(String name,String aadhar,String s1,String s2,String s3){
	super(name,aadhar);
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	}
	public void displayProgrammer(){
		super.displayPerson();
		System.out.println("i am indian computer programmer");
		System.out.println("My computer skills are...");
		System.out.println(s1+","+s2+","+s3);
	}
}
class SingleInheritence{
	public static void main(String args[]){
		Programmer p=new Programmer("haritha","3456890654322","java","python","c");
		p.displayProgrammer();
	}
}
		