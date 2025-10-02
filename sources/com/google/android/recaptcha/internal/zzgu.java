package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzgu implements zzgx {

    @NotNull
    public static final zzgu zza = new zzgu();

    private zzgu() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objZza = zzgdVar.zzh().zza((String) objZza);
            }
            zzgdVar.zzc().zze(i, Array.newInstance((Class<?>) zzgc.zza(objZza), iIntValue));
        } catch (Exception e) {
            throw new zzce(6, 21, e);
        }
    }
}
