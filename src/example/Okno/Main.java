package example.Okno;

import javax.imageio.ImageIO;
import javax.swing.plaf.OptionPaneUI;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Vladyslav on 18.02.2016.
 */
public class Main {
    public static BufferedImage getImage() {
        return image;
    }

    public static void setImage(BufferedImage image) {
        Main.image = image;
    }
    public static void setImage(URL url) {
        try {
            ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void setImage(File file) {
        try {
            ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void SaveImage(File file,String format){
        try {
            ImageIO.write(image,format,file);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static MainWindow getMw() {
        return mw;
    }

    public static void setMw(MainWindow mw) {
        Main.mw = mw;
    }

    private static BufferedImage image;
    private static MainWindow mw;
    public static void main(String[] args) {
        mw = new MainWindow(640,480);

    }
}
