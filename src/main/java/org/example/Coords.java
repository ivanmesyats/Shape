package org.example;

public class Coords {
    public int x, y;

    public Coords(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        Coords c = (Coords) obj;
        if (x == c.x && y == c.y)
        {
            return true;
        } else {
            return false;
        }


    }
}
