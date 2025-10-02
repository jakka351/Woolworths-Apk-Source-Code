package com.google.android.datatransport.cct.internal;

import android.support.v4.media.session.a;

/* loaded from: classes.dex */
final class AutoValue_LogResponse extends LogResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14422a;

    public AutoValue_LogResponse(long j) {
        this.f14422a = j;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public final long b() {
        return this.f14422a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f14422a == ((LogResponse) obj).b();
    }

    public final int hashCode() {
        long j = this.f14422a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return a.l(this.f14422a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
