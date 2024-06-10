class Point {
    
    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getPointInfo() {
        return "x = " + this.x + " y = " + this.y;
    }
}


class Shape extends Point {

    public String name;
    public String colour;

    public Shape(float x, float y, String name, String colour) {
        super(x, y);
        this.name = name;
        this.colour = colour;
    }

    public String getShapeInfo() {
        return "x = " + this.x + " y = " + this.y + "name = " + this.name + "colour = " + this.colour;
    }
}


class Rectangle extends Shape {

    public float height;
    public float width;

    public Rectangle(float x, float y, String name, String colour, float height, float width) {
        super(x, y, name, colour);
        this.height = height;
        this.width = width;
    }

    public String getRectangleInfo() {
        return "x = " + this.x + " y = " + this.y + " name = " + this.name + " colour = " + this.colour + " height = " + this.height + " width = " + this.width;
    }
}


class Circle extends Shape {

    public float radius;

    public Circle(float x, float y, String name, String colour, float radius) {
        super(x, y, name, colour);
        this.radius = radius;
    }
    
    public String getCircleInfo() {
        return "x = " + this.x + " y = " + this.y + " name = " + this.name + " colour = " + this.colour + " radius = " + this.radius;
    }
}
