package androidx.camera.core.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.util.GLUtils;
import androidx.core.util.Consumer;
import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) throws IOException {
        switch (this.d) {
            case 0:
                Surface surface = (Surface) this.e;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f;
                surface.release();
                surfaceTexture.release();
                break;
            default:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.e;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f;
                surfaceOutput.close();
                Surface surface2 = (Surface) dualSurfaceProcessor.k.remove(surfaceOutput);
                if (surface2 != null) {
                    DualOpenGlRenderer dualOpenGlRenderer = dualSurfaceProcessor.d;
                    GLUtils.d(dualOpenGlRenderer.f549a, true);
                    GLUtils.c(dualOpenGlRenderer.c);
                    dualOpenGlRenderer.i(surface2, true);
                    break;
                }
                break;
        }
    }
}
