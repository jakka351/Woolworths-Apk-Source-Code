package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzaxa extends zzaxl {
    public zzaxa(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", zzarwVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarw zzarwVar = this.zzd;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzarwVar.zzah(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
