package com.google.android.datatransport.cct.internal;

import android.support.v4.media.session.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14407a;

    public AutoValue_BatchedLogRequest(ArrayList arrayList) {
        this.f14407a = arrayList;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public final List b() {
        return this.f14407a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f14407a.equals(((BatchedLogRequest) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f14407a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.q("}", new StringBuilder("BatchedLogRequest{logRequests="), this.f14407a);
    }
}
