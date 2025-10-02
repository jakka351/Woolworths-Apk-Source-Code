package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f545a;
    public final /* synthetic */ ImageProxy b;
    public final /* synthetic */ ImageProxy c;

    public /* synthetic */ l(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.f545a = i;
        this.b = imageProxy;
        this.c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void g(ForwardingImageProxy forwardingImageProxy) throws Exception {
        int i = this.f545a;
        ImageProxy imageProxy = this.c;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.f411a;
                imageProxy.close();
                break;
            default:
                int i3 = ImageProcessingUtil.f411a;
                imageProxy.close();
                break;
        }
    }
}
