package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class Image2Bitmap implements Operation<Packet<ImageProxy>, Bitmap> {
    public final Object a(Object obj) throws Throwable {
        Throwable th;
        Bitmap bitmapCreateBitmap;
        Packet packet = (Packet) obj;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = null;
        try {
            try {
                if (packet.e() == 35) {
                    ImageProxy imageProxy = (ImageProxy) packet.c();
                    boolean z = packet.f() % SubsamplingScaleImageView.ORIENTATION_180 != 0;
                    SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = new SafeCloseImageReaderProxy(ImageReaderProxys.a(z ? imageProxy.getHeight() : imageProxy.getWidth(), z ? imageProxy.getWidth() : imageProxy.getHeight(), 1, 2));
                    try {
                        ImageProxy imageProxyD = ImageProcessingUtil.d(imageProxy, safeCloseImageReaderProxy2, ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4), packet.f(), false);
                        imageProxy.close();
                        if (imageProxyD == null) {
                            throw new ImageCaptureException("Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = ImageUtil.a(imageProxyD);
                        imageProxyD.close();
                        safeCloseImageReaderProxy = safeCloseImageReaderProxy2;
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new ImageCaptureException("Can't convert " + (packet.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCloseImageReaderProxy = safeCloseImageReaderProxy2;
                        if (safeCloseImageReaderProxy == null) {
                            throw th;
                        }
                        safeCloseImageReaderProxy.close();
                        throw th;
                    }
                } else {
                    if (packet.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + packet.e());
                    }
                    ImageProxy imageProxy2 = (ImageProxy) packet.c();
                    Bitmap bitmapA = ImageUtil.a(imageProxy2);
                    imageProxy2.close();
                    int iF = packet.f();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(iF);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
