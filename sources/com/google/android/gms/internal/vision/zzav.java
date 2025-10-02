package com.google.android.gms.internal.vision;

import android.content.Context;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzav extends zzbr {
    private final Context zza;
    private final zzdf<zzcy<zzbe>> zzb;

    public zzav(Context context, @Nullable zzdf<zzcy<zzbe>> zzdfVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzdfVar;
    }

    public final boolean equals(Object obj) {
        zzdf<zzcy<zzbe>> zzdfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbr) {
            zzbr zzbrVar = (zzbr) obj;
            if (this.zza.equals(zzbrVar.zza()) && ((zzdfVar = this.zzb) != null ? zzdfVar.equals(zzbrVar.zzb()) : zzbrVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdf<zzcy<zzbe>> zzdfVar = this.zzb;
        return iHashCode ^ (zzdfVar == null ? 0 : zzdfVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 46);
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.vision.zzbr
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzbr
    @Nullable
    public final zzdf<zzcy<zzbe>> zzb() {
        return this.zzb;
    }
}
