package com.google.firebase.firestore.model.mutation;

import java.util.HashSet;

/* loaded from: classes6.dex */
public final class FieldMask {
    public static final FieldMask b = new FieldMask(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15541a;

    public FieldMask(HashSet hashSet) {
        this.f15541a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldMask.class != obj.getClass()) {
            return false;
        }
        return this.f15541a.equals(((FieldMask) obj).f15541a);
    }

    public final int hashCode() {
        return this.f15541a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f15541a.toString() + "}";
    }
}
