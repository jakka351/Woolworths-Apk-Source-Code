package com.google.firebase.firestore.core;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.Scheduler;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.remote.RemoteComponenetProvider;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;

/* loaded from: classes6.dex */
public abstract class ComponentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestoreSettings f15441a;
    public final RemoteComponenetProvider b = new RemoteComponenetProvider();
    public Persistence c;
    public LocalStore d;
    public SyncEngine e;
    public RemoteStore f;
    public EventManager g;
    public IndexBackfiller h;
    public Scheduler i;

    public static final class Configuration {

        /* renamed from: a, reason: collision with root package name */
        public final Context f15442a;
        public final AsyncQueue b;
        public final DatabaseInfo c;
        public final User d;
        public final FirebaseAuthCredentialsProvider e;
        public final FirebaseAppCheckTokenProvider f;
        public final GrpcMetadataProvider g;

        public Configuration(Context context, AsyncQueue asyncQueue, DatabaseInfo databaseInfo, User user, FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider, GrpcMetadataProvider grpcMetadataProvider) {
            this.f15442a = context;
            this.b = asyncQueue;
            this.c = databaseInfo;
            this.d = user;
            this.e = firebaseAuthCredentialsProvider;
            this.f = firebaseAppCheckTokenProvider;
            this.g = grpcMetadataProvider;
        }
    }

    public ComponentProvider(FirebaseFirestoreSettings firebaseFirestoreSettings) {
        this.f15441a = firebaseFirestoreSettings;
    }

    public abstract EventManager a();

    public abstract Scheduler b(Configuration configuration);

    public abstract IndexBackfiller c(Configuration configuration);

    public abstract LocalStore d(Configuration configuration);

    public abstract Persistence e(Configuration configuration);

    public abstract RemoteStore f(Configuration configuration);

    public abstract SyncEngine g(Configuration configuration);

    public final LocalStore h() {
        LocalStore localStore = this.d;
        Assert.c(localStore, "localStore not initialized yet", new Object[0]);
        return localStore;
    }

    public final SyncEngine i() {
        SyncEngine syncEngine = this.e;
        Assert.c(syncEngine, "syncEngine not initialized yet", new Object[0]);
        return syncEngine;
    }
}
