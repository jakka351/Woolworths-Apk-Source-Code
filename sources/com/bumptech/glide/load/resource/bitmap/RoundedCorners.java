package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class RoundedCorners extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13923a = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.b);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Paint paint = TransformationUtils.f13926a;
        Preconditions.a("roundingRadius must be greater than 0.", false);
        return TransformationUtils.j(bitmapPool, bitmap, new TransformationUtils.AnonymousClass1());
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof RoundedCorners;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.h(-569625254, Util.h(0, 17));
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13923a);
        messageDigest.update(ByteBuffer.allocate(4).putInt(0).array());
    }
}
