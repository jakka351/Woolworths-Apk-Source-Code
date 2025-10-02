package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

/* loaded from: classes6.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f15609a;
    public final long b;
    public final long c;

    public static final class Builder extends InstallationTokenResult.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15610a;
        public Long b;
        public Long c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult a() {
            String strG = this.f15610a == null ? " token" : "";
            if (this.b == null) {
                strG = strG.concat(" tokenExpirationTimestamp");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " tokenCreationTimestamp");
            }
            if (strG.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.f15610a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f15610a = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.f15609a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final String b() {
        return this.f15609a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f15609a.equals(installationTokenResult.b()) && this.b == installationTokenResult.d() && this.c == installationTokenResult.c();
    }

    public final int hashCode() {
        int iHashCode = (this.f15609a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f15609a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return android.support.v4.media.session.a.l(this.c, "}", sb);
    }
}
