package files;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
 */
public class SimpleApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Simple Applet", 300,300);
        System.out.println('a');
    }
}
