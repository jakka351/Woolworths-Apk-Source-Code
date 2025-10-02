package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class zze {
    private static zze zza;
    private zzk zzb;
    private final Context zzc;

    private zze(Context context) {
        this.zzc = context.getApplicationContext();
    }

    public static zze zza(Context context) {
        if (zza == null) {
            zze zzeVar = new zze(context);
            zza = zzeVar;
            zzeVar.zzb = new zzk(zzeVar.zzc);
        }
        return zza;
    }

    public static zzd zzb(Context context, String str) {
        try {
            return new zzd(context.getPackageManager().getResourcesForApplication(str), str, null);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
            sb.append("Unable to get resources for ");
            sb.append(str);
            sb.append(", using local resources.");
            Log.w("OssLicenses", sb.toString());
            return new zzd(context.getResources(), context.getPackageName(), null);
        }
    }

    public static final int zzf(zzd zzdVar) {
        return zzdVar.zza.getIdentifier("license_fragment_container", "id", zzdVar.zzb);
    }

    public static final int zzg(zzd zzdVar) {
        return zzdVar.zza.getIdentifier("libraries_social_licenses_license", "layout", zzdVar.zzb);
    }

    public static final int zzh(zzd zzdVar) {
        return zzdVar.zza.getIdentifier("license", "id", zzdVar.zzb);
    }

    public final zzk zzc() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzd(String str) {
        try {
            zzk zzkVar = this.zzb;
            return (String) com.google.android.gms.internal.oss_licenses.zze.zza(zzkVar.doRead(new zzh(zzkVar, str)), null).get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("OssLicenses", "Failed to get package name from OssLicensesClient", e);
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zze(com.google.android.gms.internal.oss_licenses.zzg zzgVar) {
        try {
            zzk zzkVar = this.zzb;
            return (String) com.google.android.gms.internal.oss_licenses.zze.zza(zzkVar.doRead(new zzi(zzkVar, zzgVar)), null).get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("OssLicenses", "Failed to get license detail from OssLicensesClient", e);
            return "";
        }
    }
}
