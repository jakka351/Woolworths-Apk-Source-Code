package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.ImmutableImageInfo;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import androidx.exifinterface.media.ExifInterface;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ProcessingNode implements Node<In, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f449a;
    public AutoValue_ProcessingNode_In b;
    public Operation c;
    public Operation d;
    public Operation e;
    public Operation f;
    public Operation g;
    public JpegImage2Result h;
    public JpegBytes2Image i;
    public Image2Bitmap j;
    public final Quirks k;
    public final boolean l;

    @AutoValue
    public static abstract class In {
        public abstract Edge a();

        public abstract int b();

        public abstract int c();

        public abstract Edge d();
    }

    @AutoValue
    public static abstract class InputPacket {
        public abstract ImageProxy a();

        public abstract ProcessingRequest b();
    }

    public ProcessingNode(Executor executor) {
        Quirks quirks = DeviceQuirks.f535a;
        if (DeviceQuirks.f535a.b(LowMemoryQuirk.class) != null) {
            this.f449a = CameraXExecutors.f(executor);
        } else {
            this.f449a = executor;
        }
        this.k = quirks;
        this.l = quirks.a(IncorrectJpegMetadataQuirk.class);
    }

    public final ImageProxy a(InputPacket inputPacket) {
        ProcessingRequest processingRequestB = inputPacket.b();
        Packet packetJ = (Packet) ((ProcessingInput2Packet) this.c).a(inputPacket);
        if ((packetJ.e() == 35 || this.l) && this.b.d == 256) {
            Packet packet = (Packet) ((Image2JpegBytes) this.d).a(new AutoValue_Image2JpegBytes_In(packetJ, processingRequestB.e));
            this.i.getClass();
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.a(packet.h().getWidth(), packet.h().getHeight(), 256, 2));
            ImageProxy imageProxyB = ImageProcessingUtil.b(safeCloseImageReaderProxy, (byte[]) packet.c());
            safeCloseImageReaderProxy.g();
            Objects.requireNonNull(imageProxyB);
            Exif exifD = packet.d();
            Objects.requireNonNull(exifD);
            Rect rectB = packet.b();
            int iF = packet.f();
            Matrix matrixG = packet.g();
            CameraCaptureResult cameraCaptureResultA = packet.a();
            ForwardingImageProxy forwardingImageProxy = (ForwardingImageProxy) imageProxyB;
            packetJ = Packet.j(imageProxyB, exifD, new Size(forwardingImageProxy.getWidth(), forwardingImageProxy.getHeight()), rectB, iF, matrixG, cameraCaptureResultA);
        }
        this.h.getClass();
        ImageProxy imageProxy = (ImageProxy) packetJ.c();
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, packetJ.h(), ImmutableImageInfo.d(imageProxy.M0().a(), imageProxy.M0().getTimestamp(), packetJ.f(), packetJ.g()));
        settableImageProxy.b(packetJ.b());
        return settableImageProxy;
    }

    public final void b(InputPacket inputPacket) throws ImageCaptureException, IOException {
        int i = this.b.d;
        Preconditions.a("On-disk capture only support JPEG and JPEG/R output formats. Output format: " + i, ImageUtil.c(i));
        ProcessingRequest processingRequestB = inputPacket.b();
        Packet packetK = (Packet) ((Image2JpegBytes) this.d).a(new AutoValue_Image2JpegBytes_In((Packet) ((ProcessingInput2Packet) this.c).a(inputPacket), processingRequestB.e));
        if (TransformUtils.b(packetK.b(), packetK.h())) {
            int i2 = processingRequestB.e;
            Preconditions.f(null, ImageUtil.c(packetK.e()));
            ((JpegBytes2CroppedBitmap) this.g).getClass();
            Rect rectB = packetK.b();
            byte[] bArr = (byte[]) packetK.c();
            try {
                Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rectB, new BitmapFactory.Options());
                Exif exifD = packetK.d();
                Objects.requireNonNull(exifD);
                Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                int iF = packetK.f();
                Matrix matrixG = packetK.g();
                RectF rectF = TransformUtils.f522a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                Packet packetI = Packet.i(bitmapDecodeRegion, exifD, rect, iF, matrix, packetK.a());
                Operation operation = this.e;
                AutoValue_Bitmap2JpegBytes_In autoValue_Bitmap2JpegBytes_In = new AutoValue_Bitmap2JpegBytes_In(packetI, i2);
                ((Bitmap2JpegBytes) operation).getClass();
                Packet packetB = autoValue_Bitmap2JpegBytes_In.b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) packetB.c()).compress(Bitmap.CompressFormat.JPEG, autoValue_Bitmap2JpegBytes_In.a(), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Exif exifD2 = packetB.d();
                Objects.requireNonNull(exifD2);
                packetK = Packet.k(byteArray, exifD2, (Build.VERSION.SDK_INT < 34 || !Bitmap2JpegBytes.Api34Impl.a((Bitmap) packetB.c())) ? 256 : 4101, packetB.h(), packetB.b(), packetB.f(), packetB.g(), packetB.a());
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to decode JPEG.", e);
            }
        }
        Operation operation2 = this.f;
        ImageCapture.OutputFileOptions outputFileOptions = processingRequestB.b;
        Objects.requireNonNull(outputFileOptions);
        AutoValue_JpegBytes2Disk_In autoValue_JpegBytes2Disk_In = new AutoValue_JpegBytes2Disk_In(packetK, outputFileOptions);
        ((JpegBytes2Disk) operation2).getClass();
        Packet packetB2 = autoValue_JpegBytes2Disk_In.b();
        try {
            autoValue_JpegBytes2Disk_In.a().getClass();
            File fileCreateTempFile = File.createTempFile("CameraX", ".tmp");
            byte[] bArr2 = (byte[]) packetB2.c();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    fileOutputStream.write(bArr2, 0, new InvalidJpegDataParser().a(bArr2));
                    fileOutputStream.close();
                    Exif exifD3 = packetB2.d();
                    Objects.requireNonNull(exifD3);
                    int iF2 = packetB2.f();
                    try {
                        ThreadLocal threadLocal = Exif.b;
                        Exif exif = new Exif(new ExifInterface(fileCreateTempFile.toString()));
                        exifD3.a(exif);
                        if (exif.b() != 0 || iF2 == 0) {
                            throw null;
                        }
                        exif.c(iF2);
                        throw null;
                    } catch (IOException e2) {
                        throw new ImageCaptureException("Failed to update Exif data", e2);
                    }
                } finally {
                }
            } catch (IOException e3) {
                throw new ImageCaptureException("Failed to write to temp file", e3);
            }
        } catch (IOException e4) {
            throw new ImageCaptureException("Failed to create temp file.", e4);
        }
    }
}
