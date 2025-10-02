package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* loaded from: classes.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f15623a;
    public final String b;
    public final String c;
    public final TokenResult d;
    public final InstallationResponse.ResponseCode e;

    public static final class Builder extends InstallationResponse.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15624a;
        public String b;
        public String c;
        public TokenResult d;
    }

    public AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f15623a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenResult;
        this.e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String b() {
        return this.b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.ResponseCode d() {
        return this.e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String e() {
        return this.f15623a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f15623a;
        if (str == null) {
            if (installationResponse.e() != null) {
                return false;
            }
        } else if (!str.equals(installationResponse.e())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (installationResponse.b() != null) {
                return false;
            }
        } else if (!str2.equals(installationResponse.b())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (installationResponse.c() != null) {
                return false;
            }
        } else if (!str3.equals(installationResponse.c())) {
            return false;
        }
        TokenResult tokenResult = this.d;
        if (tokenResult == null) {
            if (installationResponse.a() != null) {
                return false;
            }
        } else if (!tokenResult.equals(installationResponse.a())) {
            return false;
        }
        InstallationResponse.ResponseCode responseCode = this.e;
        return responseCode == null ? installationResponse.d() == null : responseCode.equals(installationResponse.d());
    }

    public final int hashCode() {
        String str = this.f15623a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f15623a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
