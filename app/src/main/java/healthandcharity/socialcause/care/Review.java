package healthandcharity.socialcause.care;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class Review {
    private int imageResourceId;
    private String username;
    private String comment;

    Review(int imageId,String name, String comment){
        this.comment=comment;
        this.username=name;
        this.imageResourceId = imageId;
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

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
