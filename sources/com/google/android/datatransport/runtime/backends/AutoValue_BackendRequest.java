package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class AutoValue_BackendRequest extends BackendRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f14446a;
    public final byte[] b;

    public static final class Builder extends BackendRequest.Builder {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f14447a;
        public byte[] b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest a() {
            String str = this.f14447a == null ? " events" : "";
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f14447a, this.b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder b(ArrayList arrayList) {
            this.f14447a = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public AutoValue_BackendRequest(ArrayList arrayList, byte[] bArr) {
        this.f14446a = arrayList;
        this.b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final Iterable b() {
        return this.f14446a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final byte[] c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f14446a.equals(backendRequest.b())) {
            return Arrays.equals(this.b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).b : backendRequest.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14446a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f14446a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
