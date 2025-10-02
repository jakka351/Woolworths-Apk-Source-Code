package androidx.camera.view;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.video.VideoCapture;
import androidx.camera.view.RotationProvider;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements AsyncFunction, ZoomGestureDetector.OnZoomGestureListener, CallbackToFutureAdapter.Resolver, RotationProvider.Listener {
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj) {
        this.d = obj;
    }

    @Override // androidx.camera.view.RotationProvider.Listener
    public void a(int i) {
        LifecycleCameraController lifecycleCameraController = (LifecycleCameraController) this.d;
        ImageAnalysis imageAnalysis = lifecycleCameraController.d;
        if (imageAnalysis.A(i)) {
            imageAnalysis.H();
        }
        ImageCapture imageCapture = lifecycleCameraController.c;
        int iJ = imageCapture.j();
        if (imageCapture.A(i) && imageCapture.t != null) {
            imageCapture.t = ImageUtil.b(Math.abs(CameraOrientationUtil.b(i) - CameraOrientationUtil.b(iJ)), imageCapture.t);
        }
        VideoCapture videoCapture = lifecycleCameraController.e;
        if (videoCapture.A(i)) {
            videoCapture.O();
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return ((PreviewStreamStateObserver) this.d).d.g();
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        ((TextureViewImplementation) this.d).k.set(completer);
        return "textureViewImpl_waitForNextFrame";
    }

    public void b(ZoomGestureDetector.ZoomEvent zoomEvent) {
        PreviewView previewView = (PreviewView) this.d;
        if (!(zoomEvent instanceof ZoomGestureDetector.ZoomEvent.Move)) {
            int i = PreviewView.s;
            return;
        }
        CameraController cameraController = previewView.k;
        if (cameraController != null) {
            float f = ((ZoomGestureDetector.ZoomEvent.Move) zoomEvent).f661a;
            if (!cameraController.h()) {
                Logger.e("CameraController", "Use cases not attached to camera.");
                return;
            }
            if (!cameraController.p) {
                Logger.a("CameraController", "Pinch to zoom disabled.");
                return;
            }
            Logger.a("CameraController", "Pinch to zoom with scale: " + f);
            Threads.a();
            ZoomState zoomState = (ZoomState) cameraController.r.e();
            if (zoomState == null) {
                return;
            }
            cameraController.i(Math.min(Math.max(zoomState.d() * (f > 1.0f ? YU.a.a(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), zoomState.c()), zoomState.a()));
        }
    }
}
