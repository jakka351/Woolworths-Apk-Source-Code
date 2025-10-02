package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.exifinterface.media.ExifInterface;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Image2JpegBytes implements Operation<In, Packet<byte[]>> {

    /* renamed from: a, reason: collision with root package name */
    public final JpegMetadataCorrector f446a;

    @AutoValue
    public static abstract class In {
        public abstract int a();

        public abstract Packet b();
    }

    public Image2JpegBytes(Quirks quirks) {
        this.f446a = new JpegMetadataCorrector(quirks);
    }

    public static Packet c(AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In) throws ImageCaptureException {
        Packet packet = autoValue_Image2JpegBytes_In.f436a;
        ImageProxy imageProxy = (ImageProxy) packet.c();
        Rect rectB = packet.b();
        try {
            byte[] bArrD = ImageUtil.d(imageProxy, rectB, autoValue_Image2JpegBytes_In.b, packet.f());
            try {
                Exif exif = new Exif(new ExifInterface(new ByteArrayInputStream(bArrD)));
                Size size = new Size(rectB.width(), rectB.height());
                Rect rect = new Rect(0, 0, rectB.width(), rectB.height());
                int iF = packet.f();
                Matrix matrixG = packet.g();
                RectF rectF = TransformUtils.f522a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                return Packet.k(bArrD, exif, 256, size, rect, iF, matrix, packet.a());
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil.CodecFailedException e2) {
            throw new ImageCaptureException("Failed to encode the image to JPEG.", e2);
        }
    }

    public final Object a(Object obj) throws Exception {
        Packet packetC;
        In in = (In) obj;
        try {
            int iE = in.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                packetC = b((AutoValue_Image2JpegBytes_In) in, iE);
            } else {
                packetC = c((AutoValue_Image2JpegBytes_In) in);
            }
            ((ImageProxy) in.b().c()).close();
            return packetC;
        } catch (Throwable th) {
            ((ImageProxy) in.b().c()).close();
            throw th;
        }
    }

    public final Packet b(AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In, int i) {
        byte[] bArr;
        byte[] bArrCopyOfRange;
        byte b;
        Packet packet = autoValue_Image2JpegBytes_In.f436a;
        ImageProxy imageProxy = (ImageProxy) packet.c();
        int i2 = 0;
        if (this.f446a.f540a == null) {
            ByteBuffer byteBufferQ = imageProxy.getPlanes()[0].q();
            bArrCopyOfRange = new byte[byteBufferQ.capacity()];
            byteBufferQ.rewind();
            byteBufferQ.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferQ2 = imageProxy.getPlanes()[0].q();
            int iCapacity = byteBufferQ2.capacity();
            byte[] bArr2 = new byte[iCapacity];
            byteBufferQ2.rewind();
            byteBufferQ2.get(bArr2);
            int i3 = 2;
            for (int i4 = 2; i4 + 4 <= iCapacity && (b = bArr2[i4]) == -1; i4 += (((bArr2[i4 + 2] & 255) << 8) | (bArr2[i4 + 3] & 255)) + 2) {
                if (b == -1 && bArr2[i4 + 1] == -38) {
                    break;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 > iCapacity) {
                    i2 = -1;
                    break;
                }
                if (bArr2[i3] == -1 && bArr2[i5] == -40) {
                    i2 = i3;
                    break;
                }
                i = i;
                i3 = i5;
            }
            if (i2 == -1) {
                bArr = bArr2;
                Exif exifD = packet.d();
                Objects.requireNonNull(exifD);
                return Packet.k(bArr, exifD, i, packet.h(), packet.b(), packet.f(), packet.g(), packet.a());
            }
            bArrCopyOfRange = Arrays.copyOfRange(bArr2, i2, byteBufferQ2.limit());
        }
        bArr = bArrCopyOfRange;
        Exif exifD2 = packet.d();
        Objects.requireNonNull(exifD2);
        return Packet.k(bArr, exifD2, i, packet.h(), packet.b(), packet.f(), packet.g(), packet.a());
    }
}
