package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public abstract class N6 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(android.content.Context r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r1 = r5.getPackageName()
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            android.content.pm.SigningInfo r0 = r0.signingInfo
            r1 = 0
            if (r0 == 0) goto L3b
            boolean r2 = r0.hasMultipleSigners()
            if (r2 == 0) goto L23
            android.content.pm.Signature[] r0 = r0.getApkContentsSigners()
            goto L3c
        L23:
            android.content.pm.Signature[] r0 = r0.getSigningCertificateHistory()
            java.lang.String r2 = "signingInfo.signingCertificateHistory"
            kotlin.jvm.internal.Intrinsics.g(r0, r2)
            java.lang.Object r0 = kotlin.collections.ArraysKt.H(r0)
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            if (r0 == 0) goto L3b
            r2 = 1
            android.content.pm.Signature[] r2 = new android.content.pm.Signature[r2]
            r2[r1] = r0
            r0 = r2
            goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 != 0) goto L52
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            r2 = 64
            android.content.pm.PackageInfo r5 = r0.getPackageInfo(r5, r2)
            android.content.pm.Signature[] r0 = r5.signatures
            if (r0 != 0) goto L52
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r1]
        L52:
            java.util.ArrayList r5 = kotlin.collections.ArraysKt.F(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L65:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r5.next()
            android.content.pm.Signature r1 = (android.content.pm.Signature) r1
            java.lang.String r2 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            byte[] r1 = r1.toByteArray()
            byte[] r1 = r2.digest(r1)
            java.lang.String r2 = "getInstance(\"SHA-1\").dig…(signature.toByteArray())"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            com.scandit.datacapture.core.M6 r2 = com.scandit.datacapture.core.M6.f18346a
            java.lang.String r3 = ""
            r4 = 30
            java.lang.String r1 = kotlin.collections.ArraysKt.T(r1, r3, r2, r4)
            r0.add(r1)
            goto L65
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.N6.a(android.content.Context):java.util.ArrayList");
    }
}
