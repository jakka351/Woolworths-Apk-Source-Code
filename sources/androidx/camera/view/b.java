package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.view.PreviewView;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f658a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.f658a = i;
        this.b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f658a) {
            case 0:
                LifecycleCameraController lifecycleCameraController = (LifecycleCameraController) this.b;
                lifecycleCameraController.k = (ProcessCameraProviderWrapper) obj;
                lifecycleCameraController.l();
                lifecycleCameraController.k();
                break;
            default:
                ((PreviewStreamStateObserver) this.b).b(PreviewView.StreamState.e);
                break;
        }
        return null;
    }
}
