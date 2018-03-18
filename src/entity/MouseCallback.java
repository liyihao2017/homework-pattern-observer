/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package entity;

import core.Event;

/**
 * @author eason.li
 *
 */
public class MouseCallback {
    public void singleClick(Event e) {
        System.out.println("trigger mouse single click event");
    }
    
    public void doubleClick(Event e) {
        System.out.println("trigger mouse double click event");
    } 
}
