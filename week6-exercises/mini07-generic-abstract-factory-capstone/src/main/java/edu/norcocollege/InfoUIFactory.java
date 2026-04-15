//package
package edu.norcocollege.cis18b.week6.mini07;

//Info UI Factory class that implements the UIFactory interface
public class InfoUIFactory implements UIFactory<InfoButton, InfoDialog> {
    //Create button method that returns an InfoButton
    public InfoButton createButton() {
        return new InfoButton();
    }
    //Create dialog method that returns an InfoDialog
    public InfoDialog createDialog() {
        return new InfoDialog();
    }
}