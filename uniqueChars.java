//CtCI 1.1
//Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?

public class uniqueChars{
	
	public static void main(String[] args){
		String str = "abcdef";
		int i;
		boolean[] alphaBit = new boolean[256]; //Considering ASCII chars.
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

/*
#### ANALYSIS ####
complexity: 
	time: O(n)
	space: O(n)

#### OTHER SOLUTIONS ####
	Do the same stuff but WITHOUT ALLOCATING THE BOOLEAN ARRAY.
	Compare each char with all the others (O(n²)) time and no space.
	Sort the string O(log n) and then check the string for each neighboring char O(n) -> O(n log n)
	(???) Sort the string and do a binary search O(log n) for each char O(n) -> O(n log n)

#### QUESTIONS ####
Does java does automatic char->int casting?
	Yes.
Does java have a bitArray-like data structure?
	Yes. Check BitSet.
How would it change for Unicode chars?

#### TODO ####
Create unitTests
*/
