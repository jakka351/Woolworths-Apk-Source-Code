package androidx.media3.common.util;

import androidx.media3.common.util.NetworkTypeObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ NetworkTypeObserver.ListenerHolder d;

    @Override // java.lang.Runnable
    public final void run() {
        NetworkTypeObserver.ListenerHolder listenerHolder = this.d;
        NetworkTypeObserver.Listener listener = (NetworkTypeObserver.Listener) listenerHolder.f2919a.get();
        if (listener != null) {
            listener.a(listenerHolder.c.b());
        }
    }
}
