
class Window {
    private int width, height;
    private String color;

    Window (int w, int h, String c) {
        width = w;
        height = h;
        color = c;
    }

    void draw() {
        System.out.println("Drawing TextField: " + width + ", " + height + " with color : #" + color);
    }
}

class WindowWithVerticalScrollBar extends Window {

    WindowWithVerticalScrollBar (int w, int h, String c) {
        super(w, h, c);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing vertical scroll bar");
    }
}

class WindowWithBorder extends Window {

    WindowWithBorder (int w, int h, String c) {
        super(w, h, c);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing border");
    }
}

class WindowWithHorizontalScrollBar extends Window {

    WindowWithHorizontalScrollBar (int w, int h, String c) {
        super(w, h, c);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing horizontal scroll bar");
    }
}

class WindowWithVerticalAndHorizontalScrollBar extends Window {

    WindowWithVerticalAndHorizontalScrollBar(int w, int h, String c) {
        super(w, h, c);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing vertical and horizontal scroll bar");
    }

}

class WindowWithVerticalAndHorizontalScrollBarAndBorder extends Window {

    WindowWithVerticalAndHorizontalScrollBarAndBorder(int w, int h, String c) {
        super(w, h, c);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing vertical and horizontal scroll bar and border");
    }

}

public class Main {
    public static void main (String[] args) {
        Window w = new WindowWithVerticalAndHorizontalScrollBarAndBorder(10, 20, "white");
        w.draw();

        w = new WindowWithHorizontalScrollBar(10, 20, "white");
        w.draw();

        w = new WindowWithBorder(10, 20, "white");
        w.draw();

        w = new Window(10, 20, "white");
        w.draw();
    }
}