package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class PatchMutation extends Mutation {
    public final ObjectValue d;
    public final FieldMask e;

    public PatchMutation(DocumentKey documentKey, ObjectValue objectValue, FieldMask fieldMask, Precondition precondition, ArrayList arrayList) {
        super(documentKey, precondition, arrayList);
        this.d = objectValue;
        this.e = fieldMask;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask a(MutableDocument mutableDocument, FieldMask fieldMask, Timestamp timestamp) {
        i(mutableDocument);
        if (!this.b.a(mutableDocument)) {
            return fieldMask;
        }
        HashMap mapG = g(timestamp, mutableDocument);
        HashMap mapJ = j();
        ObjectValue objectValue = mutableDocument.e;
        objectValue.f(mapJ);
        objectValue.f(mapG);
        mutableDocument.g(mutableDocument.c, mutableDocument.e);
        mutableDocument.q();
        if (fieldMask == null) {
            return null;
        }
        HashSet hashSet = new HashSet(fieldMask.f15541a);
        hashSet.addAll(this.e.f15541a);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(((FieldTransform) it.next()).f15542a);
        }
        hashSet.addAll(arrayList);
        return new FieldMask(hashSet);
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final void b(MutableDocument mutableDocument, MutationResult mutationResult) {
        i(mutableDocument);
        if (!this.b.a(mutableDocument)) {
            mutableDocument.i(mutationResult.f15546a);
            return;
        }
        HashMap mapH = h(mutableDocument, mutationResult.b);
        ObjectValue objectValue = mutableDocument.e;
        objectValue.f(j());
        objectValue.f(mapH);
        mutableDocument.g(mutationResult.f15546a, mutableDocument.e);
        mutableDocument.p();
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PatchMutation.class != obj.getClass()) {
            return false;
        }
        PatchMutation patchMutation = (PatchMutation) obj;
        return d(patchMutation) && this.d.equals(patchMutation.d) && this.c.equals(patchMutation.c);
    }

    public final int hashCode() {
        return this.d.hashCode() + (e() * 31);
    }

    public final HashMap j() {
        HashMap map = new HashMap();
        Iterator it = this.e.f15541a.iterator();
        while (it.hasNext()) {
            FieldPath fieldPath = (FieldPath) it.next();
            if (!fieldPath.l()) {
                map.put(fieldPath, this.d.e(fieldPath));
            }
        }
        return map;
    }

    public final String toString() {
        return "PatchMutation{" + f() + ", mask=" + this.e + ", value=" + this.d + "}";
    }
}
