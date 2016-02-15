package example.Calculator;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
/**
 * Created by Vladyslav on 06.02.2016.
 */
public class rdFile {
    static String[][] m = new String[5][3];
    static Scanner scr;
    public static void main(String args[])
    {
        openFile();
        readFile();
        out();
    }

    private static void out() {
        for (int row =0;row<m.length;row++)
        {
            for (int col=0; col<m[row].length;col++)
            {
               System.out.print(m[row][col]+" ");
            }
            System.out.println();
        }

    }

    private static void readFile() {
       while (scr.hasNext())
       {
           for (int row =0;row<m.length;row++)
           {
               for (int col=0; col<m[row].length;col++)
               {
                m[row][col]=scr.next();
               }
           }
       }
    }

    private static void openFile() {
        try {
            scr = new Scanner(new File("res//1.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"File not found");
        }
    }
}
