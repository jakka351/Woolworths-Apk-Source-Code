package com.google.android.gms.internal.measurement;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.zza.add(zzbk.AND);
        this.zza.add(zzbk.NOT);
        this.zza.add(zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            zzao zzaoVarZza = zzgVar.zza((zzao) c.i(zzbk.AND, 2, list, 0));
            return zzaoVarZza.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzaoVarZza;
        }
        if (iOrdinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zza((zzao) c.i(zzbk.NOT, 1, list, 0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return zzb(str);
        }
        zzao zzaoVarZza2 = zzgVar.zza((zzao) c.i(zzbk.OR, 2, list, 0));
        return !zzaoVarZza2.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzaoVarZza2;
    }
}
