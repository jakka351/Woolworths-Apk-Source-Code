package androidx.camera.core.processing;

import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements AsyncFunction {
    public final /* synthetic */ SurfaceEdge d;
    public final /* synthetic */ SurfaceEdge.SettableSurface e;
    public final /* synthetic */ int f;
    public final /* synthetic */ SurfaceOutput.CameraInputInfo g;
    public final /* synthetic */ SurfaceOutput.CameraInputInfo h;

    public /* synthetic */ n(SurfaceEdge surfaceEdge, SurfaceEdge.SettableSurface settableSurface, int i, SurfaceOutput.CameraInputInfo cameraInputInfo, SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        this.d = surfaceEdge;
        this.e = settableSurface;
        this.f = i;
        this.g = cameraInputInfo;
        this.h = cameraInputInfo2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        SurfaceEdge.SettableSurface settableSurface = this.e;
        Surface surface = (Surface) obj;
        SurfaceEdge surfaceEdge = this.d;
        surfaceEdge.getClass();
        surface.getClass();
        try {
            settableSurface.d();
            SurfaceOutputImpl surfaceOutputImpl = new SurfaceOutputImpl(surface, this.f, surfaceEdge.g.e(), this.g, this.h);
            surfaceOutputImpl.m.addListener(new j(settableSurface, 1), CameraXExecutors.a());
            Preconditions.f("Consumer can only be linked once.", settableSurface.r == null);
            settableSurface.r = surfaceOutputImpl;
            return Futures.g(surfaceOutputImpl);
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return Futures.e(e);
        }
    }
}
