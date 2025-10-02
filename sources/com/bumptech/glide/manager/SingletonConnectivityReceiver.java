package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class SingletonConnectivityReceiver {
    public static volatile SingletonConnectivityReceiver d;

    /* renamed from: a, reason: collision with root package name */
    public final FrameworkConnectivityMonitorPostApi24 f13954a;
    public final HashSet b = new HashSet();
    public boolean c;

    /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$2, reason: invalid class name */
    class AnonymousClass2 implements ConnectivityMonitor.ConnectivityListener {
        public AnonymousClass2() {
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void a(boolean z) {
            ArrayList arrayList;
            Util.a();
            synchronized (SingletonConnectivityReceiver.this) {
                arrayList = new ArrayList(SingletonConnectivityReceiver.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ConnectivityMonitor.ConnectivityListener) it.next()).a(z);
            }
        }
    }

    public interface FrameworkConnectivityMonitor {
    }

    @RequiresApi
    public static final class FrameworkConnectivityMonitorPostApi24 implements FrameworkConnectivityMonitor {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13957a;
        public final ConnectivityMonitor.ConnectivityListener b;
        public final GlideSuppliers.GlideSupplier c;
        public final ConnectivityManager.NetworkCallback d = new ConnectivityManager.NetworkCallback() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24.1

            /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1, reason: invalid class name and collision with other inner class name */
            class RunnableC02901 implements Runnable {
                public final /* synthetic */ boolean d;

                public RunnableC02901(boolean z) {
                    this.d = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Util.a();
                    FrameworkConnectivityMonitorPostApi24 frameworkConnectivityMonitorPostApi24 = FrameworkConnectivityMonitorPostApi24.this;
                    boolean z = frameworkConnectivityMonitorPostApi24.f13957a;
                    boolean z2 = this.d;
                    frameworkConnectivityMonitorPostApi24.f13957a = z2;
                    if (z != z2) {
                        ((AnonymousClass2) frameworkConnectivityMonitorPostApi24.b).a(z2);
                    }
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                Util.f().post(new RunnableC02901(true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                Util.f().post(new RunnableC02901(false));
            }
        };

        public FrameworkConnectivityMonitorPostApi24(GlideSuppliers.GlideSupplier glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.c = glideSupplier;
            this.b = connectivityListener;
        }
    }

    /* loaded from: classes4.dex */
    public static final class FrameworkConnectivityMonitorPreApi24 implements FrameworkConnectivityMonitor {

        /* renamed from: a, reason: collision with root package name */
        public static final Executor f13959a = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$1, reason: invalid class name */
        public class AnonymousClass1 extends BroadcastReceiver {
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                throw null;
            }
        }

        /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3, reason: invalid class name */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4, reason: invalid class name */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5, reason: invalid class name */
        class AnonymousClass5 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    public SingletonConnectivityReceiver(final Context context) {
        this.f13954a = new FrameworkConnectivityMonitorPostApi24(GlideSuppliers.a(new GlideSuppliers.GlideSupplier<ConnectivityManager>() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.1
            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public final Object get() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        }), new AnonymousClass2());
    }

    public static SingletonConnectivityReceiver a(Context context) {
        if (d == null) {
            synchronized (SingletonConnectivityReceiver.class) {
                try {
                    if (d == null) {
                        d = new SingletonConnectivityReceiver(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void b() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        FrameworkConnectivityMonitorPostApi24 frameworkConnectivityMonitorPostApi24 = this.f13954a;
        GlideSuppliers.GlideSupplier glideSupplier = frameworkConnectivityMonitorPostApi24.c;
        boolean z = false;
        frameworkConnectivityMonitorPostApi24.f13957a = ((ConnectivityManager) glideSupplier.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) glideSupplier.get()).registerDefaultNetworkCallback(frameworkConnectivityMonitorPostApi24.d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.c = z;
    }
}
