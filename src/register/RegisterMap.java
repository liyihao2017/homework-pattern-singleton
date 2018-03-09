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
public class RegisterMap {
    
    private static Map<String,Object> map = new ConcurrentHashMap<>();
    
    public static Map getInstance(String name) {
        if (map.get(name) == null) {
            map.put(name, new RegisterMap());
        }
        
        return (Map)map.get(name);
    }
}
