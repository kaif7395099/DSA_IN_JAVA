class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int n = x;
        int r = 0;
        while(n != 0){
           int s = n%10;
         r = r*10 + s;
        n = n/10;
        }
        if(x == r) return true;
        else return false;
    }
}