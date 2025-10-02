package com.google.android.datatransport.runtime.backends;

import android.support.v4.media.session.a;
import com.google.android.datatransport.runtime.backends.BackendResponse;

/* loaded from: classes.dex */
final class AutoValue_BackendResponse extends BackendResponse {

    /* renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f14448a;
    public final long b;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j) {
        this.f14448a = status;
        this.b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status c() {
        return this.f14448a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f14448a.equals(backendResponse.c()) && this.b == backendResponse.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f14448a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f14448a);
        sb.append(", nextRequestWaitMillis=");
        return a.l(this.b, "}", sb);
    }
}
