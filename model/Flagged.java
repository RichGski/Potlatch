package richgski.potlatch.model;

/**
 * Class to flag a gift as inappropriate. An entry here marks the gift as inappropriate for the member.
 * A primary key is not needed because each foreign key pair will always be unique.
 * fkGiftId: is the foreign key to Gift.
 * fkMemberID: is the foreign key to the Member that flagged it as inappropriate.
 * 
 * @author rgolebiowski
 *
 */
public class Flagged {
	private	long fkGiftId;
	private long fkMemberID;
}
