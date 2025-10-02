package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MediaContent;

@Deprecated
/* loaded from: classes5.dex */
public class MediaView extends FrameLayout {
    public MediaView(@NonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
    }

    public void setMediaContent(@NonNull MediaContent mediaContent) {
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
