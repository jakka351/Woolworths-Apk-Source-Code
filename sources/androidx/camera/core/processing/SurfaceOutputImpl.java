package androidx.camera.core.processing;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class SurfaceOutputImpl implements SurfaceOutput {
    public final Surface e;
    public final int f;
    public final Size g;
    public final float[] h;
    public Consumer i;
    public Executor j;
    public final ListenableFuture m;
    public CallbackToFutureAdapter.Completer n;
    public final Object d = new Object();
    public boolean k = false;
    public boolean l = false;

    public SurfaceOutputImpl(Surface surface, int i, Size size, SurfaceOutput.CameraInputInfo cameraInputInfo, SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        float[] fArr = new float[16];
        this.h = fArr;
        this.e = surface;
        this.f = i;
        this.g = size;
        a(fArr, new float[16], cameraInputInfo);
        a(new float[16], new float[16], cameraInputInfo2);
        this.m = CallbackToFutureAdapter.a(new o(this, 1));
    }

    public static void a(float[] fArr, float[] fArr2, SurfaceOutput.CameraInputInfo cameraInputInfo) {
        Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        MatrixExt.b(fArr);
        MatrixExt.a(fArr, cameraInputInfo.e());
        if (cameraInputInfo.d()) {
            Matrix.translateM(fArr, 0, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = TransformUtils.g(cameraInputInfo.c(), cameraInputInfo.e());
        Size sizeC = cameraInputInfo.c();
        float f = 0;
        android.graphics.Matrix matrixA = TransformUtils.a(new RectF(f, f, sizeC.getWidth(), sizeC.getHeight()), new RectF(f, f, sizeG.getWidth(), sizeG.getHeight()), cameraInputInfo.e(), cameraInputInfo.d());
        RectF rectF = new RectF(cameraInputInfo.b());
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, BitmapDescriptorFactory.HUE_RED);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        CameraInternal cameraInternalA = cameraInputInfo.a();
        Matrix.setIdentityM(fArr2, 0);
        MatrixExt.b(fArr2);
        if (cameraInternalA != null) {
            Preconditions.f("Camera has no transform.", cameraInternalA.p());
            MatrixExt.a(fArr2, cameraInternalA.b().i());
            if (cameraInternalA.e()) {
                Matrix.translateM(fArr2, 0, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Surface Q1(Executor executor, Consumer consumer) {
        boolean z;
        synchronized (this.d) {
            this.j = executor;
            this.i = consumer;
            z = this.k;
        }
        if (z) {
            b();
        }
        return this.e;
    }

    public final void b() {
        Executor executor;
        Consumer consumer;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.d) {
            try {
                if (this.j == null || (consumer = this.i) == null) {
                    this.k = true;
                } else if (!this.l) {
                    atomicReference.set(consumer);
                    executor = this.j;
                    this.k = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new c(1, this, atomicReference));
            } catch (RejectedExecutionException e) {
                if (Logger.d(3, "SurfaceOutputImpl")) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            try {
                if (!this.l) {
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.n.b(null);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getFormat() {
        return this.f;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Size getSize() {
        return this.g;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void q0(float[] fArr, float[] fArr2) {
        y0(fArr, fArr2);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void y0(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.h, 0);
    }
}
