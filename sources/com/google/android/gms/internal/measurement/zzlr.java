package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzlr {
    static final zzlr zza = new zzlr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzlr zzd;
    private final Map zze;

    public zzlr() {
        this.zze = new HashMap();
    }

    public static zzlr zza() {
        zzlr zzlrVar = zzd;
        if (zzlrVar != null) {
            return zzlrVar;
        }
        synchronized (zzlr.class) {
            try {
                zzlr zzlrVar2 = zzd;
                if (zzlrVar2 != null) {
                    return zzlrVar2;
                }
                int i = zznu.zza;
                zzlr zzlrVarZzb = zzlz.zzb(zzlr.class);
                zzd = zzlrVarZzb;
                return zzlrVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzme zzb(zznm zznmVar, int i) {
        return (zzme) this.zze.get(new zzlq(zznmVar, i));
    }

    public zzlr(boolean z) {
        this.zze = Collections.EMPTY_MAP;
    }
}
