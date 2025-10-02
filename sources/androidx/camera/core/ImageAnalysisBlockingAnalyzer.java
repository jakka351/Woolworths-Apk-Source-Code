package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;

/* loaded from: classes2.dex */
final class ImageAnalysisBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final ImageProxy b(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.c();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void d() {
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void f(final ImageProxy imageProxy) {
        Futures.a(c(imageProxy), new FutureCallback<Void>() { // from class: androidx.camera.core.ImageAnalysisBlockingAnalyzer.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) throws Exception {
                imageProxy.close();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }
        }, CameraXExecutors.a());
    }
}
