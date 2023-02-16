package broCodeYT;

import javax.swing.*;

// import statements used in YT tutorial; replace by IntelliJ with javax.swing.*
// import javax.swing.ImageIcon; YT
// import javax.swing.JFrame; YT

/*******************************************************************************
 * Bro Code: Youtube - https://www.youtube.com/watch?v=Kmgo00avvEw             *
 * #1 Frames                                                                   *
 * Date created:  2023/02/14                                                   *
 * Date modified: 2023/02/15                                                   *
 *******************************************************************************/

public class Frames
{
    public static void main(String[] args)
    {
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame();                            // creates a frame
        // default behaviour of 'X' close button is to hide the frame (HIDE_ON_CLOSE)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit app when frame closed
        frame.setResizable(false);                              // prevent frame from being resized
        frame.setSize(500, 500);                                // sets the x,y dimensions of the frame
        frame.setVisible(true);                                 // makes the frame visible
        frame.setTitle("Frame title");                          // add a title for the frame

        ImageIcon image = new ImageIcon("cw.jpeg");             // create ImageIcon (this may be for WIN only)
        frame.setIconImage(image.getImage());                   // change frame icon (wasn't one on macos, still isn't)
    }
}
