package mySpring.thirdChapter.propeditor;

/**
 * Created by Dmitry on 03.04.2017.
 */
public class Contact {
    // This class will probably have other properties, too
    // But the phoneNumber property is all that's needed
    // to demonstrate property editors.

    private PhoneNumber phoneNumber;

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
