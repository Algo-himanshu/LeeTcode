class Solution {
    
     public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = happy(n);
        }
        return n == 1;
    }
    
    public int happy(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n/= 10;
        }
        return sum;
    }
}