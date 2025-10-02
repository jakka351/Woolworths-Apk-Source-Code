package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.constraintlayout.core.state.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class zzke extends zzkm {
    public zzke(zzkg zzkgVar, String str, Double d, boolean z) {
        super(zzkgVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", a.l(new StringBuilder(str.length() + 27 + string.length()), "Invalid double value for ", str, ": ", string));
        return null;
    }
}
