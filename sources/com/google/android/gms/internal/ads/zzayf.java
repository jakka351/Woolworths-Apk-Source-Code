package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzayf {
    private final String zza;

    @Nullable
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzayf(String str, VersionInfoParcel versionInfoParcel, String str2, @Nullable JSONObject jSONObject, boolean z, boolean z2) {
        this.zzd = versionInfoParcel.afmaVersion;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z2;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    @Nullable
    public final JSONObject zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zze;
    }
}
