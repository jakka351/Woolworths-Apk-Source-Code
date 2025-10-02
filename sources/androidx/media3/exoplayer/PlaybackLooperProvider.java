package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@RestrictTo
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackLooperProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3021a = new Object();
    public Looper b = null;
    public HandlerThread c = null;
    public int d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.f3021a) {
            try {
                Assertions.f(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
