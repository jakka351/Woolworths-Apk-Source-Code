package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class ImageAnalysisNonBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    public final Executor w;
    public final Object x = new Object();
    public ImageProxy y;
    public CacheAnalyzingImageProxy z;

    public static class CacheAnalyzingImageProxy extends ForwardingImageProxy {
        public final WeakReference g;

        public CacheAnalyzingImageProxy(ImageProxy imageProxy, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.g = new WeakReference(imageAnalysisNonBlockingAnalyzer);
            a(new j(this, 0));
        }
    }

    public ImageAnalysisNonBlockingAnalyzer(Executor executor) {
        this.w = executor;
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final ImageProxy b(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.d();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void d() {
        synchronized (this.x) {
            try {
                ImageProxy imageProxy = this.y;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void f(ImageProxy imageProxy) {
        synchronized (this.x) {
            try {
                if (!this.v) {
                    imageProxy.close();
                    return;
                }
                if (this.z == null) {
                    final CacheAnalyzingImageProxy cacheAnalyzingImageProxy = new CacheAnalyzingImageProxy(imageProxy, this);
                    this.z = cacheAnalyzingImageProxy;
                    Futures.a(c(cacheAnalyzingImageProxy), new FutureCallback<Void>() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.1
                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public final void onFailure(Throwable th) throws Exception {
                            cacheAnalyzingImageProxy.close();
                        }

                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        }
                    }, CameraXExecutors.a());
                } else {
                    if (imageProxy.M0().getTimestamp() <= this.z.e.M0().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.y;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.y = imageProxy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
