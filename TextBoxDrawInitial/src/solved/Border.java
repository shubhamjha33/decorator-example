package solved;

/**
 * Created by shubham.jh on 28/07/16.
 */
public class Border extends GUIDecorator {

    public Border(GraphicUserInterface graphicUserInterface){
        this.graphicUserInterface=graphicUserInterface;
    }

    @Override
    public void draw() {
        graphicUserInterface.draw();
        System.out.println("Drawing border");
    }
}
