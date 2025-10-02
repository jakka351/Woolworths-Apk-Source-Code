package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@WorkerThread
/* loaded from: classes2.dex */
public final class DualOpenGlRenderer extends OpenGlRenderer {
    public int n = -1;
    public int o = -1;
    public final LayoutSettings p;
    public final LayoutSettings q;

    public DualOpenGlRenderer(LayoutSettings layoutSettings, LayoutSettings layoutSettings2) {
        this.p = layoutSettings;
        this.q = layoutSettings2;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public final GraphicDeviceInfo e(DynamicRange dynamicRange) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        GraphicDeviceInfo graphicDeviceInfoE = super.e(dynamicRange);
        this.n = GLUtils.h();
        this.o = GLUtils.h();
        return graphicDeviceInfoE;
    }

    public final void l(long j, Surface surface, SurfaceOutput surfaceOutput, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        GLUtils.d(this.f549a, true);
        GLUtils.c(this.c);
        HashMap map = this.b;
        Preconditions.f("The surface is not registered.", map.containsKey(surface));
        OutputSurface outputSurfaceB = (OutputSurface) map.get(surface);
        Objects.requireNonNull(outputSurfaceB);
        if (outputSurfaceB == GLUtils.j) {
            outputSurfaceB = b(surface);
            if (outputSurfaceB == null) {
                return;
            } else {
                map.put(surface, outputSurfaceB);
            }
        }
        OutputSurface outputSurface = outputSurfaceB;
        if (surface != this.i) {
            f(outputSurface.a());
            this.i = surface;
        }
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        GLES20.glClear(16384);
        m(outputSurface, surfaceOutput, surfaceTexture, this.p, this.n);
        m(outputSurface, surfaceOutput, surfaceTexture2, this.q, this.o);
        EGLExt.eglPresentationTimeANDROID(this.d, outputSurface.a(), j);
        if (EGL14.eglSwapBuffers(this.d, outputSurface.a())) {
            return;
        }
        Logger.e("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void m(OutputSurface outputSurface, SurfaceOutput surfaceOutput, SurfaceTexture surfaceTexture, LayoutSettings layoutSettings, int i) {
        k(i);
        GLES20.glViewport(0, 0, outputSurface.c(), outputSurface.b());
        GLES20.glScissor(0, 0, outputSurface.c(), outputSurface.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        surfaceOutput.y0(fArr2, fArr);
        GLUtils.Program2D program2D = this.k;
        program2D.getClass();
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            GLES20.glUniformMatrix4fv(((GLUtils.SamplerShaderProgram) program2D).f, 1, false, fArr2, 0);
            GLUtils.b("glUniformMatrix4fv");
        }
        float fC = outputSurface.c();
        layoutSettings.getClass();
        Size size = new Size((int) (fC * 1.0f), (int) (outputSurface.b() * 1.0f));
        Size size2 = new Size(outputSurface.c(), outputSurface.b());
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(program2D.b, 1, false, fArr5, 0);
        GLUtils.b("glUniformMatrix4fv");
        GLES20.glUniform1f(program2D.c, layoutSettings.f412a);
        GLUtils.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
