package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.MemoryPersistence;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.QueryEngine;
import com.google.firebase.firestore.local.Scheduler;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.RemoteComponenetProvider;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import io.grpc.Status;

/* loaded from: classes6.dex */
public class MemoryComponentProvider extends ComponentProvider {

    public class RemoteStoreCallback implements RemoteStore.RemoteStoreCallback {
        public RemoteStoreCallback() {
        }

        @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
        public final void a(int i, Status status) {
            MemoryComponentProvider.this.i().a(i, status);
        }

        @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
        public final ImmutableSortedSet b(int i) {
            return MemoryComponentProvider.this.i().b(i);
        }

        @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
        public final void c(MutationBatchResult mutationBatchResult) {
            MemoryComponentProvider.this.i().c(mutationBatchResult);
        }

        @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
        public final void d(int i, Status status) {
            MemoryComponentProvider.this.i().d(i, status);
        }

        @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
        public final void e(RemoteEvent remoteEvent) {
            MemoryComponentProvider.this.i().e(remoteEvent);
        }

        @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
        public final void f(OnlineState onlineState) {
            MemoryComponentProvider.this.i().f(onlineState);
        }
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public final EventManager a() {
        return new EventManager(i());
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public Scheduler b(ComponentProvider.Configuration configuration) {
        return null;
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public IndexBackfiller c(ComponentProvider.Configuration configuration) {
        return null;
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public final LocalStore d(ComponentProvider.Configuration configuration) {
        Persistence persistence = this.c;
        Assert.c(persistence, "persistence not initialized yet", new Object[0]);
        return new LocalStore(persistence, new QueryEngine(), configuration.d);
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public Persistence e(ComponentProvider.Configuration configuration) {
        this.f15441a.getClass();
        return MemoryPersistence.n();
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public final RemoteStore f(ComponentProvider.Configuration configuration) {
        DatabaseId databaseId = configuration.c.f15444a;
        RemoteStoreCallback remoteStoreCallback = new RemoteStoreCallback();
        LocalStore localStoreH = h();
        RemoteComponenetProvider remoteComponenetProvider = this.b;
        Datastore datastore = remoteComponenetProvider.d;
        Assert.c(datastore, "datastore not initialized yet", new Object[0]);
        AsyncQueue asyncQueue = configuration.b;
        ConnectivityMonitor connectivityMonitor = remoteComponenetProvider.e;
        Assert.c(connectivityMonitor, "connectivityMonitor not initialized yet", new Object[0]);
        return new RemoteStore(databaseId, remoteStoreCallback, localStoreH, datastore, asyncQueue, connectivityMonitor);
    }

    @Override // com.google.firebase.firestore.core.ComponentProvider
    public final SyncEngine g(ComponentProvider.Configuration configuration) {
        LocalStore localStoreH = h();
        RemoteStore remoteStore = this.f;
        Assert.c(remoteStore, "remoteStore not initialized yet", new Object[0]);
        return new SyncEngine(localStoreH, remoteStore, configuration.d);
    }
}
