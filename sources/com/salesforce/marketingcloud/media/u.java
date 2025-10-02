package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.media.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@SuppressLint
@VisibleForTesting
/* loaded from: classes6.dex */
public abstract class u {

    public interface a {
        void a(b bVar);

        void a(Throwable th);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final o.b f16982a;
        private final Bitmap b;
        private final Drawable c;

        private b(Bitmap bitmap, Drawable drawable, o.b bVar) {
            this.b = bitmap;
            this.c = drawable;
            this.f16982a = bVar;
        }

        public Bitmap a() {
            return this.b;
        }

        public Drawable b() {
            return this.c;
        }

        public o.b c() {
            return this.f16982a;
        }

        public boolean d() {
            return this.b != null;
        }

        public boolean e() {
            return this.c != null;
        }

        public b(Bitmap bitmap, o.b bVar) {
            this(bitmap, null, bVar);
        }

        public b(Drawable drawable, o.b bVar) {
            this(null, drawable, bVar);
        }
    }

    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options) {
        int iMin;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = i3 / i;
            } else if (i == 0) {
                d = i4 / i2;
            } else {
                iMin = Math.min((int) Math.floor(i4 / i2), (int) Math.floor(i3 / i));
            }
            iMin = (int) Math.floor(d);
        } else {
            iMin = 1;
        }
        options.inSampleSize = iMin;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options b(s sVar) {
        if (!sVar.d()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        return options;
    }

    public abstract void a(o oVar, s sVar, a aVar) throws IOException;

    public abstract boolean a(s sVar);

    private static void a(int i, int i2, BitmapFactory.Options options) {
        a(i, i2, options.outWidth, options.outHeight, options);
    }

    public static Bitmap a(InputStream inputStream, s sVar) throws IOException {
        BitmapFactory.Options optionsB = b(sVar);
        boolean zA = a(optionsB);
        byte[] bArrA = com.salesforce.marketingcloud.util.g.a(inputStream);
        if (zA) {
            BitmapFactory.decodeStream(new ByteArrayInputStream(bArrA), null, optionsB);
            a(sVar.e, sVar.f, optionsB);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(bArrA), null, optionsB);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode bitmap");
    }

    public static boolean a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }
}
