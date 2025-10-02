package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* loaded from: classes.dex */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f14423a;
    public final NetworkConnectionInfo.MobileSubtype b;

    public static final class Builder extends NetworkConnectionInfo.Builder {

        /* renamed from: a, reason: collision with root package name */
        public NetworkConnectionInfo.NetworkType f14424a;
        public NetworkConnectionInfo.MobileSubtype b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo a() {
            return new AutoValue_NetworkConnectionInfo(this.f14424a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo.Builder b(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo.Builder c(NetworkConnectionInfo.NetworkType networkType) {
            this.f14424a = networkType;
            return this;
        }
    }

    public AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f14423a = networkType;
        this.b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.MobileSubtype b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.NetworkType c() {
        return this.f14423a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f14423a;
        if (networkType == null) {
            if (networkConnectionInfo.c() != null) {
                return false;
            }
        } else if (!networkType.equals(networkConnectionInfo.c())) {
            return false;
        }
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return mobileSubtype == null ? networkConnectionInfo.b() == null : mobileSubtype.equals(networkConnectionInfo.b());
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f14423a;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return (mobileSubtype != null ? mobileSubtype.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14423a + ", mobileSubtype=" + this.b + "}";
    }
}
