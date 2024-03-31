
public class ConvertBinToDec {

	public static void main(String[] args) {
		System.out.println(converToDecimal("1101"));
	}
	public static int converToDecimal(String n) {
		int p2=1,res=0;
		for(int i=n.length()-1;i>=0;i--) {
			if(n.charAt(i)=='1') {
				res+=p2;
			}
			p2*=2;
		}
		return res;
	}
}
