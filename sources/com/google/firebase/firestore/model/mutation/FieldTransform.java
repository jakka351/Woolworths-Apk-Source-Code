package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.FieldPath;

/* loaded from: classes6.dex */
public final class FieldTransform {

    /* renamed from: a, reason: collision with root package name */
    public final FieldPath f15542a;
    public final TransformOperation b;

    public FieldTransform(FieldPath fieldPath, TransformOperation transformOperation) {
        this.f15542a = fieldPath;
        this.b = transformOperation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldTransform.class != obj.getClass()) {
            return false;
        }
        FieldTransform fieldTransform = (FieldTransform) obj;
        if (this.f15542a.equals(fieldTransform.f15542a)) {
            return this.b.equals(fieldTransform.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15542a.hashCode() * 31);
    }
}
