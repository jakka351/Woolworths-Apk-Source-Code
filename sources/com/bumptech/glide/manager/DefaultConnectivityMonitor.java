package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.SingletonConnectivityReceiver;

/* loaded from: classes.dex */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {
    public final Context d;
    public final ConnectivityMonitor.ConnectivityListener e;

    public DefaultConnectivityMonitor(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.d = context.getApplicationContext();
        this.e = connectivityListener;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        SingletonConnectivityReceiver singletonConnectivityReceiverA = SingletonConnectivityReceiver.a(this.d);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.e;
        synchronized (singletonConnectivityReceiverA) {
            singletonConnectivityReceiverA.b.add(connectivityListener);
            singletonConnectivityReceiverA.b();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        SingletonConnectivityReceiver singletonConnectivityReceiverA = SingletonConnectivityReceiver.a(this.d);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.e;
        synchronized (singletonConnectivityReceiverA) {
            singletonConnectivityReceiverA.b.remove(connectivityListener);
            if (singletonConnectivityReceiverA.c && singletonConnectivityReceiverA.b.isEmpty()) {
                SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24 frameworkConnectivityMonitorPostApi24 = singletonConnectivityReceiverA.f13954a;
                ((ConnectivityManager) frameworkConnectivityMonitorPostApi24.c.get()).unregisterNetworkCallback(frameworkConnectivityMonitorPostApi24.d);
                singletonConnectivityReceiverA.c = false;
            }
        }
    }
}
