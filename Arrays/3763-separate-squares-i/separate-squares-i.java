class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        
        for (int[] sq : squares) {
            double length = sq[2];
            totalArea += length * length;
            low = Math.min(low, sq[1]);
            high = Math.max(high, sq[1] + length);
        }
        
        double targetArea = totalArea / 2.0;
        
        for (int i = 0; i < 70; i++) {
            double mid = low + (high - low) / 2.0;
            
            if (calculateAreaBelow(squares, mid) < targetArea) {
                low = mid; 
            } else {
                high = mid; 
            }
        }
        
        return low;
    }
    
    private double calculateAreaBelow(int[][] squares, double y) {
        double area = 0;
        
        for (int[] sq : squares) {
            double bottomY = sq[1];
            double topY = sq[1] + sq[2];
            double length = sq[2];
            
            if (y >= topY) {
                area += length * length;
            } else if (y > bottomY) {
                area += (y - bottomY) * length;
            }
        }
        
        return area;
    }
}