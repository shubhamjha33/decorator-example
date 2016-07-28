package solved;

/**
 * Created by shubham.jh on 28/07/16.
 */
public class Window implements GraphicUserInterface {
    private int width, height;
    private String color;

    Window (int w, int h, String c) {
        width = w;
        height = h;
        color = c;
    }

    @Override
    public void draw() {
        System.out.println("Drawing TextField: " + width + ", " + height + " with color : #" + color);
    }
}
