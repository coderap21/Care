package healthandcharity.socialcause.care;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class ReviewAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater=null;
    ArrayList<Review> reviewList;
    public ReviewAdapter(Context context,ArrayList<Review> reviewList)
    {
        this.context = context;
        this.reviewList = reviewList;
    }


    class ViewHolder{
        TextView username,comment;
        MLRoundedImageView profilePic;
    }

    @Override
    public int getCount() {
        return reviewList.size();
    }

    @Override
    public Object getItem(int position) {
        return reviewList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        Review review = reviewList.get(position);

        if(inflater==null)
            inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = inflater.inflate(R.layout.review_layout,null);

        holder.username = (TextView)view.findViewById(R.id.user_name);
        holder.comment = (TextView)view.findViewById(R.id.comment);
        holder.profilePic = (MLRoundedImageView)view.findViewById(R.id.review_row_imageview);

        holder.username.setText(review.getUsername());
        holder.comment.setText(review.getComment());
        holder.profilePic.setImageResource(review.getImageResourceId());
        return view;
    }
}
