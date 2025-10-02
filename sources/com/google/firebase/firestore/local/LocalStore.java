package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleCallback;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.core.TargetIdGenerator;
import com.google.firebase.firestore.local.IndexManager;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class LocalStore implements BundleCallback {
    public static final long o = TimeUnit.MINUTES.toSeconds(5);
    public static final /* synthetic */ int p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Persistence f15487a;
    public final GlobalsCache b;
    public IndexManager c;
    public MutationQueue d;
    public DocumentOverlayCache e;
    public final RemoteDocumentCache f;
    public LocalDocumentsView g;
    public final QueryEngine h;
    public final ReferenceSet i;
    public final TargetCache j;
    public final BundleCache k;
    public final SparseArray l;
    public final HashMap m;
    public final TargetIdGenerator n;

    public static class AllocateQueryHolder {

        /* renamed from: a, reason: collision with root package name */
        public TargetData f15488a;
        public int b;
    }

    public static class DocumentChangeResult {
    }

    public LocalStore(Persistence persistence, QueryEngine queryEngine, User user) {
        Assert.b(persistence.j(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f15487a = persistence;
        this.h = queryEngine;
        this.b = persistence.c();
        TargetCache targetCacheI = persistence.i();
        this.j = targetCacheI;
        this.k = persistence.a();
        TargetIdGenerator targetIdGenerator = new TargetIdGenerator(0, targetCacheI.c());
        targetIdGenerator.f15466a += 2;
        this.n = targetIdGenerator;
        this.f = persistence.h();
        ReferenceSet referenceSet = new ReferenceSet();
        this.i = referenceSet;
        this.l = new SparseArray();
        this.m = new HashMap();
        persistence.g().m(referenceSet);
        g(user);
    }

    public static boolean h(TargetData targetData, TargetData targetData2, TargetChange targetChange) {
        if (targetData.g.isEmpty()) {
            return true;
        }
        long j = targetData2.e.d.d - targetData.e.d.d;
        long j2 = o;
        if (j >= j2 || targetData2.f.d.d - targetData.f.d.d >= j2) {
            return true;
        }
        if (targetChange == null) {
            return false;
        }
        return targetChange.e.d.size() + (targetChange.d.d.size() + targetChange.c.d.size()) > 0;
    }

    public final TargetData a(final Target target) {
        int i;
        TargetData targetDataB = this.j.b(target);
        if (targetDataB != null) {
            i = targetDataB.b;
        } else {
            final AllocateQueryHolder allocateQueryHolder = new AllocateQueryHolder();
            this.f15487a.l(new Runnable() { // from class: com.google.firebase.firestore.local.j
                @Override // java.lang.Runnable
                public final void run() {
                    LocalStore localStore = this.d;
                    TargetIdGenerator targetIdGenerator = localStore.n;
                    int i2 = targetIdGenerator.f15466a;
                    targetIdGenerator.f15466a = i2 + 2;
                    LocalStore.AllocateQueryHolder allocateQueryHolder2 = allocateQueryHolder;
                    allocateQueryHolder2.b = i2;
                    TargetData targetData = new TargetData(target, i2, localStore.f15487a.g().f(), QueryPurpose.d);
                    allocateQueryHolder2.f15488a = targetData;
                    localStore.j.g(targetData);
                }
            }, "Allocate target");
            i = allocateQueryHolder.b;
            targetDataB = allocateQueryHolder.f15488a;
        }
        SparseArray sparseArray = this.l;
        if (sparseArray.get(i) == null) {
            sparseArray.put(i, targetDataB);
            this.m.put(target, Integer.valueOf(i));
        }
        return targetDataB;
    }

    public final QueryResult b(Query query, boolean z) {
        ImmutableSortedSet immutableSortedSetH;
        SnapshotVersion snapshotVersion;
        Target targetF = query.f();
        Integer num = (Integer) this.m.get(targetF);
        TargetCache targetCache = this.j;
        TargetData targetDataB = num != null ? (TargetData) this.l.get(num.intValue()) : targetCache.b(targetF);
        SnapshotVersion snapshotVersion2 = SnapshotVersion.e;
        ImmutableSortedSet immutableSortedSet = DocumentKey.f;
        if (targetDataB != null) {
            snapshotVersion = targetDataB.f;
            immutableSortedSetH = targetCache.h(targetDataB.b);
        } else {
            immutableSortedSetH = immutableSortedSet;
            snapshotVersion = snapshotVersion2;
        }
        if (!z) {
            snapshotVersion = snapshotVersion2;
        }
        QueryEngine queryEngine = this.h;
        Assert.b(queryEngine.c, "initialize() not called", new Object[0]);
        queryEngine.getClass();
        ImmutableSortedMap immutableSortedMapC = null;
        if (!query.e()) {
            Target targetF2 = query.f();
            if (!queryEngine.b.h(targetF2).equals(IndexManager.IndexType.d)) {
                List listI = queryEngine.b.i(targetF2);
                Assert.b(listI != null, "index manager must return results for partial and full indexes.", new Object[0]);
                ImmutableSortedMap immutableSortedMapB = queryEngine.f15504a.b(listI);
                FieldIndex.IndexOffset indexOffsetB = queryEngine.b.b(targetF2);
                ImmutableSortedSet<Document> immutableSortedSetA = QueryEngine.a(query, immutableSortedMapB);
                ((ArrayList) listI).size();
                indexOffsetB.l();
                ImmutableSortedMap immutableSortedMapC2 = queryEngine.f15504a.c(query, indexOffsetB, null);
                for (Document document : immutableSortedSetA) {
                    immutableSortedMapC2 = immutableSortedMapC2.j(document.getKey(), document);
                }
                immutableSortedMapC = immutableSortedMapC2;
            }
        }
        if (immutableSortedMapC == null) {
            immutableSortedMapC = null;
            if (!query.e() && !snapshotVersion.equals(snapshotVersion2)) {
                ImmutableSortedSet<Document> immutableSortedSetA2 = QueryEngine.a(query, queryEngine.f15504a.b(immutableSortedSetH));
                immutableSortedSetH.d.size();
                Logger.a("QueryEngine", "Re-using previous result from %s to execute query: %s", snapshotVersion.toString(), query.toString());
                ImmutableSortedMap immutableSortedMapC3 = queryEngine.f15504a.c(query, FieldIndex.IndexOffset.c(snapshotVersion), null);
                for (Document document2 : immutableSortedSetA2) {
                    immutableSortedMapC3 = immutableSortedMapC3.j(document2.getKey(), document2);
                }
                immutableSortedMapC = immutableSortedMapC3;
            }
            if (immutableSortedMapC == null) {
                QueryContext queryContext = new QueryContext();
                Logger.a("QueryEngine", "Using full collection scan to execute query: %s", query.toString());
                immutableSortedMapC = queryEngine.f15504a.c(query, FieldIndex.IndexOffset.d, queryContext);
            }
        }
        return new QueryResult(immutableSortedMapC, immutableSortedSetH);
    }

    public final SnapshotVersion c() {
        return this.j.i();
    }

    public final ByteString d() {
        return this.d.d();
    }

    public final MutationBatch e(int i) {
        return this.d.b(i);
    }

    public final ImmutableSortedMap f(User user) {
        List listI = this.d.i();
        g(user);
        i iVar = new i(this, 1);
        Persistence persistence = this.f15487a;
        persistence.l(iVar, "Start IndexManager");
        persistence.l(new i(this, 0), "Start MutationQueue");
        List listI2 = this.d.i();
        ImmutableSortedSet immutableSortedSetB = DocumentKey.f;
        Iterator it = Arrays.asList(listI, listI2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((MutationBatch) it2.next()).d.iterator();
                while (it3.hasNext()) {
                    immutableSortedSetB = immutableSortedSetB.b(((Mutation) it3.next()).f15543a);
                }
            }
        }
        return this.g.b(immutableSortedSetB);
    }

    public final void g(User user) {
        Persistence persistence = this.f15487a;
        IndexManager indexManagerD = persistence.d(user);
        this.c = indexManagerD;
        this.d = persistence.e(user, indexManagerD);
        DocumentOverlayCache documentOverlayCacheB = persistence.b(user);
        this.e = documentOverlayCacheB;
        MutationQueue mutationQueue = this.d;
        IndexManager indexManager = this.c;
        RemoteDocumentCache remoteDocumentCache = this.f;
        this.g = new LocalDocumentsView(remoteDocumentCache, mutationQueue, documentOverlayCacheB, indexManager);
        remoteDocumentCache.g(indexManager);
        LocalDocumentsView localDocumentsView = this.g;
        IndexManager indexManager2 = this.c;
        QueryEngine queryEngine = this.h;
        queryEngine.f15504a = localDocumentsView;
        queryEngine.b = indexManager2;
        queryEngine.c = true;
    }
}
