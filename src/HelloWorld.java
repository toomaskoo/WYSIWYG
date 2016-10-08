import java.io.*;
public class HelloWorld {
    public static void main(String args[]) throws IOException {
        System.out.println("Hello World!");


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
