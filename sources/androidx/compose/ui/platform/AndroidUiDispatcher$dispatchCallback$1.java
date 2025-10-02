package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ AndroidUiDispatcher d;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.d = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.g.removeCallbacks(this);
        AndroidUiDispatcher.T(this.d);
        AndroidUiDispatcher androidUiDispatcher = this.d;
        synchronized (androidUiDispatcher.h) {
            if (androidUiDispatcher.m) {
                androidUiDispatcher.m = false;
                ArrayList arrayList = androidUiDispatcher.j;
                androidUiDispatcher.j = androidUiDispatcher.k;
                androidUiDispatcher.k = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidUiDispatcher.T(this.d);
        AndroidUiDispatcher androidUiDispatcher = this.d;
        synchronized (androidUiDispatcher.h) {
            if (androidUiDispatcher.j.isEmpty()) {
                androidUiDispatcher.f.removeFrameCallback(this);
                androidUiDispatcher.m = false;
            }
        }
    }
}
