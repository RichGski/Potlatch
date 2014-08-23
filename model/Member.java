package richgski.potlatch.model;
/**
 * Class for the member information.
 * id: is the primary key.
 * firstName: meber's first name.
 * surName: members last name.
 * email: members email address.
 * password: account password.
 * locked: if true then the account is locked.
 * 
 * @author rgolebiowski
 *
 */
public class Member {
	private long id;
	private String firstName;
	private String surName;
	private String email;
	private String password;
	private boolean locked;
}
