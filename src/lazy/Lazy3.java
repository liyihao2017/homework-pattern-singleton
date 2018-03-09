/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package lazy;


/**
 * @author eason.li
 *
 */
public class Lazy3 {
    
    private boolean initialized = false;
    
    private Lazy3(){
        //·ÀÖ¹µ¥Àý±»ÇÖ·¸
        synchronized(Lazy3.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                try {
                    throw new Exception("µ¥Àý±»ÇÖ·¸");
                } catch(Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    public static Lazy3 getInstance() {
        return Lazy3Holder.lazy;
    }
    
    
    private static class Lazy3Holder {
        private static final Lazy3 lazy = new Lazy3();
    }
}
