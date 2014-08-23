package richgski.potlatch.model;
/**
 * Class for recording if a member was touched by a gift.
 * The "Touched" table will have an entry if touched, else it will not have an entry.
 * A primary key is not needed because each foreign key pair will always be unique.
 * fkGiftId: is the foreign key to Gift.
 * fkMemberID: is the foreign key to the Member that flagged it as inappropriate.
 * 
 * @author rgolebiowski
 *
 */
public class Touched {
	private long fkGiftId;
	private long fkMemberID;
}
