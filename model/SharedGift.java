package richgski.potlatch.model;
/**
 * Class to record if a gift is shared with a member. If a gift is only shared with specific members
 * then an entry identifies that gift, fkGiftId, as shared to member, fkMemberID.
 * A primary key is not needed because each foreign key pair will always be unique.
 * fkGiftId: is the foreign key to Gift.
 * fkMemberID: is the foreign key to the Member that the gift is shared with..
 * 
 * @author rgolebiowski
 *
 */
public class SharedGift {
	private	long fkGiftId;
	private long fkMemberID;
}
