public class ReverseAString{
    public static void main(String[] args) {
        String str = "helloP";
        char[] ch = str.toCharArray();
        int left = 0, right= str.length()-1;
        
        while(left<right){
            char temp = ch[left];
            ch[left]= ch[right];
            ch[right]= temp;
            left++;
            right--;
        }
        // String revString = ch.toString();
        String revString = new String(ch);
        System.out.println(revString);
    }
}