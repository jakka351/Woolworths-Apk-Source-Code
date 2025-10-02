package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public class BitmapResource implements Resource<Bitmap>, Initializable {
    public final Bitmap d;
    public final BitmapPool e;

    public BitmapResource(Bitmap bitmap, BitmapPool bitmapPool) {
        Preconditions.c(bitmap, "Bitmap must not be null");
        this.d = bitmap;
        Preconditions.c(bitmapPool, "BitmapPool must not be null");
        this.e = bitmapPool;
    }

    public static BitmapResource b(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.d;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return Util.c(this.d);
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        this.d.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        this.e.d(this.d);
    }
}
