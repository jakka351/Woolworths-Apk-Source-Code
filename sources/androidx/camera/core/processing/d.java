package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.d) {
            case 0:
                ((CallbackToFutureAdapter.Completer) this.e).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            case 1:
                ((SurfaceOutput) this.e).close();
                break;
            case 2:
                ((SurfaceRequest) this.e).c();
                break;
            case 3:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.e;
                defaultSurfaceProcessor.m = true;
                defaultSurfaceProcessor.c();
                break;
            default:
                SurfaceProcessorNode.Out out = ((SurfaceProcessorNode) this.e).c;
                if (out != null) {
                    Iterator<SurfaceEdge> it = out.values().iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    break;
                }
                break;
        }
    }
}
