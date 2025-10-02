package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface BitmapPool {
    void a(int i);

    void b();

    void c(float f);

    void d(Bitmap bitmap);

    Bitmap e(int i, int i2, Bitmap.Config config);

    Bitmap f(int i, int i2, Bitmap.Config config);
}
