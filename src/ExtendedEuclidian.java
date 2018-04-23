
import java.math.BigInteger;

public class ExtendedEuclidian {
	 
	   static BigInteger[] gcd(BigInteger p, BigInteger q) {
		   if(q.equals(new BigInteger("0")))
	         return new BigInteger[] { p, new BigInteger("1"), new BigInteger("0")};

	      BigInteger[] vals = gcd(q, p.mod(q));
	      BigInteger d = vals[0];
	      BigInteger a = vals[2];
	      BigInteger div=p.divide(q);
	      BigInteger e1mule2=div.multiply(vals[2]);
	      BigInteger b=vals[1].subtract(e1mule2);
	      return new BigInteger[] { d, a, b };
	   }

	   public static void main(String[] args) {
		   
		   BigInteger p = new BigInteger("7");
		   BigInteger q = new BigInteger("15");
		   BigInteger vals[] = gcd(p, q);
		   //gcd(4768552418835129570121, 20262211388320084211478) = 17
		   //4768552418835129570121(-520035163831585349815) + 20262211388320084211478(122386194223493771744) = 17
	      System.out.println("gcd(" + p + ", " + q + ") = " + vals[0]);
	      System.out.println( p + "(" +vals[1]+ ") + " + q + "(" +vals[2] + ") = " + vals[0]);
	   }
	

}
