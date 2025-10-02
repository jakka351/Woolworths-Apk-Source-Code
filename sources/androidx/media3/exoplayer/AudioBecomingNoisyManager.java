package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.SystemClock;

/* loaded from: classes2.dex */
final class AudioBecomingNoisyManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2990a;
    public final AudioBecomingNoisyReceiver b;
    public final HandlerWrapper c;
    public boolean d;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final EventListener f2991a;
        public final HandlerWrapper b;

        public AudioBecomingNoisyReceiver(HandlerWrapper handlerWrapper, EventListener eventListener) {
            this.b = handlerWrapper;
            this.f2991a = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(new a(this, 1));
            }
        }
    }

    public interface EventListener {
        void z();
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, EventListener eventListener, SystemClock systemClock) {
        this.f2990a = context.getApplicationContext();
        this.c = systemClock.b(looper, null);
        this.b = new AudioBecomingNoisyReceiver(systemClock.b(looper2, null), eventListener);
    }

    public final void a() {
        if (this.d) {
            this.c.post(new a(this, 0));
            this.d = false;
        }
    }
}
