package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class BitmapImageViewTarget extends ImageViewTarget<Bitmap> {
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final void f(Object obj) {
        ((ImageView) this.e).setImageBitmap((Bitmap) obj);
    }
}
