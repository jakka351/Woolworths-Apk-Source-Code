package com.google.android.gms.auth.api.identity;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;

/* loaded from: classes5.dex */
final class zbe extends ClearTokenRequest.Builder {
    private String zba;
    private String zbb;

    public zbe() {
    }

    @Override // com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder
    public final ClearTokenRequest build() {
        if (this.zba != null) {
            return new ClearTokenRequest(this.zba, this.zbb);
        }
        throw new IllegalStateException("Missing required properties: token");
    }

    @Override // com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder
    public final ClearTokenRequest.Builder setToken(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zba = str;
        return this;
    }

    @Override // com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder
    public final ClearTokenRequest.Builder zba(@Nullable String str) {
        this.zbb = str;
        return this;
    }

    public zbe(ClearTokenRequest clearTokenRequest) {
        this.zba = clearTokenRequest.getToken();
        this.zbb = clearTokenRequest.zba();
    }
}
