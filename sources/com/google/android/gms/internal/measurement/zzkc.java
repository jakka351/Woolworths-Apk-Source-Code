package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.constraintlayout.core.state.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class zzkc extends zzkm {
    public zzkc(zzkg zzkgVar, String str, Long l, boolean z) {
        super(zzkgVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", a.l(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
        return null;
    }
}
