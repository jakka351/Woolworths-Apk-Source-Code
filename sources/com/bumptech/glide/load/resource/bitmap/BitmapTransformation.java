package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.camera.core.impl.b;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public abstract class BitmapTransformation implements Transformation<Bitmap> {
    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i, int i2) {
        if (!Util.j(i, i2)) {
            throw new IllegalArgumentException(b.j(i, i2, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        BitmapPool bitmapPool = Glide.a(context).e;
        Bitmap bitmap = (Bitmap) resource.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapB = b(bitmapPool, bitmap, i, i2);
        return bitmap.equals(bitmapB) ? resource : BitmapResource.b(bitmapB, bitmapPool);
    }

    public abstract Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);
}
