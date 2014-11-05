package guitar;

/*
* This comment is NOT a class level javadoc comment.
* Such comments appear just above the class declaration, not at the 
* start of the file. 
*/

import java.math.BigDecimal;

/**
* Guitar Model Object.
* 
* <P>Various attributes of guitars, and related behaviour.
*  
* <P>Note that {@link BigDecimal} is used to model the price - not double or float. 
* See {@link #Guitar(String, BigDecimal, Integer)} for more information.
*  
* @author Les Paul
* @version 2.0
*/
public class Guitar {
  
  /**
  * Constructor.
  * 
  * @param aName (required) brand name of the guitar. Must have content. Length 
  * must be in range <tt>1..50</tt>.
  * @param aPrice (optional) purchase price of the guitar.
  * @param aNumStrings (required) number of strings on the guitar. Can take 
  * values 6 or 12.
  */
  public Guitar(String aName, BigDecimal aPrice, Integer aNumStrings){
    //...elided
  }

  //There is a one-line form of javadoc comment, useful for shorter text :
  
  /**
   * Return name passed to the constructor
   * @return devuelve null
   */
  public String getName(){
    return null;
  }
  
  /**
   * Return price passed to the constructor.
   * @param monetary_unit contains the price
   * @return  devuelve null
   */
  public BigDecimal getPrice(String monetary_unit){
    return null;
  }
  
  /** Value - {@value}, key for storing the current guitar of interest in the session.*/
  public static final String KEY = "guitar";
  
  /** 
  * Play the guitar.
  * 
  * This method makes no guarantees as to how <em>well</em> the song is played.
  * @param aSongTitle must have content, and must have trimmed length greater than 2.
  */
  public void play(String aSongTitle){
    //..elided
  }
  
  /**
  * Apply standard tuning to the guitar.
  * 
  * @return <tt>true</tt> only if the guitar has been properly tuned.
  */
  public boolean tune(){
    return true;
  }

  /**
  * Destroy the guitar while on stage.
  * 
  * @deprecated Not good for the environment.
  */
  public void lightOnFireAndSmashLikeAWildman(){
    //..elided
  }
  
  //...other methods elided
}
