package solved;

/**
 * Created by shubham.jh on 28/07/16.
 */
public class Main {

    public static void main(String[] args) {
        GraphicUserInterface graphicUserInterface=new Border(new VerticalScrollBar(new HorizontalScrollBar(new Window(2,3,"ffffff"))));
        graphicUserInterface.draw();
    }

}
