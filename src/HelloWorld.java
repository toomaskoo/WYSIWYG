import javax.swing.*;
import java.io.*;
public class HelloWorld {
    public static void main(String args[]) throws IOException {
        System.out.println("Hello World!");

        JFrame frame = new JFrame ("WYSIWYG");//create frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X closes the program
            frame.setVisible(true);
            frame.getGraphics();
            frame.setDefaultLookAndFeelDecorated(true);//looks like win XP
            frame.setSize(1024,768);//1024x768 size
            frame.getJMenuBar();

        //kirjutab index faili valmis
        PrintWriter index = new PrintWriter("index.html", "UTF-8");
        index.println("<h1>SUUR PEALKIRI BOLDIS</h1>");
        index.println("Teema");
        index.close();

        //kirjutab styles.css faili valmis
        PrintWriter css = new PrintWriter("styles.css", "UTF-8");
        css.println("h1 {color: red; text-align: center; font-size: 72px;}");
        css.close();
    }
}
