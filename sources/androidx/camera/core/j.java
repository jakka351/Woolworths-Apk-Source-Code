package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;
import androidx.camera.core.imagecapture.TakePictureManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.f544a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void g(ForwardingImageProxy forwardingImageProxy) {
        TakePictureManager takePictureManager;
        switch (this.f544a) {
            case 0:
                ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = (ImageAnalysisNonBlockingAnalyzer) ((ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy) this.b).g.get();
                if (imageAnalysisNonBlockingAnalyzer != null) {
                    imageAnalysisNonBlockingAnalyzer.w.execute(new k(imageAnalysisNonBlockingAnalyzer, 0));
                    return;
                }
                return;
            default:
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = (SafeCloseImageReaderProxy) this.b;
                synchronized (safeCloseImageReaderProxy.f423a) {
                    try {
                        int i = safeCloseImageReaderProxy.b - 1;
                        safeCloseImageReaderProxy.b = i;
                        if (safeCloseImageReaderProxy.c && i == 0) {
                            safeCloseImageReaderProxy.close();
                        }
                        takePictureManager = safeCloseImageReaderProxy.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (takePictureManager != null) {
                    takePictureManager.g(forwardingImageProxy);
                    return;
                }
                return;
        }
    }
}
