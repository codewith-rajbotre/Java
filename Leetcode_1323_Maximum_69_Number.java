// 1323_Maximum_69_Number.java

public class Leetcode_1323_Maximum_69_Number {

    public static void main(String[] args) {
       
        int num = 699996;
        char[] ch = String.valueOf(num).toCharArray();
        for(int i=0 ; i< ch.length ; i++){
               if(ch[i]=='6'){
                 ch[i]='9';
                 break;
               }
        }
         int n = Integer.parseInt(new String(ch));
        System.out.println("The value is :  "+n);

    }
}
