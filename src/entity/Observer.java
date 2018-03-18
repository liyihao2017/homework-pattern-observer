/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package entity;

import core.Event;

/**
 * @author eason.li
 *
 */
public class Observer {
    public void advice(Event event) {
        System.out.println("this is observer advice method");
    }
}
