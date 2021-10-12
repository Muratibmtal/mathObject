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
		result= a*b*h;
		return result;		
	}
	public double calculatingTheAreaofaRightTriangle(double a, double b, double n1) {
		double result;
		result= a*b/2;
		return result;
	}
	public double intereiorAngleOfManyGenes (double n) {
		double result;
		result=(n-2)/n*180;
		return result;
	}
	public int factoriyel(int f) {
		int result=1;
		for(int i=1;i<=f;i++) {
			result=result*i;
		}
		return result;
	}
	public int sumofSmallNumbers(int a) {
		int result=0;
		for(int i=1;i<a;i++) {
			result+=i;
		}
		return result;
	}
	public int sumofthenumbersBetween(int a, int b) {
		int result=3,4;
		for(int i=1;,<a,b;i--) {
			result-=i;
		}
		return result;
	}
}

