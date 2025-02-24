public class For{
    public static void main(String[] args) {

    //   Pattern :
    //   *
    //   **
    //   ***
    //   ****
    //   *****
        // for(int i=0 ; i<5 ; i++){
        //     for(int j=0 ; j<5 ; j++){
        //         if(j<=i){
        //         System.out.print("*");
        //         }
        //     }
        //     System.out.printf("\n");
        // }

    //    *
    //    **
    //    ***
    //    **
    //    *
    //    *
    //    **
    //    ***
    //    **
    //    *
    //    *
    //    **
    //    ***
    //    **
    //    *
    for(int k=0 ; k<3 ; k++){
     for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                if(j<=i ){
                System.out.print("*");
                }
            }
            System.out.printf("\n");
        }
    for(int i=3 ; i>0 ; i--){
            for(int j = 3 ; j>0 ; j--){
                if(j<=i){
                     System.out.print("*");
                }
                
            }
            System.out.printf("\n");
      }
   }
//   1
//   12
//   123
//   12
//   1


//    for(int i=1 ; i<3 ; i++){
//             for(int j=1 ; j<3 ; j++){
//                 if(j<=i ){
//                 System.out.print(j);
//                 }
//             }
//             System.out.printf("\n");
//         }
//     for(int i=3 ; i>0 ; i--){
//             for(int j = 3 ; j>0 ; j--){
//                 if(j<=i){
//                      System.out.print(j);
//                 }
                
//             }
//             System.out.printf("\n");
//       }

    }

}