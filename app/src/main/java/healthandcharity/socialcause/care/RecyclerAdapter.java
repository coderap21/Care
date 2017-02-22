package healthandcharity.socialcause.care;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ReviewViewHolder> {
    ArrayList<Review> reviews = new ArrayList<>();
    RecyclerAdapter(ArrayList<Review> reviews){
        this.reviews = reviews;
    }

    @Override
    public ReviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_layout,parent,false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewViewHolder holder, int position) {
        Review review  = reviews.get(position);

        holder.imageView.setImageResource(R.drawable.dummy_profile_pic);
        holder.username.setText(review.getUsername());
        holder.comment.setText(review.getComment());
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public static class ReviewViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView comment;
        TextView username;
        ReviewViewHolder(View view){
            super(view);
            imageView = (ImageView) view.findViewById(R.id.review_row_imageview);
            username = (TextView)view.findViewById(R.id.user_name);
            comment = (TextView) view.findViewById(R.id.comment);
        }

    }
}
