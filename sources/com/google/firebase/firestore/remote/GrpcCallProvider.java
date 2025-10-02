package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;

/* loaded from: classes6.dex */
public class GrpcCallProvider {

    /* renamed from: a, reason: collision with root package name */
    public Task f15574a = Tasks.call(Executors.c, new g(this));
    public final AsyncQueue b;
    public CallOptions c;
    public AsyncQueue.DelayedTask d;
    public final Context e;
    public final CallCredentials f;

    public GrpcCallProvider(AsyncQueue asyncQueue, Context context, DatabaseInfo databaseInfo, CallCredentials callCredentials) {
        this.b = asyncQueue;
        this.e = context;
        this.f = callCredentials;
    }

    public final void a(ManagedChannel managedChannel) {
        ConnectivityState connectivityStateJ = managedChannel.j();
        Logger.a("GrpcCallProvider", "Current gRPC connectivity state: " + connectivityStateJ, new Object[0]);
        if (this.d != null) {
            Logger.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.d.a();
            this.d = null;
        }
        if (connectivityStateJ == ConnectivityState.d) {
            Logger.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.d = this.b.a(AsyncQueue.TimerId.k, 15000L, new h(this, managedChannel, 1));
        }
        managedChannel.k(connectivityStateJ, new h(this, managedChannel, 2));
    }
}
