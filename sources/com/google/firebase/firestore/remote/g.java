package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import com.google.firestore.v1.FirestoreGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.android.AndroidChannelBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ GrpcCallProvider d;

    public /* synthetic */ g(GrpcCallProvider grpcCallProvider) {
        this.d = grpcCallProvider;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        GrpcCallProvider grpcCallProvider = this.d;
        AsyncQueue asyncQueue = grpcCallProvider.b;
        Context context = grpcCallProvider.e;
        try {
            ProviderInstaller.installIfNeeded(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e) {
            Logger.c("GrpcCallProvider", "Failed to update ssl context: %s", e);
        }
        ManagedChannelBuilder managedChannelBuilderB = ManagedChannelBuilder.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        managedChannelBuilderB.c();
        AndroidChannelBuilder androidChannelBuilder = new AndroidChannelBuilder(managedChannelBuilderB);
        androidChannelBuilder.b = context;
        ManagedChannel managedChannelA = androidChannelBuilder.a();
        asyncQueue.b(new h(grpcCallProvider, managedChannelA, 0));
        FirestoreGrpc.FirestoreStub firestoreStubA = FirestoreGrpc.a(managedChannelA);
        FirestoreGrpc.FirestoreStub firestoreStub = new FirestoreGrpc.FirestoreStub(firestoreStubA.f24158a, firestoreStubA.b.d(grpcCallProvider.f));
        grpcCallProvider.c = new FirestoreGrpc.FirestoreStub(firestoreStub.f24158a, firestoreStub.b.f(asyncQueue.f15594a)).b;
        Logger.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return managedChannelA;
    }
}
