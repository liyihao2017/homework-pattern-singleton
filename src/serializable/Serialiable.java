/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package serializable;

import java.io.Serializable;

/**
 * @author eason.li
 *
 */
public class Serialiable implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -7417262420889543773L;
    public static final Serialiable SERIALIABLE = new Serialiable();
    private Serialiable(){}
    
    public static  Serialiable getInstance() {
        return SERIALIABLE;
    }
    
    public Object readSolve() {
        return SERIALIABLE;
    }
}
