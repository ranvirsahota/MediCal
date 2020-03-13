package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Accounts {
    @PrimaryKey(autoGenerate = true)
    public int accountID;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "password")
    public String password;

    @ColumnInfo(name="f_name")
    public String fName;

    @ColumnInfo(name="l_name")
    public String lName;

    @ColumnInfo(name="house_number")
    public int houseNum;

    @ColumnInfo(name="address_one")
    public String address1;

    @ColumnInfo(name="address_two")
    public String address2;


    @ColumnInfo(name="city")
    public String city;

    @ColumnInfo(name="county")
    public String county;

    @ColumnInfo(name="post_code")
    public String postCode;

    @ColumnInfo(name="phone_number")
    public int phoneNumber;
}
