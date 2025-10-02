package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class AndroidImageProxy implements ImageProxy {
    public final Image d;
    public final PlaneProxy[] e;
    public final ImageInfo f;

    public static final class PlaneProxy implements ImageProxy.PlaneProxy {

        /* renamed from: a, reason: collision with root package name */
        public final Image.Plane f384a;

        public PlaneProxy(Image.Plane plane) {
            this.f384a = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final ByteBuffer q() {
            return this.f384a.getBuffer();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int r() {
            return this.f384a.getRowStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int s() {
            return this.f384a.getPixelStride();
        }
    }

    public AndroidImageProxy(Image image) {
        this.d = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.e = new PlaneProxy[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.e[i] = new PlaneProxy(planes[i]);
            }
        } else {
            this.e = new PlaneProxy[0];
        }
        this.f = new AutoValue_ImmutableImageInfo(TagBundle.b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageInfo M0() {
        return this.f;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.d.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.d.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return this.d;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageProxy.PlaneProxy[] getPlanes() {
        return this.e;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.d.getWidth();
    }
}
