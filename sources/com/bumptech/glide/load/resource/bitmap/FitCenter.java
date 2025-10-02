package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class FitCenter extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13913a = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.b);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.d(bitmapPool, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof FitCenter;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13913a);
    }
}
