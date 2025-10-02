package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzadt {
    public final zzadw zza;
    public final zzadw zzb;

    public zzadt(zzadw zzadwVar, zzadw zzadwVar2) {
        this.zza = zzadwVar;
        this.zzb = zzadwVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadtVar = (zzadt) obj;
            if (this.zza.equals(zzadtVar.zza) && this.zzb.equals(zzadtVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzadw zzadwVar = this.zza;
        zzadw zzadwVar2 = this.zzb;
        String string = zzadwVar.toString();
        String strConcat = zzadwVar.equals(zzadwVar2) ? "" : ", ".concat(zzadwVar2.toString());
        return androidx.constraintlayout.core.state.a.l(new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}
