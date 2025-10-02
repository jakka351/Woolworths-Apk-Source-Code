package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Objects;

@RestrictTo
/* loaded from: classes2.dex */
public final class RgbaImageProxy implements ImageProxy {
    public final Object d;
    public final int e;
    public final int f;
    public ImageProxy.PlaneProxy[] g;
    public final ImageInfo h;

    public RgbaImageProxy(Packet packet) {
        Bitmap bitmap = (Bitmap) packet.c();
        final int iF = packet.f();
        final long timestamp = packet.a().getTimestamp();
        Preconditions.a("Only accept Bitmap with ARGB_8888 format for now.", bitmap.getConfig() == Bitmap.Config.ARGB_8888);
        final ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.e(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.d = new Object();
        this.e = width;
        this.f = height;
        this.h = new ImageInfo() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.2
            @Override // androidx.camera.core.ImageInfo
            public final TagBundle a() {
                throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
            }

            @Override // androidx.camera.core.ImageInfo
            public final void b(ExifData.Builder builder) {
                throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
            }

            @Override // androidx.camera.core.ImageInfo
            public final int c() {
                return iF;
            }

            @Override // androidx.camera.core.ImageInfo
            public final long getTimestamp() {
                return timestamp;
            }
        };
        byteBufferAllocateDirect.rewind();
        final int i = width * 4;
        this.g = new ImageProxy.PlaneProxy[]{new ImageProxy.PlaneProxy() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.1
            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public final ByteBuffer q() {
                return byteBufferAllocateDirect;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public final int r() {
                return i;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public final int s() {
                return 4;
            }
        }};
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageInfo M0() {
        ImageInfo imageInfo;
        synchronized (this.d) {
            a();
            imageInfo = this.h;
        }
        return imageInfo;
    }

    public final void a() {
        synchronized (this.d) {
            Preconditions.f("The image is closed.", this.g != null);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            a();
            this.g = null;
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        synchronized (this.d) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        int i;
        synchronized (this.d) {
            a();
            i = this.f;
        }
        return i;
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        synchronized (this.d) {
            a();
        }
        return null;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageProxy.PlaneProxy[] getPlanes() {
        ImageProxy.PlaneProxy[] planeProxyArr;
        synchronized (this.d) {
            a();
            ImageProxy.PlaneProxy[] planeProxyArr2 = this.g;
            Objects.requireNonNull(planeProxyArr2);
            planeProxyArr = planeProxyArr2;
        }
        return planeProxyArr;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        int i;
        synchronized (this.d) {
            a();
            i = this.e;
        }
        return i;
    }
}
