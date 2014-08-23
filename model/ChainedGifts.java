package richgski.potlatch.model;

/**
 * Class for the Gifts in a GiftChain.
 * fkGiftChain: foreign key to GiftChain.
 * fkGiftId: foreign key to Gift.
 * seq: sequence number. 1 is the first gift in the chain and is the Gift that starts the chain.
 * 
 * @author rgolebiowski
 *
 */
@Entity
public class ChainedGifts {
	private long fkGiftChain;
	private long fkGiftId;
	private int seq;
}
