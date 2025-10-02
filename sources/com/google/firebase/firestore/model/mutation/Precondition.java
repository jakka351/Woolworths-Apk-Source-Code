package com.google.firebase.firestore.model.mutation;

import androidx.compose.ui.input.pointer.a;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
public final class Precondition {
    public static final Precondition c = new Precondition(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotVersion f15548a;
    public final Boolean b;

    public Precondition(SnapshotVersion snapshotVersion, Boolean bool) {
        Assert.b(snapshotVersion == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f15548a = snapshotVersion;
        this.b = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.firebase.firestore.model.MutableDocument r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.google.firebase.firestore.model.SnapshotVersion r2 = r4.f15548a
            if (r2 == 0) goto L15
            boolean r3 = r5.b()
            if (r3 == 0) goto L24
            com.google.firebase.firestore.model.SnapshotVersion r5 = r5.c
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L24
            goto L23
        L15:
            java.lang.Boolean r3 = r4.b
            if (r3 == 0) goto L25
            boolean r2 = r3.booleanValue()
            boolean r5 = r5.b()
            if (r2 != r5) goto L24
        L23:
            return r1
        L24:
            return r0
        L25:
            if (r2 != 0) goto L2b
            if (r3 != 0) goto L2b
            r5 = r1
            goto L2c
        L2b:
            r5 = r0
        L2c:
            java.lang.String r2 = "Precondition should be empty"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.firebase.firestore.util.Assert.b(r5, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.mutation.Precondition.a(com.google.firebase.firestore.model.MutableDocument):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Precondition.class == obj.getClass()) {
            Precondition precondition = (Precondition) obj;
            Boolean bool = precondition.b;
            SnapshotVersion snapshotVersion = precondition.f15548a;
            SnapshotVersion snapshotVersion2 = this.f15548a;
            if (snapshotVersion2 == null ? snapshotVersion != null : !snapshotVersion2.equals(snapshotVersion)) {
                return false;
            }
            Boolean bool2 = this.b;
            if (bool2 != null) {
                return bool2.equals(bool);
            }
            if (bool == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        SnapshotVersion snapshotVersion = this.f15548a;
        int iHashCode = (snapshotVersion != null ? snapshotVersion.d.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.b;
        SnapshotVersion snapshotVersion = this.f15548a;
        if (snapshotVersion == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (snapshotVersion != null) {
            return "Precondition{updateTime=" + snapshotVersion + "}";
        }
        if (bool != null) {
            return a.k(bool, "Precondition{exists=", "}");
        }
        Assert.a("Invalid Precondition", new Object[0]);
        throw null;
    }
}
