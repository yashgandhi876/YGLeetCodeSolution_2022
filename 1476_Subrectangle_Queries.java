class SubrectangleQueries {
    int [][]matrix;
    
    public SubrectangleQueries(int[][] rectangle) {
        matrix = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {  
        int c1 = col1;
        
//         while(row2 >= row1 && col2 >= col1){            
//             matrix[row1][col1++] = newValue;
            
//             if(col2 < col1){
//                 col1 = c1;
//                 row1 += 1;
//             }
//         }
        for(int i = row1; i < matrix.length; i++){
            for(int j = col1; j < matrix[0].length; j++){
                if(i <= row2 && j <= col2){
                    matrix[i][j] = newValue;
                }
            }
        } 
    }
    
    public int getValue(int row, int col) {
        return matrix[row][col];
      }
    
 }
