package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
final class zzfyt extends zzfzq {
    private final Activity zza;
    private final View zzb;

    public zzfyt(zzarw zzarwVar, zzfym zzfymVar, View view, Activity activity, zzgea zzgeaVar) {
        super("4B7vnMQm97gtfYCN8yumUNsSm+Z7/sMpw1b42iir2AzlNgWprThRkINsRaLbaNhi", "vUVK3XzwCmqCaraATX3abEiF/IUJoPC7bOtgDKtr95Q=", zzarwVar, zzfymVar, zzgeaVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzarwVar) {
            zzarwVar.zzS(((Long) objArr[0]).longValue());
            zzarwVar.zzT(((Long) objArr[1]).longValue());
            zzarwVar.zzU((String) objArr[2]);
        }
    }
}
