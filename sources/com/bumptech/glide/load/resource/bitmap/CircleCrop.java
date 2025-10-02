package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public class CircleCrop extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13904a = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.b);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Paint paint = TransformationUtils.f13926a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapE = TransformationUtils.e(bitmap, bitmapPool);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapF = bitmapPool.f(iMin, iMin, config);
        bitmapF.setHasAlpha(true);
        Lock lock = TransformationUtils.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawCircle(f2, f2, f2, TransformationUtils.b);
            canvas.drawBitmap(bitmapE, (Rect) null, rectF, TransformationUtils.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapE.equals(bitmap)) {
                bitmapPool.d(bitmapE);
            }
            return bitmapF;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof CircleCrop;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1101716364;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13904a);
    }
}
