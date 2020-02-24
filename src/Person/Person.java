package Person;

import java.math.BigInteger;
import java.util.ArrayList;

public class Person {
    private String fname;
    private String lname;
    private ArrayList<BigInteger> contactnumber;
    private String email;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() { return lname; }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public ArrayList<BigInteger> getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(ArrayList<BigInteger> contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s;
        if(contactnumber.size()==1)
        {
            s=" First Name: "+fname+"\n Last Name: "+lname+"\n Contact Number: "+contactnumber.get(0)+"\n Email Address: "+email+"\n";
        }
        else
        {
            s=" First Name: "+fname+"\n Last Name: "+lname+"\n Contact Number(s): "+contactnumber+"\n Email Address: "+email+"\n";
        }
        return s;
    }
}