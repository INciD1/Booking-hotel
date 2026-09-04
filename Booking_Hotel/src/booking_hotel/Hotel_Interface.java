/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking_hotel;

/**
 *
 * @author LEGION
 */
public interface Hotel_Interface {

    boolean login(String username, String password);

    boolean register(String username, String password);
}
