package healthandcharity.socialcause.care;

/**
 * Created by Darkslayer on 2/26/2017.
 */

public class Donation {
    String organisationName,donationStatus,donationAmount;
    int imageId;

    public Donation(String organisationName, String donationStatus, String donationAmount) {
        this.organisationName = organisationName;
        this.donationStatus = donationStatus;
        this.donationAmount = donationAmount;
        this.imageId = imageId;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
