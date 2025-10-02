package com.google.firebase.firestore.model.mutation;

/* loaded from: classes6.dex */
final class AutoValue_Overlay extends Overlay {

    /* renamed from: a, reason: collision with root package name */
    public final int f15540a;
    public final Mutation b;

    public AutoValue_Overlay(int i, Mutation mutation) {
        this.f15540a = i;
        this.b = mutation;
    }

    @Override // com.google.firebase.firestore.model.mutation.Overlay
    public final int b() {
        return this.f15540a;
    }

    @Override // com.google.firebase.firestore.model.mutation.Overlay
    public final Mutation c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Overlay)) {
            return false;
        }
        Overlay overlay = (Overlay) obj;
        return this.f15540a == overlay.b() && this.b.equals(overlay.c());
    }

    public final int hashCode() {
        return ((this.f15540a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f15540a + ", mutation=" + this.b + "}";
    }
}
