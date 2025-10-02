package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.constraintlayout.core.state.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class zzkd extends zzkm {
    public zzkd(zzkg zzkgVar, String str, Boolean bool, boolean z) {
        super(zzkgVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzjg.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjg.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", a.l(new StringBuilder(str2.length() + 28 + string.length()), "Invalid boolean value for ", str2, ": ", string));
        return null;
    }
}
