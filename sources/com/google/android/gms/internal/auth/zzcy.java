package com.google.android.gms.internal.auth;

import YU.a;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhs.zzp(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sbU = a.u("Invalid byte[] value for ", this.zzc, ": ");
            sbU.append((String) obj);
            Log.e("PhenotypeFlag", sbU.toString());
            return null;
        }
    }
}
