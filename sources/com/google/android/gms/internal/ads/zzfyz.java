package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
final class zzfyz extends zzfzq {
    public zzfyz(zzarw zzarwVar, zzfym zzfymVar, zzgea zzgeaVar) {
        super("K2vlpfvzMof/Fkhw5ooFQnqSkLCXl5/h8k5w3bn3Vpx1DRFKnIigf1DgNQQROLBI", "cLJFUzyZbXRBMPdRbtmRuYPbuG1CYlxml0Db6Duicxg=", zzarwVar, zzfymVar, zzgeaVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzarwVar) {
            zzarwVar.zza("E");
            zzarwVar.zzB(0L);
            zzarwVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzarwVar) {
            zzarwVar.zza((String) objArr[0]);
            zzarwVar.zzB(((Long) objArr[1]).longValue());
            zzarwVar.zzV((String) objArr[2]);
        }
    }
}
