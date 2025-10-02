package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes6.dex */
public final /* synthetic */ class h implements Supplier, Function {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public Object apply(Object obj) {
        MutableDocument mutableDocument = (MutableDocument) obj;
        return Boolean.valueOf(((Query) this.e).d(mutableDocument) || ((Set) this.f).contains(mutableDocument.f15535a));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.firebase.firestore.local.LruDelegate, java.lang.Object] */
    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        long jLongValue;
        int i = this.d;
        Object obj = this.f;
        LocalStore localStore = (LocalStore) this.e;
        switch (i) {
            case 0:
                MutationBatchResult mutationBatchResult = (MutationBatchResult) obj;
                int i2 = LocalStore.p;
                MutationBatch mutationBatch = mutationBatchResult.f15545a;
                ArrayList arrayList = mutationBatchResult.c;
                localStore.d.e(mutationBatch, mutationBatchResult.d);
                RemoteDocumentCache remoteDocumentCache = localStore.f;
                HashSet hashSetA = mutationBatch.a();
                ArrayList arrayList2 = mutationBatch.d;
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    DocumentKey documentKey = (DocumentKey) it.next();
                    MutableDocument mutableDocumentA = remoteDocumentCache.a(documentKey);
                    SnapshotVersion snapshotVersion = (SnapshotVersion) mutationBatchResult.e.d(documentKey);
                    Assert.b(snapshotVersion != null, "docVersions should contain every doc in the write.", new Object[0]);
                    if (mutableDocumentA.c.compareTo(snapshotVersion) < 0) {
                        int size = arrayList2.size();
                        Assert.b(arrayList.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(arrayList.size()));
                        for (int i3 = 0; i3 < size; i3++) {
                            Mutation mutation = (Mutation) arrayList2.get(i3);
                            if (mutation.f15543a.equals(mutableDocumentA.f15535a)) {
                                mutation.b(mutableDocumentA, (MutationResult) arrayList.get(i3));
                            }
                        }
                        if (mutableDocumentA.m()) {
                            remoteDocumentCache.d(mutableDocumentA, mutationBatchResult.b);
                        }
                    }
                }
                localStore.d.g(mutationBatch);
                localStore.d.a();
                localStore.e.c(mutationBatch.f15544a);
                LocalDocumentsView localDocumentsView = localStore.g;
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (!((MutationResult) arrayList.get(i4)).b.isEmpty()) {
                        hashSet.add(((Mutation) arrayList2.get(i4)).f15543a);
                    }
                }
                localDocumentsView.f(localDocumentsView.f15484a.e(hashSet));
                return localStore.g.b(mutationBatch.a());
            default:
                SparseArray sparseArray = localStore.l;
                ?? r3 = ((LruGarbageCollector) obj).f15491a;
                long jE = r3.e();
                if (jE < 104857600) {
                    Logger.a("LruGarbageCollector", androidx.camera.core.impl.b.l(jE, "Garbage collection skipped; Cache size ", " is lower than threshold 104857600"), new Object[0]);
                    return new LruGarbageCollector.Results();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iL = (int) ((10 / 100.0f) * r3.l());
                if (iL > 1000) {
                    Logger.a("LruGarbageCollector", YU.a.d(iL, "Capping sequence numbers to collect down to the maximum of 1000 from "), new Object[0]);
                    iL = 1000;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (iL == 0) {
                    jLongValue = -1;
                } else {
                    LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer = new LruGarbageCollector.RollingSequenceNumberBuffer(iL);
                    r3.i(new k(rollingSequenceNumberBuffer, 0));
                    r3.g(new k(rollingSequenceNumberBuffer, 1));
                    jLongValue = ((Long) rollingSequenceNumberBuffer.f15493a.peek()).longValue();
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                int iJ = r3.j(jLongValue, sparseArray);
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                int iH = r3.h(jLongValue);
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                StringBuilder sbS = YU.a.s(android.support.v4.media.session.a.l(jCurrentTimeMillis2 - jCurrentTimeMillis, "ms\n", new StringBuilder("LRU Garbage Collection:\n\tCounted targets in ")));
                Locale locale = Locale.ROOT;
                sbS.append("\tDetermined least recently used " + iL + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n");
                StringBuilder sbS2 = YU.a.s(sbS.toString());
                sbS2.append("\tRemoved " + iJ + " targets in " + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms\n");
                StringBuilder sbS3 = YU.a.s(sbS2.toString());
                sbS3.append("\tRemoved " + iH + " documents in " + (jCurrentTimeMillis5 - jCurrentTimeMillis4) + "ms\n");
                StringBuilder sbS4 = YU.a.s(sbS3.toString());
                StringBuilder sb = new StringBuilder("Total Duration: ");
                sb.append(jCurrentTimeMillis5 - jCurrentTimeMillis);
                sb.append("ms");
                sbS4.append(sb.toString());
                Logger.a("LruGarbageCollector", sbS4.toString(), new Object[0]);
                return new LruGarbageCollector.Results();
        }
    }
}
