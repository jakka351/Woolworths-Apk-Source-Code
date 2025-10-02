package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public class BitmapDrawableResource extends DrawableResource<BitmapDrawable> implements Initializable {
    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return Util.c(((BitmapDrawable) this.d).getBitmap());
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        ((BitmapDrawable) this.d).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        ((BitmapDrawable) this.d).getBitmap();
        throw null;
    }
}
