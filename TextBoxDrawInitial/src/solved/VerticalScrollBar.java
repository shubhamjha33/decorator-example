package solved;

/**
 * Created by shubham.jh on 28/07/16.
 */
public class VerticalScrollBar extends GUIDecorator{

    public VerticalScrollBar(GraphicUserInterface graphicUserInterface){
        this.graphicUserInterface=graphicUserInterface;
    }

    @Override
    public void draw() {
        graphicUserInterface.draw();
        System.out.println("Drawing vertical scroll bar");
    }
}
