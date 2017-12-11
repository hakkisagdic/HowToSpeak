package cnmp.com.howtospeak.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cnmp.com.howtospeak.R;

/**
 * Created by henry on 12/10/2017.
 */

public class ViewHolderCategory extends RecyclerView.ViewHolder {
    public ImageView imvCategoryImage;
    public TextView txtCategoryName;

    public ViewHolderCategory(final View itemView) {
        super(itemView);
        imvCategoryImage = itemView.findViewById(R.id.imv_category_image);
        txtCategoryName = itemView.findViewById(R.id.txt_category_name);

        //called when click category

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(itemView.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}