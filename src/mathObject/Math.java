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
    public double
}