package androidx.camera.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = (ImageAnalysisNonBlockingAnalyzer) this.e;
                synchronized (imageAnalysisNonBlockingAnalyzer.x) {
                    try {
                        imageAnalysisNonBlockingAnalyzer.z = null;
                        ImageProxy imageProxy = imageAnalysisNonBlockingAnalyzer.y;
                        if (imageProxy != null) {
                            imageAnalysisNonBlockingAnalyzer.y = null;
                            imageAnalysisNonBlockingAnalyzer.f(imageProxy);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((Preview) this.e).p();
                return;
            default:
                ((SurfaceRequest) this.e).g.cancel(true);
                return;
        }
    }
}
