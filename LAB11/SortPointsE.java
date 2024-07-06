package LAB11;

import java.util.*;

public class SortPointsE {
    public static void main(String[] args) {
        Random rand = new Random();
        Point[] points = new Point[100];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(rand.nextInt(100), rand.nextInt(100));
        }

        Arrays.sort(points);
        System.out.println("Points x-coordinates: " + Arrays.toString(points));

        Arrays.sort(points, new CompareY());
        System.out.println("Points y-coordinates: " + Arrays.toString(points));
    }
}

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x == other.x) {
            return Integer.compare(this.y, other.y);
        } else {
            return Integer.compare(this.x, other.x);
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.y == p2.y) {
            return Integer.compare(p1.x, p2.x);
        } else {
            return Integer.compare(p1.y, p2.y);
        }
    }
}


