package leetcode.String;

/**
 * Created by lenovo on 2017/6/18.
 */
/*
Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 */
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {

        int a1=str2Int(a.substring(0,a.indexOf("+")));
        int b1=str2Int(b.substring(0,b.indexOf("+")));

        int a2=str2Int(a.substring(a.indexOf("+")+1,a.indexOf("i")));
        int b2=str2Int(b.substring(b.indexOf("+")+1,b.indexOf("i")));

        int tem1=(-1)*(a2*b2)+(a1*b1);
        int tem2=a1*b2+a2*b1;
        String res="";
        res=res+tem1+"+"+tem2+"i";
        return res;
    }

    public int str2Int(String s){
        return Integer.parseInt(s);    }
}
