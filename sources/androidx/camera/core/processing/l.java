package androidx.camera.core.processing;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SurfaceEdge e;

    public /* synthetic */ l(SurfaceEdge surfaceEdge, int i) {
        this.d = i;
        this.e = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CameraXExecutors.d().execute(new l(this.e, 1));
                break;
            default:
                SurfaceEdge surfaceEdge = this.e;
                if (!surfaceEdge.n) {
                    surfaceEdge.f();
                    break;
                }
                break;
        }
    }
}
