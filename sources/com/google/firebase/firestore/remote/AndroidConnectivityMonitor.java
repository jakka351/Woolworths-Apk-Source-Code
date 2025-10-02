package com.google.firebase.firestore.remote;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
final class AndroidConnectivityMonitor implements ConnectivityMonitor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15560a;
    public final ArrayList b = new ArrayList();

    @TargetApi
    public class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        public DefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            AndroidConnectivityMonitor.this.b(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            AndroidConnectivityMonitor.this.b(false);
        }
    }

    public class NetworkReceiver extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15562a = false;

        public NetworkReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            AndroidConnectivityMonitor androidConnectivityMonitor = AndroidConnectivityMonitor.this;
            boolean zA = androidConnectivityMonitor.a();
            if (androidConnectivityMonitor.a() && !this.f15562a) {
                androidConnectivityMonitor.b(true);
            } else if (!zA && this.f15562a) {
                androidConnectivityMonitor.b(false);
            }
            this.f15562a = zA;
        }
    }

    public AndroidConnectivityMonitor(Context context) {
        Assert.b(context != null, "Context must be non-null", new Object[0]);
        this.f15560a = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Application application = (Application) context.getApplicationContext();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.google.firebase.firestore.remote.AndroidConnectivityMonitor.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (atomicBoolean.compareAndSet(true, false)) {
                    AndroidConnectivityMonitor.this.c();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (atomicBoolean.compareAndSet(true, false)) {
                    AndroidConnectivityMonitor.this.c();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                if (atomicBoolean.compareAndSet(true, false)) {
                    AndroidConnectivityMonitor.this.c();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.google.firebase.firestore.remote.AndroidConnectivityMonitor.2
            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public final void onTrimMemory(int i) {
                if (i == 20) {
                    atomicBoolean.set(true);
                }
            }
        });
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(new DefaultNetworkCallback());
        } else {
            context.registerReceiver(new NetworkReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f15560a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void b(boolean z) {
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(z ? ConnectivityMonitor.NetworkStatus.e : ConnectivityMonitor.NetworkStatus.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        Logger.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (a()) {
            b(true);
        }
    }
}
