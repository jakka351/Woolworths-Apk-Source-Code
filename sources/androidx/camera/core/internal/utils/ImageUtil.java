package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ImageUtil {

    public static final class CodecFailedException extends Exception {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FailureType {
            public static final /* synthetic */ FailureType[] d = {new FailureType("ENCODE_FAILED", 0), new FailureType("DECODE_FAILED", 1), new FailureType("UNKNOWN", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            FailureType EF5;

            public static FailureType valueOf(String str) {
                return (FailureType) Enum.valueOf(FailureType.class, str);
            }

            public static FailureType[] values() {
                return (FailureType[]) d.clone();
            }
        }
    }

    public static Bitmap a(ImageProxy imageProxy) {
        int format = imageProxy.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
            imageProxy.getPlanes()[0].q().rewind();
            ImageProcessingUtil.f(bitmapCreateBitmap, imageProxy.getPlanes()[0].q(), imageProxy.getPlanes()[0].r());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(imageProxy);
        }
        if (format != 256 && format != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!c(imageProxy.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        ByteBuffer byteBufferQ = imageProxy.getPlanes()[0].q();
        int iCapacity = byteBufferQ.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferQ.rewind();
        byteBufferQ.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Rational b(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static boolean c(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] d(ImageProxy imageProxy, Rect rect, int i, int i2) throws CodecFailedException {
        if (imageProxy.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        ByteBuffer byteBufferQ = planeProxy.q();
        ByteBuffer byteBufferQ2 = planeProxy2.q();
        ByteBuffer byteBufferQ3 = planeProxy3.q();
        byteBufferQ.rewind();
        byteBufferQ2.rewind();
        byteBufferQ3.rewind();
        int iRemaining = byteBufferQ.remaining();
        byte[] bArr = new byte[((imageProxy.getHeight() * imageProxy.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i3 = 0; i3 < imageProxy.getHeight(); i3++) {
            byteBufferQ.get(bArr, width, imageProxy.getWidth());
            width += imageProxy.getWidth();
            byteBufferQ.position(Math.min(iRemaining, planeProxy.r() + (byteBufferQ.position() - imageProxy.getWidth())));
        }
        int height = imageProxy.getHeight() / 2;
        int width2 = imageProxy.getWidth() / 2;
        int iR = planeProxy3.r();
        int iR2 = planeProxy2.r();
        int iS = planeProxy3.s();
        int iS2 = planeProxy2.s();
        byte[] bArr2 = new byte[iR];
        byte[] bArr3 = new byte[iR2];
        for (int i4 = 0; i4 < height; i4++) {
            byteBufferQ3.get(bArr2, 0, Math.min(iR, byteBufferQ3.remaining()));
            byteBufferQ2.get(bArr3, 0, Math.min(iR2, byteBufferQ2.remaining()));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < width2; i7++) {
                int i8 = width + 1;
                bArr[width] = bArr2[i5];
                width += 2;
                bArr[i8] = bArr3[i6];
                i5 += iS;
                i6 += iS2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight()) : rect, i, new ExifOutputStream(byteArrayOutputStream, ExifData.a(imageProxy, i2)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.");
    }
}
