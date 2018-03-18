/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * @author eason.li
 *
 */
public class EventListener {
    private Map<Enum,Event> listeners = new HashMap<Enum,Event>();
    
    public void addListener(Enum eventType,Object target,Method method) {
        listeners.put(eventType, new Event(target,method));
    }
    
    protected void trigger(Enum eventType) {
        if (!listeners.containsKey(eventType)) {
            return;
        } else {
            Event event = listeners.get(eventType);
            event.setSource(this);
            event.setTrigger(eventType.toString());
            try {
                event.getMethod().invoke(event.getTarget(),event);
            }  catch(Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
