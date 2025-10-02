package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.Overlay;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SQLiteOverlayMigrationManager sQLiteOverlayMigrationManager = (SQLiteOverlayMigrationManager) this.e;
                Boolean[] boolArr = {Boolean.FALSE};
                SQLitePersistence sQLitePersistence = sQLiteOverlayMigrationManager.f15512a;
                sQLitePersistence.p("SELECT migration_name FROM data_migrations").c(new n(boolArr, 2));
                if (boolArr[0].booleanValue()) {
                    HashSet hashSet = new HashSet();
                    Cursor cursorE = sQLitePersistence.p("SELECT DISTINCT uid FROM mutation_queues").e();
                    while (cursorE.moveToNext()) {
                        try {
                            hashSet.add(cursorE.getString(0));
                        } catch (Throwable th) {
                            if (cursorE != null) {
                                try {
                                    cursorE.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    cursorE.close();
                    SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache = sQLitePersistence.e;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        User user = new User((String) it.next());
                        MutationQueue mutationQueueE = sQLitePersistence.e(user, sQLitePersistence.d(user));
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = ((ArrayList) ((SQLiteMutationQueue) mutationQueueE).i()).iterator();
                        while (it2.hasNext()) {
                            hashSet2.addAll(((MutationBatch) it2.next()).a());
                        }
                        new LocalDocumentsView(sQLiteRemoteDocumentCache, mutationQueueE, sQLitePersistence.b(user), sQLitePersistence.d(user)).f(sQLiteRemoteDocumentCache.e(hashSet2));
                    }
                    sQLitePersistence.o("DELETE FROM data_migrations WHERE migration_name = ?", "BUILD_OVERLAYS");
                    return;
                }
                return;
            case 1:
                IndexBackfiller.Scheduler scheduler = (IndexBackfiller.Scheduler) this.e;
                final IndexBackfiller indexBackfiller = IndexBackfiller.this;
                Integer num = (Integer) indexBackfiller.b.k("Backfill Indexes", new Supplier() { // from class: com.google.firebase.firestore.local.c
                    @Override // com.google.firebase.firestore.util.Supplier
                    public final Object get() {
                        IndexBackfiller indexBackfiller2;
                        b bVar;
                        IndexBackfiller indexBackfiller3 = indexBackfiller;
                        b bVar2 = indexBackfiller3.c;
                        IndexManager indexManager = bVar2.e.c;
                        HashSet hashSet3 = new HashSet();
                        int i = indexBackfiller3.e;
                        int size = i;
                        while (size > 0) {
                            String strG = indexManager.g();
                            if (strG == null || hashSet3.contains(strG)) {
                                break;
                            }
                            Logger.a("IndexBackfiller", "Processing collection: %s", strG);
                            IndexManager indexManager2 = bVar2.e.c;
                            LocalDocumentsView localDocumentsView = indexBackfiller3.d.e.g;
                            FieldIndex.IndexOffset indexOffsetC = indexManager2.c(strG);
                            Map mapB = localDocumentsView.f15484a.b(strG, indexOffsetC, size);
                            HashMap mapD = size - mapB.size() > 0 ? localDocumentsView.c.d(indexOffsetC.f(), size - mapB.size(), strG) : new HashMap();
                            int iMax = -1;
                            for (Overlay overlay : mapD.values()) {
                                if (mapB.containsKey(overlay.c().f15543a)) {
                                    indexBackfiller2 = indexBackfiller3;
                                    bVar = bVar2;
                                } else {
                                    DocumentKey documentKey = overlay.c().f15543a;
                                    indexBackfiller2 = indexBackfiller3;
                                    DocumentKey documentKey2 = overlay.c().f15543a;
                                    bVar = bVar2;
                                    mapB.put(documentKey, overlay.c() instanceof PatchMutation ? localDocumentsView.f15484a.a(documentKey2) : MutableDocument.n(documentKey2));
                                }
                                iMax = Math.max(iMax, overlay.b());
                                indexBackfiller3 = indexBackfiller2;
                                bVar2 = bVar;
                            }
                            IndexBackfiller indexBackfiller4 = indexBackfiller3;
                            b bVar3 = bVar2;
                            localDocumentsView.e(mapD, mapB.keySet());
                            HashMap mapA = localDocumentsView.a(mapB, mapD, Collections.EMPTY_SET);
                            ImmutableSortedMap immutableSortedMapJ = DocumentCollections.f15533a;
                            for (Map.Entry entry : mapA.entrySet()) {
                                immutableSortedMapJ = immutableSortedMapJ.j((DocumentKey) entry.getKey(), ((OverlayedDocument) entry.getValue()).f15503a);
                            }
                            LocalDocumentsResult localDocumentsResult = new LocalDocumentsResult(iMax, immutableSortedMapJ);
                            indexManager2.a(immutableSortedMapJ);
                            Iterator<Map.Entry<K, V>> it3 = immutableSortedMapJ.iterator();
                            FieldIndex.IndexOffset indexOffset = indexOffsetC;
                            while (it3.hasNext()) {
                                FieldIndex.IndexOffset indexOffsetD = FieldIndex.IndexOffset.d((Document) ((Map.Entry) it3.next()).getValue());
                                if (indexOffsetD.compareTo(indexOffset) > 0) {
                                    indexOffset = indexOffsetD;
                                }
                            }
                            FieldIndex.IndexOffset indexOffsetB = FieldIndex.IndexOffset.b(indexOffset.l(), indexOffset.e(), Math.max(localDocumentsResult.f15483a, indexOffsetC.f()));
                            Logger.a("IndexBackfiller", "Updating offset: %s", indexOffsetB);
                            indexManager2.e(strG, indexOffsetB);
                            size -= localDocumentsResult.b.size();
                            hashSet3.add(strG);
                            indexBackfiller3 = indexBackfiller4;
                            bVar2 = bVar3;
                        }
                        return Integer.valueOf(i - size);
                    }
                });
                num.getClass();
                Logger.a("IndexBackfiller", "Documents written: %s", num);
                long j = IndexBackfiller.g;
                scheduler.f15482a.a(AsyncQueue.TimerId.l, j, new r(scheduler, 1));
                return;
            default:
                LruGarbageCollector.GCScheduler gCScheduler = (LruGarbageCollector.GCScheduler) this.e;
                LocalStore localStore = gCScheduler.b;
                gCScheduler.c = true;
                long j2 = LruGarbageCollector.c;
                gCScheduler.f15492a.a(AsyncQueue.TimerId.j, j2, new r(gCScheduler, 2));
                return;
        }
    }
}
