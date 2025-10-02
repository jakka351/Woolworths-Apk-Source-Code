package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class StandardGifDecoder implements GifDecoder {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13772a;
    public final GifDecoder.BitmapProvider c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public GifHeader l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this.c = bitmapProvider;
        this.l = new GifHeader();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = gifHeader;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = gifHeader.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((GifFrame) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = gifHeader.f;
                this.r = i2 / iHighestOneBit;
                int i3 = gifHeader.g;
                this.q = i3 / iHighestOneBit;
                this.i = this.c.a(i2 * i3);
                this.j = this.c.d(this.r * this.q);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized Bitmap a() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("StandardGifDecoder", 3)) {
                    Log.d("StandardGifDecoder", "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k);
                }
                this.o = 1;
            }
            int i = this.o;
            if (i != 1 && i != 2) {
                this.o = 0;
                if (this.e == null) {
                    this.e = this.c.a(255);
                }
                GifFrame gifFrame = (GifFrame) this.l.e.get(this.k);
                int i2 = this.k - 1;
                GifFrame gifFrame2 = i2 >= 0 ? (GifFrame) this.l.e.get(i2) : null;
                int[] iArr = gifFrame.k;
                if (iArr == null) {
                    iArr = this.l.f13770a;
                }
                this.f13772a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("StandardGifDecoder", 3)) {
                        Log.d("StandardGifDecoder", "No valid color table found for frame #" + this.k);
                    }
                    this.o = 1;
                    return null;
                }
                if (gifFrame.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.f13772a = iArr2;
                    iArr2[gifFrame.h] = 0;
                    if (gifFrame.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return f(gifFrame, gifFrame2);
            }
            if (Log.isLoggable("StandardGifDecoder", 3)) {
                Log.d("StandardGifDecoder", "Unable to decode frame, status=" + this.o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    public final Bitmap c() {
        Boolean bool = this.s;
        Bitmap bitmapB = this.c.b(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    public final int d() {
        int i;
        GifHeader gifHeader = this.l;
        int i2 = gifHeader.c;
        if (i2 <= 0 || (i = this.k) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return ((GifFrame) gifHeader.e.get(i)).i;
    }

    public final void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap f(com.bumptech.glide.gifdecoder.GifFrame r35, com.bumptech.glide.gifdecoder.GifFrame r36) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.f(com.bumptech.glide.gifdecoder.GifFrame, com.bumptech.glide.gifdecoder.GifFrame):android.graphics.Bitmap");
    }
}
