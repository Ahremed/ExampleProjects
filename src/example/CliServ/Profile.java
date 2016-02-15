package example.CliServ;
import java.io.Serializable;

/**
 * Created by Vladyslav on 14.02.2016.
 */
public class Profile implements Serializable
{
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String name;
    private String surname;

}