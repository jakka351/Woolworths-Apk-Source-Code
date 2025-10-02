package com.google.android.datatransport.runtime;

import YU.a;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class AutoValue_EventInternal extends EventInternal {

    /* renamed from: a, reason: collision with root package name */
    public final String f14433a;
    public final Integer b;
    public final EncodedPayload c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public static final class Builder extends EventInternal.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14434a;
        public Integer b;
        public EncodedPayload c;
        public Long d;
        public Long e;
        public HashMap f;
        public Integer g;
        public String h;
        public byte[] i;
        public byte[] j;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal b() {
            String strG = this.f14434a == null ? " transportName" : "";
            if (this.c == null) {
                strG = strG.concat(" encodedPayload");
            }
            if (this.d == null) {
                strG = a.g(strG, " eventMillis");
            }
            if (this.e == null) {
                strG = a.g(strG, " uptimeMillis");
            }
            if (this.f == null) {
                strG = a.g(strG, " autoMetadata");
            }
            if (strG.isEmpty()) {
                return new AutoValue_EventInternal(this.f14434a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final Map c() {
            HashMap map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder d(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder e(EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder f(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder g(byte[] bArr) {
            this.i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder h(byte[] bArr) {
            this.j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder i(Integer num) {
            this.g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder j(String str) {
            this.h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder k(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f14434a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder l(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f14433a = str;
        this.b = num;
        this.c = encodedPayload;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Map c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer d() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final EncodedPayload e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (!this.f14433a.equals(eventInternal.l())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (eventInternal.d() != null) {
                return false;
            }
        } else if (!num.equals(eventInternal.d())) {
            return false;
        }
        if (!this.c.equals(eventInternal.e()) || this.d != eventInternal.f() || this.e != eventInternal.m() || !this.f.equals(eventInternal.c())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (eventInternal.j() != null) {
                return false;
            }
        } else if (!num2.equals(eventInternal.j())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (eventInternal.k() != null) {
                return false;
            }
        } else if (!str.equals(eventInternal.k())) {
            return false;
        }
        boolean z = eventInternal instanceof AutoValue_EventInternal;
        if (Arrays.equals(this.i, z ? ((AutoValue_EventInternal) eventInternal).i : eventInternal.g())) {
            return Arrays.equals(this.j, z ? ((AutoValue_EventInternal) eventInternal).j : eventInternal.h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long f() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] g() {
        return this.i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] h() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.f14433a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer j() {
        return this.g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String k() {
        return this.h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String l() {
        return this.f14433a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long m() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14433a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
