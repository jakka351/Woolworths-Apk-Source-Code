package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class zzfzj extends zzfzq {
    private final Context zza;

    public zzfzj(zzarw zzarwVar, zzfym zzfymVar, Context context, zzgea zzgeaVar) {
        super("A8km1fKhVCEOHft43zU9Y3DGoNIs4mavU3BMf8IOeia1/wV0xy5wGwT3F8eyloUl", "Cy7/BJEWRZ7R8lyzDpb6G4eaYqNDtTlzBP7NVvGHRcQ=", zzarwVar, zzfymVar, zzgeaVar.zza(119));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzarwVar) {
            zzarwVar.zzc(((Long) objArr[0]).longValue());
            zzarwVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}
