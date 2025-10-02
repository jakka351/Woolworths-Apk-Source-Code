package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzghs;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(@NonNull Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put("device", zzs.zzv());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzI(context) ? "0" : "1");
        zzbbz zzbbzVar = zzbci.zza;
        List listZzf = zzbd.zzb().zzf();
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzhm)).booleanValue()) {
            listZzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put(lllqqql.cc006300630063cc, this.zzc);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzmf)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzF(context) ? "0" : "1");
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzkj)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzcE)).booleanValue()) {
                map.put("plugin", zzghs.zza(zzt.zzh().zzu()));
            }
        }
    }
}
