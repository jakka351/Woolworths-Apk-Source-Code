package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
final class MemoryMutationQueue implements MutationQueue {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15499a = new ArrayList();
    public ImmutableSortedSet b = new ImmutableSortedSet(Collections.EMPTY_LIST, DocumentReference.c);
    public ByteString c = WriteStream.v;
    public final MemoryPersistence d;

    public MemoryMutationQueue(MemoryPersistence memoryPersistence) {
        this.d = memoryPersistence;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void a() {
        if (this.f15499a.isEmpty()) {
            Assert.b(this.b.d.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final MutationBatch b(int i) {
        int iJ = j(i + 1);
        if (iJ < 0) {
            iJ = 0;
        }
        ArrayList arrayList = this.f15499a;
        if (arrayList.size() > iJ) {
            return (MutationBatch) arrayList.get(iJ);
        }
        return null;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final MutationBatch c(int i) {
        int iJ = j(i);
        if (iJ < 0) {
            return null;
        }
        ArrayList arrayList = this.f15499a;
        if (iJ >= arrayList.size()) {
            return null;
        }
        MutationBatch mutationBatch = (MutationBatch) arrayList.get(iJ);
        Assert.b(mutationBatch.f15544a == i, "If found batch must match", new Object[0]);
        return mutationBatch;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final ByteString d() {
        return this.c;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void e(MutationBatch mutationBatch, ByteString byteString) {
        int i = mutationBatch.f15544a;
        int iJ = j(i);
        ArrayList arrayList = this.f15499a;
        Assert.b(iJ >= 0 && iJ < arrayList.size(), "Batches must exist to be %s", "acknowledged");
        Assert.b(iJ == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        MutationBatch mutationBatch2 = (MutationBatch) arrayList.get(iJ);
        Assert.b(i == mutationBatch2.f15544a, "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(i), Integer.valueOf(mutationBatch2.f15544a));
        byteString.getClass();
        this.c = byteString;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final ArrayList f(Set set) {
        List list = Collections.EMPTY_LIST;
        int i = Util.f15603a;
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(list, new androidx.browser.trusted.a(11));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            Iterator itD = this.b.d(new DocumentReference(documentKey, 0));
            while (itD.hasNext()) {
                DocumentReference documentReference = (DocumentReference) itD.next();
                if (!documentKey.equals(documentReference.f15480a)) {
                    break;
                }
                immutableSortedSet = immutableSortedSet.b(Integer.valueOf(documentReference.b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            MutationBatch mutationBatchC = c(((Integer) it2.next()).intValue());
            if (mutationBatchC != null) {
                arrayList.add(mutationBatchC);
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void g(MutationBatch mutationBatch) {
        int iJ = j(mutationBatch.f15544a);
        ArrayList arrayList = this.f15499a;
        Assert.b(iJ >= 0 && iJ < arrayList.size(), "Batches must exist to be %s", "removed");
        Assert.b(iJ == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        arrayList.remove(0);
        ImmutableSortedSet immutableSortedSetG = this.b;
        Iterator it = mutationBatch.d.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = ((Mutation) it.next()).f15543a;
            this.d.h.d(documentKey);
            immutableSortedSetG = immutableSortedSetG.g(new DocumentReference(documentKey, mutationBatch.f15544a));
        }
        this.b = immutableSortedSetG;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void h(ByteString byteString) {
        byteString.getClass();
        this.c = byteString;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final List i() {
        return Collections.unmodifiableList(this.f15499a);
    }

    public final int j(int i) {
        ArrayList arrayList = this.f15499a;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return i - ((MutationBatch) arrayList.get(0)).f15544a;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void start() {
        this.f15499a.isEmpty();
    }
}
