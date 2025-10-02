package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Downsampler {
    public static final Option f = Option.a(DecodeFormat.f, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final Option g = new Option("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, Option.e);
    public static final Option h;
    public static final Option i;
    public static final Set j;
    public static final DecodeCallbacks k;
    public static final Set l;
    public static final ArrayDeque m;

    /* renamed from: a, reason: collision with root package name */
    public final BitmapPool f13910a;
    public final DisplayMetrics b;
    public final ArrayPool c;
    public final ArrayList d;
    public final HardwareConfigState e = HardwareConfigState.a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.Downsampler$1, reason: invalid class name */
    public class AnonymousClass1 implements DecodeCallbacks {
        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void a(Bitmap bitmap, BitmapPool bitmapPool) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void b() {
        }
    }

    public interface DecodeCallbacks {
        void a(Bitmap bitmap, BitmapPool bitmapPool);

        void b();
    }

    static {
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.f13909a;
        Boolean bool = Boolean.FALSE;
        h = Option.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = Option.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new AnonymousClass1();
        l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = Util.f13989a;
        m = new ArrayDeque(0);
    }

    public Downsampler(ArrayList arrayList, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.d = arrayList;
        Preconditions.c(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        Preconditions.c(bitmapPool, "Argument must not be null");
        this.f13910a = bitmapPool;
        Preconditions.c(arrayPool, "Argument must not be null");
        this.c = arrayPool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(com.bumptech.glide.load.resource.bitmap.ImageReader r9, android.graphics.BitmapFactory.Options r10, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r11, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.b()
            r9.a()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.f()
            r4.lock()
            android.graphics.Bitmap r9 = r9.c(r10)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L67
        L1d:
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.f()
            r10.unlock()
            return r9
        L25:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = YU.a.q(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L67
            r1.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L67
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L67
            r1.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L67
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L67
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L56
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L67
        L56:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L66
            r12.d(r0)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            goto L1d
        L65:
            throw r5     // Catch: java.lang.Throwable -> L67
        L66:
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.f()
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.c(com.bumptech.glide.load.resource.bitmap.ImageReader, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final BitmapResource a(ImageReader imageReader, int i2, int i3, Options options, DecodeCallbacks decodeCallbacks) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.c(byte[].class, 65536);
        synchronized (Downsampler.class) {
            arrayDeque = m;
            synchronized (arrayDeque) {
                options2 = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options2 == null) {
                options2 = new BitmapFactory.Options();
                e(options2);
            }
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.b(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) options.b(g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.b(DownsampleStrategy.f);
        boolean zBooleanValue = ((Boolean) options.b(h)).booleanValue();
        Option option = i;
        try {
            BitmapResource bitmapResourceB = BitmapResource.b(b(imageReader, options2, downsampleStrategy, decodeFormat, preferredColorSpace, options.b(option) != null && ((Boolean) options.b(option)).booleanValue(), i2, i3, zBooleanValue, decodeCallbacks), this.f13910a);
            e(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.c.put(bArr);
            return bitmapResourceB;
        } catch (Throwable th) {
            e(options2);
            ArrayDeque arrayDeque2 = m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(com.bumptech.glide.load.resource.bitmap.ImageReader r41, android.graphics.BitmapFactory.Options r42, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r43, com.bumptech.glide.load.DecodeFormat r44, com.bumptech.glide.load.PreferredColorSpace r45, boolean r46, int r47, int r48, boolean r49, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r50) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.b(com.bumptech.glide.load.resource.bitmap.ImageReader, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks):android.graphics.Bitmap");
    }
}
