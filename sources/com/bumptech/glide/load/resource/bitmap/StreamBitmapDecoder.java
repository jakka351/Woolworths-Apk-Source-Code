package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ImageReader;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final Downsampler f13924a;
    public final ArrayPool b;

    /* loaded from: classes4.dex */
    public static class UntrustedCallbacks implements Downsampler.DecodeCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public final RecyclableBufferedInputStream f13925a;
        public final ExceptionPassthroughInputStream b;

        public UntrustedCallbacks(RecyclableBufferedInputStream recyclableBufferedInputStream, ExceptionPassthroughInputStream exceptionPassthroughInputStream) {
            this.f13925a = recyclableBufferedInputStream;
            this.b = exceptionPassthroughInputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void a(Bitmap bitmap, BitmapPool bitmapPool) throws IOException {
            IOException iOException = this.b.e;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                bitmapPool.d(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13925a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f = recyclableBufferedInputStream.d.length;
            }
        }
    }

    public StreamBitmapDecoder(Downsampler downsampler, ArrayPool arrayPool) {
        this.f13924a = downsampler;
        this.b = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.b);
        }
        ExceptionPassthroughInputStream exceptionPassthroughInputStreamA = ExceptionPassthroughInputStream.a(recyclableBufferedInputStream);
        MarkEnforcingInputStream markEnforcingInputStream = new MarkEnforcingInputStream(exceptionPassthroughInputStreamA);
        UntrustedCallbacks untrustedCallbacks = new UntrustedCallbacks(recyclableBufferedInputStream, exceptionPassthroughInputStreamA);
        try {
            Downsampler downsampler = this.f13924a;
            BitmapResource bitmapResourceA = downsampler.a(new ImageReader.InputStreamImageReader(markEnforcingInputStream, downsampler.d, downsampler.c), i, i2, options, untrustedCallbacks);
            exceptionPassthroughInputStreamA.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
            return bitmapResourceA;
        } finally {
        }
    }
}
