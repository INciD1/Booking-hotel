/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking_hotel;

/**
 *
 * @author cchan
 */
public class Person_Check {

    private String name;
    private String phone;

    public Person_Check(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] toArray() {
        return new String[]{this.name, this.phone};
    }
}
