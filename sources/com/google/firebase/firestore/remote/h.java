package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import io.grpc.ManagedChannel;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ GrpcCallProvider e;
    public final /* synthetic */ ManagedChannel f;

    public /* synthetic */ h(GrpcCallProvider grpcCallProvider, ManagedChannel managedChannel, int i) {
        this.d = i;
        this.e = grpcCallProvider;
        this.f = managedChannel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.a(this.f);
                break;
            case 1:
                Logger.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                GrpcCallProvider grpcCallProvider = this.e;
                if (grpcCallProvider.d != null) {
                    Logger.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    grpcCallProvider.d.a();
                    grpcCallProvider.d = null;
                }
                grpcCallProvider.b.b(new h(grpcCallProvider, this.f, 4));
                break;
            case 2:
                GrpcCallProvider grpcCallProvider2 = this.e;
                grpcCallProvider2.b.b(new h(grpcCallProvider2, this.f, 3));
                break;
            case 3:
                this.e.a(this.f);
                break;
            default:
                this.f.l();
                Executor executor = Executors.c;
                GrpcCallProvider grpcCallProvider3 = this.e;
                grpcCallProvider3.f15574a = Tasks.call(executor, new g(grpcCallProvider3));
                break;
        }
    }
}
