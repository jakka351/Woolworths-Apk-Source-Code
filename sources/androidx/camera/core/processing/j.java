package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SurfaceEdge.SettableSurface e;

    public /* synthetic */ j(SurfaceEdge.SettableSurface settableSurface, int i) {
        this.d = i;
        this.e = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.a();
                break;
            case 1:
                this.e.b();
                break;
            default:
                SurfaceEdge.SettableSurface settableSurface = this.e;
                SurfaceOutputImpl surfaceOutputImpl = settableSurface.r;
                if (surfaceOutputImpl != null) {
                    surfaceOutputImpl.b();
                }
                if (settableSurface.q == null) {
                    settableSurface.p.c();
                    break;
                }
                break;
        }
    }
}
