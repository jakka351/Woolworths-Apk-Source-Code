package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes4.dex */
final class NonOwnedDrawableResource extends DrawableResource<Drawable> {
    public static Resource b(Drawable drawable) {
        if (drawable != null) {
            return new NonOwnedDrawableResource(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return this.d.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        Drawable drawable = this.d;
        return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
    }
}
