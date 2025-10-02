package androidx.camera.core.imagecapture;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ TakePictureManager e;

    public /* synthetic */ j(TakePictureManager takePictureManager, int i) {
        this.d = i;
        this.e = takePictureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.b();
                break;
            default:
                TakePictureManager takePictureManager = this.e;
                takePictureManager.d = null;
                takePictureManager.b();
                break;
        }
    }
}
