package com.google.android.gms.measurement.internal;

import YU.a;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzc, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? a.h("experiment_id(", str, ")") : zzg(str, zzjo.zzb, zzjo.zza, zzc);
    }

    public final String zzd(zzbg zzbgVar) {
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbgVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbgVar.zza));
        sb.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        sb.append(zzbeVar == null ? null : !zzgmVar.zza() ? zzbeVar.toString() : zze(zzbeVar.zzf()));
        return sb.toString();
    }

    public final String zze(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbS = a.s("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbS.length() != 8) {
                sbS.append(", ");
            }
            sbS.append(zzb(str));
            sbS.append("=");
            Object obj = bundle.get(str);
            sbS.append(obj instanceof Bundle ? zzf(new Object[]{obj}) : obj instanceof Object[] ? zzf((Object[]) obj) : obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbS.append("}]");
        return sbS.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbS = a.s("[");
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sbS.length() != 1) {
                    sbS.append(", ");
                }
                sbS.append(strZze);
            }
        }
        sbS.append("]");
        return sbS.toString();
    }
}
