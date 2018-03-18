/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package core;

import java.lang.reflect.Method;

/**
 * @author eason.li
 *
 */
public class Event {
    private String trigger;
    private Object source;
    private Object target;
    private Method method;
    
    public Event(Object target, Method method) {
        this.target = target;
        this.method = method;
    }
    
    public String getTrigger() {
        return trigger;
    }
    
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
    
    public Object getSource() {
        return source;
    }
    
    public void setSource(Object source) {
        this.source = source;
    }
    
    public Object getTarget() {
        return target;
    }
    
    public void setTarget(Object target) {
        this.target = target;
    }
    
    public Method getMethod() {
        return method;
    }
    
    public void setMethod(Method method) {
        this.method = method;
    }
    
    
}
