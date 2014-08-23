package richgski.potlatch.model;

import java.util.Date;

/**
 * The Gift class.
 * id: primary key.
 * fkMemberId is the Member that owns the image.
 * title: the title of the image.
 * image: the actual image.
 * latitude: location latitude associated with the image.
 * longitude: location longitude associated with the image.
 * dateImg: the date associated with the image.
 * dateRec: the date that the image record was created.
 * shared: denotes level of image sharing by the owner of the image with other members
 *  0 private, 1 is shared among specified members, 2 is public.
 * 
 * @author rgolebiowski
 *
 */
public class Gift {
	private long id;
	private long fkMemberId;
	private String title;
	private byte[] image;
	private float latitude;
	private float longitude;
	private Date dateImg;
	private Date dateRec;
	private int shared;
}
