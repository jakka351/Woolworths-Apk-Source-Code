package androidx.camera.core;

import android.util.Range;
import androidx.camera.core.SurfaceRequest;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener e;
    public final /* synthetic */ SurfaceRequest.TransformationInfo f;

    public /* synthetic */ m(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.d = i;
        this.e = transformationInfoListener;
        this.f = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        SurfaceRequest.TransformationInfo transformationInfo = this.f;
        SurfaceRequest.TransformationInfoListener transformationInfoListener = this.e;
        switch (i) {
            case 0:
                Range range = SurfaceRequest.p;
                transformationInfoListener.f(transformationInfo);
                break;
            default:
                Range range2 = SurfaceRequest.p;
                transformationInfoListener.f(transformationInfo);
                break;
        }
    }
}
