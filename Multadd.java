public class Multadd {

public static double multadd(double a, double b, double c) {
	return a * b + c;
}

public static double expSum(double x) {
	return multadd(1.0, x * Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
}

public static void main (String[] args) {
	System.out.println(multadd(1.0, 2.0, 3.0));
	System.out.println(multadd(1.0, Math.sin(Math.PI/4), (Math.cos(Math.PI/4))/2));
	System.out.println(multadd(1.0, Math.log(10.0), Math.log(20.0)));
	System.out.println(expSum(1));
}

}
