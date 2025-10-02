package androidx.camera.core.processing;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ SurfaceEdge d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ k(SurfaceEdge surfaceEdge, int i, int i2) {
        this.d = surfaceEdge;
        this.e = i;
        this.f = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        SurfaceEdge surfaceEdge = this.d;
        int i = surfaceEdge.i;
        int i2 = this.e;
        boolean z2 = true;
        if (i != i2) {
            surfaceEdge.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = surfaceEdge.h;
        int i4 = this.f;
        if (i3 != i4) {
            surfaceEdge.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            surfaceEdge.g();
        }
    }
}
