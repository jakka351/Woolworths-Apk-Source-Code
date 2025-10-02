package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes6.dex */
final class AutoValue_TokenResult extends TokenResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f15625a;
    public final long b;
    public final TokenResult.ResponseCode c;

    public static final class Builder extends TokenResult.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15626a;
        public long b;
        public TokenResult.ResponseCode c;
        public byte d;

        public final TokenResult a() {
            if (this.d == 1) {
                return new AutoValue_TokenResult(this.f15626a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        public final TokenResult.Builder b(TokenResult.ResponseCode responseCode) {
            this.c = responseCode;
            return this;
        }

        public final TokenResult.Builder c(String str) {
            this.f15626a = str;
            return this;
        }

        public final TokenResult.Builder d(long j) {
            this.b = j;
            this.d = (byte) (this.d | 1);
            return this;
        }
    }

    public AutoValue_TokenResult(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f15625a = str;
        this.b = j;
        this.c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode a() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String b() {
        return this.f15625a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f15625a;
        if (str == null) {
            if (tokenResult.b() != null) {
                return false;
            }
        } else if (!str.equals(tokenResult.b())) {
            return false;
        }
        if (this.b != tokenResult.c()) {
            return false;
        }
        TokenResult.ResponseCode responseCode = this.c;
        return responseCode == null ? tokenResult.a() == null : responseCode.equals(tokenResult.a());
    }

    public final int hashCode() {
        String str = this.f15625a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f15625a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
