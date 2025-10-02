package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes2.dex */
public class SafeCloseImageReaderProxy implements ImageReaderProxy {
    public final ImageReaderProxy d;
    public final Surface e;
    public TakePictureManager f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f423a = new Object();
    public int b = 0;
    public boolean c = false;
    public final j g = new j(this, 1);

    public SafeCloseImageReaderProxy(ImageReaderProxy imageReaderProxy) {
        this.d = imageReaderProxy;
        this.e = imageReaderProxy.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int a() {
        int iA;
        synchronized (this.f423a) {
            iA = this.d.a();
        }
        return iA;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int b() {
        int iB;
        synchronized (this.f423a) {
            iB = this.d.b();
        }
        return iB;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy c() {
        SingleCloseImageProxy singleCloseImageProxy;
        synchronized (this.f423a) {
            ImageProxy imageProxyC = this.d.c();
            if (imageProxyC != null) {
                this.b++;
                singleCloseImageProxy = new SingleCloseImageProxy(imageProxyC);
                singleCloseImageProxy.a(this.g);
            } else {
                singleCloseImageProxy = null;
            }
        }
        return singleCloseImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.f423a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy d() {
        SingleCloseImageProxy singleCloseImageProxy;
        synchronized (this.f423a) {
            ImageProxy imageProxyD = this.d.d();
            if (imageProxyD != null) {
                this.b++;
                singleCloseImageProxy = new SingleCloseImageProxy(imageProxyD);
                singleCloseImageProxy.a(this.g);
            } else {
                singleCloseImageProxy = null;
            }
        }
        return singleCloseImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void e() {
        synchronized (this.f423a) {
            this.d.e();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void f(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.f423a) {
            this.d.f(new d(1, this, onImageAvailableListener), executor);
        }
    }

    public final void g() {
        synchronized (this.f423a) {
            try {
                this.c = true;
                this.d.e();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.f423a) {
            height = this.d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f423a) {
            surface = this.d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.f423a) {
            width = this.d.getWidth();
        }
        return width;
    }
}
