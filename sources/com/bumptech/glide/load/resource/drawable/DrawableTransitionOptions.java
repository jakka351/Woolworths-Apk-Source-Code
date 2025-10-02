package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;

/* loaded from: classes4.dex */
public final class DrawableTransitionOptions extends TransitionOptions<DrawableTransitionOptions, Drawable> {
    @Override // com.bumptech.glide.TransitionOptions
    public final boolean equals(Object obj) {
        return (obj instanceof DrawableTransitionOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public final int hashCode() {
        return NoTransition.b.hashCode();
    }
}
