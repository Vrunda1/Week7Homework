package week7;

public class Wall {
    double width;
    double height;
    //main method

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    //constructor used to assign value to the instance variable
    public Wall() {

    }

    //Instance method
    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
        } else if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else if (width < 0 && height > 0) {
            this.width = 0;
            this.height = height;
        } else this.width = width;
        this.height = height;

    }

    //instance method
    public double getWidth() {
        return width;
    }

    //instance method
    public double getHeight() {
        return height;
    }

    //instance method no datayype,with parameter
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else
            this.width = width;
    }

    //instance method no datayype,with parameter
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;

    }

    //Instance method
    public double getArea() {

        return this.height * this.width;

    }

}