interface Programmer{
	void becomeProgrammer();
}
interface Engineer{
	void becomeEngineer();
}
interface Innovator{
	void becomeInnovator();
}
class AITSStudent implements Programmer,Engineer,Innovator{
	public void becomeProgrammer(){
		System.out.println("I learned computer programming skills");
	}
	public void becomeEngineer(){
		System.out.println("I learned software product development skills");
	}
	public void becomeInnovator(){
		System.out.println("i learned some innovation skills");
	}
	public void becomeCEO(){
		System.out.println("i can start my own business..");
	}
}
class MultipleInheritence{
	public static void main(String args[]){
		AITSStudent stud=new AITSStudent();
		stud.becomeProgrammer();
		stud.becomeEngineer();
		stud.becomeInnovator();
		stud.becomeCEO();
	}
}