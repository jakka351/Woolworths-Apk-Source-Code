package com.otaliastudios.zoom;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.otaliastudios.opengl.program.GlFlatProgram;
import com.otaliastudios.opengl.program.GlTextureProgram;
import com.otaliastudios.zoom.ZoomSurfaceView;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ZoomSurfaceView e;

    public /* synthetic */ a(ZoomSurfaceView zoomSurfaceView, int i) {
        this.d = i;
        this.e = zoomSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        ZoomSurfaceView zoomSurfaceView = this.e;
        switch (i) {
            case 0:
                ZoomLogger zoomLogger = ZoomSurfaceView.n;
                SurfaceTexture surfaceTexture = zoomSurfaceView.g;
                boolean z = surfaceTexture != null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                GlTextureProgram glTextureProgram = zoomSurfaceView.j;
                if (glTextureProgram != null) {
                    glTextureProgram.d();
                }
                GlFlatProgram glFlatProgram = zoomSurfaceView.k;
                if (glFlatProgram != null) {
                    glFlatProgram.d();
                }
                Surface surface = zoomSurfaceView.f;
                if (surface != null) {
                    surface.release();
                }
                if (z) {
                    Iterator it = zoomSurfaceView.e.iterator();
                    while (it.hasNext()) {
                        ((ZoomSurfaceView.Callback) it.next()).b();
                    }
                }
                zoomSurfaceView.g = null;
                zoomSurfaceView.j = null;
                zoomSurfaceView.k = null;
                zoomSurfaceView.f = null;
                break;
            default:
                ZoomLogger zoomLogger2 = ZoomSurfaceView.n;
                zoomSurfaceView.f = new Surface(zoomSurfaceView.getSurfaceTexture());
                Iterator it2 = zoomSurfaceView.e.iterator();
                while (it2.hasNext()) {
                    ((ZoomSurfaceView.Callback) it2.next()).a();
                }
                break;
        }
    }
}
