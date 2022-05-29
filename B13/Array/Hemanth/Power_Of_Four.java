// Using bitCount method

// Intuition : I could see for the power of 4 like 4, 16, 64,.... contians only one 1 bit (100(4),10000(16),...) and I could also see that the numbers(n-1) 
//should always divisible by 3 Eg : 16 -> (16-1)%3 = 15%3 = 0.

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n>0 && (n-1)%3==0 && Integer.bitCount(n)==1){
            return true;
        }else{
            return false;
        }
    }
}
