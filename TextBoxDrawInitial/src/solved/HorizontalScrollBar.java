package solved;

/**
 * Created by shubham.jh on 28/07/16.
 */
public class HorizontalScrollBar extends GUIDecorator {

    public HorizontalScrollBar(GraphicUserInterface graphicUserInterface){
        this.graphicUserInterface=graphicUserInterface;
    }

    @Override
    public void draw() {
        graphicUserInterface.draw();
        System.out.println("Drawing horizontal scroll bar");
    }
}
