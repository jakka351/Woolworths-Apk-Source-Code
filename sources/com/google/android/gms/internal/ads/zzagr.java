package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzagr implements zzan {
    public final float zza;
    public final int zzb;

    public zzagr(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.zza == zzagrVar.zza && this.zzb == zzagrVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return android.support.v4.media.session.a.b(this.zza, 527, 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
