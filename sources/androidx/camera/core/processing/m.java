package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DeferrableSurface e;

    public /* synthetic */ m(DeferrableSurface deferrableSurface, int i) {
        this.d = i;
        this.e = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.a();
                break;
            default:
                this.e.b();
                break;
        }
    }
}
