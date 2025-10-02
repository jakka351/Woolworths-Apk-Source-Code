package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* loaded from: classes.dex */
final class AutoValue_ClientInfo extends ClientInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f14408a;
    public final AndroidClientInfo b;

    public static final class Builder extends ClientInfo.Builder {

        /* renamed from: a, reason: collision with root package name */
        public ClientInfo.ClientType f14409a;
        public AndroidClientInfo b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo a() {
            return new AutoValue_ClientInfo(this.f14409a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder b(AndroidClientInfo androidClientInfo) {
            this.b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder c() {
            this.f14409a = ClientInfo.ClientType.d;
            return this;
        }
    }

    public AutoValue_ClientInfo(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f14408a = clientType;
        this.b = androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final AndroidClientInfo b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType c() {
        return this.f14408a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f14408a;
        if (clientType == null) {
            if (clientInfo.c() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.c())) {
            return false;
        }
        AndroidClientInfo androidClientInfo = this.b;
        return androidClientInfo == null ? clientInfo.b() == null : androidClientInfo.equals(clientInfo.b());
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f14408a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.b;
        return (androidClientInfo != null ? androidClientInfo.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f14408a + ", androidClientInfo=" + this.b + "}";
    }
}
