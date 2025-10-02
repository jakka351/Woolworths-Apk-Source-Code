package io.grpc.android;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.common.annotations.VisibleForTesting;
import com.google.firebase.firestore.remote.h;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ConnectivityState;
import io.grpc.ForwardingChannelBuilder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ManagedChannelProvider;
import io.grpc.MethodDescriptor;
import io.grpc.okhttp.OkHttpChannelProvider;

/* loaded from: classes7.dex */
public final class AndroidChannelBuilder extends ForwardingChannelBuilder<AndroidChannelBuilder> {

    /* renamed from: a, reason: collision with root package name */
    public final ManagedChannelBuilder f23975a;
    public Context b;

    @VisibleForTesting
    public static final class AndroidChannel extends ManagedChannel {

        /* renamed from: a, reason: collision with root package name */
        public final ManagedChannel f23976a;
        public final Context b;
        public final ConnectivityManager c;
        public final Object d = new Object();
        public Runnable e;

        @TargetApi
        public class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
            public DefaultNetworkCallback() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                AndroidChannel.this.f23976a.i();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onBlockedStatusChanged(Network network, boolean z) {
                if (z) {
                    return;
                }
                AndroidChannel.this.f23976a.i();
            }
        }

        public class NetworkReceiver extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            public boolean f23978a = false;

            public NetworkReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.f23978a;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f23978a = z2;
                if (!z2 || z) {
                    return;
                }
                AndroidChannel.this.f23976a.i();
            }
        }

        public AndroidChannel(ManagedChannel managedChannel, Context context) {
            this.f23976a = managedChannel;
            this.b = context;
            if (context == null) {
                this.c = null;
                return;
            }
            this.c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                m();
            } catch (SecurityException e) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
            }
        }

        @Override // io.grpc.Channel
        public final String a() {
            return this.f23976a.a();
        }

        @Override // io.grpc.Channel
        public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
            return this.f23976a.h(methodDescriptor, callOptions);
        }

        @Override // io.grpc.ManagedChannel
        public final void i() {
            this.f23976a.i();
        }

        @Override // io.grpc.ManagedChannel
        public final ConnectivityState j() {
            return this.f23976a.j();
        }

        @Override // io.grpc.ManagedChannel
        public final void k(ConnectivityState connectivityState, h hVar) {
            this.f23976a.k(connectivityState, hVar);
        }

        @Override // io.grpc.ManagedChannel
        public final ManagedChannel l() {
            synchronized (this.d) {
                try {
                    Runnable runnable = this.e;
                    if (runnable != null) {
                        runnable.run();
                        this.e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f23976a.l();
        }

        public final void m() {
            ConnectivityManager connectivityManager = this.c;
            if (connectivityManager != null) {
                final DefaultNetworkCallback defaultNetworkCallback = new DefaultNetworkCallback();
                connectivityManager.registerDefaultNetworkCallback(defaultNetworkCallback);
                this.e = new Runnable() { // from class: io.grpc.android.AndroidChannelBuilder.AndroidChannel.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidChannel.this.c.unregisterNetworkCallback(defaultNetworkCallback);
                    }
                };
            } else {
                final NetworkReceiver networkReceiver = new NetworkReceiver();
                this.b.registerReceiver(networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.e = new Runnable() { // from class: io.grpc.android.AndroidChannelBuilder.AndroidChannel.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidChannel.this.b.unregisterReceiver(networkReceiver);
                    }
                };
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                ((ManagedChannelProvider) OkHttpChannelProvider.class.asSubclass(ManagedChannelProvider.class).getConstructor(null).newInstance(null)).getClass();
            } catch (Exception e) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
            }
        } catch (ClassCastException e2) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
        }
    }

    public AndroidChannelBuilder(ManagedChannelBuilder managedChannelBuilder) {
        this.f23975a = managedChannelBuilder;
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public final ManagedChannel a() {
        return new AndroidChannel(this.f23975a.a(), this.b);
    }

    @Override // io.grpc.ForwardingChannelBuilder2
    public final ManagedChannelBuilder d() {
        return this.f23975a;
    }
}
