/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package hungry;


/**
 * @author eason.li
 *
 */
public class Hungry {
    private static Hungry hungry = new Hungry();
    
    private Hungry(){}
    
    public static Hungry getInstance() {
        return hungry;
    }
}
