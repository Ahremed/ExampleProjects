package example.CliServ;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;


/**
 * Created by Vladyslav on 14.02.2016.
 */
public class Serial {
    private static ArrayList<Profile> profiles = new ArrayList<>();
    public static void main (String[] args)
    {
        profiles = (ArrayList<Profile>) deserData("profiles");
        System.out.println(profiles.size());
        Profile profile = new Profile();
        profile.setName(JOptionPane.showInputDialog(null,"What is your name?"));
        profile.setSurname(JOptionPane.showInputDialog(null,"What is your surname?"));
        profiles.add(profile);
        for (Profile p:profiles)
        {
            System.out.println(p.getName()+ " "+ p.getSurname());
        }
        System.out.println(profiles.size());
        serData("profiles",profiles);
    }

    private static Object deserData(String fileName) {
        Object out = null;
        try {
            FileInputStream finp = new FileInputStream(fileName+".ser");
            ObjectInputStream oinp = new ObjectInputStream(finp);
            out = oinp.readObject();
            finp.close();
            oinp.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e) {
            System.exit(2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return out;
    }

    private static void serData(String fileName, Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Problem IO");
            System.exit(2);
        }
    }


}
