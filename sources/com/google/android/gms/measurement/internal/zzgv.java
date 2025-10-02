package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.state.a;

/* loaded from: classes.dex */
public final class zzgv {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public zzgv(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzgv zza(zzbg zzbgVar) {
        return new zzgv(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zzd.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        a.B(sb, "origin=", str, ",name=", str2);
        return YU.a.o(sb, ",params=", string);
    }

    public final zzbg zzb() {
        return new zzbg(this.zza, new zzbe(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
