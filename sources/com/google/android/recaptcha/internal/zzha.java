package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzha implements zzgx {

    @NotNull
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] clsArrZzf = zzgdVar.zzc().zzf(ArraysKt.l0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e) {
            throw new zzce(6, 9, e);
        }
    }
}
