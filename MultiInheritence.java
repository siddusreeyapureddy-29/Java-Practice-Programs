class Person{
	protected String name;
	Person(String name){
		this.name=name;
	}
	public void displayPerson(){
		System.out.println("i am an indian");
		System.out.println("My name is:"+name);
	}
}
class Programmer extends Person{
	protected String skills;
	Programmer(String name,String skills){
		super(name);
		this.skills=skills;
	}
	public void displayProgrammer(){
		System.out.println("i am an indian computer programmer");
		System.out.println("My programming skills are:"+skills);
	}
}
class Engineer extends Programmer{
	protected  String eskills;
	Engineer(String name,String skills,String eskills){
		super(name,skills);
		this.eskills=eskills;
	}
	public void displayEngineer(){
		super.displayPerson();
		super.displayProgrammer();
		System.out.println(" to became engineer i acquire following skills...");
	}
}
class MultiInheritence{
	public static void main(String args[]){
		Engineer e=new Engineer("siddu","java,python,c","critical thinking,logical thinking");
		e.displayEngineer();
	}
}
		
		