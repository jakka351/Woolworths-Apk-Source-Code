package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzbxa implements zzbxf {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());

    @VisibleForTesting
    boolean zza;
    private final zzhmp zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxc zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxa(Context context, VersionInfoParcel versionInfoParcel, zzbxc zzbxcVar, @Nullable String str, zzbxb zzbxbVar) {
        Preconditions.checkNotNull(zzbxcVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxcVar;
        Iterator it = zzbxcVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhmp zzhmpVarZzg = zzhot.zzg();
        zzhmpVarZzg.zzn(9);
        if (str != null) {
            zzhmpVarZzg.zzb(str);
            zzhmpVarZzg.zzc(str);
        }
        zzhmq zzhmqVarZzc = zzhmr.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhmqVarZzc.zza(str2);
        }
        zzhmpVarZzg.zzd((zzhmr) zzhmqVarZzc.zzbu());
        zzhof zzhofVarZzc = zzhog.zzc();
        zzhofVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhofVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhofVarZzc.zzb(apkVersion);
        }
        zzhmpVarZzg.zzk((zzhog) zzhofVarZzc.zzbu());
        this.zzd = zzhmpVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final zzbxc zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzc() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxc r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L88
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L88
            com.google.android.gms.ads.internal.zzt.zzc()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L15
            goto L76
        L15:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L27
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L27
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L27
            if (r3 == 0) goto L29
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L27
            goto L2a
        L27:
            r2 = move-exception
            goto L30
        L29:
            r3 = r1
        L2a:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2e
            goto L38
        L2e:
            r2 = move-exception
            goto L31
        L30:
            r3 = r1
        L31:
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r4, r2)
        L38:
            if (r3 != 0) goto L75
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            if (r2 == 0) goto L65
            if (r3 != 0) goto L47
            goto L65
        L47:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L63
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L63
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L63
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L63
            r1 = r4
            goto L76
        L63:
            r8 = move-exception
            goto L6d
        L65:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.RuntimeException -> L63
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r8)     // Catch: java.lang.RuntimeException -> L63
            goto L76
        L6d:
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r2, r8)
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto L7e
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxe.zza(r8)
            return
        L7e:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbwz r8 = new com.google.android.gms.internal.ads.zzbwz
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxa.zzd(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzhod) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhod zzhodVarZze = zzhoe.zze();
            int iZza = zzhoc.zza(i);
            if (iZza != 0) {
                zzhodVarZze.zze(iZza);
            }
            zzhodVarZze.zza(linkedHashMap.size());
            zzhodVarZze.zzb(str);
            zzhnc zzhncVarZzc = zzhnf.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhna zzhnaVarZzc = zzhnb.zzc();
                        zzhnaVarZzc.zza(zzhhb.zzs(str2));
                        zzhnaVarZzc.zzb(zzhhb.zzs(str3));
                        zzhncVarZzc.zza((zzhnb) zzhnaVarZzc.zzbu());
                    }
                }
            }
            zzhodVarZze.zzc((zzhnf) zzhncVarZzc.zzbu());
            linkedHashMap.put(str, zzhodVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZza = zzgot.zza(Collections.EMPTY_MAP);
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbww
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzgpd zzgpdVar = zzbzh.zzg;
            ListenableFuture listenableFutureZzj = zzgot.zzj(listenableFutureZza, zzgobVar, zzgpdVar);
            ListenableFuture listenableFutureZzi = zzgot.zzi(listenableFutureZzj, 10L, TimeUnit.SECONDS, zzbzh.zzd);
            zzgot.zzq(listenableFutureZzj, new zzbwv(this, listenableFutureZzi), zzgpdVar);
            zzc.add(listenableFutureZzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zzhha zzhhaVarZzx = zzhhb.zzx();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzhhaVarZzx);
        synchronized (this.zzj) {
            zzhmp zzhmpVar = this.zzd;
            zzhnx zzhnxVarZzc = zzhnz.zzc();
            zzhnxVarZzc.zzb(zzhhaVarZzx.zza());
            zzhnxVarZzc.zza("image/png");
            zzhnxVarZzc.zzc(2);
            zzhmpVar.zzj((zzhnz) zzhnxVarZzc.zzbu());
        }
    }

    public final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzhod zzhodVar;
        ListenableFuture listenableFutureZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzhodVar = (zzhod) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzhodVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzbxe.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzhodVar.zzd(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzgot.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgot.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzhoe) ((zzhod) it.next()).zzbu());
                }
                zzhmp zzhmpVar = this.zzd;
                zzhmpVar.zzl(this.zzf);
                zzhmpVar.zzm(this.zzg);
                if (zzbxe.zzb()) {
                    String strZza = zzhmpVar.zza();
                    String strZzg = zzhmpVar.zzg();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(strZza);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(strZzg);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (zzhoe zzhoeVar : zzhmpVar.zze()) {
                        sb3.append("    [");
                        sb3.append(zzhoeVar.zzd());
                        sb3.append("] ");
                        sb3.append(zzhoeVar.zzc());
                    }
                    zzbxe.zza(sb3.toString());
                }
                ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhot) zzhmpVar.zzbu()).zzaN());
                if (zzbxe.zzb()) {
                    listenableFutureZzb.addListener(zzbwy.zza, zzbzh.zza);
                }
                listenableFutureZzk = zzgot.zzk(listenableFutureZzb, zzbwx.zza, zzbzh.zzg);
            } finally {
            }
        }
        return listenableFutureZzk;
    }
}
