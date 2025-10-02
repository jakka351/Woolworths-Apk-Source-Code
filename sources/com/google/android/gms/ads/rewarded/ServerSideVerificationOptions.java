package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        @NonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        @NonNull
        public Builder setCustomData(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setUserId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public final /* synthetic */ String zza() {
            return this.zza;
        }

        public final /* synthetic */ String zzb() {
            return this.zzb;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
    }

    @NonNull
    public String getCustomData() {
        return this.zzb;
    }

    @NonNull
    public String getUserId() {
        return this.zza;
    }
}
