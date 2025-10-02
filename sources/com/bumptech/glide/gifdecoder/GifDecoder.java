package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface GifDecoder {

    public interface BitmapProvider {
        byte[] a(int i);

        Bitmap b(int i, int i2, Bitmap.Config config);

        void c(Bitmap bitmap);

        int[] d(int i);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface GifDecodeStatus {
    }

    Bitmap a();
}
