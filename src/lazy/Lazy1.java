/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package lazy;


/**
 * @author eason.li
 *
 */
public class Lazy1 {
    private static Lazy1 lazy = null;
    private Lazy1(){}
    
    public static Object getInstance() {
        if (lazy == null) {
            lazy = new Lazy1();
        }
        return lazy;
    }
}
