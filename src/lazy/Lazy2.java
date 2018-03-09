/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package lazy;


/**
 * @author eason.li
 *
 */
public class Lazy2 {
    private static Lazy2 lazy = null;
    private Lazy2(){}
    
    public synchronized static Object getInstance() {
        if (lazy == null) {
            lazy = new Lazy2();
        }
        return lazy;
    }
}
