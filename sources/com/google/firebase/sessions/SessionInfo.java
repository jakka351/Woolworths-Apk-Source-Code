package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f15823a;
    public final String b;
    public final int c;
    public final long d;
    public final DataCollectionStatus e;
    public final String f;
    public final String g;

    public SessionInfo(String sessionId, String firstSessionId, int i, long j, DataCollectionStatus dataCollectionStatus, String str, String firebaseAuthenticationToken) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(firstSessionId, "firstSessionId");
        Intrinsics.h(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f15823a = sessionId;
        this.b = firstSessionId;
        this.c = i;
        this.d = j;
        this.e = dataCollectionStatus;
        this.f = str;
        this.g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return Intrinsics.c(this.f15823a, sessionInfo.f15823a) && Intrinsics.c(this.b, sessionInfo.b) && this.c == sessionInfo.c && this.d == sessionInfo.d && Intrinsics.c(this.e, sessionInfo.e) && Intrinsics.c(this.f, sessionInfo.f) && Intrinsics.c(this.g, sessionInfo.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + androidx.camera.core.impl.b.c((this.e.hashCode() + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.c(this.f15823a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f15823a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return androidx.camera.core.impl.b.r(sb, this.g, ')');
    }
}
