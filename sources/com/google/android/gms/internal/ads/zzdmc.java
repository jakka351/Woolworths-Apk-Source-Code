package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdmc {
    private final Context zza;
    private final zzdli zzb;
    private final zzauu zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbh zzf;
    private final Executor zzg;
    private final zzbfl zzh;
    private final zzdmu zzi;
    private final zzdpi zzj;
    private final ScheduledExecutorService zzk;
    private final zzdod zzl;
    private final zzdsm zzm;
    private final zzfjv zzn;
    private final zzecn zzo;
    private final zzecy zzp;
    private final zzfdg zzq;
    private final zzdsg zzr;
    private final zzdtp zzs;

    public zzdmc(Context context, zzdli zzdliVar, zzauu zzauuVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbh zzbbhVar, Executor executor, zzfdc zzfdcVar, zzdmu zzdmuVar, zzdpi zzdpiVar, ScheduledExecutorService scheduledExecutorService, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzdod zzdodVar, zzecy zzecyVar, zzfdg zzfdgVar, zzdsg zzdsgVar, zzdtp zzdtpVar) {
        this.zza = context;
        this.zzb = zzdliVar;
        this.zzc = zzauuVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbhVar;
        this.zzg = executor;
        this.zzh = zzfdcVar.zzj;
        this.zzi = zzdmuVar;
        this.zzj = zzdpiVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsmVar;
        this.zzn = zzfjvVar;
        this.zzo = zzecnVar;
        this.zzl = zzdodVar;
        this.zzp = zzecyVar;
        this.zzq = zzfdgVar;
        this.zzr = zzdsgVar;
        this.zzs = zzdtpVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzgjz.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgjz.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzezVarZzt != null) {
                arrayList.add(zzezVarZzt);
            }
        }
        return zzgjz.zzq(arrayList);
    }

    private final ListenableFuture zzm(@Nullable JSONArray jSONArray, boolean z, boolean z2, zzdru zzdruVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgot.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzr.zze(), zzdruVar.zza());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzdmb.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.common.util.concurrent.ListenableFuture zzn(@androidx.annotation.Nullable org.json.JSONObject r14, boolean r15, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzdru r16) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L8
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgot.zza(r0)
            return r14
        L8:
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzes
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzet
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L55
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzeu
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            java.lang.String r6 = r14.getString(r5)     // Catch: org.json.JSONException -> L50
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L50
        L50:
            int r4 = r4 + 1
            goto L45
        L53:
            r12 = r1
            goto L56
        L55:
            r12 = r0
        L56:
            java.lang.String r1 = "url"
            java.lang.String r3 = r14.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L6a
            if (r12 == 0) goto L65
            goto L6a
        L65:
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgot.zza(r0)
            return r14
        L6a:
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzcy
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8b
            if (r16 == 0) goto L8b
            com.google.android.gms.internal.ads.zzdsg r1 = r13.zzr
            android.os.Bundle r1 = r1.zze()
            java.lang.String r2 = r16.zza()
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(r1, r2)
        L8b:
            java.lang.String r1 = "scale"
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r14.optDouble(r1, r4)
            java.lang.String r1 = "is_transparent"
            r2 = 1
            boolean r1 = r14.optBoolean(r1, r2)
            java.lang.String r2 = "width"
            r6 = -1
            int r10 = r14.optInt(r2, r6)
            java.lang.String r2 = "height"
            int r7 = r14.optInt(r2, r6)
            if (r15 != 0) goto Lcb
            if (r12 == 0) goto Lae
            r8 = r4
            r6 = r10
            goto Lcd
        Lae:
            com.google.android.gms.internal.ads.zzdli r2 = r13.zzb
            com.google.common.util.concurrent.ListenableFuture r1 = r2.zza(r3, r4, r1)
            com.google.android.gms.internal.ads.zzdlr r2 = new com.google.android.gms.internal.ads.zzdlr
            r6 = r10
            r2.<init>()
            java.util.concurrent.Executor r3 = r13.zzg
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgot.zzk(r1, r2, r3)
            java.lang.String r2 = "require"
            boolean r14 = r14.optBoolean(r2)
            com.google.common.util.concurrent.ListenableFuture r14 = zzr(r14, r1, r0)
            return r14
        Lcb:
            r6 = r10
            r8 = r4
        Lcd:
            com.google.android.gms.internal.ads.zzbfh r5 = new com.google.android.gms.internal.ads.zzbfh
            r10 = r6
            r6 = 0
            android.net.Uri r14 = android.net.Uri.parse(r3)
            r11 = r7
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12)
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgot.zza(r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmc.zzn(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzdru):com.google.common.util.concurrent.ListenableFuture");
    }

    @Nullable
    private static Integer zzo(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfcj zzfcjVar, zzfcm zzfcmVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxf zzbxfVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfcjVar, zzfcmVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzbxfVar);
        return zzgot.zzj(listenableFutureZzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzeho {
                zzcek zzcekVar = (zzcek) obj;
                if (zzcekVar == null || zzcekVar.zzh() == null) {
                    throw new zzeho(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzbzh.zzg);
    }

    private static ListenableFuture zzq(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgot.zzh(listenableFuture, Exception.class, new zzgob(obj2) { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgot.zza(null);
            }
        }, zzbzh.zzg);
    }

    private static ListenableFuture zzr(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgot.zzj(listenableFuture, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return obj2 != null ? listenableFuture : zzgot.zzc(new zzeho(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbzh.zzg) : zzq(listenableFuture, null);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }

    @Nullable
    private static final com.google.android.gms.ads.internal.client.zzez zzt(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, @Nullable zzdru zzdruVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdruVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdru zzdruVar) {
        zzbfl zzbflVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbflVar.zzb, zzbflVar.zzd, zzdruVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfcj zzfcjVar, final zzfcm zzfcmVar, @Nullable final com.google.android.gms.ads.internal.zzb zzbVar, @Nullable final zzbxf zzbxfVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkP)).booleanValue()) {
            return zzgot.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgot.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgot.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzes)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzet))) {
                return zzgot.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzs = zzs(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgot.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzr.zze(), zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final ListenableFuture listenableFutureZzj = zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzrVarZzs, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar, strOptString, strOptString2, obj);
            }
        }, zzbzh.zzf);
        return zzgot.zzj(listenableFutureZzj, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzeho {
                if (((zzcek) obj) != null) {
                    return listenableFutureZzj;
                }
                throw new zzeho(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbzh.zzg);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdru zzdruVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgot.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzr(jSONObjectOptJSONObject.optBoolean("require"), zzgot.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdruVar), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, @Nullable final com.google.android.gms.ads.internal.zzb zzbVar, @Nullable final zzbxf zzbxfVar) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                return zzgot.zza(null);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
                au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzr.zze(), zzdru.NATIVE_ASSETS_LOADING_OMID_START.zza());
            }
            return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlv
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzj(strOptString, zzbxfVar, zzbVar, obj);
                }
            }, zzbzh.zzf);
        }
        return zzgot.zza(null);
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzr.zze(), zzdru.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzgot.zzq(listenableFuture, new zzdlq(this, zzbzmVar), zzbzh.zzf);
        return zzbzmVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfcj zzfcjVar, zzfcm zzfcmVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxf zzbxfVar) {
        ListenableFuture listenableFutureZza;
        zzdmc zzdmcVar;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgot.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkO)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzbxfVar);
                zzdmcVar = this;
            }
            return zzq(zzgot.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzek)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
        }
        if (!z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzgot.zza(null);
        }
        zzdmcVar = this;
        listenableFutureZza = zzdmcVar.zzp(jSONObjectOptJSONObject, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar);
        return zzq(zzgot.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzek)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
    }

    public final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfcj zzfcjVar, zzfcm zzfcmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar, String str, String str2, Object obj) throws zzcez {
        zzdtp zzdtpVar;
        zzcek zzcekVarZza = this.zzj.zza(zzrVar, zzfcjVar, zzfcmVar);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        zzdoa zzdoaVarZza = this.zzl.zza();
        zzcgi zzcgiVarZzP = zzcekVarZza.zzP();
        zzbbz zzbbzVar = zzbci.zzoq;
        zzcgiVarZzP.zzZ(zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? null : zzbxfVar, this.zzo, this.zzn, this.zzm, null, zzdoaVarZza, null, null, null, null, null, null);
        zzcekVarZza.zzab("/getNativeAdViewSignals", zzbjk.zzs);
        zzcekVarZza.zzab("/getNativeClickMeta", zzbjk.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziq)).booleanValue() && (zzdtpVar = this.zzs) != null) {
                zzcekVarZza.zzab("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
            }
        }
        zzcekVarZza.zzP().zzQ(true);
        zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzbzl zzbzlVar = zzbzlVarZza;
                if (z) {
                    zzbzlVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i, "Image Web View failed to load. Error code: ", ", Description: ", str3, sb);
                zzbzlVar.zzd(new zzeho(1, YU.a.o(sb, ", Failing URL: ", str4)));
            }
        });
        zzcekVarZza.zzau(str, str2, null);
        return zzbzlVarZza;
    }

    public final /* synthetic */ zzbfe zzi(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString(TextBundle.TEXT_ENTRY);
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbfe(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ ListenableFuture zzj(String str, zzbxf zzbxfVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzcez {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzecy zzecyVar = this.zzp;
        zzcek zzcekVarZza = zzcfa.zza(context, zzcgt.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzecyVar, this.zzq, this.zzm);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzbzlVarZza.zzb();
            }
        });
        zzcekVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue()) {
            if (zzbxfVar != null) {
                zzcekVarZza.zzP().zzj(zzbxfVar);
            }
            zzcekVarZza.zzP().zzi(zzbVar);
        }
        return zzbzlVarZza;
    }
}
