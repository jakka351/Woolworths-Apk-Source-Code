package androidx.media3.exoplayer.audio;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Executor {
    public final /* synthetic */ Handler d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
