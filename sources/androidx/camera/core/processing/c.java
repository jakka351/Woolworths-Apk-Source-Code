package androidx.camera.core.processing;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.util.GLUtils;
import androidx.core.util.Consumer;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        switch (this.d) {
            case 0:
                ((DefaultSurfaceProcessor) this.e).n.add((AutoValue_DefaultSurfaceProcessor_PendingSnapshot) this.f);
                break;
            case 1:
                ((Consumer) ((AtomicReference) this.f).get()).accept(SurfaceOutput.Event.c((SurfaceOutputImpl) this.e));
                break;
            case 2:
                final DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.e;
                final SurfaceOutput surfaceOutput = (SurfaceOutput) this.f;
                Surface surfaceQ1 = surfaceOutput.Q1(defaultSurfaceProcessor.f, new Consumer() { // from class: androidx.camera.core.processing.e
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) throws IOException {
                        SurfaceOutput surfaceOutput2 = surfaceOutput;
                        surfaceOutput2.close();
                        DefaultSurfaceProcessor defaultSurfaceProcessor2 = defaultSurfaceProcessor;
                        Surface surface = (Surface) defaultSurfaceProcessor2.k.remove(surfaceOutput2);
                        if (surface != null) {
                            OpenGlRenderer openGlRenderer = defaultSurfaceProcessor2.d;
                            GLUtils.d(openGlRenderer.f549a, true);
                            GLUtils.c(openGlRenderer.c);
                            openGlRenderer.i(surface, true);
                        }
                    }
                });
                defaultSurfaceProcessor.d.g(surfaceQ1);
                defaultSurfaceProcessor.k.put(surfaceOutput, surfaceQ1);
                break;
            default:
                final DefaultSurfaceProcessor defaultSurfaceProcessor2 = (DefaultSurfaceProcessor) this.e;
                final SurfaceRequest surfaceRequest = (SurfaceRequest) this.f;
                defaultSurfaceProcessor2.l++;
                OpenGlRenderer openGlRenderer = defaultSurfaceProcessor2.d;
                GLUtils.d(openGlRenderer.f549a, true);
                GLUtils.c(openGlRenderer.c);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(openGlRenderer.m);
                Size size = surfaceRequest.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                Executor executor = defaultSurfaceProcessor2.f;
                surfaceRequest.b(executor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.core.processing.h
                    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                    public final void f(SurfaceRequest.TransformationInfo transformationInfo) {
                        GLUtils.InputFormat inputFormat = (surfaceRequest.c.a() && transformationInfo.e()) ? GLUtils.InputFormat.f : GLUtils.InputFormat.e;
                        OpenGlRenderer openGlRenderer2 = defaultSurfaceProcessor2.d;
                        GLUtils.d(openGlRenderer2.f549a, true);
                        GLUtils.c(openGlRenderer2.c);
                        if (openGlRenderer2.l != inputFormat) {
                            openGlRenderer2.l = inputFormat;
                            openGlRenderer2.k(openGlRenderer2.m);
                        }
                    }
                });
                surfaceRequest.a(surface, executor, new Consumer() { // from class: androidx.camera.core.processing.i
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) throws IOException {
                        DefaultSurfaceProcessor defaultSurfaceProcessor3 = defaultSurfaceProcessor2;
                        SurfaceRequest surfaceRequest2 = surfaceRequest;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        defaultSurfaceProcessor3.getClass();
                        synchronized (surfaceRequest2.f424a) {
                            surfaceRequest2.n = null;
                            surfaceRequest2.o = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        defaultSurfaceProcessor3.l--;
                        defaultSurfaceProcessor3.c();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(defaultSurfaceProcessor2, defaultSurfaceProcessor2.g);
                break;
        }
    }
}
