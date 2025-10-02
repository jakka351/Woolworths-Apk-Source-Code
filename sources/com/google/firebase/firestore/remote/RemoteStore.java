package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.remote.WatchChangeAggregator;
import com.google.firebase.firestore.remote.WatchStream;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class RemoteStore implements WatchChangeAggregator.TargetMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final DatabaseId f15580a;
    public final RemoteStoreCallback b;
    public final LocalStore c;
    public final ConnectivityMonitor d;
    public final OnlineStateTracker f;
    public final WatchStream h;
    public final WriteStream i;
    public WatchChangeAggregator j;
    public boolean g = false;
    public final HashMap e = new HashMap();
    public final ArrayDeque k = new ArrayDeque();

    public interface RemoteStoreCallback {
        void a(int i, Status status);

        ImmutableSortedSet b(int i);

        void c(MutationBatchResult mutationBatchResult);

        void d(int i, Status status);

        void e(RemoteEvent remoteEvent);

        void f(OnlineState onlineState);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.firebase.firestore.remote.RemoteStore$1] */
    public RemoteStore(DatabaseId databaseId, RemoteStoreCallback remoteStoreCallback, LocalStore localStore, Datastore datastore, final AsyncQueue asyncQueue, ConnectivityMonitor connectivityMonitor) {
        this.f15580a = databaseId;
        this.b = remoteStoreCallback;
        this.c = localStore;
        this.d = connectivityMonitor;
        this.f = new OnlineStateTracker(asyncQueue, new i(remoteStoreCallback));
        ?? r2 = new WatchStream.Callback() { // from class: com.google.firebase.firestore.remote.RemoteStore.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:109:0x02c3  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x02d0  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02ed  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x032f  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x0457  */
            /* JADX WARN: Removed duplicated region for block: B:312:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
            /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            @Override // com.google.firebase.firestore.remote.WatchStream.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(com.google.firebase.firestore.model.SnapshotVersion r35, com.google.firebase.firestore.remote.WatchChange r36) {
                /*
                    Method dump skipped, instructions count: 1588
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.RemoteStore.AnonymousClass1.a(com.google.firebase.firestore.model.SnapshotVersion, com.google.firebase.firestore.remote.WatchChange):void");
            }

            @Override // com.google.firebase.firestore.remote.Stream.StreamCallback
            public final void c(Status status) {
                RemoteStore remoteStore = RemoteStore.this;
                OnlineStateTracker onlineStateTracker = remoteStore.f;
                if (status.f()) {
                    Assert.b(!remoteStore.f(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
                }
                remoteStore.j = null;
                boolean zF = remoteStore.f();
                OnlineState onlineState = OnlineState.d;
                if (!zF) {
                    onlineStateTracker.c(onlineState);
                    return;
                }
                if (onlineStateTracker.f15575a == OnlineState.e) {
                    onlineStateTracker.b(onlineState);
                    Assert.b(onlineStateTracker.b == 0, "watchStreamFailures must be 0", new Object[0]);
                    Assert.b(onlineStateTracker.c == null, "onlineStateTimer must be null", new Object[0]);
                } else {
                    int i = onlineStateTracker.b + 1;
                    onlineStateTracker.b = i;
                    if (i >= 1) {
                        AsyncQueue.DelayedTask delayedTask = onlineStateTracker.c;
                        if (delayedTask != null) {
                            delayedTask.a();
                            onlineStateTracker.c = null;
                        }
                        Locale locale = Locale.ENGLISH;
                        onlineStateTracker.a("Connection failed 1 times. Most recent error: " + status);
                        onlineStateTracker.b(OnlineState.f);
                    }
                }
                remoteStore.h();
            }

            @Override // com.google.firebase.firestore.remote.Stream.StreamCallback
            public final void e() {
                RemoteStore remoteStore = RemoteStore.this;
                Iterator it = remoteStore.e.values().iterator();
                while (it.hasNext()) {
                    remoteStore.e((TargetData) it.next());
                }
            }
        };
        datastore.getClass();
        FirestoreChannel firestoreChannel = datastore.c;
        AsyncQueue asyncQueue2 = datastore.b;
        RemoteSerializer remoteSerializer = datastore.f15566a;
        this.h = new WatchStream(firestoreChannel, asyncQueue2, remoteSerializer, r2);
        this.i = new WriteStream(firestoreChannel, asyncQueue2, remoteSerializer, new WriteStream.Callback() { // from class: com.google.firebase.firestore.remote.RemoteStore.2
            @Override // com.google.firebase.firestore.remote.WriteStream.Callback
            public final void b() {
                RemoteStore remoteStore = RemoteStore.this;
                LocalStore localStore2 = remoteStore.c;
                WriteStream writeStream = remoteStore.i;
                localStore2.f15487a.l(new com.google.firebase.firestore.local.d(localStore2, writeStream.u, 0), "Set stream token");
                Iterator it = remoteStore.k.iterator();
                while (it.hasNext()) {
                    writeStream.k(((MutationBatch) it.next()).d);
                }
            }

            @Override // com.google.firebase.firestore.remote.Stream.StreamCallback
            public final void c(Status status) {
                RemoteStore remoteStore = RemoteStore.this;
                WriteStream writeStream = remoteStore.i;
                ArrayDeque arrayDeque = remoteStore.k;
                if (status.f()) {
                    Assert.b(!remoteStore.g(), "Write stream was stopped gracefully while still needed.", new Object[0]);
                }
                if (!status.f() && !arrayDeque.isEmpty()) {
                    if (writeStream.t) {
                        Assert.b(!status.f(), "Handling write error with status OK.", new Object[0]);
                        if (Datastore.a(status) && !status.f23971a.equals(Status.Code.ABORTED)) {
                            MutationBatch mutationBatch = (MutationBatch) arrayDeque.poll();
                            writeStream.b();
                            remoteStore.b.d(mutationBatch.f15544a, status);
                            remoteStore.b();
                        }
                    } else {
                        Assert.b(!status.f(), "Handling write error with status OK.", new Object[0]);
                        if (Datastore.a(status)) {
                            Logger.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", Util.h(writeStream.u), status);
                            ByteString byteString = WriteStream.v;
                            byteString.getClass();
                            writeStream.u = byteString;
                            LocalStore localStore2 = remoteStore.c;
                            localStore2.f15487a.l(new com.google.firebase.firestore.local.d(localStore2, byteString, 0), "Set stream token");
                        }
                    }
                }
                if (remoteStore.g()) {
                    Assert.b(remoteStore.g(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
                    writeStream.g();
                }
            }

            @Override // com.google.firebase.firestore.remote.WriteStream.Callback
            public final void d(SnapshotVersion snapshotVersion, ArrayList arrayList) {
                RemoteStore remoteStore = RemoteStore.this;
                MutationBatch mutationBatch = (MutationBatch) remoteStore.k.poll();
                ByteString byteString = remoteStore.i.u;
                ArrayList arrayList2 = mutationBatch.d;
                Assert.b(arrayList2.size() == arrayList.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()));
                ImmutableSortedMap immutableSortedMapJ = DocumentCollections.f15533a;
                for (int i = 0; i < arrayList2.size(); i++) {
                    immutableSortedMapJ = immutableSortedMapJ.j(((Mutation) arrayList2.get(i)).f15543a, ((MutationResult) arrayList.get(i)).f15546a);
                }
                remoteStore.b.c(new MutationBatchResult(mutationBatch, snapshotVersion, arrayList, byteString, immutableSortedMapJ));
                remoteStore.b();
            }

            @Override // com.google.firebase.firestore.remote.Stream.StreamCallback
            public final void e() {
                RemoteStore.this.i.j();
            }
        });
        Consumer consumer = new Consumer() { // from class: com.google.firebase.firestore.remote.j
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                asyncQueue.b(new c(2, this.f15593a, (ConnectivityMonitor.NetworkStatus) obj));
            }
        };
        AndroidConnectivityMonitor androidConnectivityMonitor = (AndroidConnectivityMonitor) connectivityMonitor;
        synchronized (androidConnectivityMonitor.b) {
            androidConnectivityMonitor.b.add(consumer);
        }
    }

    public final void a() {
        this.g = true;
        ByteString byteStringD = this.c.d();
        WriteStream writeStream = this.i;
        writeStream.getClass();
        byteStringD.getClass();
        writeStream.u = byteStringD;
        if (f()) {
            h();
        } else {
            this.f.c(OnlineState.d);
        }
        b();
    }

    public final void b() {
        WriteStream writeStream;
        ArrayDeque arrayDeque = this.k;
        int i = arrayDeque.isEmpty() ? -1 : ((MutationBatch) arrayDeque.getLast()).f15544a;
        while (true) {
            boolean z = this.g;
            writeStream = this.i;
            if (!z || arrayDeque.size() >= 10) {
                break;
            }
            MutationBatch mutationBatchE = this.c.e(i);
            if (mutationBatchE != null) {
                Assert.b(this.g && arrayDeque.size() < 10, "addToWritePipeline called when pipeline is full", new Object[0]);
                arrayDeque.add(mutationBatchE);
                if (writeStream.c() && writeStream.t) {
                    writeStream.k(mutationBatchE.d);
                }
                i = mutationBatchE.f15544a;
            } else if (arrayDeque.size() == 0 && writeStream.c() && writeStream.b == null) {
                writeStream.b = writeStream.f.a(writeStream.g, AbstractStream.o, writeStream.e);
            }
        }
        if (g()) {
            Assert.b(g(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            writeStream.g();
        }
    }

    public final void c(TargetData targetData) {
        Integer numValueOf = Integer.valueOf(targetData.b);
        HashMap map = this.e;
        if (map.containsKey(numValueOf)) {
            return;
        }
        map.put(numValueOf, targetData);
        if (f()) {
            h();
        } else if (this.h.c()) {
            e(targetData);
        }
    }

    public final void d() {
        this.g = false;
        WatchStream watchStream = this.h;
        boolean zD = watchStream.d();
        Stream.State state = Stream.State.d;
        if (zD) {
            watchStream.a(state, Status.e);
        }
        WriteStream writeStream = this.i;
        if (writeStream.d()) {
            writeStream.a(state, Status.e);
        }
        ArrayDeque arrayDeque = this.k;
        if (!arrayDeque.isEmpty()) {
            Logger.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.j = null;
        this.f.c(OnlineState.d);
        writeStream.b();
        watchStream.b();
        a();
    }

    public final void e(TargetData targetData) {
        this.j.a(targetData.b).f15584a++;
        if (!targetData.g.isEmpty() || targetData.e.compareTo(SnapshotVersion.e) > 0) {
            targetData = new TargetData(targetData.f15522a, targetData.b, targetData.c, targetData.d, targetData.e, targetData.f, targetData.g, Integer.valueOf(this.b.b(targetData.b).d.size()));
        }
        this.h.l(targetData);
    }

    public final boolean f() {
        return (!this.g || this.h.d() || this.e.isEmpty()) ? false : true;
    }

    public final boolean g() {
        return (!this.g || this.i.d() || this.k.isEmpty()) ? false : true;
    }

    public final void h() {
        Assert.b(f(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.j = new WatchChangeAggregator(this.f15580a, this);
        this.h.g();
        OnlineStateTracker onlineStateTracker = this.f;
        if (onlineStateTracker.b == 0) {
            onlineStateTracker.b(OnlineState.d);
            Assert.b(onlineStateTracker.c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            onlineStateTracker.c = onlineStateTracker.e.a(AsyncQueue.TimerId.i, 10000L, new d(onlineStateTracker, 1));
        }
    }

    public final void i(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.e;
        Assert.b(((TargetData) map.remove(numValueOf)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        WatchStream watchStream = this.h;
        if (watchStream.c()) {
            this.j.a(i).f15584a++;
            watchStream.k(i);
        }
        if (map.isEmpty()) {
            if (!watchStream.c()) {
                if (this.g) {
                    this.f.c(OnlineState.d);
                }
            } else if (watchStream.c() && watchStream.b == null) {
                watchStream.b = watchStream.f.a(watchStream.g, AbstractStream.o, watchStream.e);
            }
        }
    }
}
