package mathObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Math math=new Math();
        System.out.println(math.sum(5, 13));
        System.out.println(math.sub(5, 13));
        System.out.println(math.multi(5 , 13));
        System.out.println(math.divide(15 , 3));
        System.out.println(math.getPi());
        // pi*r*r areaOfCircle
        System.out.println(math.areaOfRectangularPrism(3,5,6));
        System.out.println(math.calculatingTheAreaofaRightTriangle(4, 5, 6));
        System.out.println(math.factoriyel(5));
        System.out.println(math.sumofSmallNumbers(6));
        System.out.println(math.sumofNumbersBetween(3,4));
	}

}
