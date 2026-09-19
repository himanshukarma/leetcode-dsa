package leetcode.medium;

public class CircleAndRectangleOverlapping_1401 {

    public static void main(String[] args) {
        System.out.println(checkOverlap(1, 0, 0, 1, -1, 3, 1)); // Expected: true
        System.out.println(checkOverlap(1, 1, 1, 1, -3, 2, -1)); // Expected: false
    }
 
    
    public static boolean checkOverlap(int r, int cx, int cy, int x1, int y1, int x2, int y2) {
        int x = Math.max(x1, Math.min(cx, x2)) - cx;
        int y = Math.max(y1, Math.min(cy, y2)) - cy;

        return x * x + y * y <= r * r;
    }
}