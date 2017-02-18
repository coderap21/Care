package healthandcharity.socialcause.care;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class Review {
    private int reviewID;
    private String username;
    private String comment;

    Review(int id,String name, String comment){
        this.comment=comment;
        this.reviewID = id;
        this.username=name;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
