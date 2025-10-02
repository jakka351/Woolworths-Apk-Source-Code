package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* loaded from: classes.dex */
final class AutoValue_TransportContext extends TransportContext {

    /* renamed from: a, reason: collision with root package name */
    public final String f14436a;
    public final byte[] b;
    public final Priority c;

    public static final class Builder extends TransportContext.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14437a;
        public byte[] b;
        public Priority c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext a() {
            String strConcat = this.f14437a == null ? " backendName" : "";
            if (this.c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_TransportContext(this.f14437a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f14437a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder d(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = priority;
            return this;
        }
    }

    public AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.f14436a = str;
        this.b = bArr;
        this.c = priority;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final String b() {
        return this.f14436a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final byte[] c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final Priority d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f14436a.equals(transportContext.b())) {
            return Arrays.equals(this.b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).b : transportContext.c()) && this.c.equals(transportContext.d());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14436a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
