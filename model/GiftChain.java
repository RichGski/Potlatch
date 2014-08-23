package richgski.potlatch.model;

import java.util.Date;

/**
 * Class for gift chains.
 * id: primary key.
 * fkMemberId: the foreign key to the Member that is the chain owner.
 * title: title for the gift chain.
 * dateRec: the record date.
 * 
 * @author rgolebiowski
 * 
 */
public class GiftChain {
	private long id;
	private long fkMemberId;
	private String title;
	private Date dateRec;
}
