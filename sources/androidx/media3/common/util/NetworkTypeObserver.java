package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

@UnstableApi
/* loaded from: classes2.dex */
public final class NetworkTypeObserver {
    public static NetworkTypeObserver f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2917a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    @RequiresApi
    public static final class Api31 {

        public static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            public final NetworkTypeObserver f2918a;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
                this.f2918a = networkTypeObserver;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f2918a.d(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }

    public interface Listener {
        void a(int i);
    }

    public final class ListenerHolder {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f2919a;
        public final Executor b;

        public ListenerHolder(androidx.media3.exoplayer.upstream.b bVar, Executor executor) {
            this.f2919a = new WeakReference(bVar);
            this.b = executor;
        }
    }

    public final class Receiver extends BroadcastReceiver {
        public Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            NetworkTypeObserver.this.f2917a.execute(new c(1, this, context));
        }
    }

    public NetworkTypeObserver(Context context) {
        Executor executorA = BackgroundExecutor.a();
        this.f2917a = executorA;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorA.execute(new c(0, this, context));
    }

    public static synchronized NetworkTypeObserver a(Context context) {
        try {
            if (f == null) {
                f = new NetworkTypeObserver(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(androidx.media3.exoplayer.upstream.b bVar, Executor executor) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            if (listenerHolder.f2919a.get() == null) {
                copyOnWriteArrayList.remove(listenerHolder);
            }
        }
        ListenerHolder listenerHolder2 = new ListenerHolder(bVar, executor);
        synchronized (this.c) {
            this.b.add(listenerHolder2);
            z = this.e;
        }
        if (z) {
            listenerHolder2.b.execute(new d(listenerHolder2));
        }
    }

    public final void d(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            if (listenerHolder.f2919a.get() == null) {
                copyOnWriteArrayList.remove(listenerHolder);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ListenerHolder listenerHolder2 = (ListenerHolder) it2.next();
                    listenerHolder2.b.execute(new d(listenerHolder2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
