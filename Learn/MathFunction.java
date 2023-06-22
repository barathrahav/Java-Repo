import java.lang.Math;

class MathFunction{
	public static void main(String args[]){
	
	//abs() retuns the absolute value of parameter
	System.out.println("abs(): " + Math.abs(40));

	//cbrt() retuns the Cube root of parameter
	System.out.println("cbrt(): " + Math.cbrt(27));

	//sqrt() returns the square root of parameter
	System.out.println("sqrt(): " + Math.sqrt(16));

	//signum() returns the sign of parameter
	System.out.println("signum(): " + Math.signum(0));

	//rint() retuns the double value that is closest to parameter that is equal to mathematical integer
	System.out.println("rint(): " + Math.rint(1.4));

	//ceil() returns the value of parameter rounded upto its nearest integer
	System.out.println("ceil(): " + Math.ceil(0.87));

	//floor() returns the value of parameter rounded down to its nearest parameter
	System.out.println("floor(): " + Math.floor(5.8));

	//random() returns the random number between 0 and 1
	System.out.println("random(): " + Math.random());

	//pow() retuns the value of parameter one to the power of parameter two
	System.out.println("pow(): " + Math.pow(5,3));

	//max() returns the number with the highest value 
	System.out.println("max(): " + Math.max(-22,22));

	//min() returns the number with the lowest value
	System.out.println("min(): " + Math.min(-22,22));

	//copySign() returns the first floating parameter with sign of second floating parameter
	System.out.println("copySign(): " + Math.copySign(5,-3)); 
	
	//exp() returns the value of e^x
	System.out.println("exp(): " + Math.exp(2));
	
	//expm1() returns the value of (e^x)-1
	System.out.println("expm1(): " + Math.expm1(2));

	//getExponent() returns the unbiased exponent used in parameter
	System.out.println("getExponent(): " + Math.getExponent(1234.5678));

	//hypot() returns sqrt(x^2 + y^2) without intermediate of overflow or underflow
	System.out.println("hypot(): " + Math.hypot(2,3));

	//IEEEremainder() returns the IEEE754 standard value
	System.out.println("IEEEremainder(): " + Math.IEEEremainder(10,10));

	//nextAfter() returns the floating number adjacent to the parameter 1 in the direction to the parameter 2
	System.out.println("nextAfter(): " + Math.nextAfter(2,5));

	//nextUp() returns the floating point value adjacent to parameter in the direction of positive infinity
	System.out.println("nextUp(): " + Math.nextUp(2));

	//round() returns the value of parameter rounded to its nearest integer
	System.out.println("round(): " + Math.round(2.5));

	//
	System.out.println("acos(): " + Math.acos(-1));
	System.out.println("asin(): " + Math.asin(-1));
	System.out.println("atan(): " + Math.atan(-1));
	System.out.println("atan2(): " + Math.atan2(1,2.5));
	System.out.println("cos(): " + Math.cos(1));
	System.out.println("cosh(): " + Math.cosh(1));
	System.out.println("log(): " + Math.log(10));
	System.out.println("log10(): " + Math.log10(10));
	System.out.println("log1p(): " + Math.log1p(10));
	System.out.println("sin(): " + Math.sin(0.2));
	System.out.println("sinh(): " + Math.sinh(2.5));
	System.out.println("tan(): " + Math.tan(2.5));
	System.out.println("tanh(): " + Math.tanh(2.5));
	System.out.println("toDegrees(): " + Math.toDegrees(Math.PI/4));
	System.out.println("toRadians(): " + Math.toRadians(45));
	System.out.println("ulp(): " + Math.ulp(2.5));
}
}














