package com.google.firebase.firestore;

/* loaded from: classes6.dex */
public class SnapshotMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15429a;
    public final boolean b;

    public SnapshotMetadata(boolean z, boolean z2) {
        this.f15429a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
        return this.f15429a == snapshotMetadata.f15429a && this.b == snapshotMetadata.b;
    }

    public final int hashCode() {
        return ((this.f15429a ? 1 : 0) * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotMetadata{hasPendingWrites=");
        sb.append(this.f15429a);
        sb.append(", isFromCache=");
        return androidx.camera.core.impl.b.s(sb, this.b, '}');
    }
}
