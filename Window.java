import java.awt.Color;
/**
 *
 * @author (Ashley Briggs)
 * @version (Nov 15 23)
 */
public class Window extends javax.swing.JFrame     // A Frame is a top-level window with 
                                                   //a title and a border. The size of the frame 
                                                   //includes any area designated for the border. 
                                                   //The dimensions of the border area may be obtained 
                                                   //using the getInsets method 
{
    
    public Window()
    {
        GameWindow mini = new GameWindow(); 
        mini.setLocation(0,0);
        mini.setSize(this.getSize());
        mini.setBackground(Color.WHITE);
        mini.setVisible(true);
        this.add(mini); //adds a GameWindow to JFrame
    } 
    
}
