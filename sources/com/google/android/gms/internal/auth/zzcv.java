package com.google.android.gms.internal.auth;

import YU.a;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbU = a.u("Invalid long value for ", this.zzc, ": ");
            sbU.append((String) obj);
            Log.e("PhenotypeFlag", sbU.toString());
            return null;
        }
    }
}
