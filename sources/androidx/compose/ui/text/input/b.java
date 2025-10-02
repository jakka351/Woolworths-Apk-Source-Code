package androidx.compose.ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {
    public final /* synthetic */ Choreographer d;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.d.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
