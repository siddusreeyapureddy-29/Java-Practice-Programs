package p2;
public abstract class AbstractFigure implements Figure{
	public double dim1,dim2;
	public AbstractFigure(){
		this.dim1=0;
		this.dim2=0;
	}
	public AbstractFigure(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public void display(){
		System.out.println("dimensions are:");
		System.out.println("Dim1="+dim1+"\t"+"Dim2="+dim2);
	}
	public abstract double area();
}
