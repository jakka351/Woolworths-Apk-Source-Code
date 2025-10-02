package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* loaded from: classes5.dex */
public final class zzaaq {
    private PhoneMultiFactorInfo zza;
    private final String zzb;

    @Nullable
    private final String zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final String zzf;

    @Nullable
    private final String zzg;

    @Nullable
    private final String zzh;
    private final boolean zzi;

    public zzaaq(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z3) {
        this.zza = phoneMultiFactorInfo;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
        this.zzi = z3;
    }

    public final long zza() {
        return this.zzd;
    }

    public final PhoneMultiFactorInfo zzb() {
        return this.zza;
    }

    @Nullable
    public final String zzc() {
        return this.zzh;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzb;
    }

    @Nullable
    public final String zzf() {
        return this.zzg;
    }

    @Nullable
    public final String zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zze;
    }

    public final boolean zzi() {
        return this.zzi;
    }
}
