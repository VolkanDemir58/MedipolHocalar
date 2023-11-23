package com.example.hocalarhafta13;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
public class GlideUtil {
    public  static  void resmiIndiripGoster(Context context, String resimUrl, ImageView hangiImageView)
    {
        Glide.with(context)
                .load(resimUrl)
                .into(hangiImageView);
    }
}
