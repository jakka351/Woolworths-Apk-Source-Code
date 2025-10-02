package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* loaded from: classes2.dex */
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    public final OpenGlRenderer d;
    public final HandlerThread e;
    public final Executor f;
    public final Handler g;
    public final AtomicBoolean h;
    public final float[] i;
    public final float[] j;
    public final LinkedHashMap k;
    public int l;
    public boolean m;
    public final ArrayList n;

    public static class Factory {
    }

    @AutoValue
    public static abstract class PendingSnapshot {
        public abstract CallbackToFutureAdapter.Completer a();

        public abstract int b();

        public abstract int c();
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange) throws ExecutionException, InterruptedException {
        Map map = Collections.EMPTY_MAP;
        this.h = new AtomicBoolean(false);
        this.i = new float[16];
        this.j = new float[16];
        this.k = new LinkedHashMap();
        this.l = 0;
        this.m = false;
        this.n = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.e = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g = handler;
        this.f = CameraXExecutors.e(handler);
        this.d = new OpenGlRenderer();
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
        if (this.h.get()) {
            surfaceRequest.c();
        } else {
            d(new c(3, this, surfaceRequest), new d(surfaceRequest, 2));
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void b(SurfaceOutput surfaceOutput) throws IOException {
        if (this.h.get()) {
            surfaceOutput.close();
            return;
        }
        c cVar = new c(2, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        d(cVar, new d(surfaceOutput, 1));
    }

    public final void c() throws IOException {
        if (this.m && this.l == 0) {
            LinkedHashMap linkedHashMap = this.k;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            Iterator it2 = this.n.iterator();
            while (it2.hasNext()) {
                ((PendingSnapshot) it2.next()).a().d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            OpenGlRenderer openGlRenderer = this.d;
            if (openGlRenderer.f549a.getAndSet(false)) {
                GLUtils.c(openGlRenderer.c);
                openGlRenderer.h();
            }
            this.e.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.f.execute(new g(0, this, runnable2, runnable));
        } catch (RejectedExecutionException e) {
            Logger.f("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void e(Exception exc) {
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PendingSnapshot) it.next()).a().d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap f(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        MatrixExt.a(fArr2, i);
        MatrixExt.b(fArr2);
        Size sizeG = TransformUtils.g(size, i);
        OpenGlRenderer openGlRenderer = this.d;
        openGlRenderer.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        Preconditions.a("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4);
        Preconditions.a("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = GLUtils.f561a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        GLUtils.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        GLUtils.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        GLUtils.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        GLUtils.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        GLUtils.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        GLUtils.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        GLUtils.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        GLUtils.b("glActiveTexture");
        GLES20.glBindTexture(36197, openGlRenderer.m);
        GLUtils.b("glBindTexture");
        openGlRenderer.i = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLUtils.Program2D program2D = openGlRenderer.k;
        program2D.getClass();
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            GLES20.glUniformMatrix4fv(((GLUtils.SamplerShaderProgram) program2D).f, 1, false, fArr2, 0);
            GLUtils.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        GLUtils.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        GLUtils.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        GLUtils.b("glDeleteFramebuffers");
        int i4 = openGlRenderer.m;
        GLES20.glActiveTexture(33984);
        GLUtils.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        GLUtils.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void g(Triple triple) throws IOException {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return;
        }
        if (triple == null) {
            e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapF = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    PendingSnapshot pendingSnapshot = (PendingSnapshot) it.next();
                    if (iC != pendingSnapshot.c() || bitmapF == null) {
                        iC = pendingSnapshot.c();
                        if (bitmapF != null) {
                            bitmapF.recycle();
                        }
                        bitmapF = f((Size) triple.e, (float[]) triple.f, iC);
                        iB = -1;
                    }
                    if (iB != pendingSnapshot.b()) {
                        byteArrayOutputStream.reset();
                        iB = pendingSnapshot.b();
                        bitmapF.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) triple.d;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.i(byteArray, surface);
                    pendingSnapshot.a().b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            e(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.h.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.i;
        surfaceTexture.getTransformMatrix(fArr);
        Triple triple = null;
        for (Map.Entry entry : this.k.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            float[] fArr2 = this.j;
            surfaceOutput.q0(fArr2, fArr);
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.d.j(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e) {
                    Logger.c("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                Preconditions.f("Unsupported format: " + surfaceOutput.getFormat(), surfaceOutput.getFormat() == 256);
                Preconditions.f("Only one JPEG output is supported.", triple == null);
                triple = new Triple(surface, surfaceOutput.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            g(triple);
        } catch (RuntimeException e2) {
            e(e2);
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.h.getAndSet(true)) {
            return;
        }
        d(new d(this, 3), new u(1));
    }
}
