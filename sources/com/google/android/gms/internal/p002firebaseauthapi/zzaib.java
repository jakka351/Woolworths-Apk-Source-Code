package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzaib {

    @Nullable
    private String zza;

    @Nullable
    private String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;

    @Nullable
    private String zze;

    @Nullable
    private String zzf;

    @Nullable
    private String zzg;

    public zzaib() {
    }

    @Nullable
    public final Uri zza() {
        if (TextUtils.isEmpty(this.zzc)) {
            return null;
        }
        return Uri.parse(this.zzc);
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zzg;
    }

    @Nullable
    public final String zzd() {
        return this.zza;
    }

    @Nullable
    public final String zze() {
        return this.zzf;
    }

    @Nullable
    public final String zzf() {
        return this.zzd;
    }

    @Nullable
    public final String zzg() {
        return this.zze;
    }

    public zzaib(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = null;
        this.zzf = str6;
        this.zzg = str7;
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
