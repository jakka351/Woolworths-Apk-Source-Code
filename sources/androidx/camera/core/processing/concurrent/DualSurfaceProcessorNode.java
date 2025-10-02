package androidx.camera.core.processing.concurrent;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.processing.n;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class DualSurfaceProcessorNode implements Node<In, Out> {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceProcessorInternal f555a;
    public final CameraInternal b;
    public final CameraInternal c;
    public Out d;
    public In e;

    @AutoValue
    public static abstract class In {
        public static In d(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, ArrayList arrayList) {
            return new AutoValue_DualSurfaceProcessorNode_In(surfaceEdge, surfaceEdge2, arrayList);
        }

        public abstract List a();

        public abstract SurfaceEdge b();

        public abstract SurfaceEdge c();
    }

    public static class Out extends HashMap<DualOutConfig, SurfaceEdge> {
    }

    public DualSurfaceProcessorNode(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceProcessorInternal surfaceProcessorInternal) {
        this.b = cameraInternal;
        this.c = cameraInternal2;
        this.f555a = surfaceProcessorInternal;
    }

    public final void a(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, Map.Entry entry) {
        final SurfaceEdge surfaceEdge3 = (SurfaceEdge) entry.getValue();
        Size sizeE = surfaceEdge.g.e();
        Rect rectA = ((DualOutConfig) entry.getKey()).a().a();
        if (!surfaceEdge.c) {
            cameraInternal = null;
        }
        SurfaceOutput.CameraInputInfo cameraInputInfoF = SurfaceOutput.CameraInputInfo.f(sizeE, rectA, cameraInternal, ((DualOutConfig) entry.getKey()).a().c(), ((DualOutConfig) entry.getKey()).a().g());
        Size sizeE2 = surfaceEdge2.g.e();
        Rect rectA2 = ((DualOutConfig) entry.getKey()).b().a();
        if (!surfaceEdge2.c) {
            cameraInternal2 = null;
        }
        SurfaceOutput.CameraInputInfo cameraInputInfoF2 = SurfaceOutput.CameraInputInfo.f(sizeE2, rectA2, cameraInternal2, ((DualOutConfig) entry.getKey()).b().c(), ((DualOutConfig) entry.getKey()).b().g());
        int iB = ((DualOutConfig) entry.getKey()).a().b();
        surfaceEdge3.getClass();
        Threads.a();
        surfaceEdge3.b();
        Preconditions.f("Consumer can only be linked once.", !surfaceEdge3.j);
        surfaceEdge3.j = true;
        SurfaceEdge.SettableSurface settableSurface = surfaceEdge3.l;
        Futures.a(Futures.m(settableSurface.c(), new n(surfaceEdge3, settableSurface, iB, cameraInputInfoF, cameraInputInfoF2), CameraXExecutors.d()), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                int i = surfaceEdge3.f;
                if (i == 2 && (th instanceof CancellationException)) {
                    Logger.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.f("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + TargetUtils.a(i), th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                surfaceOutput.getClass();
                try {
                    DualSurfaceProcessorNode.this.f555a.b(surfaceOutput);
                } catch (ProcessingException e) {
                    Logger.c("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
            }
        }, CameraXExecutors.d());
    }
}
