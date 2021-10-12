package mathObject;

public class Math {
	public int sum(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	public int sub(int n1, int n2) {
		int result;
		result = n1 - n2;
		return result;
	}
	
	public int multi(int n1, int n2) {
	   int result;
	   result = n1 * n2;
	   return result;
    }
	public double divide(int n1, int n2) {
		double result;
		result=n1/n2;
		return result;
	}
    private double pi;
    public Math() {
    	this.pi=3.14785;
    }
    public double getPi() {
    	return pi;
    }
    public double areaOfCricle(double r) {
    	return this.getPi()*r*r;
    }
    public double volumeOfShpere(double r) {
       return this.getPi()*r*r*r*4/3;}

	public double areaOfRectangularPrism(double a,double b,double h){
		double result;
}
		return result;
	} 
       
	public int sumofthenumbersBetween(int a, int b) {
		int result=0;
		for(int i=a+1;i<b;i++) {
			result-=i;
		}
		return result;
	}
}

