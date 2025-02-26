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
//     for(int k=0 ; k<3 ; k++){
//      for(int i=0 ; i<2 ; i++){
//             for(int j=0 ; j<2 ; j++){
//                 if(j<=i ){
//                 System.out.print("*");
//                 }
//             }
//             System.out.printf("\n");
//         }
//     for(int i=3 ; i>0 ; i--){
//             for(int j = 3 ; j>0 ; j--){
//                 if(j<=i){
//                      System.out.print("*");
//                 }
                
//             }
//             System.out.printf("\n");
//       }
//    }
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


//Pattern
// ***
//  **
//   *
//  **
// ***


// 2nd Way
   // int n = 3; 

       
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

     
        // for (int i = n - 2; i >= 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        

         int space = 0 ;
         int cEnd =4;
         for(int i=1; i<=7 ; i++){
          for(int j=1 ; j<=cEnd ; j++){
            if(space >= j){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }

            System.out.println();

            if( i < 4){
                space++;
                cEnd++;

            }
            else{
                space--;
                cEnd--;
                
            }
        }
     }



    }

}