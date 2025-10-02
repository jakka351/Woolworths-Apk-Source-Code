package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class Rotate extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13922a = "com.bumptech.glide.load.resource.bitmap.Rotate".getBytes(Key.b);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Paint paint = TransformationUtils.f13926a;
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof Rotate;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.h(-950519196, Util.h(0, 17));
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13922a);
        messageDigest.update(ByteBuffer.allocate(4).putInt(0).array());
    }
}
