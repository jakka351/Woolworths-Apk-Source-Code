package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;

/* loaded from: classes5.dex */
public final class zzaap {
    private final Status zza;
    private final zze zzb;
    private final String zzc;
    private final String zzd;

    @SafeParcelable.Constructor
    public zzaap(Status status, zze zzeVar, String str, @Nullable String str2) {
        this.zza = status;
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final Status zza() {
        return this.zza;
    }

    public final zze zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
