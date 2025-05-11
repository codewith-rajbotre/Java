public class ASCII{
    public static void main(String[]args){
        int num = 5;
        String s ="JAMES";
        
        int sum =0 ;
        for(int i=0; i< s.length(); i++){
              int a = (int)s.charAt(i);
               if((a)%2!=0 || (i+1)%2!=0){
           sum = sum +(a*(i+1));
               }
        }
        System.out.println(sum);
    }
}