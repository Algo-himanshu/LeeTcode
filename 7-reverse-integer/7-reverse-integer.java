class Solution {
    public int reverse(int x) {
        long rev = 0;
        int a = Math.abs(x);
        while(a>0)
        {
            int num = a % 10;
            rev = rev *10 + num;
            a/=10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        if(x<0) return (int)(rev-(2*rev));
        else return (int)rev;
    }
}