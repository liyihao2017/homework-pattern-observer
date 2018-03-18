/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package test;

import java.lang.reflect.Method;

import core.Event;
import entity.Mouse;
import entity.MouseCallback;
import entity.MouseEventType;

/**
 * @author eason.li
 *
 */
public class TestMouse {
    public static void main(String[] args) {
        MouseCallback mouseCallback = new MouseCallback();
        Mouse mouse = new Mouse();
        Method method;
        try {
            method = mouseCallback.getClass().getMethod("singleClick",Event.class);
            mouse.addListener(MouseEventType.SINGLE_CLICK , mouseCallback, method);
            
            mouse.singleClick();
        }  catch(Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
