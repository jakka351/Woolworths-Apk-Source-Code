package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class SingleCloseImageProxy extends ForwardingImageProxy {
    public final AtomicBoolean g;

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
        this.g = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.g.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
