package part2.lection1;

import java.math.*;

public class H15BigFact {
//	BigInteger res = BigInteger.valueOf(5);

	public BigInteger BigFact (int n){
		if (n<=1)
			return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(BigFact(n-1));
		//return n*factRec(n-1);
	
}
}
