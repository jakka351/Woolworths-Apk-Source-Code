package com.google.firebase.crashlytics.internal.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/common/FirebaseInstallationId;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FirebaseInstallationId {

    /* renamed from: a, reason: collision with root package name */
    public final String f15277a;
    public final String b;

    public FirebaseInstallationId(String str, String str2) {
        this.f15277a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        return Intrinsics.c(this.f15277a, firebaseInstallationId.f15277a) && Intrinsics.c(this.b, firebaseInstallationId.b);
    }

    public final int hashCode() {
        String str = this.f15277a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f15277a);
        sb.append(", authToken=");
        return androidx.camera.core.impl.b.r(sb, this.b, ')');
    }
}
