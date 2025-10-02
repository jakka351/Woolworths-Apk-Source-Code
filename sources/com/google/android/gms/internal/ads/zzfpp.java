package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzfpp implements zzfok {
    private final Object zza;
    private final zzfpq zzb;
    private final zzfqb zzc;
    private final zzfoh zzd;
    private final boolean zze;

    public zzfpp(@NonNull Object obj, @NonNull zzfpq zzfpqVar, @NonNull zzfqb zzfqbVar, @NonNull zzfoh zzfohVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfpqVar;
        this.zzc = zzfqbVar;
        this.zzd = zzfohVar;
        this.zze = z;
    }

    @Nullable
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzatj zzatjVarZza = zzatk.zza();
        zzatjVarZza.zzd(5);
        zzatjVarZza.zza(zzhhb.zzr(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzatk) zzatjVarZza.zzbu()).zzaN(), 11);
    }

    @Nullable
    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    @Nullable
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        try {
            Map mapZzb = this.zzc.zzb();
            mapZzb.put("f", "q");
            mapZzb.put("ctx", context);
            mapZzb.put("aid", null);
            bArrZzj = zzj(null, mapZzb);
            if (this.zze) {
                mapZzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    @Nullable
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzc = this.zzc.zzc();
            mapZzc.put("f", "v");
            mapZzc.put("ctx", context);
            mapZzc.put("aid", null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrZzj = zzj(null, mapZzc);
            if (this.zze) {
                mapZzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    @Nullable
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzd = this.zzc.zzd();
            mapZzd.put("f", "c");
            mapZzd.put("ctx", context);
            mapZzd.put("cs", str2);
            mapZzd.put("aid", null);
            mapZzd.put("view", view);
            mapZzd.put("act", activity);
            bArrZzj = zzj(null, mapZzd);
            if (this.zze) {
                mapZzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfpz {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put("aid", null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfpz(2005, e);
        }
    }

    public final zzfpq zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzfpz {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfpz(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public final synchronized void zzg() throws zzfpz {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.zzd.zzb(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfpz(2003, e);
        }
    }

    public final synchronized int zzh() throws zzfpz {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfpz(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }
}
