package com.google.firebase.firestore.model;

import YU.a;
import com.google.firebase.Timestamp;

/* loaded from: classes6.dex */
public final class SnapshotVersion implements Comparable<SnapshotVersion> {
    public static final SnapshotVersion e = new SnapshotVersion(new Timestamp(0, 0));
    public final Timestamp d;

    public SnapshotVersion(Timestamp timestamp) {
        this.d = timestamp;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(SnapshotVersion snapshotVersion) {
        return this.d.compareTo(snapshotVersion.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SnapshotVersion) && this.d.compareTo(((SnapshotVersion) obj).d) == 0;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotVersion(seconds=");
        Timestamp timestamp = this.d;
        sb.append(timestamp.d);
        sb.append(", nanos=");
        return a.m(sb, timestamp.e, ")");
    }
}
