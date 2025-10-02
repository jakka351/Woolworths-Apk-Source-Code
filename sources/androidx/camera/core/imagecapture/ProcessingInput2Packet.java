package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class ProcessingInput2Packet implements Operation<ProcessingNode.InputPacket, Packet<ImageProxy>> {
    public final Object a(Object obj) throws ImageCaptureException {
        Exif exif;
        ProcessingNode.InputPacket inputPacket = (ProcessingNode.InputPacket) obj;
        ImageProxy imageProxyA = inputPacket.a();
        ProcessingRequest processingRequestB = inputPacket.b();
        if (ImageUtil.c(imageProxyA.getFormat())) {
            try {
                ThreadLocal threadLocal = Exif.b;
                ByteBuffer byteBufferQ = imageProxyA.getPlanes()[0].q();
                byteBufferQ.rewind();
                byte[] bArr = new byte[byteBufferQ.capacity()];
                byteBufferQ.get(bArr);
                exif = new Exif(new ExifInterface(new ByteArrayInputStream(bArr)));
                imageProxyA.getPlanes()[0].q().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to extract EXIF data.", e);
            }
        } else {
            exif = null;
        }
        Exif exif2 = exif;
        if (((ImageCaptureRotationOptionQuirk) DeviceQuirks.f535a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            Config.Option option = CaptureConfig.i;
        } else if (ImageUtil.c(imageProxyA.getFormat())) {
            Preconditions.e(exif2, "JPEG image must have exif.");
            Size size = new Size(imageProxyA.getWidth(), imageProxyA.getHeight());
            int iB = processingRequestB.d - exif2.b();
            Size size2 = TransformUtils.c(TransformUtils.h(iB)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = TransformUtils.a(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size2.getWidth(), size2.getHeight()), iB, false);
            RectF rectF = new RectF(processingRequestB.c);
            matrixA.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int iB2 = exif2.b();
            Size size3 = size2;
            Matrix matrix = new Matrix(processingRequestB.f);
            matrix.postConcat(matrixA);
            return Packet.j(imageProxyA, exif2, size3, rect, iB2, matrix, imageProxyA.M0() instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageProxyA.M0()).f528a : new CameraCaptureResult.EmptyCameraCaptureResult());
        }
        return Packet.j(imageProxyA, exif2, new Size(imageProxyA.getWidth(), imageProxyA.getHeight()), processingRequestB.c, processingRequestB.d, processingRequestB.f, imageProxyA.M0() instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageProxyA.M0()).f528a : new CameraCaptureResult.EmptyCameraCaptureResult());
    }
}
