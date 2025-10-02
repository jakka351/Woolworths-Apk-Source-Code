package androidx.camera.view;

import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.d) {
            case 0:
                PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = (PreviewViewImplementation.OnSurfaceNotInUseListener) this.e;
                Logger.a("SurfaceViewImpl", "Safe to release surface.");
                if (onSurfaceNotInUseListener != null) {
                    onSurfaceNotInUseListener.a();
                    break;
                }
                break;
            default:
                ((CallbackToFutureAdapter.Completer) this.e).b((SurfaceRequest.Result) obj);
                break;
        }
    }
}
