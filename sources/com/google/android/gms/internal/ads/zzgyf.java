package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgyf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyd zzc = zzgye.zza;
    private static final zzgyf zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzgyf zza() {
        return zzd;
    }

    private static zzgyf zzd() {
        zzgyf zzgyfVar = new zzgyf();
        try {
            zzgyfVar.zzb(zzc, zzgxw.class);
            return zzgyfVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized zzgqd zze(zzgqs zzgqsVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgyd zzgydVar;
        zzgydVar = (zzgyd) this.zzb.get(zzgqsVar.getClass());
        if (zzgydVar == null) {
            String string = zzgqsVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(string);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzgydVar.zza(zzgqsVar, num);
    }

    public final synchronized void zzb(zzgyd zzgydVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzgyd zzgydVar2 = (zzgyd) map.get(cls);
            if (zzgydVar2 != null && !zzgydVar2.equals(zzgydVar)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, zzgydVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzgqd zzc(zzgqs zzgqsVar, @Nullable Integer num) throws GeneralSecurityException {
        return zze(zzgqsVar, num);
    }
}
