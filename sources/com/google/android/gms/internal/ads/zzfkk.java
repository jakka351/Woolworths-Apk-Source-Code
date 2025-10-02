package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.wrappers.Wrappers;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfkk {
    private final zzdsm zza;
    private final String zzb;

    public zzfkk(zzdsm zzdsmVar, Context context) {
        CharSequence applicationLabel;
        this.zza = zzdsmVar;
        zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
        try {
            applicationLabel = Wrappers.packageManager(context).getApplicationLabel(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get application name", e);
            applicationLabel = "";
        }
        this.zzb = applicationLabel.toString();
    }

    private final void zzq(String str, long j, @Nullable String str2, @Nullable String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, str);
        zzdslVarZza.zzc("pat", Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdslVarZza.zzc("max_ads", Integer.toString(i));
        zzdslVarZza.zzc("cache_size", Integer.toString(i2));
        zzdslVarZza.zzc("pas", Integer.toString(i3));
        zzdslVarZza.zzc("pv", "2");
        zzdslVarZza.zzc("ad_unit_id", str3);
        zzdslVarZza.zzc("pid", str2);
        zzdslVarZza.zzd();
    }

    private final void zzr(@Nullable String str, String str2, long j, int i, int i2, @Nullable String str3, @Nullable zzfkr zzfkrVar, String str4) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(str2, Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        if (zzfkrVar != null) {
            zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
            zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
            zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        }
        zzdslVarZza.zzc(UrlHandler.ACTION, str);
        if (str3 != null) {
            zzdslVarZza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zzdslVarZza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zzdslVarZza.zzc("cache_size", Integer.toString(i2));
        }
        zzdslVarZza.zzc("pv", str4);
        zzdslVarZza.zzd();
    }

    public final void zza(int i, long j, zzfkr zzfkrVar, String str) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "start_preload");
        zzdslVarZza.zzc("sp_ts", Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("max_ads", Integer.toString(i));
        zzdslVarZza.zzc("pv", str);
        zzdslVarZza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "start_preload");
        zzdslVarZza.zzc("sp_ts", Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdslVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdslVarZza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfkr zzfkrVar) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "cache_resize");
        zzdslVarZza.zzc("cs_ts", Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("orig_ma", Integer.toString(i));
        zzdslVarZza.zzc("max_ads", Integer.toString(i2));
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("pv", "1");
        zzdslVarZza.zzd();
    }

    public final void zzd(int i, int i2, long j, @Nullable Long l, @Nullable String str, @Nullable zzfkr zzfkrVar, String str2) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("plaac_ts", Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("max_ads", Integer.toString(i));
        zzdslVarZza.zzc("cache_size", Integer.toString(i2));
        zzdslVarZza.zzc(UrlHandler.ACTION, "is_ad_available");
        if (zzfkrVar != null) {
            zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
            zzdslVarZza.zzc("pid", zzfkrVar.zzc());
            zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        }
        if (l != null) {
            zzdslVarZza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zzdslVarZza.zzc("gqi", str);
        }
        zzdslVarZza.zzc("pv", str2);
        zzdslVarZza.zzd();
    }

    public final void zze(long j, String str) {
        zzr("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfkr zzfkrVar, int i, int i2, String str) {
        zzr("poll_ad", "ppac_ts", j, i, i2, null, zzfkrVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfkr zzfkrVar, String str2) {
        zzr("poll_ad", "psvroc_ts", j, i, i2, str, zzfkrVar, str2);
    }

    public final void zzh(long j, int i, int i2, @Nullable String str, zzfkr zzfkrVar, String str2) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("ppla_ts", Long.toString(j));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("max_ads", Integer.toString(i));
        zzdslVarZza.zzc("cache_size", Integer.toString(i2));
        zzdslVarZza.zzc(UrlHandler.ACTION, "poll_ad");
        if (str != null) {
            zzdslVarZza.zzc("gqi", str);
        }
        zzdslVarZza.zzc("pv", str2);
        zzdslVarZza.zzd();
    }

    public final void zzi(long j, @Nullable String str, zzfkr zzfkrVar, int i, int i2, String str2) {
        zzr("paa", "pano_ts", j, i, i2, str, zzfkrVar, str2);
    }

    public final void zzj(long j, zzfkr zzfkrVar, int i, String str) {
        zzr("pae", "paeo_ts", j, i, 0, null, zzfkrVar, str);
    }

    public final void zzk(long j, zzfkr zzfkrVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "pftla");
        zzdslVarZza.zzc("pftlat_ts", Long.toString(j));
        zzdslVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("max_ads", Integer.toString(i));
        zzdslVarZza.zzc("cache_size", Integer.toString(i2));
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("pv", str);
        zzdslVarZza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzq("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzq("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzq("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, @Nullable String str2, AdFormat adFormat, int i, int i2) {
        zzq("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, @Nullable String str2, AdFormat adFormat, int i2) {
        zzq("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }
}
