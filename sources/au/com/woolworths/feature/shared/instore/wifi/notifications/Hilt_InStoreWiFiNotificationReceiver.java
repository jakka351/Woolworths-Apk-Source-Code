package au.com.woolworths.feature.shared.instore.wifi.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.OnReceiveBytecodeInjectionMarker;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;

@OnReceiveBytecodeInjectionMarker
/* loaded from: classes.dex */
public abstract class Hilt_InStoreWiFiNotificationReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f6521a = false;
    public final Object b = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f6521a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.f6521a) {
                    ((InStoreWiFiNotificationReceiver_GeneratedInjector) BroadcastReceiverComponentManager.a(context)).b((InStoreWiFiNotificationReceiver) this);
                    this.f6521a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
