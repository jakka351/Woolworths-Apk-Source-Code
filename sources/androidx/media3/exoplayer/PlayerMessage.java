package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class PlayerMessage {

    /* renamed from: a, reason: collision with root package name */
    public final Target f3022a;
    public final Sender b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public interface Sender {
        void b(PlayerMessage playerMessage);
    }

    public interface Target {
        void i(int i, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, SystemClock systemClock, Looper looper) {
        this.b = sender;
        this.f3022a = target;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        Assertions.f(!this.f);
        this.f = true;
        this.b.b(this);
    }
}
