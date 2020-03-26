package database.entity.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "accounts")
public class Accounts {
    public Accounts(String email, String password, String fName, String lName, int houseNum, String address1, String address2, String city, String county, String postCode, int phoneNumber) {
        this.email = email;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.houseNum = houseNum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.county = county;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
    }

    @ColumnInfo(name = "account_id")
    @PrimaryKey(autoGenerate = true)
    public int accountID;

    public String email;

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

    public String city;

    public String county;

    @ColumnInfo(name="post_code")
    public String postCode;

    @ColumnInfo(name="phone_number")
    public int phoneNumber;
}