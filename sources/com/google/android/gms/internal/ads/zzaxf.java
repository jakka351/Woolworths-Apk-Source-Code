package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzaxf extends zzaxl {
    private final zzawe zzh;
    private long zzi;

    public zzaxf(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2, zzawe zzaweVar) {
        super(zzavxVar, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", zzarwVar, i, 53);
        this.zzh = zzaweVar;
        if (zzaweVar != null) {
            this.zzi = zzaweVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
