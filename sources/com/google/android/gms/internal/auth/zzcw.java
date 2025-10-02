package com.google.android.gms.internal.auth;

import YU.a;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbU = a.u("Invalid boolean value for ", this.zzc, ": ");
        sbU.append((String) obj);
        Log.e("PhenotypeFlag", sbU.toString());
        return null;
    }
}
