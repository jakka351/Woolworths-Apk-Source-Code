package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
public final class VerifyMutation extends Mutation {
    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask a(MutableDocument mutableDocument, FieldMask fieldMask, Timestamp timestamp) {
        Assert.a("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final void b(MutableDocument mutableDocument, MutationResult mutationResult) {
        Assert.a("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public final FieldMask c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VerifyMutation.class != obj.getClass()) {
            return false;
        }
        return d((VerifyMutation) obj);
    }

    public final int hashCode() {
        return e();
    }

    public final String toString() {
        return "VerifyMutation{" + f() + "}";
    }
}
