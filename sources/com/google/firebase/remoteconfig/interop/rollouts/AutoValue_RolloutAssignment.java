package com.google.firebase.remoteconfig.interop.rollouts;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

/* loaded from: classes6.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public static final class Builder extends RolloutAssignment.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15781a;
        public String b;
        public String c;
        public String d;
        public long e;
        public byte f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment a() {
            if (this.f == 1 && this.f15781a != null && this.b != null && this.c != null && this.d != null) {
                return new AutoValue_RolloutAssignment(this.f15781a, this.b, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15781a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            if (this.c == null) {
                sb.append(" parameterKey");
            }
            if (this.d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder c(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f15781a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder e(long j) {
            this.e = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.b = str;
            return this;
        }
    }

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String b() {
        return this.d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String c() {
        return this.e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String d() {
        return this.b;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.b.equals(rolloutAssignment.d()) && this.c.equals(rolloutAssignment.f()) && this.d.equals(rolloutAssignment.b()) && this.e.equals(rolloutAssignment.c()) && this.f == rolloutAssignment.e();
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return a.l(this.f, "}", sb);
    }
}
