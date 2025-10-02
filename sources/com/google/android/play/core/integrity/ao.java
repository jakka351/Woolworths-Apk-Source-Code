package com.google.android.play.core.integrity;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f14720a;

    @Nullable
    private final Long b;

    @Nullable
    private final Object c = null;

    public /* synthetic */ ao(String str, Long l, Object obj, an anVar) {
        this.f14720a = str;
        this.b = l;
    }

    @ChecksSdkIntAtLeast
    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    @Nullable
    public final Long cloudProjectNumber() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f14720a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r3 = r5.b
            if (r3 != 0) goto L26
            java.lang.Long r1 = r1.cloudProjectNumber()
            if (r1 != 0) goto L24
        L22:
            r1 = r0
            goto L31
        L24:
            r1 = r2
            goto L31
        L26:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L24
            goto L22
        L31:
            boolean r6 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r6 == 0) goto L3f
            boolean r6 = a()
            if (r6 == 0) goto L3f
            if (r1 == 0) goto L3e
            return r0
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f14720a.hashCode() ^ 1000003;
        Long l = this.b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f14720a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f14720a + ", cloudProjectNumber=" + this.b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
