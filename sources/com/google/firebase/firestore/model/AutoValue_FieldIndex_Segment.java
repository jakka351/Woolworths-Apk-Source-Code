package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;

/* loaded from: classes6.dex */
final class AutoValue_FieldIndex_Segment extends FieldIndex.Segment {
    public final FieldPath d;
    public final FieldIndex.Segment.Kind e;

    public AutoValue_FieldIndex_Segment(FieldPath fieldPath, FieldIndex.Segment.Kind kind) {
        if (fieldPath == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.d = fieldPath;
        this.e = kind;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.Segment
    public final FieldPath b() {
        return this.d;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.Segment
    public final FieldIndex.Segment.Kind c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex.Segment)) {
            return false;
        }
        FieldIndex.Segment segment = (FieldIndex.Segment) obj;
        return this.d.equals(segment.b()) && this.e.equals(segment.c());
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Segment{fieldPath=" + this.d + ", kind=" + this.e + "}";
    }
}
