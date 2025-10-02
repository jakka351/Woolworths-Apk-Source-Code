package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzhhr {
    static final zzhhr zza = new zzhhr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzhhr zzd;
    private final Map zze;

    public zzhhr() {
        this.zze = new HashMap();
    }

    public static zzhhr zza() {
        int i = zzhgo.zza;
        return zza;
    }

    public static zzhhr zzb() {
        zzhhr zzhhrVar = zzd;
        if (zzhhrVar != null) {
            return zzhhrVar;
        }
        synchronized (zzhhr.class) {
            try {
                zzhhr zzhhrVar2 = zzd;
                if (zzhhrVar2 != null) {
                    return zzhhrVar2;
                }
                int i = zzhgo.zza;
                zzhhr zzhhrVarZzb = zzhhz.zzb(zzhhr.class);
                zzd = zzhhrVarZzb;
                return zzhhrVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhif zzc(zzhjs zzhjsVar, int i) {
        return (zzhif) this.zze.get(new zzhhq(zzhjsVar, i));
    }

    public zzhhr(boolean z) {
        this.zze = Collections.EMPTY_MAP;
    }
}
