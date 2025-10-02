package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.core.ListenSequence;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class SQLiteLruReferenceDelegate implements ReferenceDelegate, LruDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15509a;
    public ListenSequence b;
    public long c = -1;
    public final LruGarbageCollector d;
    public ReferenceSet e;

    public SQLiteLruReferenceDelegate(SQLitePersistence sQLitePersistence, LruGarbageCollector.Params params) {
        this.f15509a = sQLitePersistence;
        this.d = new LruGarbageCollector(this, params);
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final LruGarbageCollector a() {
        return this.d;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void b(DocumentKey documentKey) {
        p(documentKey);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void c() {
        Assert.b(this.c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        ListenSequence listenSequence = this.b;
        long j = listenSequence.f15455a + 1;
        listenSequence.f15455a = j;
        this.c = j;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void d(DocumentKey documentKey) {
        p(documentKey);
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final long e() {
        Long lValueOf;
        SQLitePersistence sQLitePersistence = this.f15509a;
        Cursor cursorE = sQLitePersistence.p("PRAGMA page_count").e();
        try {
            if (cursorE.moveToFirst()) {
                lValueOf = Long.valueOf(cursorE.getLong(0));
                cursorE.close();
            } else {
                cursorE.close();
                lValueOf = null;
            }
            long jLongValue = lValueOf.longValue();
            cursorE = sQLitePersistence.p("PRAGMA page_size").e();
            try {
                Long lValueOf2 = cursorE.moveToFirst() ? Long.valueOf(cursorE.getLong(0)) : null;
                cursorE.close();
                return lValueOf2.longValue() * jLongValue;
            } finally {
            }
        } finally {
        }
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final long f() {
        Assert.b(this.c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.c;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final void g(k kVar) {
        Cursor cursorE = this.f15509a.p("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e();
        while (cursorE.moveToNext()) {
            try {
                kVar.accept(Long.valueOf(cursorE.getLong(0)));
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
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final int h(long j) {
        SQLitePersistence sQLitePersistence;
        SQLitePersistence.Query queryP;
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final ResourcePath[] resourcePathArr = {ResourcePath.e};
        do {
            sQLitePersistence = this.f15509a;
            queryP = sQLitePersistence.p("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
            queryP.a(Long.valueOf(j), EncodedPath.b(resourcePathArr[0]), 100);
        } while (queryP.c(new Consumer() { // from class: com.google.firebase.firestore.local.p
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                boolean z;
                SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate = this.f15527a;
                SQLitePersistence sQLitePersistence2 = sQLiteLruReferenceDelegate.f15509a;
                ResourcePath resourcePathA = EncodedPath.a(((Cursor) obj).getString(0));
                DocumentKey documentKey = new DocumentKey(resourcePathA);
                boolean zB = sQLiteLruReferenceDelegate.e.b(documentKey);
                ResourcePath resourcePath = documentKey.d;
                if (zB) {
                    z = true;
                } else {
                    SQLitePersistence.Query queryP2 = sQLitePersistence2.p("SELECT 1 FROM document_mutations WHERE path = ?");
                    queryP2.a(EncodedPath.b(resourcePath));
                    z = !queryP2.d();
                }
                if (!z) {
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + 1;
                    arrayList.add(documentKey);
                    sQLitePersistence2.o("DELETE FROM target_documents WHERE path = ? AND target_id = 0", EncodedPath.b(resourcePath));
                }
                resourcePathArr[0] = resourcePathA;
            }
        }) == 100);
        sQLitePersistence.e.f(arrayList);
        return iArr[0];
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final void i(k kVar) {
        SQLiteTargetCache sQLiteTargetCache = this.f15509a.c;
        Cursor cursorE = sQLiteTargetCache.f15519a.p("SELECT target_proto FROM targets").e();
        while (cursorE.moveToNext()) {
            try {
                kVar.accept(sQLiteTargetCache.j(cursorE.getBlob(0)));
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
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final int j(long j, SparseArray sparseArray) {
        SQLiteTargetCache sQLiteTargetCache = this.f15509a.c;
        int[] iArr = new int[1];
        SQLitePersistence.Query queryP = sQLiteTargetCache.f15519a.p("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
        queryP.a(Long.valueOf(j));
        queryP.c(new q(sQLiteTargetCache, sparseArray, iArr, 1));
        sQLiteTargetCache.l();
        return iArr[0];
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void k(TargetData targetData) {
        this.f15509a.c.e(targetData.b(f()));
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final long l() {
        Long lValueOf;
        SQLitePersistence sQLitePersistence = this.f15509a;
        long j = sQLitePersistence.c.f;
        Cursor cursorE = sQLitePersistence.p("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").e();
        try {
            if (cursorE.moveToFirst()) {
                lValueOf = Long.valueOf(cursorE.getLong(0));
                cursorE.close();
            } else {
                cursorE.close();
                lValueOf = null;
            }
            return lValueOf.longValue() + j;
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

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void m(ReferenceSet referenceSet) {
        this.e = referenceSet;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void n(DocumentKey documentKey) {
        p(documentKey);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void o(DocumentKey documentKey) {
        p(documentKey);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void onTransactionCommitted() {
        Assert.b(this.c != -1, "Committing a transaction without having started one", new Object[0]);
        this.c = -1L;
    }

    public final void p(DocumentKey documentKey) {
        this.f15509a.o("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", EncodedPath.b(documentKey.d), Long.valueOf(f()));
    }
}
