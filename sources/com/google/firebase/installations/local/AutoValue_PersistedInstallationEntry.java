package com.google.firebase.installations.local;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
    public final String b;
    public final PersistedInstallation.RegistrationStatus c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public static final class Builder extends PersistedInstallationEntry.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15619a;
        public PersistedInstallation.RegistrationStatus b;
        public String c;
        public String d;
        public long e;
        public long f;
        public String g;
        public byte h;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry a() {
            if (this.h == 3 && this.b != null) {
                return new AutoValue_PersistedInstallationEntry(this.f15619a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" registrationStatus");
            }
            if ((this.h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder c(long j) {
            this.e = j;
            this.h = (byte) (this.h | 1);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder d(String str) {
            this.f15619a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder e(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder f(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder g(long j) {
            this.f = j;
            this.h = (byte) (this.h | 2);
            return this;
        }
    }

    public AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = registrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long b() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String d() {
        return this.h;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str = this.b;
        if (str == null) {
            if (persistedInstallationEntry.c() != null) {
                return false;
            }
        } else if (!str.equals(persistedInstallationEntry.c())) {
            return false;
        }
        if (!this.c.equals(persistedInstallationEntry.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (persistedInstallationEntry.a() != null) {
                return false;
            }
        } else if (!str2.equals(persistedInstallationEntry.a())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (persistedInstallationEntry.e() != null) {
                return false;
            }
        } else if (!str3.equals(persistedInstallationEntry.e())) {
            return false;
        }
        if (this.f != persistedInstallationEntry.b() || this.g != persistedInstallationEntry.g()) {
            return false;
        }
        String str4 = this.h;
        return str4 == null ? persistedInstallationEntry.d() == null : str4.equals(persistedInstallationEntry.d());
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallation.RegistrationStatus f() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long g() {
        return this.g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallationEntry.Builder h() {
        Builder builder = new Builder();
        builder.f15619a = c();
        builder.b = f();
        builder.c = a();
        builder.d = e();
        builder.e = b();
        builder.f = g();
        builder.g = d();
        builder.h = (byte) 3;
        return builder;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return a.o(sb, this.h, "}");
    }
}
