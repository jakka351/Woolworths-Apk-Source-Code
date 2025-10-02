package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class BitmapPoolAdapter implements BitmapPool {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void a(int i) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void c(float f) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
