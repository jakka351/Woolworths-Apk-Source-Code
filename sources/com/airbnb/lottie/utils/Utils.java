package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Utils {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13480a = new AnonymousClass1();
    public static final ThreadLocal b = new AnonymousClass2();
    public static final ThreadLocal c = new AnonymousClass3();
    public static final ThreadLocal d = new AnonymousClass4();
    public static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: com.airbnb.lottie.utils.Utils$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.Utils$2, reason: invalid class name */
    public class AnonymousClass2 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.Utils$3, reason: invalid class name */
    public class AnonymousClass3 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.Utils$4, reason: invalid class name */
    public class AnonymousClass4 extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f13480a.get();
        Path path2 = (Path) b.get();
        Path path3 = (Path) c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == BitmapDescriptorFactory.HUE_RED) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = MiscUtils.c(fMin, length);
                fMax = MiscUtils.c(fMax, length);
            }
            if (fMin < BitmapDescriptorFactory.HUE_RED) {
                fMin = MiscUtils.c(fMin, length);
            }
            if (fMax < BitmapDescriptorFactory.HUE_RED) {
                fMax = MiscUtils.c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < BitmapDescriptorFactory.HUE_RED) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
