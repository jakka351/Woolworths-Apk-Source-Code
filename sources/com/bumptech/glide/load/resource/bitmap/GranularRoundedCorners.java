package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.bumptech.glide.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class GranularRoundedCorners extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13914a = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(Key.b);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.j(bitmapPool, bitmap, new TransformationUtils.AnonymousClass2());
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof GranularRoundedCorners;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.g(BitmapDescriptorFactory.HUE_RED, Util.g(BitmapDescriptorFactory.HUE_RED, Util.g(BitmapDescriptorFactory.HUE_RED, Util.h(-2013597734, Util.g(BitmapDescriptorFactory.HUE_RED, 17)))));
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13914a);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(BitmapDescriptorFactory.HUE_RED).putFloat(BitmapDescriptorFactory.HUE_RED).putFloat(BitmapDescriptorFactory.HUE_RED).putFloat(BitmapDescriptorFactory.HUE_RED).array());
    }
}
