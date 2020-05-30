class Document {
    public void print() {
        System.out.println("printing a document...");
    }
}

class Car {
    public void start() {
        System.out.println("starting a car...");
    }
}

interface Colorable {
    int WHITE = 0, RED = 1, BLUE = 2, GREEN = 3, BLACK = 4;
    void setColor(int color);
    int getColor();
}

class ColoredDocument extends Document implements Colorable {
    int color;
    public void setColor(int color) {
        this.color = color;
        System.out.println("setting color of a ColoredDocument to " + color);
    }
    public int getColor() {
        return color;
    }
}

class ColoredCar extends Car implements Colorable {
    int color;
    public void setColor(int color) {
        this.color = color;
        System.out.println("setting color of a ColoredCar to " + color);
    }
    public int getColor() {
        return color;
    }
}

class InterfaceTest3 {
    public static void main(String[] args) {
        ColoredDocument doc = new ColoredDocument();
        makeWhite(doc);
        ColoredCar car = new ColoredCar();
        makeWhite(car);
    }

    public static void makeWhite(Colorable x) {
        x.setColor(Colorable.WHITE);
    }
}
