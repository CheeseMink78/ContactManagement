
package model;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> cList= new ArrayList<>();

    public ContactList() {
        addContact(new Contact("Nguyen Truong Giang","Penguin","Quang Binh","0123456789"));
        addContact(new Contact("Nguyen Van Dat","Datto","Quang Binh","0121223213"));
        addContact(new Contact("Tran Chi Minh","Penguin","Quang Binh","0987654321"));
        addContact(new Contact("Nguyen Van Duy Thang","BunBo","Hue","0123459876"));
    }

    public ArrayList<Contact> getcList() {
        return cList;
    }
    public boolean addContact(Contact c) {
        for(Contact test:cList) {
            if(test.getId()==c.getId()) return false;
        }
        cList.add(c);
        return true;
    }
    public boolean deleleContact(int id){
        for(Contact test:cList)  {
            if(test.getId()==id) {
                cList.remove(test);
                return true;
            }
        }
        return false;
    }
}
