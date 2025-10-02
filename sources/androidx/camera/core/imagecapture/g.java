package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.Threads;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.d) {
            case 0:
                ProcessingRequest processingRequest = (ProcessingRequest) this.e;
                ImageProxy imageProxy = (ImageProxy) this.f;
                RequestWithCallback requestWithCallback = processingRequest.g;
                Threads.a();
                if (requestWithCallback.g) {
                    imageProxy.close();
                    return;
                } else {
                    Preconditions.f("onImageCaptured() must be called before onFinalResult()", requestWithCallback.c.isDone());
                    requestWithCallback.a();
                    throw null;
                }
            default:
                TakePictureManager takePictureManager = (TakePictureManager) this.e;
                takePictureManager.e.remove((RequestWithCallback) this.f);
                return;
        }
    }
}
