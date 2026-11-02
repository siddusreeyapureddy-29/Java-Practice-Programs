package p2;
public class TriangleFigure extends AbstractFigure{
	public TriangleFigure(){
		super();
	}
	public TriangleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
	public double area(){
		double ar=0.5*dim1*dim2;
		return ar;
	}
}