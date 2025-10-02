package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.protobuf.ByteString;

/* loaded from: classes6.dex */
public final class TargetChange {

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f15583a;
    public final boolean b;
    public final ImmutableSortedSet c;
    public final ImmutableSortedSet d;
    public final ImmutableSortedSet e;

    public TargetChange(ByteString byteString, boolean z, ImmutableSortedSet immutableSortedSet, ImmutableSortedSet immutableSortedSet2, ImmutableSortedSet immutableSortedSet3) {
        this.f15583a = byteString;
        this.b = z;
        this.c = immutableSortedSet;
        this.d = immutableSortedSet2;
        this.e = immutableSortedSet3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetChange.class != obj.getClass()) {
            return false;
        }
        TargetChange targetChange = (TargetChange) obj;
        if (this.b == targetChange.b && this.f15583a.equals(targetChange.f15583a) && this.c.equals(targetChange.c) && this.d.equals(targetChange.d)) {
            return this.e.equals(targetChange.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.d.hashCode() + ((this.d.d.hashCode() + ((this.c.d.hashCode() + (((this.f15583a.hashCode() * 31) + (this.b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
