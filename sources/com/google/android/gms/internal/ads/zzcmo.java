package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzcmo implements zzgoq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcmu zzb;

    public zzcmo(zzcmu zzcmuVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcmuVar);
        this.zzb = zzcmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzcmu zzcmuVar = this.zzb;
        zzcmuVar.zzu().zza(zzcmuVar.zzt().zzb(zzcmuVar.zzr(), zzcmuVar.zzs(), false, this.zza, null, zzcmuVar.zzp(), zzcmuVar.zzw()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = this.zza;
        String str2 = (String) obj;
        zzcmu zzcmuVar = this.zzb;
        zzcmuVar.zzu().zza(zzcmuVar.zzt().zzb(zzcmuVar.zzr(), zzcmuVar.zzs(), false, str, str2, zzcmuVar.zzp(), zzcmuVar.zzw()), zzcmuVar.zzv());
    }
}
