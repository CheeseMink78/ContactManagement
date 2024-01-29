
package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    private String title;
    private ArrayList<T> choices;
    private Boolean continueRun = true;

    public Menu() {
    }

    public Menu(String title, T[] mchon) {
        this.title = title;
        choices = new ArrayList<>();
        for (T m : mchon) {
            choices.add(m);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<T> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<T> choices) {
        this.choices = choices;
    }
//----------------------------------------------------

    public void display() {
        System.out.println(title);
        System.out.println("-------------------");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
        System.out.println("-------------------");
    }
//----------------------------------------------------

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
//----------------------------------------------------

    public abstract void execute(int ch);
//----------------------------------------------------

    public void run() {
        while (continueRun) {
            int ch = getSelected();
            if (ch <= choices.size()) {
                execute(ch);
            } else {
                break;
            }
        }
    }
//----------------------------------------------------    

    public void exitMenu() {
        continueRun=false;
    }
}