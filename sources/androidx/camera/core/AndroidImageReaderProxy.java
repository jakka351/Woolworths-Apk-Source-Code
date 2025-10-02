package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class AndroidImageReaderProxy implements ImageReaderProxy {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f385a;
    public final Object b = new Object();
    public boolean c = true;

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.f385a = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int a() {
        int imageFormat;
        synchronized (this.b) {
            imageFormat = this.f385a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int b() {
        int maxImages;
        synchronized (this.b) {
            maxImages = this.f385a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy c() {
        Image imageAcquireNextImage;
        synchronized (this.b) {
            try {
                imageAcquireNextImage = this.f385a.acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new AndroidImageProxy(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.b) {
            this.f385a.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy d() {
        Image imageAcquireLatestImage;
        synchronized (this.b) {
            try {
                imageAcquireLatestImage = this.f385a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new AndroidImageProxy(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void e() {
        synchronized (this.b) {
            this.c = true;
            this.f385a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void f(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
        synchronized (this.b) {
            this.c = false;
            this.f385a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    AndroidImageReaderProxy androidImageReaderProxy = this.f433a;
                    Executor executor2 = executor;
                    ImageReaderProxy.OnImageAvailableListener onImageAvailableListener2 = onImageAvailableListener;
                    synchronized (androidImageReaderProxy.b) {
                        try {
                            if (!androidImageReaderProxy.c) {
                                executor2.execute(new b(0, androidImageReaderProxy, onImageAvailableListener2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, MainThreadAsyncHandler.a());
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.b) {
            height = this.f385a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.b) {
            surface = this.f385a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.b) {
            width = this.f385a.getWidth();
        }
        return width;
    }
}
