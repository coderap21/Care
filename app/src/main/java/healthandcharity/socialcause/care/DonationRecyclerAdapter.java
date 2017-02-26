package healthandcharity.socialcause.care;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Darkslayer on 2/26/2017.
 */

public class DonationRecyclerAdapter extends RecyclerView.Adapter<DonationRecyclerAdapter.DonationViewHolder> {
    ArrayList<Donation> donationList = new ArrayList();
    DonationRecyclerAdapter(ArrayList donationList){
        this.donationList = donationList;
    }

    class DonationViewHolder extends RecyclerView.ViewHolder{
        TextView organisationName,donationAmount,donationStatus;
        DonationViewHolder(View view){
            super(view);
            organisationName = (TextView)view.findViewById(R.id.organisation_name);
            donationAmount = (TextView)view.findViewById(R.id.donation_amt);
            donationStatus = (TextView)view.findViewById(R.id.donation_confirmation);
        }}

    @Override
    public DonationRecyclerAdapter.DonationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation,parent,false);
        return new DonationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DonationRecyclerAdapter.DonationViewHolder holder, int position) {
        holder.organisationName.setText(donationList.get(position).getOrganisationName());
        holder.donationAmount.setText(donationList.get(position).getDonationAmount());
        holder.donationStatus.setText(donationList.get(position).getDonationStatus());
    }

    @Override
    public int getItemCount() {
        return donationList.size();
    }
}
