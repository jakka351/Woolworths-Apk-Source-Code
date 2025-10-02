package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final void f(Object obj) {
        ((ImageView) this.e).setImageDrawable((Drawable) obj);
    }
}
