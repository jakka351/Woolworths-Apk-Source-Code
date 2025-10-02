package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.remote.AbstractStream;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import io.grpc.Metadata;
import io.grpc.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<String> setUnmodifiableSet;
        switch (this.d) {
            case 0:
                AbstractStream.StreamObserver streamObserver = (AbstractStream.StreamObserver) this.e;
                Metadata metadata = (Metadata) this.f;
                AbstractStream abstractStream = AbstractStream.this;
                HashMap map = new HashMap();
                if (metadata.b == 0) {
                    setUnmodifiableSet = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet(metadata.b);
                    for (int i = 0; i < metadata.b; i++) {
                        hashSet.add(new String(metadata.e(i), 0));
                    }
                    setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                }
                for (String str : setUnmodifiableSet) {
                    if (Datastore.d.contains(str.toLowerCase(Locale.ENGLISH))) {
                        map.put(str, (String) metadata.c(Metadata.Key.a(str, Metadata.d)));
                    }
                }
                if (!map.isEmpty()) {
                    Logger.a(abstractStream.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(abstractStream)), map);
                    break;
                }
                break;
            case 1:
                AbstractStream.StreamObserver streamObserver2 = (AbstractStream.StreamObserver) this.e;
                Status status = (Status) this.f;
                AbstractStream abstractStream2 = AbstractStream.this;
                if (status.f()) {
                    Logger.a(abstractStream2.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(abstractStream2)));
                } else {
                    Logger.c(abstractStream2.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(abstractStream2)), status);
                }
                Assert.b(abstractStream2.d(), "Can't handle server close on non-started stream!", new Object[0]);
                abstractStream2.a(Stream.State.h, status);
                break;
            default:
                RemoteStore remoteStore = (RemoteStore) this.e;
                ConnectivityMonitor.NetworkStatus networkStatus = (ConnectivityMonitor.NetworkStatus) this.f;
                OnlineStateTracker onlineStateTracker = remoteStore.f;
                if (!networkStatus.equals(ConnectivityMonitor.NetworkStatus.e) || !onlineStateTracker.f15575a.equals(OnlineState.e)) {
                    if ((!networkStatus.equals(ConnectivityMonitor.NetworkStatus.d) || !onlineStateTracker.f15575a.equals(OnlineState.f)) && remoteStore.g) {
                        Logger.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                        remoteStore.d();
                        break;
                    }
                }
                break;
        }
    }
}
