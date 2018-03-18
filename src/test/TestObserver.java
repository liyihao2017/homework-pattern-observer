/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package test;

import java.lang.reflect.Method;

import core.Event;
import entity.EventType;
import entity.Observer;
import entity.Publisher;

/**
 * @author eason.li
 *
 */
public class TestObserver {
    public static void main(String[] args) {
        
        try {
            Observer observer = new Observer();
            Method method = observer.getClass().getMethod("advice", new Class[]{Event.class});
            
            Publisher publisher = new Publisher();
//            publisher.addListener(EventType.ADD, observer, method);
            
            publisher.add();
            
        } catch(Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
