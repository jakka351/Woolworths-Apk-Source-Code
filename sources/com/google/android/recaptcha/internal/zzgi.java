package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzgi implements zzgx {

    @NotNull
    public static final zzgi zza = new zzgi();

    private zzgi() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, zzce {
        if (zzueVarArr.length != 3) {
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
        Object objZza3 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e) {
            if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzce(4, 25, e);
            }
            throw new zzce(4, 22, e);
        }
    }
}
