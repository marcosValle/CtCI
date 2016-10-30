/*Very basic implementation of a BitSet data structure
 *A simple array stores boolean values
 */
public class BitSet{
    boolean[] bitSet;
    int size;

   public BitSet(int size){
        if(size<0){ throw new NegativeArraySizeException(); }
        this.size = size;    
        this.bitSet = new boolean[this.size];
    }

    /* Sets the nth bit to true*/
    public void set(int n){
        if(n<0 || n>this.size){ throw new ArrayIndexOutOfBoundsException(); }
        this.bitSet[n] = true;
    }

    /* Gets the nth bit*/
    public boolean get(int n){
        return this.bitSet[n];
    }
    
    @Override
    public String toString(){
        String result = "";
        for(boolean b : this.bitSet)
            result += b ? 1 : 0;
        return result;
    }
 
    public static void main(String[] args){
        BitSet bs = new BitSet(10);
        bs.set(0);
        System.out.println(bs.get(0));
        System.out.println(bs.toString()); 
    }

}
