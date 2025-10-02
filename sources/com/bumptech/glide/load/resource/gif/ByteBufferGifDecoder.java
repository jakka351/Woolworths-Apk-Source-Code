package com.bumptech.glide.load.resource.gif;

import YU.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {
    public static final GifDecoderFactory f = new GifDecoderFactory();
    public static final GifHeaderParserPool g = new GifHeaderParserPool();

    /* renamed from: a, reason: collision with root package name */
    public final Context f13936a;
    public final ArrayList b;
    public final GifHeaderParserPool c;
    public final GifDecoderFactory d;
    public final GifBitmapProvider e;

    @VisibleForTesting
    public static class GifDecoderFactory {
    }

    @VisibleForTesting
    public static class GifHeaderParserPool {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f13937a;

        public GifHeaderParserPool() {
            char[] cArr = Util.f13989a;
            this.f13937a = new ArrayDeque(0);
        }
    }

    public ByteBufferGifDecoder(Context context) {
        this(context, Glide.a(context).g.a().b(), Glide.a(context).e, Glide.a(context).h);
    }

    public static int d(GifHeader gifHeader, int i, int i2) {
        int iMin = Math.min(gifHeader.a() / i2, gifHeader.d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbQ = a.q(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbQ.append(i2);
            sbQ.append("], actual dimens: [");
            sbQ.append(gifHeader.d());
            sbQ.append("x");
            sbQ.append(gifHeader.a());
            sbQ.append("]");
            Log.v("BufferGifDecoder", sbQ.toString());
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return !((Boolean) options.b(GifOptions.b)).booleanValue() && ImageHeaderParserUtils.g(this.b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x0050
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public final com.bumptech.glide.load.engine.Resource b(java.lang.Object r8, int r9, int r10, com.bumptech.glide.load.Options r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r8 = r7.c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f13937a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L4b
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = (com.bumptech.glide.gifdecoder.GifHeaderParser) r0     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L15
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = new com.bumptech.glide.gifdecoder.GifHeaderParser     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L4e
        L1b:
            r5.g(r2)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            com.bumptech.glide.load.resource.gif.GifDrawableResource r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r9 = r1.c
            monitor-enter(r9)
            r5.a()     // Catch: java.lang.Throwable -> L34
            java.util.ArrayDeque r10 = r9.f13937a     // Catch: java.lang.Throwable -> L34
            r10.offer(r5)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r9)
            return r8
        L34:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L34
            throw r8
        L38:
            r0 = move-exception
            r8 = r0
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r9 = r1.c
            monitor-enter(r9)
            r5.a()     // Catch: java.lang.Throwable -> L47
            java.util.ArrayDeque r10 = r9.f13937a     // Catch: java.lang.Throwable -> L47
            r10.offer(r5)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r9)
            throw r8
        L47:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r8
        L4b:
            r0 = move-exception
            r1 = r7
        L4d:
            r9 = r0
        L4e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L50
            throw r9
        L50:
            r0 = move-exception
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.b(java.lang.Object, int, int, com.bumptech.glide.load.Options):com.bumptech.glide.load.engine.Resource");
    }

    public final GifDrawableResource c(ByteBuffer byteBuffer, int i, int i2, GifHeaderParser gifHeaderParser, Options options) {
        StringBuilder sb;
        long jB = LogTime.b();
        try {
            GifHeader gifHeaderC = gifHeaderParser.c();
            if (gifHeaderC.b() > 0 && gifHeaderC.c() == 0) {
                Bitmap.Config config = options.b(GifOptions.f13943a) == DecodeFormat.e ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(gifHeaderC, i, i2);
                GifDecoderFactory gifDecoderFactory = this.d;
                GifBitmapProvider gifBitmapProvider = this.e;
                gifDecoderFactory.getClass();
                StandardGifDecoder standardGifDecoder = new StandardGifDecoder(gifBitmapProvider, gifHeaderC, byteBuffer, iD);
                standardGifDecoder.e(config);
                standardGifDecoder.b();
                Bitmap bitmapA = standardGifDecoder.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(LogTime.a(jB));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                GifDrawableResource gifDrawableResource = new GifDrawableResource(new GifDrawable(new GifDrawable.GifState(new GifFrameLoader(Glide.a(this.f13936a), standardGifDecoder, i, i2, UnitTransformation.f13895a, bitmapA))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.a(jB));
                }
                return gifDrawableResource;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(LogTime.a(jB));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.a(jB));
            }
            throw th;
        }
    }

    public ByteBufferGifDecoder(Context context, ArrayList arrayList, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f13936a = context.getApplicationContext();
        this.b = arrayList;
        this.d = f;
        this.e = new GifBitmapProvider(bitmapPool, arrayPool);
        this.c = g;
    }
}
