package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class Mutation {

    /* renamed from: a, reason: collision with root package name */
    public final DocumentKey f15543a;
    public final Precondition b;
    public final ArrayList c;

    public Mutation(DocumentKey documentKey, Precondition precondition) {
        this(documentKey, precondition, new ArrayList());
    }

    public abstract FieldMask a(MutableDocument mutableDocument, FieldMask fieldMask, Timestamp timestamp);

    public abstract void b(MutableDocument mutableDocument, MutationResult mutationResult);

    public abstract FieldMask c();

    public final boolean d(Mutation mutation) {
        return this.f15543a.equals(mutation.f15543a) && this.b.equals(mutation.b);
    }

    public final int e() {
        return this.b.hashCode() + (this.f15543a.d.hashCode() * 31);
    }

    public final String f() {
        return "key=" + this.f15543a + ", precondition=" + this.b;
    }

    public final HashMap g(Timestamp timestamp, MutableDocument mutableDocument) {
        ArrayList arrayList = this.c;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FieldTransform fieldTransform = (FieldTransform) it.next();
            TransformOperation transformOperation = fieldTransform.b;
            FieldPath fieldPath = fieldTransform.f15542a;
            map.put(fieldPath, transformOperation.a(mutableDocument.e.e(fieldPath), timestamp));
        }
        return map;
    }

    public final HashMap h(MutableDocument mutableDocument, ArrayList arrayList) {
        ArrayList arrayList2 = this.c;
        HashMap map = new HashMap(arrayList2.size());
        Assert.b(arrayList2.size() == arrayList.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
        for (int i = 0; i < arrayList.size(); i++) {
            FieldTransform fieldTransform = (FieldTransform) arrayList2.get(i);
            TransformOperation transformOperation = fieldTransform.b;
            FieldPath fieldPath = fieldTransform.f15542a;
            map.put(fieldPath, transformOperation.b(mutableDocument.e.e(fieldPath), (Value) arrayList.get(i)));
        }
        return map;
    }

    public final void i(MutableDocument mutableDocument) {
        Assert.b(mutableDocument.f15535a.equals(this.f15543a), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public Mutation(DocumentKey documentKey, Precondition precondition, ArrayList arrayList) {
        this.f15543a = documentKey;
        this.b = precondition;
        this.c = arrayList;
    }
}
