class Matrix2DExample{
    public static void main(String[] args) {
        int [] [] mat = {{1,2},{3,4}};
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat.length ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}