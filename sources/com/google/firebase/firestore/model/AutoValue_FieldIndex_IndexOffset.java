package com.google.firebase.firestore.model;

import YU.a;
import com.google.firebase.firestore.model.FieldIndex;

/* loaded from: classes6.dex */
final class AutoValue_FieldIndex_IndexOffset extends FieldIndex.IndexOffset {
    public final SnapshotVersion f;
    public final DocumentKey g;
    public final int h;

    public AutoValue_FieldIndex_IndexOffset(SnapshotVersion snapshotVersion, DocumentKey documentKey, int i) {
        if (snapshotVersion == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f = snapshotVersion;
        if (documentKey == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.g = documentKey;
        this.h = i;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    public final DocumentKey e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex.IndexOffset)) {
            return false;
        }
        FieldIndex.IndexOffset indexOffset = (FieldIndex.IndexOffset) obj;
        return this.f.equals(indexOffset.l()) && this.g.equals(indexOffset.e()) && this.h == indexOffset.f();
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    public final int f() {
        return this.h;
    }

    public final int hashCode() {
        return ((((this.f.d.hashCode() ^ 1000003) * 1000003) ^ this.g.d.hashCode()) * 1000003) ^ this.h;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    public final SnapshotVersion l() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexOffset{readTime=");
        sb.append(this.f);
        sb.append(", documentKey=");
        sb.append(this.g);
        sb.append(", largestBatchId=");
        return a.m(sb, this.h, "}");
    }
}
