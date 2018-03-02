
public class prim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for()

	}
	private static boolean isprime(int num)
	{
		if(num<2) return false;
		if(num==2) return true;
		if(num%2==0) return false;
		for (int i = 3; i*i<= num; i+=2) {
			System.out.println(i);
			if(num%i==0) return false;
		return true;
			
		}
	}

}
