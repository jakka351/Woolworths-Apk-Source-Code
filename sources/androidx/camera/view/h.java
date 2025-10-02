package androidx.camera.view;

import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewViewImplementation;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements SurfaceRequest.TransformationInfoListener, PreviewViewImplementation.OnSurfaceNotInUseListener {
    public final /* synthetic */ PreviewView.AnonymousClass1 d;
    public final /* synthetic */ CameraInternal e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(PreviewView.AnonymousClass1 anonymousClass1, CameraInternal cameraInternal, SurfaceRequest surfaceRequest) {
        this.d = anonymousClass1;
        this.e = cameraInternal;
        this.f = surfaceRequest;
    }

    @Override // androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener
    public void a() {
        PreviewStreamStateObserver previewStreamStateObserver = (PreviewStreamStateObserver) this.f;
        AtomicReference atomicReference = PreviewView.this.j;
        while (true) {
            if (atomicReference.compareAndSet(previewStreamStateObserver, null)) {
                previewStreamStateObserver.b(PreviewView.StreamState.d);
                break;
            } else if (atomicReference.get() != previewStreamStateObserver) {
                break;
            }
        }
        FutureChain futureChain = previewStreamStateObserver.e;
        if (futureChain != null) {
            futureChain.cancel(false);
            previewStreamStateObserver.e = null;
        }
        this.e.g().d(previewStreamStateObserver);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void f(SurfaceRequest.TransformationInfo transformationInfo) {
        PreviewViewImplementation previewViewImplementation;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.f;
        PreviewView previewView = PreviewView.this;
        Logger.a("PreviewView", "Preview transformation info updated. " + transformationInfo);
        boolean z = this.e.d().d() == 0;
        PreviewTransformation previewTransformation = previewView.g;
        Size size = surfaceRequest.b;
        previewTransformation.getClass();
        Logger.a("PreviewTransform", "Transformation info set: " + transformationInfo + " " + size + " " + z);
        previewTransformation.b = transformationInfo.a();
        previewTransformation.c = transformationInfo.b();
        previewTransformation.e = transformationInfo.d();
        previewTransformation.f647a = size;
        previewTransformation.f = z;
        previewTransformation.g = transformationInfo.e();
        previewTransformation.d = transformationInfo.c();
        if (transformationInfo.d() == -1 || ((previewViewImplementation = previewView.e) != null && (previewViewImplementation instanceof SurfaceViewImplementation))) {
            previewView.h = true;
        } else {
            previewView.h = false;
        }
        previewView.b();
    }

    public /* synthetic */ h(PreviewView.AnonymousClass1 anonymousClass1, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
        this.d = anonymousClass1;
        this.f = previewStreamStateObserver;
        this.e = cameraInternal;
    }
}
