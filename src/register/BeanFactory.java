/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author eason.li
 *
 */
public class BeanFactory {
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
    
    public static Object getBean(String name) {
        if (!ioc.containsKey(name)) {
            Object obj = null;
            
            try {
                obj = Class.forName(name).newInstance();
                ioc.put(name, obj);
            } catch(Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
            return obj;
        } else {
           return ioc.get(name); 
        }
    }
}
