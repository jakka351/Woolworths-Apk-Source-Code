package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                SurfaceEdge.SettableSurface settableSurface = (SurfaceEdge.SettableSurface) this.e;
                settableSurface.p = completer;
                return "SettableFuture hashCode: " + settableSurface.hashCode();
            default:
                ((SurfaceOutputImpl) this.e).n = completer;
                return "SurfaceOutputImpl close future complete";
        }
    }
}
