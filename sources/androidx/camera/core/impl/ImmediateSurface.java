package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final class ImmediateSurface extends DeferrableSurface {
    public final Surface o;

    public ImmediateSurface(Surface surface, Size size, int i) {
        super(size, i);
        this.o = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture f() {
        return Futures.g(this.o);
    }

    public ImmediateSurface(Surface surface) {
        super(DeferrableSurface.k, 0);
        this.o = surface;
    }
}
