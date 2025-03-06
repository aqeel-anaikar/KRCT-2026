public class saddle {
    public static void main(String[] args) {
        int arr [][] = {{7,8,9},
                        {6,4,3},
                        {5,2,1}};
        int min = Integer.MAX_VALUE;
        int row[] = new int [3];int i,j;
        int col[] = new int [3];

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(arr[i][j]<min){
                    min  = arr[i][j];
                    row[i] = min;
                }
            }
        }
        for (int z : row) {
            
            System.out.println(z);
        }
        
    }
}
