package androidx.camera.view;

import androidx.camera.core.ImageCapture;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((ImageCapture.ScreenFlashListener) this.e).onCompleted();
                break;
            default:
                ((h) this.e).a();
                break;
        }
    }
}
