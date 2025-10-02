package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes5.dex */
public class PreloadConfiguration {
    private final String zza;

    @Nullable
    @Deprecated
    private final AdFormat zzb;
    private final AdRequest zzc;
    private final int zzd;

    public static class Builder {
        private final String zza;
        private AdFormat zzb;
        private AdRequest zzc = new AdRequest.Builder().build();
        private int zzd;

        public Builder(@NonNull String str) {
            this.zza = str;
        }

        @NonNull
        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, null);
        }

        @NonNull
        public Builder setAdRequest(@NonNull AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        @NonNull
        public Builder setBufferSize(int i) {
            this.zzd = i;
            return this;
        }

        public final /* synthetic */ String zza() {
            return this.zza;
        }

        public final /* synthetic */ AdFormat zzb() {
            return this.zzb;
        }

        public final /* synthetic */ AdRequest zzc() {
            return this.zzc;
        }

        public final /* synthetic */ int zzd() {
            return this.zzd;
        }

        @Deprecated
        public Builder(@NonNull String str, @NonNull AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
        this.zzc = builder.zzc();
        this.zzd = builder.zzd();
    }

    @NonNull
    @Deprecated
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? AdFormat.INTERSTITIAL : adFormat;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.zzc;
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
