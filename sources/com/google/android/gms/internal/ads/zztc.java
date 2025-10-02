package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zztc {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztc(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zztc.class) {
            zztc zztcVar = (zztc) obj;
            if (TextUtils.equals(this.zza, zztcVar.zza) && this.zzb == zztcVar.zzb && this.zzc == zztcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return YU.a.B(this.zza.hashCode() + 31, 31, true != this.zzb ? 1237 : 1231, 31) + (true != this.zzc ? 1237 : 1231);
    }
}
