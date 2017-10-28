
class Pascal {
    public  int [][] buildTriangle (int n){         // build a pascal tree 
     int[][] triangle = new int[n][n];              // n  -  number of rows in pascal triangle
     for(int i= 0; i < n; ++i){
         for (int j = 0 ; j <= i; ++j){
             if (j == i) triangle[i][j]  = 1 ;
             if (j == 0) triangle[i][j]  = 1 ;
             if (i != 0 && i != j && j != 0) triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
         }
     }
     return triangle;
    }

    public long sumOfRow (int row, int [][] triangleArray){
        long sum = 0;
        for (int j = 0; j < row; ++j){
            if (triangleArray[row-1][j] < 0) return -1;
            sum += triangleArray[row-1][j];
            System.out.println(triangleArray[row-1][j]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int row = 32;
        Pascal test = new Pascal();
        int [][] array = test.buildTriangle(row);
        long sum = test.sumOfRow(row,  array); // type any row u would like to count or modify to get value from anywhere u like
        if (sum <= 0) System.out.println("Int overflow");
        else System.out.println(sum);

    }
}

