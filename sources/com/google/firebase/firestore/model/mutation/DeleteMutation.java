package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
public final class DeleteMutation extends Mutation {
    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask a(MutableDocument mutableDocument, FieldMask fieldMask, Timestamp timestamp) {
        i(mutableDocument);
        if (!this.b.a(mutableDocument)) {
            return fieldMask;
        }
        mutableDocument.h(mutableDocument.c);
        mutableDocument.q();
        return null;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final void b(MutableDocument mutableDocument, MutationResult mutationResult) {
        i(mutableDocument);
        Assert.b(mutationResult.b.isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        mutableDocument.h(mutationResult.f15546a);
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
        if (obj == null || DeleteMutation.class != obj.getClass()) {
            return false;
        }
        return d((DeleteMutation) obj);
    }

    public final int hashCode() {
        return e();
    }

    public final String toString() {
        return "DeleteMutation{" + f() + "}";
    }
}
