package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class MutationBatch {

    /* renamed from: a, reason: collision with root package name */
    public final int f15544a;
    public final Timestamp b;
    public final ArrayList c;
    public final ArrayList d;

    public MutationBatch(int i, Timestamp timestamp, ArrayList arrayList, ArrayList arrayList2) {
        Assert.b(!arrayList2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f15544a = i;
        this.b = timestamp;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            hashSet.add(((Mutation) it.next()).f15543a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutationBatch.class != obj.getClass()) {
            return false;
        }
        MutationBatch mutationBatch = (MutationBatch) obj;
        return this.f15544a == mutationBatch.f15544a && this.b.equals(mutationBatch.b) && this.c.equals(mutationBatch.c) && this.d.equals(mutationBatch.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f15544a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutationBatch(batchId=" + this.f15544a + ", localWriteTime=" + this.b + ", baseMutations=" + this.c + ", mutations=" + this.d + ')';
    }
}
