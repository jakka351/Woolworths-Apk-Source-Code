package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.ImageReader;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferBitmapDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final Downsampler f13900a;

    public ByteBufferBitmapDecoder(Downsampler downsampler) {
        this.f13900a = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) {
        Downsampler downsampler = this.f13900a;
        return downsampler.a(new ImageReader.ByteBufferReader((ByteBuffer) obj, downsampler.d, downsampler.c), i, i2, options, Downsampler.k);
    }
}
