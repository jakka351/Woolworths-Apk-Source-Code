package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;
import java.util.List;

/* loaded from: classes6.dex */
final class AutoValue_FieldIndex extends FieldIndex {
    public final int b;
    public final String c;
    public final List d;
    public final FieldIndex.IndexState e;

    public AutoValue_FieldIndex(int i, String str, List list, FieldIndex.IndexState indexState) {
        this.b = i;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.c = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.d = list;
        if (indexState == null) {
            throw new NullPointerException("Null indexState");
        }
        this.e = indexState;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex)) {
            return false;
        }
        FieldIndex fieldIndex = (FieldIndex) obj;
        return this.b == fieldIndex.e() && this.c.equals(fieldIndex.c()) && this.d.equals(fieldIndex.g()) && this.e.equals(fieldIndex.f());
    }

    @Override // com.google.firebase.firestore.model.FieldIndex
    public final FieldIndex.IndexState f() {
        return this.e;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex
    public final List g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.b + ", collectionGroup=" + this.c + ", segments=" + this.d + ", indexState=" + this.e + "}";
    }
}
