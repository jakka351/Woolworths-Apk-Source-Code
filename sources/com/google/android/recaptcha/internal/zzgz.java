package com.google.android.recaptcha.internal;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzgz implements zzgx {

    @NotNull
    public static final zzgz zza = new zzgz();

    private zzgz() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        try {
            if (objZza instanceof String) {
                objZza = zzgdVar.zzh().zza((String) objZza);
            }
            zzgdVar.zzc().zze(i, zzgc.zza(objZza));
        } catch (zzce e) {
            throw e;
        } catch (Exception e2) {
            throw new zzce(6, 8, e2);
        }
    }
}
