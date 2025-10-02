package com.google.android.gms.internal.vision;

import android.util.Base64;
import android.util.Log;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzbm extends zzbi {
    private final /* synthetic */ zzbp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbm(zzbo zzboVar, String str, Object obj, boolean z, zzbp zzbpVar) {
        super(zzboVar, str, obj, true, null);
        this.zza = zzbpVar;
    }

    @Override // com.google.android.gms.internal.vision.zzbi
    public final Object zza(Object obj) {
        if (obj instanceof String) {
            try {
                return this.zza.zza(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String strZzb = zzb();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + c.f(27, strZzb));
        sb.append("Invalid byte[] value for ");
        sb.append(strZzb);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
