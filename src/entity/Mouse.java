/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package entity;

import core.Event;
import core.EventListener;

/**
 * @author eason.li
 *
 */
public class Mouse extends EventListener{
    public void singleClick() {
        System.out.println("this is mouse single click");
        trigger(MouseEventType.SINGLE_CLICK);
    }
    
    public void doubleClick() {
        System.out.println("this is double click");
        trigger(MouseEventType.DOUBLE_CLICK);
    }
}
