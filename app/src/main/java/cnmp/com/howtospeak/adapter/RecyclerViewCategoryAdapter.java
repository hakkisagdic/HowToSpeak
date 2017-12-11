package cnmp.com.howtospeak.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cnmp.com.howtospeak.R;
import cnmp.com.howtospeak.model.Category;
import cnmp.com.howtospeak.views.ViewHolderCategory;

/**
 * Created by henry on 12/10/2017.
 */

public class RecyclerViewCategoryAdapter extends RecyclerView.Adapter<ViewHolderCategory> {
    private ArrayList<Category> list;

    public RecyclerViewCategoryAdapter(ArrayList<Category> list) {
        this.list = list;
    }

    @Override
    public ViewHolderCategory onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_category, parent, false);
        ViewHolderCategory holder = new ViewHolderCategory(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolderCategory holder, int position) {
        holder.txtCategoryName.setText(list.get(position).getCategoryName());
        holder.imvCategoryImage.setImageResource(list.get(position).getResImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
