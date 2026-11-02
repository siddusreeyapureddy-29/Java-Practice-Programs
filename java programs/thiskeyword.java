class Food{
	String name;
	void setName(String name){
		this.name=name;
	}
	void getName(){
		System.out.println(name);
	}
}
class Thiskeyword{
	public static void main(String args[]){
	Food obj=new Food();
	obj.setName("Siddu Sai Triveni");
	obj.getName();
	}
}
