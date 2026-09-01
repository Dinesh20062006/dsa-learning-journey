class Solution {
    public int[][] setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        boolean [] row=new boolean[n];
        boolean [] col=new boolean[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
         for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<m;j++){
               if(row[i]==true||col[j]==true){
                arr[i][j]=0;
               }
               //System.out.print(arr[i][j]);
            }
            
        }
        return arr;
        

    }
}