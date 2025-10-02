package com.google.firebase.firestore.core;

import android.util.SparseArray;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.LimboDocumentChange;
import com.google.firebase.firestore.core.View;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.LocalViewChanges;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.local.ReferenceSet;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.local.d;
import com.google.firebase.firestore.local.g;
import com.google.firebase.firestore.local.h;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class SyncEngine implements RemoteStore.RemoteStoreCallback {

    /* renamed from: a, reason: collision with root package name */
    public final LocalStore f15461a;
    public final RemoteStore b;
    public User l;
    public EventManager m;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final LinkedHashSet e = new LinkedHashSet();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final ReferenceSet h = new ReferenceSet();
    public final HashMap i = new HashMap();
    public final TargetIdGenerator k = new TargetIdGenerator(1, 1);
    public final HashMap j = new HashMap();

    /* renamed from: com.google.firebase.firestore.core.SyncEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15462a;

        static {
            int[] iArr = new int[LimboDocumentChange.Type.values().length];
            f15462a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15462a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class LimboResolution {

        /* renamed from: a, reason: collision with root package name */
        public final DocumentKey f15463a;
        public boolean b;

        public LimboResolution(DocumentKey documentKey) {
            this.f15463a = documentKey;
        }
    }

    public interface SyncEngineCallback {
    }

    public SyncEngine(LocalStore localStore, RemoteStore remoteStore, User user) {
        this.f15461a = localStore;
        this.b = remoteStore;
        this.l = user;
    }

    public static void j(Status status, String str, Object... objArr) {
        Status.Code code = status.f23971a;
        String str2 = status.b;
        if (str2 == null) {
            str2 = "";
        }
        if ((code == Status.Code.FAILED_PRECONDITION && str2.contains("requires an index")) || code == Status.Code.PERMISSION_DENIED) {
            Logger.c("Firestore", "%s: %s", String.format(str, objArr), status);
        }
    }

    @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
    public final void a(int i, Status status) {
        g("handleRejectedListen");
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.g;
        LimboResolution limboResolution = (LimboResolution) map.get(numValueOf);
        DocumentKey documentKey = limboResolution != null ? limboResolution.f15463a : null;
        if (documentKey == null) {
            LocalStore localStore = this.f15461a;
            localStore.f15487a.l(new g(localStore, i), "Release target");
            m(i, status);
            return;
        }
        this.f.remove(documentKey);
        map.remove(Integer.valueOf(i));
        l();
        SnapshotVersion snapshotVersion = SnapshotVersion.e;
        Map mapSingletonMap = Collections.singletonMap(documentKey, MutableDocument.o(documentKey, snapshotVersion));
        Set setSingleton = Collections.singleton(documentKey);
        Map map2 = Collections.EMPTY_MAP;
        e(new RemoteEvent(snapshotVersion, map2, map2, mapSingletonMap, setSingleton));
    }

    @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
    public final ImmutableSortedSet b(int i) {
        LimboResolution limboResolution = (LimboResolution) this.g.get(Integer.valueOf(i));
        if (limboResolution != null && limboResolution.b) {
            return DocumentKey.f.b(limboResolution.f15463a);
        }
        ImmutableSortedSet immutableSortedSetH = DocumentKey.f;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        if (map.containsKey(numValueOf)) {
            for (Query query : (List) map.get(Integer.valueOf(i))) {
                HashMap map2 = this.c;
                if (map2.containsKey(query)) {
                    immutableSortedSetH = immutableSortedSetH.h(((QueryView) map2.get(query)).c.e);
                }
            }
        }
        return immutableSortedSetH;
    }

    @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
    public final void c(MutationBatchResult mutationBatchResult) {
        g("handleSuccessfulWrite");
        MutationBatch mutationBatch = mutationBatchResult.f15545a;
        k(mutationBatch.f15544a, null);
        o(mutationBatch.f15544a);
        LocalStore localStore = this.f15461a;
        h((ImmutableSortedMap) localStore.f15487a.k("Acknowledge batch", new h(0, localStore, mutationBatchResult)), null);
    }

    @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
    public final void d(final int i, Status status) {
        g("handleRejectedWrite");
        final LocalStore localStore = this.f15461a;
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) localStore.f15487a.k("Reject batch", new Supplier() { // from class: com.google.firebase.firestore.local.e
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                LocalStore localStore2 = localStore;
                MutationQueue mutationQueue = localStore2.d;
                int i2 = i;
                MutationBatch mutationBatchC = mutationQueue.c(i2);
                Assert.b(mutationBatchC != null, "Attempt to reject nonexistent batch!", new Object[0]);
                localStore2.d.g(mutationBatchC);
                localStore2.d.a();
                localStore2.e.c(i2);
                LocalDocumentsView localDocumentsView = localStore2.g;
                localDocumentsView.f(localDocumentsView.f15484a.e(mutationBatchC.a()));
                return localStore2.g.b(mutationBatchC.a());
            }
        });
        if (!immutableSortedMap.isEmpty()) {
            j(status, "Write failed at %s", ((DocumentKey) immutableSortedMap.i()).d);
        }
        k(i, status);
        o(i);
        h(immutableSortedMap, null);
    }

    @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
    public final void e(final RemoteEvent remoteEvent) {
        g("handleRemoteEvent");
        for (Map.Entry entry : remoteEvent.b.entrySet()) {
            Integer num = (Integer) entry.getKey();
            TargetChange targetChange = (TargetChange) entry.getValue();
            LimboResolution limboResolution = (LimboResolution) this.g.get(num);
            if (limboResolution != null) {
                ImmutableSortedSet immutableSortedSet = targetChange.c;
                ImmutableSortedSet immutableSortedSet2 = targetChange.e;
                ImmutableSortedSet immutableSortedSet3 = targetChange.d;
                Assert.b(immutableSortedSet2.d.size() + (immutableSortedSet3.d.size() + immutableSortedSet.d.size()) <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (targetChange.c.d.size() > 0) {
                    limboResolution.b = true;
                } else if (immutableSortedSet3.d.size() > 0) {
                    Assert.b(limboResolution.b, "Received change for limbo target document without add.", new Object[0]);
                } else if (immutableSortedSet2.d.size() > 0) {
                    Assert.b(limboResolution.b, "Received remove for limbo target document without add.", new Object[0]);
                    limboResolution.b = false;
                }
            }
        }
        final SnapshotVersion snapshotVersion = remoteEvent.f15577a;
        final LocalStore localStore = this.f15461a;
        h((ImmutableSortedMap) localStore.f15487a.k("Apply remote event", new Supplier() { // from class: com.google.firebase.firestore.local.f
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                Iterator it;
                Persistence persistence;
                LocalStore localStore2 = localStore;
                SparseArray sparseArray = localStore2.l;
                TargetCache targetCache = localStore2.j;
                RemoteEvent remoteEvent2 = remoteEvent;
                Map map = remoteEvent2.b;
                Persistence persistence2 = localStore2.f15487a;
                long jF = persistence2.g().f();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    Integer num2 = (Integer) entry2.getKey();
                    int iIntValue = num2.intValue();
                    TargetChange targetChange2 = (TargetChange) entry2.getValue();
                    TargetData targetData = (TargetData) sparseArray.get(iIntValue);
                    if (targetData != null) {
                        ImmutableSortedSet immutableSortedSet4 = targetChange2.e;
                        ByteString byteString = targetChange2.f15583a;
                        targetCache.a(immutableSortedSet4, iIntValue);
                        targetCache.d(targetChange2.c, iIntValue);
                        TargetData targetDataB = targetData.b(jF);
                        if (remoteEvent2.c.containsKey(num2)) {
                            ByteString byteString2 = ByteString.e;
                            SnapshotVersion snapshotVersion2 = SnapshotVersion.e;
                            TargetData targetDataA = targetDataB.a(byteString2, snapshotVersion2);
                            it = it2;
                            persistence = persistence2;
                            targetDataB = new TargetData(targetDataA.f15522a, targetDataA.b, targetDataA.c, targetDataA.d, targetDataA.e, snapshotVersion2, targetDataA.g, null);
                        } else {
                            it = it2;
                            persistence = persistence2;
                            if (!byteString.isEmpty()) {
                                targetDataB = targetDataB.a(byteString, remoteEvent2.f15577a);
                            }
                        }
                        sparseArray.put(iIntValue, targetDataB);
                        if (LocalStore.h(targetData, targetDataB, targetChange2)) {
                            targetCache.e(targetDataB);
                        }
                        persistence2 = persistence;
                        it2 = it;
                    }
                }
                Persistence persistence3 = persistence2;
                Map map2 = remoteEvent2.d;
                Set set = remoteEvent2.e;
                for (DocumentKey documentKey : map2.keySet()) {
                    if (set.contains(documentKey)) {
                        persistence3.g().b(documentKey);
                    }
                }
                HashMap map3 = new HashMap();
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                RemoteDocumentCache remoteDocumentCache = localStore2.f;
                HashMap mapE = remoteDocumentCache.e(map2.keySet());
                Iterator it3 = map2.entrySet().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    DocumentKey documentKey2 = (DocumentKey) entry3.getKey();
                    MutableDocument mutableDocument = (MutableDocument) entry3.getValue();
                    MutableDocument mutableDocument2 = (MutableDocument) mapE.get(documentKey2);
                    if (mutableDocument.b() != mutableDocument2.b()) {
                        hashSet.add(documentKey2);
                    }
                    if (mutableDocument.k() && mutableDocument.c.equals(SnapshotVersion.e)) {
                        arrayList.add(mutableDocument.f15535a);
                        map3.put(documentKey2, mutableDocument);
                    } else {
                        if (mutableDocument2.m() && mutableDocument.c.compareTo(mutableDocument2.c) <= 0) {
                            if (mutableDocument.c.compareTo(mutableDocument2.c) == 0) {
                                if (mutableDocument2.f() || mutableDocument2.e()) {
                                }
                            }
                            Logger.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", documentKey2, mutableDocument2.c, mutableDocument.c);
                        }
                        Assert.b(true ^ SnapshotVersion.e.equals(mutableDocument.d), "Cannot add a document when the remote version is zero", new Object[0]);
                        remoteDocumentCache.d(mutableDocument, mutableDocument.d);
                        map3.put(documentKey2, mutableDocument);
                    }
                }
                remoteDocumentCache.f(arrayList);
                SnapshotVersion snapshotVersionI = targetCache.i();
                SnapshotVersion snapshotVersion3 = SnapshotVersion.e;
                SnapshotVersion snapshotVersion4 = snapshotVersion;
                if (!snapshotVersion4.equals(snapshotVersion3)) {
                    Assert.b(snapshotVersion4.compareTo(snapshotVersionI) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", snapshotVersion4, snapshotVersionI);
                    targetCache.f(snapshotVersion4);
                }
                return localStore2.g.d(map3, hashSet);
            }
        }), remoteEvent);
    }

    @Override // com.google.firebase.firestore.remote.RemoteStore.RemoteStoreCallback
    public final void f(OnlineState onlineState) {
        boolean z;
        ViewChange viewChange;
        g("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.entrySet().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            View view = ((QueryView) ((Map.Entry) it.next()).getValue()).c;
            if (view.c && onlineState == OnlineState.f) {
                view.c = false;
                viewChange = view.a(new View.DocumentChanges(view.d, new DocumentViewChangeSet(), view.g, false), null, false);
            } else {
                viewChange = new ViewChange(null, Collections.EMPTY_LIST);
            }
            Assert.b(viewChange.b.isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            ViewSnapshot viewSnapshot = viewChange.f15472a;
            if (viewSnapshot != null) {
                arrayList.add(viewSnapshot);
            }
        }
        this.m.a(arrayList);
        EventManager eventManager = this.m;
        eventManager.d = onlineState;
        Iterator it2 = eventManager.b.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((EventManager.QueryListenersInfo) it2.next()).f15450a.iterator();
            while (it3.hasNext()) {
                QueryListener queryListener = (QueryListener) it3.next();
                queryListener.e = onlineState;
                ViewSnapshot viewSnapshot2 = queryListener.f;
                if (viewSnapshot2 != null && !queryListener.d && queryListener.d(viewSnapshot2, onlineState)) {
                    queryListener.c(queryListener.f);
                    z = true;
                }
            }
        }
        if (z) {
            eventManager.b();
        }
    }

    public final void g(String str) {
        Assert.b(this.m != null, "Trying to call %s before setting callback", str);
    }

    public final void h(ImmutableSortedMap immutableSortedMap, RemoteEvent remoteEvent) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LocalStore localStore = this.f15461a;
            if (!zHasNext) {
                this.m.a(arrayList);
                localStore.f15487a.l(new d(localStore, arrayList2, 1), "notifyLocalViewChanges");
                return;
            }
            QueryView queryView = (QueryView) ((Map.Entry) it.next()).getValue();
            View view = queryView.c;
            int i = queryView.b;
            View.DocumentChanges documentChangesC = view.c(immutableSortedMap, null);
            boolean z = false;
            if (documentChangesC.c) {
                documentChangesC = view.c(localStore.b(queryView.f15460a, false).f15505a, documentChangesC);
            }
            TargetChange targetChange = remoteEvent != null ? (TargetChange) remoteEvent.b.get(Integer.valueOf(i)) : null;
            if (remoteEvent != null && remoteEvent.c.get(Integer.valueOf(i)) != null) {
                z = true;
            }
            ViewChange viewChangeA = queryView.c.a(documentChangesC, targetChange, z);
            ViewSnapshot viewSnapshot = viewChangeA.f15472a;
            q(i, viewChangeA.b);
            if (viewSnapshot != null) {
                arrayList.add(viewSnapshot);
                ArrayList arrayList3 = new ArrayList();
                androidx.browser.trusted.a aVar = DocumentKey.e;
                ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(arrayList3, aVar);
                ImmutableSortedSet immutableSortedSet2 = new ImmutableSortedSet(new ArrayList(), aVar);
                Iterator it2 = viewSnapshot.d.iterator();
                while (it2.hasNext()) {
                    DocumentViewChange documentViewChange = (DocumentViewChange) it2.next();
                    DocumentViewChange.Type type = documentViewChange.f15445a;
                    Document document = documentViewChange.b;
                    int iOrdinal = type.ordinal();
                    if (iOrdinal == 0) {
                        immutableSortedSet2 = immutableSortedSet2.b(document.getKey());
                    } else if (iOrdinal == 1) {
                        immutableSortedSet = immutableSortedSet.b(document.getKey());
                    }
                }
                arrayList2.add(new LocalViewChanges(i, viewSnapshot.e, immutableSortedSet, immutableSortedSet2));
            }
        }
    }

    public final int i(Query query, boolean z) {
        g("listen");
        HashMap map = this.c;
        Assert.b(!map.containsKey(query), "We already listen to query: %s", query);
        Target targetF = query.f();
        LocalStore localStore = this.f15461a;
        TargetData targetDataA = localStore.a(targetF);
        int i = targetDataA.b;
        ByteString byteString = targetDataA.g;
        QueryResult queryResultB = localStore.b(query, true);
        Integer numValueOf = Integer.valueOf(i);
        HashMap map2 = this.d;
        boolean z2 = (map2.get(numValueOf) != null ? ((QueryView) map.get((Query) ((List) map2.get(Integer.valueOf(i))).get(0))).c.b : ViewSnapshot.SyncState.d) == ViewSnapshot.SyncState.f;
        ImmutableSortedSet immutableSortedSet = DocumentKey.f;
        TargetChange targetChange = new TargetChange(byteString, z2, immutableSortedSet, immutableSortedSet, immutableSortedSet);
        View view = new View(query, queryResultB.b);
        ViewChange viewChangeA = view.a(view.c(queryResultB.f15505a, null), targetChange, false);
        q(i, viewChangeA.b);
        map.put(query, new QueryView(query, i, view));
        if (!map2.containsKey(Integer.valueOf(i))) {
            map2.put(Integer.valueOf(i), new ArrayList(1));
        }
        ((List) map2.get(Integer.valueOf(i))).add(query);
        this.m.a(Collections.singletonList(viewChangeA.f15472a));
        if (z) {
            this.b.c(targetDataA);
        }
        return targetDataA.b;
    }

    public final void k(int i, Status status) {
        Map map = (Map) this.i.get(this.l);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (status != null) {
                    taskCompletionSource.setException(Util.f(status));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    public final void l() {
        while (true) {
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashMap map = this.f;
            if (map.size() >= 100) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            DocumentKey documentKey = (DocumentKey) it.next();
            it.remove();
            TargetIdGenerator targetIdGenerator = this.k;
            int i = targetIdGenerator.f15466a;
            targetIdGenerator.f15466a = i + 2;
            this.g.put(Integer.valueOf(i), new LimboResolution(documentKey));
            map.put(documentKey, Integer.valueOf(i));
            ResourcePath resourcePath = documentKey.d;
            List list = Collections.EMPTY_LIST;
            this.b.c(new TargetData(new Query(resourcePath).f(), i, -1L, QueryPurpose.g));
        }
    }

    public final void m(int i, Status status) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        for (Query query : (List) map.get(numValueOf)) {
            this.c.remove(query);
            if (!status.f()) {
                HashMap map2 = this.m.b;
                EventManager.QueryListenersInfo queryListenersInfo = (EventManager.QueryListenersInfo) map2.get(query);
                if (queryListenersInfo != null) {
                    Iterator it = queryListenersInfo.f15450a.iterator();
                    while (it.hasNext()) {
                        QueryListener queryListener = (QueryListener) it.next();
                        queryListener.c.a(null, Util.f(status));
                    }
                }
                map2.remove(query);
                j(status, "Listen for %s failed", query);
            }
        }
        map.remove(Integer.valueOf(i));
        ReferenceSet referenceSet = this.h;
        ImmutableSortedSet immutableSortedSetC = referenceSet.c(i);
        referenceSet.e(i);
        Iterator it2 = immutableSortedSetC.iterator();
        while (it2.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it2.next();
            if (!referenceSet.b(documentKey)) {
                n(documentKey);
            }
        }
    }

    public final void n(DocumentKey documentKey) {
        this.e.remove(documentKey);
        HashMap map = this.f;
        Integer num = (Integer) map.get(documentKey);
        if (num != null) {
            this.b.i(num.intValue());
            map.remove(documentKey);
            this.g.remove(num);
            l();
        }
    }

    public final void o(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.j;
        if (map.containsKey(numValueOf)) {
            Iterator it = ((List) map.get(Integer.valueOf(i))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            map.remove(Integer.valueOf(i));
        }
    }

    public final void p(Query query, boolean z) {
        g("stopListening");
        HashMap map = this.c;
        QueryView queryView = (QueryView) map.get(query);
        Assert.b(queryView != null, "Trying to stop listening to a query not found", new Object[0]);
        map.remove(query);
        int i = queryView.b;
        List list = (List) this.d.get(Integer.valueOf(i));
        list.remove(query);
        if (list.isEmpty()) {
            LocalStore localStore = this.f15461a;
            localStore.f15487a.l(new g(localStore, i), "Release target");
            if (z) {
                this.b.i(i);
            }
            m(i, Status.e);
        }
    }

    public final void q(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LimboDocumentChange limboDocumentChange = (LimboDocumentChange) it.next();
            LimboDocumentChange.Type type = limboDocumentChange.f15454a;
            DocumentKey documentKey = limboDocumentChange.b;
            int iOrdinal = type.ordinal();
            ReferenceSet referenceSet = this.h;
            if (iOrdinal == 0) {
                referenceSet.a(documentKey, i);
                if (!this.f.containsKey(documentKey)) {
                    LinkedHashSet linkedHashSet = this.e;
                    if (!linkedHashSet.contains(documentKey)) {
                        Logger.a("SyncEngine", "New document in limbo: %s", documentKey);
                        linkedHashSet.add(documentKey);
                        l();
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    Assert.a("Unknown limbo change type: %s", limboDocumentChange.f15454a);
                    throw null;
                }
                Logger.a("SyncEngine", "Document no longer in limbo: %s", documentKey);
                referenceSet.d(documentKey, i);
                if (!referenceSet.b(documentKey)) {
                    n(documentKey);
                }
            }
        }
    }
}
