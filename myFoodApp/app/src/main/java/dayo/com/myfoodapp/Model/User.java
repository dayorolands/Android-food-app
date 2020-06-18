package dayo.com.myfoodapp.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

//@Entity(tableName = "User")
public class User {
    private String Name;
    private String Password;
    private String Phone;
    private String IsStaff;


    public User() {
    }

    public String getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }

    public User(String name, String password) {
        Name = name;
        Password = password;
        IsStaff = "false";
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
