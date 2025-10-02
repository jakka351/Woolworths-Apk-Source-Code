package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzou extends zzol {
    public zzou(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final String zzd(String str) {
        String strZzc = this.zzg.zzh().zzc(str);
        if (TextUtils.isEmpty(strZzc)) {
            return (String) zzfy.zzq.zzb(null);
        }
        Uri uri = Uri.parse((String) zzfy.zzq.zzb(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzc).length() + 1 + String.valueOf(authority).length());
        sb.append(strZzc);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    private static final boolean zzf(String str) {
        String str2 = (String) zzfy.zzs.zzb(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final zzot zza(String str) {
        zzh zzhVarZzu;
        zzpg zzpgVar = this.zzg;
        zzh zzhVarZzu2 = zzpgVar.zzj().zzu(str);
        zzot zzotVar = null;
        if (zzhVarZzu2 == null || !zzhVarZzu2.zzai()) {
            return new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.zzil zzilVarZzb = com.google.android.gms.internal.measurement.zzis.zzb();
        zzilVarZzb.zzb(2);
        zzilVarZzb.zza((com.google.android.gms.internal.measurement.zzin) Preconditions.checkNotNull(com.google.android.gms.internal.measurement.zzin.zzb(zzhVarZzu2.zzaL())));
        String strZzd = zzhVarZzu2.zzd();
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzpgVar.zzh().zzb(str);
        if (zzglVarZzb == null || (zzhVarZzu = zzpgVar.zzj().zzu(str)) == null || ((!zzglVarZzb.zzp() || zzglVarZzb.zzq().zzc() != 100) && !this.zzu.zzk().zzaa(str, zzhVarZzu.zzay()) && (TextUtils.isEmpty(strZzd) || Math.abs(strZzd.hashCode() % 100) >= zzglVarZzb.zzq().zzc()))) {
            zzilVarZzb.zzc(3);
            return new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzis) zzilVarZzb.zzbc());
        }
        String strZzc = zzhVarZzu2.zzc();
        zzilVarZzb.zzb(2);
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb2 = zzpgVar.zzh().zzb(zzhVarZzu2.zzc());
        if (zzglVarZzb2 == null || !zzglVarZzb2.zzp()) {
            this.zzu.zzaV().zzk().zzb("[sgtm] Missing sgtm_setting in remote config. appId", strZzc);
            zzilVarZzb.zzc(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(zzhVarZzu2.zzay())) {
                map.put("x-gtm-server-preview", zzhVarZzu2.zzay());
            }
            String strZzd2 = zzglVarZzb2.zzq().zzd();
            com.google.android.gms.internal.measurement.zzin zzinVarZzb = com.google.android.gms.internal.measurement.zzin.zzb(zzhVarZzu2.zzaL());
            if (zzinVarZzb != null && zzinVarZzb != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
                zzilVarZzb.zza(zzinVarZzb);
            } else if (zzf(zzhVarZzu2.zzc())) {
                zzilVarZzb.zza(com.google.android.gms.internal.measurement.zzin.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strZzd2)) {
                zzilVarZzb.zza(com.google.android.gms.internal.measurement.zzin.MISSING_SGTM_SERVER_URL);
            } else {
                this.zzu.zzaV().zzk().zzb("[sgtm] Eligible for client side upload. appId", strZzc);
                zzilVarZzb.zzb(3);
                zzilVarZzb.zza(com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE);
                zzotVar = new zzot(strZzd2, map, zzls.SGTM_CLIENT, (com.google.android.gms.internal.measurement.zzis) zzilVarZzb.zzbc());
            }
            zzglVarZzb2.zzq().zza();
            zzglVarZzb2.zzq().zzb();
            zzic zzicVar = this.zzu;
            zzicVar.zzaU();
            if (TextUtils.isEmpty(strZzd2)) {
                zzilVarZzb.zzc(6);
                zzicVar.zzaV().zzk().zzb("[sgtm] Local service, missing sgtm_server_url", zzhVarZzu2.zzc());
            } else {
                zzicVar.zzaV().zzk().zzb("[sgtm] Eligible for local service direct upload. appId", strZzc);
                zzilVarZzb.zzb(5);
                zzilVarZzb.zzc(2);
                zzotVar = new zzot(strZzd2, map, zzls.SGTM, (com.google.android.gms.internal.measurement.zzis) zzilVarZzb.zzbc());
            }
        }
        return zzotVar != null ? zzotVar : new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzis) zzilVarZzb.zzbc());
    }

    @WorkerThread
    public final boolean zzc(String str, com.google.android.gms.internal.measurement.zzin zzinVar) {
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb;
        zzg();
        return (zzinVar != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE || zzf(str) || (zzglVarZzb = this.zzg.zzh().zzb(str)) == null || !zzglVarZzb.zzp() || zzglVarZzb.zzq().zzd().isEmpty()) ? false : true;
    }
}
