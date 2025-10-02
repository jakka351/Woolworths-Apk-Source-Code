package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SurfaceRequest e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(Object obj, SurfaceRequest surfaceRequest, int i) {
        this.d = i;
        this.f = obj;
        this.e = surfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((PreviewView.AnonymousClass1) PreviewView.this.r).a(this.e);
                break;
            default:
                TextureViewImplementation textureViewImplementation = (TextureViewImplementation) this.f;
                SurfaceRequest surfaceRequest = textureViewImplementation.h;
                if (surfaceRequest != null && surfaceRequest == this.e) {
                    textureViewImplementation.h = null;
                    textureViewImplementation.g = null;
                }
                h hVar = textureViewImplementation.l;
                if (hVar != null) {
                    hVar.a();
                    textureViewImplementation.l = null;
                    break;
                }
                break;
        }
    }
}
