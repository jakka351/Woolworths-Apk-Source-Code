package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ FirestoreClient e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(FirestoreClient firestoreClient, Object obj, int i) {
        this.d = i;
        this.e = firestoreClient;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EventManager.ListenerRemovalAction listenerRemovalAction;
        EventManager.ListenerSetupAction listenerSetupAction;
        boolean z;
        int i = this.d;
        Object obj = this.f;
        FirestoreClient firestoreClient = this.e;
        switch (i) {
            case 0:
                QueryListener queryListener = (QueryListener) obj;
                EventManager eventManager = firestoreClient.f;
                SyncEngine syncEngine = eventManager.f15447a;
                Query query = queryListener.f15459a;
                HashMap map = eventManager.b;
                EventManager.QueryListenersInfo queryListenersInfo = (EventManager.QueryListenersInfo) map.get(query);
                if (queryListenersInfo != null) {
                    ArrayList arrayList = queryListenersInfo.f15450a;
                    arrayList.remove(queryListener);
                    if (arrayList.isEmpty()) {
                        listenerRemovalAction = queryListener.a() ? EventManager.ListenerRemovalAction.d : EventManager.ListenerRemovalAction.e;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((QueryListener) it.next()).a()) {
                                }
                            } else if (queryListener.a()) {
                                listenerRemovalAction = EventManager.ListenerRemovalAction.f;
                            }
                        }
                        listenerRemovalAction = EventManager.ListenerRemovalAction.g;
                    }
                    int iOrdinal = listenerRemovalAction.ordinal();
                    if (iOrdinal == 0) {
                        map.remove(query);
                        syncEngine.p(query, true);
                        break;
                    } else if (iOrdinal == 1) {
                        map.remove(query);
                        syncEngine.p(query, false);
                        break;
                    } else if (iOrdinal == 2) {
                        syncEngine.g("stopListeningToRemoteStore");
                        QueryView queryView = (QueryView) syncEngine.c.get(query);
                        Assert.b(queryView != null, "Trying to stop listening to a query not found", new Object[0]);
                        int i2 = queryView.b;
                        List list = (List) syncEngine.d.get(Integer.valueOf(i2));
                        list.remove(query);
                        if (list.isEmpty()) {
                            syncEngine.b.i(i2);
                            break;
                        }
                    }
                }
                break;
            case 1:
                QueryListener queryListener2 = (QueryListener) obj;
                EventManager eventManager2 = firestoreClient.f;
                SyncEngine syncEngine2 = eventManager2.f15447a;
                Query query2 = queryListener2.f15459a;
                HashMap map2 = eventManager2.b;
                EventManager.QueryListenersInfo queryListenersInfo2 = (EventManager.QueryListenersInfo) map2.get(query2);
                if (queryListenersInfo2 == null) {
                    queryListenersInfo2 = new EventManager.QueryListenersInfo();
                    map2.put(query2, queryListenersInfo2);
                    listenerSetupAction = queryListener2.a() ? EventManager.ListenerSetupAction.d : EventManager.ListenerSetupAction.e;
                } else {
                    Iterator it2 = queryListenersInfo2.f15450a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((QueryListener) it2.next()).a()) {
                            }
                        } else if (queryListener2.a()) {
                            listenerSetupAction = EventManager.ListenerSetupAction.f;
                        }
                    }
                    listenerSetupAction = EventManager.ListenerSetupAction.g;
                }
                queryListenersInfo2.f15450a.add(queryListener2);
                OnlineState onlineState = eventManager2.d;
                queryListener2.e = onlineState;
                ViewSnapshot viewSnapshot = queryListener2.f;
                if (viewSnapshot == null || queryListener2.d || !queryListener2.d(viewSnapshot, onlineState)) {
                    z = false;
                } else {
                    queryListener2.c(queryListener2.f);
                    z = true;
                }
                Assert.b(!z, "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
                ViewSnapshot viewSnapshot2 = queryListenersInfo2.b;
                if (viewSnapshot2 != null && queryListener2.b(viewSnapshot2)) {
                    eventManager2.b();
                }
                int iOrdinal2 = listenerSetupAction.ordinal();
                if (iOrdinal2 == 0) {
                    syncEngine2.i(query2, true);
                    break;
                } else if (iOrdinal2 == 1) {
                    syncEngine2.i(query2, false);
                    break;
                } else if (iOrdinal2 == 2) {
                    syncEngine2.g("listenToRemoteStore");
                    Assert.b(syncEngine2.c.containsKey(query2), "This is the first listen to query: %s", query2);
                    syncEngine2.b.c(syncEngine2.f15461a.a(query2.f()));
                    break;
                }
                break;
            default:
                User user = (User) obj;
                Assert.b(firestoreClient.e != null, "SyncEngine not yet initialized", new Object[0]);
                Logger.a("FirestoreClient", "Credential changed. Current user: %s", user.f15436a);
                SyncEngine syncEngine3 = firestoreClient.e;
                boolean zEquals = syncEngine3.l.equals(user);
                syncEngine3.l = user;
                if (!zEquals) {
                    HashMap map3 = syncEngine3.j;
                    Iterator it3 = map3.entrySet().iterator();
                    while (it3.hasNext()) {
                        for (TaskCompletionSource taskCompletionSource : (List) ((Map.Entry) it3.next()).getValue()) {
                            FirebaseFirestoreException.Code code = FirebaseFirestoreException.Code.OK;
                            taskCompletionSource.setException(new FirebaseFirestoreException("'waitForPendingWrites' task is cancelled due to User change."));
                        }
                    }
                    map3.clear();
                    syncEngine3.h(syncEngine3.f15461a.f(user), null);
                }
                RemoteStore remoteStore = syncEngine3.b;
                if (remoteStore.g) {
                    Logger.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    remoteStore.d();
                    break;
                }
                break;
        }
    }
}
