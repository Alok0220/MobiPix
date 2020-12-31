package com.mobipix;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Field;

public class ListRow extends RecyclerView.ViewHolder {

    public ImageView mThumbnail;
    public ListRow(View view) {
        super(view);
        int drawableId=0;
        try{
            Class res = R.drawable.class;
            Field field = res.getField("small_img");
            drawableId = field.getInt(null);
        }
        catch(Exception ex){
            Log.d("Exception ", ""+ex.getStackTrace().length);
        }


        mThumbnail = (ImageView) view.findViewById(drawableId);
    }


}
