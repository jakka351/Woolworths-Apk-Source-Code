package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class LruBitmapPool implements BitmapPool {
    public static final Bitmap.Config k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final SizeConfigStrategy f13823a;
    public final Set b;
    public final long c;
    public final NullBitmapTracker d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;

    public interface BitmapTracker {
    }

    public static final class NullBitmapTracker implements BitmapTracker {
    }

    /* loaded from: classes4.dex */
    public static class ThrowingBitmapTracker implements BitmapTracker {
    }

    public LruBitmapPool(long j) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.c = j;
        this.e = j;
        this.f13823a = sizeConfigStrategy;
        this.b = setUnmodifiableSet;
        this.d = new NullBitmapTracker();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            b();
        } else if (i >= 20 || i == 15) {
            i(this.e / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final synchronized void c(float f) {
        long jRound = Math.round(this.c * f);
        this.e = jRound;
        i(jRound);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f13823a.getClass();
                if (Util.c(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                    this.f13823a.getClass();
                    int iC = Util.c(bitmap);
                    this.f13823a.f(bitmap);
                    this.d.getClass();
                    this.i++;
                    this.f += iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f13823a.getClass();
                        sb.append(SizeConfigStrategy.c(Util.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        g();
                    }
                    i(this.e);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f13823a.getClass();
                sb2.append(SizeConfigStrategy.c(Util.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        if (bitmapH != null) {
            return bitmapH;
        }
        if (config == null) {
            config = k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        if (bitmapH != null) {
            bitmapH.eraseColor(0);
            return bitmapH;
        }
        if (config == null) {
            config = k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final void g() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.f13823a);
    }

    public final synchronized Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f13823a.b(i, i2, config != null ? config : k);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f13823a.e(i, i2, config));
                }
                this.h++;
            } else {
                this.g++;
                long j = this.f;
                this.f13823a.getClass();
                this.f = j - Util.c(bitmapB);
                this.d.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f13823a.e(i, i2, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void i(long j) {
        while (this.f > j) {
            try {
                SizeConfigStrategy sizeConfigStrategy = this.f13823a;
                Bitmap bitmap = (Bitmap) sizeConfigStrategy.b.c();
                if (bitmap != null) {
                    sizeConfigStrategy.a(Integer.valueOf(Util.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        g();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.getClass();
                long j2 = this.f;
                this.f13823a.getClass();
                this.f = j2 - Util.c(bitmap);
                this.j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f13823a.getClass();
                    sb.append(SizeConfigStrategy.c(Util.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    g();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
