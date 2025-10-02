package com.google.firebase.firestore.core;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.Scheduler;
import com.google.firebase.firestore.local.i;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class FirestoreClient {

    /* renamed from: a, reason: collision with root package name */
    public final DatabaseInfo f15453a;
    public final FirebaseAuthCredentialsProvider b;
    public final FirebaseAppCheckTokenProvider c;
    public final AsyncQueue d;
    public SyncEngine e;
    public EventManager f;
    public Scheduler g;

    public FirestoreClient(final Context context, DatabaseInfo databaseInfo, FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider, AsyncQueue asyncQueue, final GrpcMetadataProvider grpcMetadataProvider, final ComponentProvider componentProvider) {
        this.f15453a = databaseInfo;
        this.b = firebaseAuthCredentialsProvider;
        this.c = firebaseAppCheckTokenProvider;
        this.d = asyncQueue;
        new RemoteSerializer(databaseInfo.f15444a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        asyncQueue.b(new Runnable() { // from class: com.google.firebase.firestore.core.a
            @Override // java.lang.Runnable
            public final void run() {
                FirestoreClient firestoreClient = this.d;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    firestoreClient.a(context, (User) Tasks.await(taskCompletionSource2.getTask()), componentProvider, grpcMetadataProvider);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        androidx.credentials.playservices.b bVar = new androidx.credentials.playservices.b(this, atomicBoolean, taskCompletionSource, asyncQueue);
        synchronized (firebaseAuthCredentialsProvider) {
            firebaseAuthCredentialsProvider.c = bVar;
            bVar.c(firebaseAuthCredentialsProvider.b());
        }
        new com.google.common.net.a(7);
        synchronized (firebaseAppCheckTokenProvider) {
            firebaseAppCheckTokenProvider.getClass();
        }
    }

    public final void a(Context context, User user, ComponentProvider componentProvider, GrpcMetadataProvider grpcMetadataProvider) {
        Logger.a("FirestoreClient", "Initializing. user=%s", user.f15436a);
        ComponentProvider.Configuration configuration = new ComponentProvider.Configuration(context, this.d, this.f15453a, user, this.b, this.c, grpcMetadataProvider);
        componentProvider.b.a(configuration);
        Persistence persistenceE = componentProvider.e(configuration);
        componentProvider.c = persistenceE;
        persistenceE.m();
        componentProvider.d = componentProvider.d(configuration);
        componentProvider.f = componentProvider.f(configuration);
        componentProvider.e = componentProvider.g(configuration);
        componentProvider.g = componentProvider.a();
        LocalStore localStore = componentProvider.d;
        localStore.f15487a.f().run();
        Persistence persistence = localStore.f15487a;
        persistence.l(new i(localStore, 1), "Start IndexManager");
        persistence.l(new i(localStore, 0), "Start MutationQueue");
        componentProvider.f.a();
        componentProvider.i = componentProvider.b(configuration);
        componentProvider.h = componentProvider.c(configuration);
        Assert.c(componentProvider.c, "persistence not initialized yet", new Object[0]);
        this.g = componentProvider.i;
        componentProvider.h();
        Assert.c(componentProvider.f, "remoteStore not initialized yet", new Object[0]);
        this.e = componentProvider.i();
        EventManager eventManager = componentProvider.g;
        Assert.c(eventManager, "eventManager not initialized yet", new Object[0]);
        this.f = eventManager;
        IndexBackfiller indexBackfiller = componentProvider.h;
        Scheduler scheduler = this.g;
        if (scheduler != null) {
            scheduler.start();
        }
        if (indexBackfiller != null) {
            indexBackfiller.f15481a.start();
        }
    }
}
