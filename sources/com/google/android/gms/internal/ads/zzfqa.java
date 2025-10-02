package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class zzfqa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqb zzc;
    private final zzfoh zzd;
    private final zzfoc zze;
    private final boolean zzf;

    @Nullable
    private zzfpp zzg;
    private final Object zzh = new Object();

    public zzfqa(@NonNull Context context, @NonNull zzfqb zzfqbVar, @NonNull zzfoh zzfohVar, @NonNull zzfoc zzfocVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfqbVar;
        this.zzd = zzfohVar;
        this.zze = zzfocVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(@NonNull zzfpq zzfpqVar) throws zzfpz {
        try {
            if (zzfpqVar.zza() == null) {
                throw new zzfpz(4010, "mc");
            }
            String strZza = zzfpqVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfpqVar.zzb())) {
                    throw new zzfpz(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfpqVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfpqVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfpz(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzfpz(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzfpz(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzfpz(2026, e4);
            }
        } finally {
        }
    }

    public final boolean zza(@NonNull zzfpq zzfpqVar) throws IllegalAccessException, zzfpz, InstantiationException, IllegalArgumentException, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpp zzfppVar = new zzfpp(zzd(zzfpqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfpqVar.zzd(), null, new Bundle(), 2), zzfpqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfppVar.zzf()) {
                    throw new zzfpz(4000, "init failed");
                }
                int iZzh = zzfppVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfpz(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfpp zzfppVar2 = this.zzg;
                    if (zzfppVar2 != null) {
                        try {
                            zzfppVar2.zzg();
                        } catch (zzfpz e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzg = zzfppVar;
                    } else {
                        this.zzg = zzfppVar;
                    }
                }
                this.zzd.zzb(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfpz(2004, e2);
            }
        } catch (zzfpz e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    @Nullable
    public final zzfok zzb() {
        zzfpp zzfppVar;
        synchronized (this.zzh) {
            zzfppVar = this.zzg;
        }
        return zzfppVar;
    }

    @Nullable
    public final zzfpq zzc() {
        synchronized (this.zzh) {
            try {
                zzfpp zzfppVar = this.zzg;
                if (zzfppVar == null) {
                    return null;
                }
                return zzfppVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
