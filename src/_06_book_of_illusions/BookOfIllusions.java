package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.prism.Image;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

// 1. Make a JFrame variable and initialize it using "new JFrame()"

JFrame f = new JFrame();

JLabel l = new JLabel();

int cli = 0;


public void run() {

// 2. make the frame visible

f.show();

// 3. set the size of the frame

f.setSize(1000, 1000);

// 4. find 2 images and save them to your project’s default package



// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"

String img = "ill.png";

// 6. create a variable of type "JLabel" but don’t initialize it yet



// 7. use the "loadImage..." methods below to initialize your JLabel

l = loadImageFromComputer(img);

// 8. add your JLabel to the frame

f.add(l);

// 9. call the pack() method on the frame

f.pack();

// 10. add a mouse listener to your frame (hint: use *this*)

f.addMouseListener(this);

}

public void mousePressed(MouseEvent e) {
// 11. Print "clicked!" to the console when the mouse is pressed

System.out.println("clicked!");

cli+=1;

if(cli==3) {
cli=0;
}

// 12. remove everything from the frame that was added earlier

f.remove(l);

// 13. load a new image like before (this is more than one line of code)

String img = "ill.png";

String img1 = "ill1.png";

String img2 = "ill2.png";



if(cli==0) {
l = loadImageFromComputer(img);
f.add(l);
}


if(cli==1) {
l = loadImageFromComputer(img1);
f.add(l);
}


if(cli==2) {
l = loadImageFromComputer(img2);
f.add(l);
}



// 14. pack the frame

f.pack();

}

// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

/*
* To use this method, the image must be placed in your Eclipse project under "default package".
*/
public JLabel loadImageFromComputer(String fileName) {
URL imageURL = getClass().getResource(fileName);
Icon icon = new ImageIcon(imageURL);
return new JLabel(icon);
}

}
