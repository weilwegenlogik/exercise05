import greenfoot.*;
import java.util.ArrayList;

/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara: <p>
 * 
 * <i>MyKara ist eine Unterklasse von Kara. Sie erbt damit alle Methoden der Klasse Kara:</i> <p>
 * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara
{
    public ArrayList<String> createBitmap(){
        ArrayList<String> lines = new ArrayList();
        lines.add("x       x ");
        lines.add("x       x ");
        lines.add("x       x ");
        lines.add("x       x ");
        lines.add("x   x   x ");
        lines.add("x   x   x ");
        lines.add("x   x   x ");
        lines.add(" xxx xxx  ");
        return lines;

    }

    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */
    public void act() 
    {
        drawLetter(createBitmap());
    }

    public void drawLetter(ArrayList<String> bitmap){
        // hint: you will need this boolean flag for turning in the right direction
        // and extracting the correct character from a line.
        boolean goingRight = true;
        // ...
    }

}
