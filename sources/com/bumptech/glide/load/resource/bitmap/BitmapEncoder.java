package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

/* loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    public static final Option b = Option.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final Option c = new Option("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, Option.e);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayPool f13898a;

    public BitmapEncoder(ArrayPool arrayPool) {
        this.f13898a = arrayPool;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    @Override // com.bumptech.glide.load.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r9, java.io.File r10, com.bumptech.glide.load.Options r11) throws java.lang.Throwable {
        /*
            r8 = this;
            com.bumptech.glide.load.engine.Resource r9 = (com.bumptech.glide.load.engine.Resource) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.bumptech.glide.load.Option r1 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.c
            java.lang.Object r2 = r11.b(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            long r3 = com.bumptech.glide.util.LogTime.b()
            com.bumptech.glide.load.Option r5 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.b
            java.lang.Object r5 = r11.b(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r10 = r8.f13898a
            if (r10 == 0) goto L4d
            com.bumptech.glide.load.data.BufferedOutputStream r6 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            goto L4e
        L46:
            r9 = move-exception
            r6 = r7
            goto Lba
        L4a:
            r10 = move-exception
            r6 = r7
            goto L5f
        L4d:
            r6 = r7
        L4e:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            goto L5a
        L58:
            r9 = move-exception
            goto Lc0
        L5a:
            r10 = 1
            goto L71
        L5c:
            r9 = move-exception
            goto Lba
        L5e:
            r10 = move-exception
        L5f:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L6b
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L5c
        L6b:
            if (r6 == 0) goto L70
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L70
        L70:
            r10 = 0
        L71:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lb9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = com.bumptech.glide.util.Util.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = com.bumptech.glide.util.LogTime.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.b(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lb9:
            return r10
        Lba:
            if (r6 == 0) goto Lc1
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> Lc1
            goto Lc1
        Lc0:
            throw r9
        Lc1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.BitmapEncoder.a(java.lang.Object, java.io.File, com.bumptech.glide.load.Options):boolean");
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public final EncodeStrategy b(Options options) {
        return EncodeStrategy.e;
    }
}
