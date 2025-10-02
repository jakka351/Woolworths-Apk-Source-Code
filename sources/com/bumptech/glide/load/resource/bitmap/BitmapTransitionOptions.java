package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;

/* loaded from: classes4.dex */
public final class BitmapTransitionOptions extends TransitionOptions<BitmapTransitionOptions, Bitmap> {
    @Override // com.bumptech.glide.TransitionOptions
    public final boolean equals(Object obj) {
        return (obj instanceof BitmapTransitionOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public final int hashCode() {
        return NoTransition.b.hashCode();
    }
}
