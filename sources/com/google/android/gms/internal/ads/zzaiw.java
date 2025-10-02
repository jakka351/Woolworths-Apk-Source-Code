package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzaiw implements zzadz {
    public final int zza;
    public final zzgnc zzb;

    public zzaiw(int i, @Nullable int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzgnc.zzb(iArr) : zzgnc.zza();
    }

    public final String toString() {
        zzgnc zzgncVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgncVar.zzc());
        for (int i = 0; i < zzgncVar.zzc(); i++) {
            arrayList.add(zzeo.zzx(zzgncVar.zzd(i)));
        }
        String strZzx = zzeo.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(strZzx.length() + 37, 1, string));
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzx);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
