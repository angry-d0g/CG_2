package figures;

import java.util.List;

public class Rectangle {
    List<int[]> points;

    public Rectangle(List<int[]> points) {
        this.points = points;
    }

    public List<int[]> getPoints() {
        return points;
    }

    public void setPoints(List<int[]> points) {
        this.points = points;
    }
}
