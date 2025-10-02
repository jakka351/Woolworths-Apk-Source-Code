package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.impl.utils.Threads;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(CaptureNode.AnonymousClass1 anonymousClass1) {
        this.d = 2;
        this.e = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                RequestWithCallback requestWithCallback = ((ProcessingRequest) this.e).g;
                Threads.a();
                if (!requestWithCallback.g) {
                    throw null;
                }
                return;
            case 1:
                RequestWithCallback requestWithCallback2 = ((ProcessingRequest) this.e).g;
                Threads.a();
                if (requestWithCallback2.g) {
                    return;
                }
                Preconditions.f("onImageCaptured() must be called before onFinalResult()", requestWithCallback2.c.isDone());
                requestWithCallback2.a();
                Threads.a();
                throw null;
            default:
                ProcessingRequest processingRequest = ((CaptureNode.AnonymousClass1) this.e).f443a.f442a;
                if (processingRequest != null) {
                    processingRequest.g.b();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h(ProcessingRequest processingRequest, Object obj, int i) {
        this.d = i;
        this.e = processingRequest;
    }
}
