package leetcode.String;

/**
 * Created by lenovo on 2017/6/12.
 */
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        char[] c=s.toCharArray();

        StringBuilder[] sbs=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sbs[i]=new StringBuilder();

        }
        int i=0;
        int len=c.length;
        int id=0;
        while(i<len){
            for(int idx=0;idx<numRows&&i<len;idx++ ){
                sbs[idx].append(c[i++]);
            }
            for(int idx=numRows-2;idx>=1&&i<len;idx--){
                sbs[idx].append(c[i++]);
            }
        }

        for(int j=1;j<sbs.length;j++){
            sbs[0].append(sbs[j]);
        }
        return sbs[0].toString();

    }
}
