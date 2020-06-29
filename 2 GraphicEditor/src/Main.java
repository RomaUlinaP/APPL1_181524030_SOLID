
import Model.Circle;
import Model.GraphicEditor;
import Model.Square;
import Model.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RomaUlina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Square square = new Square();
        
        GraphicEditor editor = new GraphicEditor();
        editor.DrawShape(circle);
        editor.DrawShape(rect);
        editor.DrawShape(square);
    }
    
}
