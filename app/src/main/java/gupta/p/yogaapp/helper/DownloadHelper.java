package gupta.p.yogaapp.helper;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by lenovo1 on 6/28/2017.
 */

public class DownloadHelper {
    public static void loadImageWithGlide(Context context, int imageRes, ImageView imageView)
    {
        Glide.with(context)
                .load(imageRes)
                .crossFade()
                .into(imageView);
    }
    public static void loadImageWithGlideURL(Context context, String url, ImageView imageView)
    {
        Glide.with(context)
                .load(url)
                .crossFade()
                .into(imageView);
    }
}
