package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class TransformationUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f13926a = new Paint(6);
    public static final Paint b = new Paint(7);
    public static final Paint c;
    public static final Lock d;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$1, reason: invalid class name */
    class AnonymousClass1 implements DrawRoundedCornerFn {
        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn
        public final void a(Canvas canvas, Paint paint, RectF rectF) {
            float f = 0;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$2, reason: invalid class name */
    class AnonymousClass2 implements DrawRoundedCornerFn {
        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn
        public final void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            path.addRoundRect(rectF, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface DrawRoundedCornerFn {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    public static final class NoLock implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new NoLock();
        Paint paint = new Paint(7);
        c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f13926a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i2;
        int height2 = bitmap.getHeight() * i;
        float width3 = BitmapDescriptorFactory.HUE_RED;
        if (width2 > height2) {
            width = i2 / bitmap.getHeight();
            width3 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width3 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapF = bitmapPool.f(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapF.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    public static Bitmap c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return d(bitmapPool, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapF = bitmapPool.f((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmapF.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i + "x" + i2);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapF.getWidth() + "x" + bitmapF.getHeight());
                    StringBuilder sb = new StringBuilder("minPct:   ");
                    sb.append(fMin);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmapF, matrix);
                return bitmapF;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap e(Bitmap bitmap, BitmapPool bitmapPool) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapF = bitmapPool.f(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(bitmapF).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        return bitmapF;
    }

    public static Lock f() {
        return d;
    }

    public static int g(int i) {
        switch (i) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    public static boolean h(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap i(BitmapPool bitmapPool, Bitmap bitmap, int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap bitmapF = bitmapPool.f(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                matrix.postTranslate(-rectF.left, -rectF.top);
                bitmapF.setHasAlpha(bitmap.hasAlpha());
                a(bitmap, bitmapF, matrix);
                return bitmapF;
            default:
                return bitmap;
        }
    }

    public static Bitmap j(BitmapPool bitmapPool, Bitmap bitmap, DrawRoundedCornerFn drawRoundedCornerFn) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapE = e(bitmap, bitmapPool);
        Bitmap bitmapF = bitmapPool.f(bitmapE.getWidth(), bitmapE.getHeight(), config);
        bitmapF.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapE, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapF.getWidth(), bitmapF.getHeight());
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            drawRoundedCornerFn.a(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapE.equals(bitmap)) {
                bitmapPool.d(bitmapE);
            }
            return bitmapF;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
