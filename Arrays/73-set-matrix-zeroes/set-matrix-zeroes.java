class Solution {
    public int[][] setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        //boolean [] row=new boolean[n];
        //boolean [] col=new boolean[m];
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        // Check if the first row has any zeroes
        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        
        // Check if the first column has any zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
         for(int i=1;i<n;i++)
        {
           
            for(int j=1;j<m;j++){
               if(arr[i][0]==0||arr[0][j]==0){
                arr[i][j]=0;
               }
               //System.out.print(arr[i][j]);
            }
            
        }
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }
        
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
        return arr;
        

    }
}