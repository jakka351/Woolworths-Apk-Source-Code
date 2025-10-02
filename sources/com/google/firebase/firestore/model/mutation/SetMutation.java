package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class SetMutation extends Mutation {
    public final ObjectValue d;

    public SetMutation(DocumentKey documentKey, ObjectValue objectValue, Precondition precondition, ArrayList arrayList) {
        super(documentKey, precondition, arrayList);
        this.d = objectValue;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask a(MutableDocument mutableDocument, FieldMask fieldMask, Timestamp timestamp) {
        i(mutableDocument);
        if (!this.b.a(mutableDocument)) {
            return fieldMask;
        }
        HashMap mapG = g(timestamp, mutableDocument);
        ObjectValue objectValue = new ObjectValue(this.d.b());
        objectValue.f(mapG);
        mutableDocument.g(mutableDocument.c, objectValue);
        mutableDocument.q();
        return null;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final void b(MutableDocument mutableDocument, MutationResult mutationResult) {
        i(mutableDocument);
        ObjectValue objectValue = new ObjectValue(this.d.b());
        objectValue.f(h(mutableDocument, mutationResult.b));
        mutableDocument.g(mutationResult.f15546a, objectValue);
        mutableDocument.p();
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SetMutation.class != obj.getClass()) {
            return false;
        }
        SetMutation setMutation = (SetMutation) obj;
        return d(setMutation) && this.d.equals(setMutation.d) && this.c.equals(setMutation.c);
    }

    public final int hashCode() {
        return this.d.hashCode() + (e() * 31);
    }

    public final String toString() {
        return "SetMutation{" + f() + ", value=" + this.d + "}";
    }
}
