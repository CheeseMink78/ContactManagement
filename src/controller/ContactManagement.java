
package controller;

import java.util.function.Predicate;
import model.Contact;
import model.ContactList;
import view.Menu;

public class ContactManagement extends Menu {
    public static String[] choices= {"Add a contact","Display all contacts","Delete a contact","Exit"};
    private ContactList listContact= new ContactList();
    public ContactManagement() {
        super("Contact Program",choices);
    }
    public void addContact() {
        Predicate<String> validForPhone= p->p.matches("^\\(?(\\d{3})\\)?[-.\\s]?(\\d{3})[-.\\s]?(\\d{4})(\\s?(?:x|ext)\\d{1,5})?$");
        int id;
        String fullname,group,address,phone;
        fullname=Input.getString("full name");
        group=Input.getString("group");
        address=Input.getString("address");
        do{
        System.out.println("Please input Phone flow:");
        System.out.println("1234567890");
        System.out.println("123-456-7890"); 
        System.out.println("123-456-7890 x1234");
        System.out.println("123-456-7890 ext1234");
        System.out.println("(123)-456-7890");
        System.out.println("123.456.7890");
        System.out.println("123 456 7890");
        phone=Input.getString("phone");
        } while(!validForPhone.test(phone));
        if(listContact.addContact(new Contact(fullname, group, address, phone))) {
            System.out.println("Sucessful.");
        }
        else {
            System.out.println("Already exist.");
        }        
    }
    public void displayAllContacts() {
        System.out.println("Contacts List:");
        for(Contact test: listContact.getcList()){
            System.out.println(test);
        }
    }
    public void deleteCotact() {
        int id=Input.getInt("id");
        if(listContact.deleleContact(id)) {
            System.out.println("Sucessful.");
        }
        else {
            System.out.println("Not found id");
        }
    }
    @Override
    public void execute(int ch) {
        switch(ch) {
            case 1:addContact();break;
            case 2:displayAllContacts();break;
            case 3:deleteCotact();break;
            case 4:exitMenu();break;
            default:break;
        }
    }
    
}
