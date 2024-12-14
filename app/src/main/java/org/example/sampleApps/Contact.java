package org.example.sampleApps;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author almacro
 */
public class Contact {
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty cellPhone = new SimpleStringProperty("");
    
    public Contact() {
        this("", "", "");
    }
    
    public Contact(String firstName, String lastName, String cellPhone) {
        setFirstName(firstName);
        setLastName(lastName);
        setCellPhone(cellPhone);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public String getCellPhone() {
        return cellPhone.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone.set(cellPhone);
    }
}
