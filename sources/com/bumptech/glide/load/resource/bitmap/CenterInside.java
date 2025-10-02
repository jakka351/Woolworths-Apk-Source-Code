package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class CenterInside extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13903a = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(Key.b);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.c(bitmapPool, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof CenterInside;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13903a);
    }
}
