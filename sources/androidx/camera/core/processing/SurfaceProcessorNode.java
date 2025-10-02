package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class SurfaceProcessorNode implements Node<In, Out> {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultSurfaceProcessor f551a;
    public final CameraInternal b;
    public Out c;

    @AutoValue
    public static abstract class In {
        public static In c(SurfaceEdge surfaceEdge, List list) {
            return new AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }

        public abstract List a();

        public abstract SurfaceEdge b();
    }

    public static class Out extends HashMap<OutConfig, SurfaceEdge> {
    }

    public SurfaceProcessorNode(CameraInternal cameraInternal, DefaultSurfaceProcessor defaultSurfaceProcessor) {
        this.b = cameraInternal;
        this.f551a = defaultSurfaceProcessor;
    }

    public final void a(SurfaceEdge surfaceEdge, Map.Entry entry) {
        final SurfaceEdge surfaceEdge2 = (SurfaceEdge) entry.getValue();
        SurfaceOutput.CameraInputInfo cameraInputInfo = null;
        SurfaceOutput.CameraInputInfo cameraInputInfoF = SurfaceOutput.CameraInputInfo.f(surfaceEdge.g.e(), ((OutConfig) entry.getKey()).a(), surfaceEdge.c ? this.b : null, ((OutConfig) entry.getKey()).c(), ((OutConfig) entry.getKey()).g());
        int iB = ((OutConfig) entry.getKey()).b();
        surfaceEdge2.getClass();
        Threads.a();
        surfaceEdge2.b();
        Preconditions.f("Consumer can only be linked once.", !surfaceEdge2.j);
        surfaceEdge2.j = true;
        SurfaceEdge.SettableSurface settableSurface = surfaceEdge2.l;
        Futures.a(Futures.m(settableSurface.c(), new n(surfaceEdge2, settableSurface, iB, cameraInputInfoF, cameraInputInfo), CameraXExecutors.d()), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                int i = surfaceEdge2.f;
                if (i == 2 && (th instanceof CancellationException)) {
                    Logger.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.f("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + TargetUtils.a(i), th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) throws IOException {
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                surfaceOutput.getClass();
                try {
                    SurfaceProcessorNode.this.f551a.b(surfaceOutput);
                } catch (ProcessingException e) {
                    Logger.c("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
            }
        }, CameraXExecutors.d());
    }

    public final void b() {
        this.f551a.release();
        Threads.c(new d(this, 4));
    }

    public final Out c(In in) {
        Rect rect;
        Threads.a();
        this.c = new Out();
        AutoValue_SurfaceProcessorNode_In autoValue_SurfaceProcessorNode_In = (AutoValue_SurfaceProcessorNode_In) in;
        SurfaceEdge surfaceEdge = autoValue_SurfaceProcessorNode_In.f548a;
        for (OutConfig outConfig : autoValue_SurfaceProcessorNode_In.b) {
            Out out = this.c;
            Rect rectA = outConfig.a();
            int iC = outConfig.c();
            boolean zG = outConfig.g();
            Matrix matrix = surfaceEdge.b;
            Rect rect2 = surfaceEdge.d;
            Matrix matrix2 = new Matrix(matrix);
            RectF rectF = new RectF(rectA);
            Size sizeD = outConfig.d();
            RectF rectF2 = TransformUtils.f522a;
            float f = 0;
            Matrix matrixA = TransformUtils.a(rectF, new RectF(f, f, sizeD.getWidth(), sizeD.getHeight()), iC, zG);
            matrix2.postConcat(matrixA);
            Preconditions.b(TransformUtils.d(TransformUtils.g(TransformUtils.e(rectA), iC), false, outConfig.d()));
            if (outConfig.i()) {
                Preconditions.a("Output crop rect " + outConfig.a() + " must contain input crop rect " + rect2, outConfig.a().contains(rect2));
                rect = new Rect();
                RectF rectF3 = new RectF(rect2);
                matrixA.mapRect(rectF3);
                rectF3.round(rect);
            } else {
                Size sizeD2 = outConfig.d();
                rect = new Rect(0, 0, sizeD2.getWidth(), sizeD2.getHeight());
            }
            Rect rect3 = rect;
            StreamSpec.Builder builderG = surfaceEdge.g.g();
            builderG.e(outConfig.d());
            out.put(outConfig, new SurfaceEdge(outConfig.e(), outConfig.b(), builderG.a(), matrix2, false, rect3, surfaceEdge.i - iC, -1, surfaceEdge.e != zG));
        }
        try {
            this.f551a.a(surfaceEdge.d(this.b, true));
        } catch (ProcessingException e) {
            Logger.c("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry<OutConfig, SurfaceEdge> entry : this.c.entrySet()) {
            a(surfaceEdge, entry);
            entry.getValue().a(new g(1, this, surfaceEdge, entry));
        }
        final Out out2 = this.c;
        Consumer consumer = new Consumer() { // from class: androidx.camera.core.processing.p
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) obj;
                for (Map.Entry entry2 : out2.entrySet()) {
                    int iB = transformationInfo.b() - ((OutConfig) entry2.getKey()).c();
                    if (((OutConfig) entry2.getKey()).g()) {
                        iB = -iB;
                    }
                    int iH = TransformUtils.h(iB);
                    SurfaceEdge surfaceEdge2 = (SurfaceEdge) entry2.getValue();
                    surfaceEdge2.getClass();
                    Threads.c(new k(surfaceEdge2, iH, -1));
                }
            }
        };
        surfaceEdge.getClass();
        surfaceEdge.o.add(consumer);
        return this.c;
    }
}
