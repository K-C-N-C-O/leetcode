package leetcode;
/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。
 */
public class huiwenshu {
    public boolean isPalindrome(int x) {
        int ge;
        int y=x;
        int m=0;
        while(y>0){
            m=m*10;
            ge=y%10;
            y=y/10;
            m+=ge;
        }
        return m==x;
    }
}
