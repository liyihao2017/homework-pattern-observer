/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package entity;

import core.EventListener;

/**
 * @author eason.li
 *
 */
public class Publisher extends EventListener{
    public void add() {
        System.out.println("this is publisher add method");
        trigger(EventType.ADD);
    }
}
