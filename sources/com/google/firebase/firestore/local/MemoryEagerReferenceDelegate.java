package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
class MemoryEagerReferenceDelegate implements ReferenceDelegate {

    /* renamed from: a, reason: collision with root package name */
    public ReferenceSet f15495a;
    public final MemoryPersistence b;
    public HashSet c;

    public MemoryEagerReferenceDelegate(MemoryPersistence memoryPersistence) {
        this.b = memoryPersistence;
    }

    public final boolean a(DocumentKey documentKey) {
        boolean zEquals;
        MemoryPersistence memoryPersistence = this.b;
        if (memoryPersistence.e.b.b(documentKey)) {
            return true;
        }
        Iterator it = memoryPersistence.b.values().iterator();
        do {
            zEquals = false;
            if (!it.hasNext()) {
                ReferenceSet referenceSet = this.f15495a;
                return referenceSet != null && referenceSet.b(documentKey);
            }
            MemoryMutationQueue memoryMutationQueue = (MemoryMutationQueue) it.next();
            memoryMutationQueue.getClass();
            Iterator itD = memoryMutationQueue.b.d(new DocumentReference(documentKey, 0));
            if (itD.hasNext()) {
                zEquals = ((DocumentReference) itD.next()).f15480a.equals(documentKey);
            }
        } while (!zEquals);
        return true;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void b(DocumentKey documentKey) {
        if (a(documentKey)) {
            this.c.remove(documentKey);
        } else {
            this.c.add(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void c() {
        this.c = new HashSet();
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void d(DocumentKey documentKey) {
        this.c.add(documentKey);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final long f() {
        return -1L;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void k(TargetData targetData) {
        MemoryTargetCache memoryTargetCache = this.b.e;
        Iterator it = memoryTargetCache.b.c(targetData.b).iterator();
        while (it.hasNext()) {
            this.c.add((DocumentKey) it.next());
        }
        memoryTargetCache.f15502a.remove(targetData.f15522a);
        memoryTargetCache.b.e(targetData.b);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void m(ReferenceSet referenceSet) {
        this.f15495a = referenceSet;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void n(DocumentKey documentKey) {
        this.c.remove(documentKey);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void o(DocumentKey documentKey) {
        this.c.add(documentKey);
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void onTransactionCommitted() {
        MemoryRemoteDocumentCache memoryRemoteDocumentCache = this.b.g;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            if (!a(documentKey)) {
                arrayList.add(documentKey);
            }
        }
        memoryRemoteDocumentCache.f(arrayList);
        this.c = null;
    }
}
