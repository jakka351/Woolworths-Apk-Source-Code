package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.WatchStream;
import com.google.protobuf.ByteString;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class TargetData {

    /* renamed from: a, reason: collision with root package name */
    public final Target f15522a;
    public final int b;
    public final long c;
    public final QueryPurpose d;
    public final SnapshotVersion e;
    public final SnapshotVersion f;
    public final ByteString g;
    public final Integer h;

    public TargetData(Target target, int i, long j, QueryPurpose queryPurpose, SnapshotVersion snapshotVersion, SnapshotVersion snapshotVersion2, ByteString byteString, Integer num) {
        target.getClass();
        this.f15522a = target;
        this.b = i;
        this.c = j;
        this.f = snapshotVersion2;
        this.d = queryPurpose;
        snapshotVersion.getClass();
        this.e = snapshotVersion;
        byteString.getClass();
        this.g = byteString;
        this.h = num;
    }

    public final TargetData a(ByteString byteString, SnapshotVersion snapshotVersion) {
        return new TargetData(this.f15522a, this.b, this.c, this.d, snapshotVersion, this.f, byteString, null);
    }

    public final TargetData b(long j) {
        return new TargetData(this.f15522a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TargetData.class == obj.getClass()) {
            TargetData targetData = (TargetData) obj;
            if (this.f15522a.equals(targetData.f15522a) && this.b == targetData.b && this.c == targetData.c && this.d.equals(targetData.d) && this.e.equals(targetData.e) && this.f.equals(targetData.f) && this.g.equals(targetData.g) && Objects.equals(this.h, targetData.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.h) + ((this.g.hashCode() + ((this.f.d.hashCode() + ((this.e.d.hashCode() + ((this.d.hashCode() + (((((this.f15522a.hashCode() * 31) + this.b) * 31) + ((int) this.c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f15522a + ", targetId=" + this.b + ", sequenceNumber=" + this.c + ", purpose=" + this.d + ", snapshotVersion=" + this.e + ", lastLimboFreeSnapshotVersion=" + this.f + ", resumeToken=" + this.g + ", expectedCount=" + this.h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TargetData(Target target, int i, long j, QueryPurpose queryPurpose) {
        SnapshotVersion snapshotVersion = SnapshotVersion.e;
        this(target, i, j, queryPurpose, snapshotVersion, snapshotVersion, WatchStream.t, null);
    }
}
