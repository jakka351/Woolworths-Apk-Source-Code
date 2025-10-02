package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* loaded from: classes.dex */
public final class GifBitmapProvider implements GifDecoder.BitmapProvider {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapPool f13938a;
    public final ArrayPool b;

    public GifBitmapProvider(BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f13938a = bitmapPool;
        this.b = arrayPool;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final byte[] a(int i) {
        ArrayPool arrayPool = this.b;
        return arrayPool == null ? new byte[i] : (byte[]) arrayPool.c(byte[].class, i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return this.f13938a.e(i, i2, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void c(Bitmap bitmap) {
        this.f13938a.d(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final int[] d(int i) {
        ArrayPool arrayPool = this.b;
        return arrayPool == null ? new int[i] : (int[]) arrayPool.c(int[].class, i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void e(byte[] bArr) {
        ArrayPool arrayPool = this.b;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void f(int[] iArr) {
        ArrayPool arrayPool = this.b;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(iArr);
    }
}
