
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 * Write a description of class Platformer here.
 *
 * @author (Ashley Briggs)
 * @version (Nov-15-23)
 */
public class Platformer 
{
    public static void main(String[] args)
    {
        Window wframe = new Window();
        
        wframe.setTitle("Simple: Don't Die");       // javax.swing.JFrame extends java.awt.Frame -> Frame has .setTitle();
        
        wframe.setSize(800,800);            // javax.swing.JFrame inherited .setSize() from class java.awt.Window
        
        Dimension comp_display_size = Toolkit.getDefaultToolkit().getScreenSize();     
        //The Dimension class encapsulates the width and height of a component (in integer precision) in a single object.
                                            // Toolkit class is the abstract superclass of all actual implementations of the Abstract Window Toolkit.
        
        wframe.setLocation( (int) (comp_display_size.getWidth()/2 - wframe.getSize().getWidth()/2), (int) (comp_display_size.getHeight()/2 - wframe.getSize().getHeight()/2) );
        // takes the size of your screen & divides by 2 to put the frame in the middle 
        
        //wframe.pack();                      // (May change later) Causes this Window to be sized to fit the preferred size and layouts of its subcomponents. 
        wframe.setVisible(true);            // the user can see the  window
        wframe.setResizable(false);         // the window cannot be resized unless .setSize() is changed 
        wframe.setDefaultCloseOperation(Window.EXIT_ON_CLOSE); // sets the operation that will happen by default when the user initiates a "close" on this frame.
                                    // (Window.EXIT_ON_CLOSE) = exit application, default window close operation
        
        
    }
}
