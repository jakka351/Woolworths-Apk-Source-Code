package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;

/* loaded from: classes6.dex */
final class AutoValue_FieldIndex_IndexState extends FieldIndex.IndexState {

    /* renamed from: a, reason: collision with root package name */
    public final long f15532a;
    public final FieldIndex.IndexOffset b;

    public AutoValue_FieldIndex_IndexState(long j, FieldIndex.IndexOffset indexOffset) {
        this.f15532a = j;
        if (indexOffset == null) {
            throw new NullPointerException("Null offset");
        }
        this.b = indexOffset;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexState
    public final FieldIndex.IndexOffset c() {
        return this.b;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexState
    public final long d() {
        return this.f15532a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex.IndexState)) {
            return false;
        }
        FieldIndex.IndexState indexState = (FieldIndex.IndexState) obj;
        return this.f15532a == indexState.d() && this.b.equals(indexState.c());
    }

    public final int hashCode() {
        long j = this.f15532a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f15532a + ", offset=" + this.b + "}";
    }
}
