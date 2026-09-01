class Solution {
    public static class ChessNode{
        int row;
        int col;
        int turn;
        public ChessNode(int a,int b,int c){
            this.row=a;
            this.col=b;
            this.turn=c;
        }
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){
            return false;
        }
    PriorityQueue<ChessNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.turn, b.turn));
    int n=grid.length;
    int m=grid[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        {
            minHeap.add(new ChessNode(i,j,grid[i][j]));
        }
    }
    
    ChessNode prev=minHeap.poll();
    while(!minHeap.isEmpty()){
        ChessNode curr=minHeap.poll();
        System.out.println(curr.row+" "+curr.col+" " + curr.turn);
        int r=Math.abs(curr.row-prev.row);
        int c=Math.abs(curr.col-prev.col);

        if(r*c !=2){
            return false;
        }
        prev=curr;
        

    }
    return true;
}
}