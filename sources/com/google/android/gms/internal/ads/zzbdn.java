package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzbdn {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdsr zzd;
    private Runnable zze;
    private zzbdk zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    @VisibleForTesting
    public zzbdn(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdsr zzdsrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdsrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzkG)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbdk r0 = r8.zzf
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r8.zzh
            if (r0 == 0) goto L9c
            androidx.browser.customtabs.CustomTabsSession r0 = r8.zzg
            if (r0 == 0) goto L9c
            java.util.concurrent.ScheduledExecutorService r0 = r8.zza
            if (r0 == 0) goto L9c
            long r1 = r8.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3b
        L2c:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzk()
            long r1 = r1.elapsedRealtime()
            long r3 = r8.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzkG
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L9c
        L4d:
            androidx.browser.customtabs.CustomTabsSession r1 = r8.zzg
            java.lang.String r2 = r8.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.support.customtabs.ICustomTabsCallback r4 = r1.c
            android.support.customtabs.ICustomTabsService r5 = r1.b
            android.os.Bundle r6 = new android.os.Bundle     // Catch: android.os.RemoteException -> L84
            r6.<init>()     // Catch: android.os.RemoteException -> L84
            android.app.PendingIntent r1 = r1.e     // Catch: android.os.RemoteException -> L84
            if (r1 == 0) goto L71
            if (r1 == 0) goto L71
            java.lang.String r7 = "android.support.customtabs.extra.SESSION_ID"
            r6.putParcelable(r7, r1)     // Catch: android.os.RemoteException -> L84
        L71:
            boolean r1 = r6.isEmpty()     // Catch: android.os.RemoteException -> L84
            if (r1 == 0) goto L78
            r6 = 0
        L78:
            if (r6 == 0) goto L81
            r3.putAll(r6)     // Catch: android.os.RemoteException -> L84
            r5.t0(r4, r2, r3)     // Catch: android.os.RemoteException -> L84
            goto L84
        L81:
            r5.Z0(r4, r2)     // Catch: android.os.RemoteException -> L84
        L84:
            java.lang.Runnable r1 = r8.zze
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzkH
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L9c:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdn.zzh():void");
    }

    private final void zzk(JSONObject jSONObject) throws JSONException {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkJ));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final void zza(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdsr zzdsrVar = this.zzd;
        zzbdk zzbdkVar = new zzbdk(this, customTabsCallback, zzdsrVar);
        this.zzf = zzbdkVar;
        CustomTabsSession customTabsSessionC = customTabsClient.c(zzbdkVar, null);
        this.zzg = customTabsSessionC;
        if (customTabsSessionC == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(zzdsrVar, null, "pact_action", new Pair("pe", "pact_init"));
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    public final void zzc() {
        this.zzi = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkF)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            };
        }
        zzh();
    }

    public final void zzd(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzben.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zzb());
            }
            customTabsSession.a(jSONObject.toString());
            zzbdl zzbdlVar = new zzbdl(this, str);
            if (((Boolean) zzben.zze.zze()).booleanValue()) {
                this.zzb.zzb(this.zzg, zzbdlVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbdlVar);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating JSON: ", e);
        }
    }

    @VisibleForTesting
    public final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    @VisibleForTesting
    public final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final void zzg(long j) {
        this.zzj = j;
    }

    public final /* synthetic */ CustomTabsSession zzi() {
        return this.zzg;
    }
}
