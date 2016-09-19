/** 
 * @element strings of type String
 * @structure linear
 * @domain all strings that start with a letter and contain only letters and numbers
 **/

public interface IdentifierInterface {
	/**
	 * Indentifier (string s){
	 * PRE -s is an identifier
	 * POST a new object has been created, the value is s
	 */
	
	/**
     * @pre -
     * @post The value associated with this identifier has been returned as a String.
     */
	String getValue();
	 
}
