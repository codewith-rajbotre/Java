class AdditionOfMatrices{
    public static void main(String[] args) {
        int [][]mat1 = {
            {12, 11},
            {15, 17}
        };
        int [][] mat2={
            {90,80},
            {70, 60}
        };
        int addMat[][] = new int[2][2];
        for(int i=0 ; i<mat1.length ; i++){
            for(int j=0 ; j<mat2.length ; j++){
                addMat[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0 ; i<mat1.length ; i++){
            for(int j=0 ; j<mat2.length ; j++){
                System.out.print(addMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}