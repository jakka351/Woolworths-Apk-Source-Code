package com.google.firebase.firestore.core;

import android.content.Context;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalSerializer;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.local.LruGarbageCollector.GCScheduler;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.local.Scheduler;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;

/* loaded from: classes6.dex */
public class SQLiteComponentProvider extends MemoryComponentProvider {
    @Override // com.google.firebase.firestore.core.MemoryComponentProvider, com.google.firebase.firestore.core.ComponentProvider
    public final Scheduler b(ComponentProvider.Configuration configuration) {
        Persistence persistence = this.c;
        Assert.c(persistence, "persistence not initialized yet", new Object[0]);
        LruGarbageCollector lruGarbageCollectorA = ((SQLitePersistence) persistence).f.a();
        AsyncQueue asyncQueue = configuration.b;
        LocalStore localStoreH = h();
        lruGarbageCollectorA.getClass();
        return lruGarbageCollectorA.new GCScheduler(asyncQueue, localStoreH);
    }

    @Override // com.google.firebase.firestore.core.MemoryComponentProvider, com.google.firebase.firestore.core.ComponentProvider
    public final IndexBackfiller c(ComponentProvider.Configuration configuration) {
        Persistence persistence = this.c;
        Assert.c(persistence, "persistence not initialized yet", new Object[0]);
        return new IndexBackfiller(persistence, configuration.b, h());
    }

    @Override // com.google.firebase.firestore.core.MemoryComponentProvider, com.google.firebase.firestore.core.ComponentProvider
    public final Persistence e(ComponentProvider.Configuration configuration) {
        RemoteSerializer remoteSerializer = this.b.b;
        Assert.c(remoteSerializer, "remoteSerializer not initialized yet", new Object[0]);
        LocalSerializer localSerializer = new LocalSerializer(remoteSerializer);
        this.f15441a.getClass();
        LruGarbageCollector.Params params = new LruGarbageCollector.Params();
        Context context = configuration.f15442a;
        DatabaseInfo databaseInfo = configuration.c;
        return new SQLitePersistence(context, databaseInfo.b, databaseInfo.f15444a, localSerializer, params);
    }
}
