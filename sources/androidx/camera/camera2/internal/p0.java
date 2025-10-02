package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ ZoomControl e;
    public final /* synthetic */ ZoomState f;

    public /* synthetic */ p0(ZoomControl zoomControl, ZoomState zoomState, int i) {
        this.d = i;
        this.e = zoomControl;
        this.f = zoomState;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                final ZoomControl zoomControl = this.e;
                Executor executor = zoomControl.b;
                final int i = 0;
                final ZoomState zoomState = this.f;
                executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                zoomControl.b(completer, zoomState);
                                break;
                            default:
                                zoomControl.b(completer, zoomState);
                                break;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final ZoomControl zoomControl2 = this.e;
                Executor executor2 = zoomControl2.b;
                final int i2 = 1;
                final ZoomState zoomState2 = this.f;
                executor2.execute(new Runnable() { // from class: androidx.camera.camera2.internal.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                zoomControl2.b(completer, zoomState2);
                                break;
                            default:
                                zoomControl2.b(completer, zoomState2);
                                break;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}
