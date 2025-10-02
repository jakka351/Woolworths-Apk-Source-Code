package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;

/* loaded from: classes6.dex */
public class RemoteComponenetProvider {

    /* renamed from: a, reason: collision with root package name */
    public GrpcCallProvider f15576a;
    public RemoteSerializer b;
    public FirestoreChannel c;
    public Datastore d;
    public ConnectivityMonitor e;

    public final void a(ComponentProvider.Configuration configuration) {
        DatabaseInfo databaseInfo = configuration.c;
        this.b = new RemoteSerializer(databaseInfo.f15444a);
        FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider = configuration.e;
        FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider = configuration.f;
        FirestoreCallCredentials firestoreCallCredentials = new FirestoreCallCredentials(firebaseAuthCredentialsProvider, firebaseAppCheckTokenProvider);
        AsyncQueue asyncQueue = configuration.b;
        Context context = configuration.f15442a;
        this.f15576a = new GrpcCallProvider(asyncQueue, context, databaseInfo, firestoreCallCredentials);
        AsyncQueue asyncQueue2 = configuration.b;
        DatabaseId databaseId = databaseInfo.f15444a;
        GrpcMetadataProvider grpcMetadataProvider = configuration.g;
        GrpcCallProvider grpcCallProvider = this.f15576a;
        Assert.c(grpcCallProvider, "grpcCallProvider not initialized yet", new Object[0]);
        this.c = new FirestoreChannel(asyncQueue2, firebaseAuthCredentialsProvider, firebaseAppCheckTokenProvider, databaseId, grpcMetadataProvider, grpcCallProvider);
        RemoteSerializer remoteSerializer = this.b;
        Assert.c(remoteSerializer, "remoteSerializer not initialized yet", new Object[0]);
        FirestoreChannel firestoreChannel = this.c;
        Assert.c(firestoreChannel, "firestoreChannel not initialized yet", new Object[0]);
        this.d = new Datastore(asyncQueue, remoteSerializer, firestoreChannel);
        this.e = new AndroidConnectivityMonitor(context);
    }
}
