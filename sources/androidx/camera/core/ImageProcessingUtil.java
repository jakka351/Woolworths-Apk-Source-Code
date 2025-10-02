package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Locale;

@RestrictTo
/* loaded from: classes2.dex */
public final class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    public static int f411a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        public static final Result d;
        public static final Result e;
        public static final /* synthetic */ Result[] f;

        /* JADX INFO: Fake field, exist only in values array */
        Result EF0;

        static {
            Result result = new Result("UNKNOWN", 0);
            Result result2 = new Result("SUCCESS", 1);
            d = result2;
            Result result3 = new Result("ERROR_CONVERSION", 2);
            e = result3;
            f = new Result[]{result, result2, result3};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f.clone();
        }
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(ImageProxy imageProxy) {
        if (!g(imageProxy)) {
            Logger.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iR = imageProxy.getPlanes()[0].r();
        int iR2 = imageProxy.getPlanes()[1].r();
        int iR3 = imageProxy.getPlanes()[2].r();
        int iS = imageProxy.getPlanes()[0].s();
        int iS2 = imageProxy.getPlanes()[1].s();
        int iNativeShiftPixel = nativeShiftPixel(imageProxy.getPlanes()[0].q(), iR, imageProxy.getPlanes()[1].q(), iR2, imageProxy.getPlanes()[2].q(), iR3, iS, iS2, width, height, iS, iS2, iS2);
        Result result = Result.e;
        if ((iNativeShiftPixel != 0 ? result : Result.d) == result) {
            Logger.b("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static ImageProxy b(SafeCloseImageReaderProxy safeCloseImageReaderProxy, byte[] bArr) {
        Preconditions.b(safeCloseImageReaderProxy.a() == 256);
        bArr.getClass();
        Surface surface = safeCloseImageReaderProxy.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            Logger.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        ImageProxy imageProxyD = safeCloseImageReaderProxy.d();
        if (imageProxyD == null) {
            Logger.b("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return imageProxyD;
    }

    public static Bitmap c(ImageProxy imageProxy) {
        if (imageProxy.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iR = imageProxy.getPlanes()[0].r();
        int iR2 = imageProxy.getPlanes()[1].r();
        int iR3 = imageProxy.getPlanes()[2].r();
        int iS = imageProxy.getPlanes()[0].s();
        int iS2 = imageProxy.getPlanes()[1].s();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(imageProxy.getPlanes()[0].q(), iR, imageProxy.getPlanes()[1].q(), iR2, imageProxy.getPlanes()[2].q(), iR3, iS, iS2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static ImageProxy d(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ByteBuffer byteBuffer, int i, boolean z) {
        if (!g(imageProxy)) {
            Logger.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            Logger.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = imageReaderProxy.getSurface();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iR = imageProxy.getPlanes()[0].r();
        int iR2 = imageProxy.getPlanes()[1].r();
        int iR3 = imageProxy.getPlanes()[2].r();
        int iS = imageProxy.getPlanes()[0].s();
        int iS2 = imageProxy.getPlanes()[1].s();
        int iNativeConvertAndroid420ToABGR = nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].q(), iR, imageProxy.getPlanes()[1].q(), iR2, imageProxy.getPlanes()[2].q(), iR3, iS, iS2, surface, byteBuffer, width, height, z ? iS : 0, z ? iS2 : 0, z ? iS2 : 0, i);
        Result result = Result.e;
        if ((iNativeConvertAndroid420ToABGR != 0 ? result : Result.d) == result) {
            Logger.b("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            Logger.a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f411a);
            f411a = f411a + 1;
        }
        ImageProxy imageProxyD = imageReaderProxy.d();
        if (imageProxyD == null) {
            Logger.b("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxyD);
        singleCloseImageProxy.a(new l(imageProxyD, imageProxy, 0));
        return singleCloseImageProxy;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean g(ImageProxy imageProxy) {
        return imageProxy.getFormat() == 35 && imageProxy.getPlanes().length == 3;
    }

    public static ImageProxy h(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        String str;
        Result result;
        Result result2;
        if (!g(imageProxy)) {
            Logger.b("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            Logger.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        Result result3 = Result.e;
        if (i > 0) {
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int iR = imageProxy.getPlanes()[0].r();
            int iR2 = imageProxy.getPlanes()[1].r();
            int iR3 = imageProxy.getPlanes()[2].r();
            int iS = imageProxy.getPlanes()[1].s();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage == null) {
                result2 = result3;
                str = "ImageProcessingUtil";
            } else {
                result2 = result3;
                str = "ImageProcessingUtil";
                if (nativeRotateYUV(imageProxy.getPlanes()[0].q(), iR, imageProxy.getPlanes()[1].q(), iR2, imageProxy.getPlanes()[2].q(), iR3, iS, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
                    result3 = result2;
                } else {
                    imageWriter.queueInputImage(imageDequeueInputImage);
                    result3 = Result.d;
                }
            }
            result = result2;
        } else {
            str = "ImageProcessingUtil";
            result = result3;
            result3 = result;
        }
        if (result3 == result) {
            Logger.b(str, "rotate YUV failure");
            return null;
        }
        String str2 = str;
        ImageProxy imageProxyD = imageReaderProxy.d();
        if (imageProxyD == null) {
            Logger.b(str2, "YUV rotation acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxyD);
        singleCloseImageProxy.a(new l(imageProxyD, imageProxy, 1));
        return singleCloseImageProxy;
    }

    public static void i(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            Logger.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, int i5, @Nullable Surface surface, @Nullable ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, int i5, @NonNull Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, @NonNull ByteBuffer byteBuffer4, int i5, int i6, @NonNull ByteBuffer byteBuffer5, int i7, int i8, @NonNull ByteBuffer byteBuffer6, int i9, int i10, @NonNull ByteBuffer byteBuffer7, @NonNull ByteBuffer byteBuffer8, @NonNull ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
