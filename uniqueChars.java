//CtCI 1.1
//Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?

public class uniqueChars{
	
	public static void main(String[] args){
		String str = "abcdef";
		int i;
		boolean[] alphaBit = new boolean[256];
		boolean res=true;

		for(i=0 ; i<str.length() ; i++){
			if(alphaBit[(int) str.charAt(i)]==true){
				 res = false;
			}
			alphaBit[(int) str.charAt(i)] = true;
		}
		//print the result
		System.out.println(res);
	}
}
