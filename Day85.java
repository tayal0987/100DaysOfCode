class Solution {
    static class Point {
        int x, y, dis;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dis = x * x + y * y; // Squared distance from origin
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> maxHeap = new PriorityQueue<>((a, b) -> b.dis - a.dis);

        for (int[] point : points) {
            maxHeap.offer(new Point(point[0], point[1]));
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the farthest point if we exceed size k
            }
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Point p = maxHeap.poll();
            result[i][0] = p.x;
            result[i][1] = p.y;
        }
        return result; // Return the k closest points
    }
}
