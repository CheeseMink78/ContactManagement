
package model;
public class Contact {
    private int id;
    private String fullname,group,address,phone,lastname,firstname;
    public static int count=0;
    public Contact(String fullname, String group, String address, String phone) {
        this.id = ++count;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        String[] str=fullname.split(" ");
        this.firstname=str[0];
        this.lastname=str[str.length-1];
    }

    public int getId() {
        return id;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return String.format("%d |%-5s |%5s |%5s |%8s |%10s |%s", this.id,this.fullname,this.firstname,this.lastname,this.group,this.address,this.phone);
                }
    
}
