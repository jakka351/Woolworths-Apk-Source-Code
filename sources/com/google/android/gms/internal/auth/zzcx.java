package com.google.android.gms.internal.auth;

import YU.a;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbU = a.u("Invalid double value for ", this.zzc, ": ");
            sbU.append((String) obj);
            Log.e("PhenotypeFlag", sbU.toString());
            return null;
        }
    }
}
