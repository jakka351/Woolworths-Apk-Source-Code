package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.e;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.d;
import androidx.camera.core.processing.f;
import androidx.camera.core.processing.g;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class DualSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    public final DualOpenGlRenderer d;
    public final HandlerThread e;
    public final Executor f;
    public final Handler g;
    public int h;
    public boolean i;
    public final AtomicBoolean j;
    public final LinkedHashMap k;
    public SurfaceTexture l;
    public SurfaceTexture m;

    public static class Factory {
    }

    public DualSurfaceProcessor(DynamicRange dynamicRange, LayoutSettings layoutSettings, LayoutSettings layoutSettings2) throws ExecutionException, InterruptedException {
        Map map = Collections.EMPTY_MAP;
        this.h = 0;
        this.i = false;
        this.j = new AtomicBoolean(false);
        this.k = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.e = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g = handler;
        this.f = CameraXExecutors.e(handler);
        this.d = new DualOpenGlRenderer(layoutSettings, layoutSettings2);
        try {
            try {
                CallbackToFutureAdapter.a(new f(this, dynamicRange)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void a(SurfaceRequest surfaceRequest) {
        if (this.j.get()) {
            surfaceRequest.c();
        } else {
            d(new e(2, this, surfaceRequest), new d(surfaceRequest, 2));
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void b(SurfaceOutput surfaceOutput) throws IOException {
        if (this.j.get()) {
            surfaceOutput.close();
            return;
        }
        e eVar = new e(1, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        d(eVar, new d(surfaceOutput, 1));
    }

    public final void c() {
        if (this.i && this.h == 0) {
            LinkedHashMap linkedHashMap = this.k;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            linkedHashMap.clear();
            DualOpenGlRenderer dualOpenGlRenderer = this.d;
            if (dualOpenGlRenderer.f549a.getAndSet(false)) {
                GLUtils.c(dualOpenGlRenderer.c);
                dualOpenGlRenderer.h();
            }
            dualOpenGlRenderer.n = -1;
            dualOpenGlRenderer.o = -1;
            this.e.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.f.execute(new g(2, this, runnable2, runnable));
        } catch (RejectedExecutionException e) {
            Logger.f("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.j.get() || (surfaceTexture2 = this.l) == null || this.m == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.m.updateTexImage();
        for (Map.Entry entry : this.k.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.d.l(surfaceTexture.getTimestamp(), surface, surfaceOutput, this.l, this.m);
                } catch (RuntimeException e) {
                    Logger.c("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.j.getAndSet(true)) {
            return;
        }
        d(new androidx.camera.camera2.interop.d(this, 6), new u(1));
    }
}
