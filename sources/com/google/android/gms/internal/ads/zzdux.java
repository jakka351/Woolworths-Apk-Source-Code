package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdux {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsx zzl;
    private final VersionInfoParcel zzm;
    private final zzdcy zzo;
    private final zzfie zzp;
    private boolean zza = false;
    private boolean zzb = false;

    @GuardedBy
    private boolean zzc = false;
    private final zzbzm zze = new zzbzm();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzdux(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqc zzdqcVar, ScheduledExecutorService scheduledExecutorService, zzdsx zzdsxVar, VersionInfoParcel versionInfoParcel, zzdcy zzdcyVar, zzfie zzfieVar) {
        this.zzh = zzdqcVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsxVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdcyVar;
        this.zzp = zzfieVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized ListenableFuture zzu() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzgot.zza(strZzd);
        }
        final zzbzm zzbzmVar = new zzbzm();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzbzmVar);
            }
        });
        return zzbzmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzblk(str, z, i, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzblr zzblrVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzblrVar.zzb(this.zza.zzd());
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbeo.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzca)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzbzm zzbzmVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdup
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf();
                            }
                        };
                        Executor executor = this.zzi;
                        zzbzmVar.addListener(runnable, executor);
                        this.zza = true;
                        ListenableFuture listenableFutureZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdur
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzh();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcc)).longValue(), TimeUnit.SECONDS);
                        zzgot.zzq(listenableFutureZzu, new zzdun(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzblk zzblkVar = (zzblk) map.get(str);
            arrayList.add(new zzblk(str, zzblkVar.zzb, zzblkVar.zzc, zzblkVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    public final /* synthetic */ void zzg(final zzbzm zzbzmVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzduv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzbzm zzbzmVar2 = zzbzmVar;
                if (zIsEmpty) {
                    zzbzmVar2.zzd(new Exception());
                } else {
                    zzbzmVar2.zzc(strZzd);
                }
            }
        });
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzi(Object obj, zzbzm zzbzmVar, String str, long j, zzfhr zzfhrVar) {
        synchronized (obj) {
            try {
                if (!zzbzmVar.isDone()) {
                    zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfie zzfieVar = this.zzp;
                    zzfhrVar.zzk("Timeout");
                    zzfhrVar.zzd(false);
                    zzfieVar.zzb(zzfhrVar.zzm());
                    zzbzmVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzj(zzfhr zzfhrVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfhrVar.zzd(true);
        this.zzp.zzb(zzfhrVar.zzm());
        return null;
    }

    public final /* synthetic */ void zzk(String str, zzblo zzbloVar, zzfea zzfeaVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbloVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfeaVar.zzA(context, zzbloVar, list);
            } catch (RemoteException e) {
                throw new zzghz(e);
            } catch (zzfdj unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                zzbloVar.zzf(sb.toString());
            }
        } catch (RemoteException e2) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    public final /* synthetic */ void zzl(String str) throws JSONException {
        final zzdux zzduxVar = this;
        Context context = zzduxVar.zzf;
        int i = 5;
        final zzfhr zzfhrVarZzn = zzfhr.zzn(context, 5);
        zzfhrVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(MlModel.MODEL_FILE_SUFFIX);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfhr zzfhrVarZzn2 = zzfhr.zzn(context, i);
                zzfhrVarZzn2.zza();
                zzfhrVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzbzm zzbzmVar = new zzbzm();
                ListenableFuture listenableFutureZzi = zzgot.zzi(zzbzmVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcb)).longValue(), TimeUnit.SECONDS, zzduxVar.zzk);
                zzduxVar.zzl.zza(next);
                zzduxVar.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                listenableFutureZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdus
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzbzmVar, next, jElapsedRealtime, zzfhrVarZzn2);
                    }
                }, zzduxVar.zzi);
                arrayList.add(listenableFutureZzi);
                try {
                } catch (JSONException e) {
                    e = e;
                    zzduxVar = this;
                }
                try {
                    final zzduo zzduoVar = new zzduo(this, obj, next, jElapsedRealtime, zzfhrVarZzn2, zzbzmVar);
                    zzduxVar = this;
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    final ArrayList arrayList2 = new ArrayList();
                    if (jSONObjectOptJSONObject != null) {
                        try {
                            JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                            int i2 = 0;
                            while (i2 < jSONArray.length()) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                String strOptString = jSONObject2.optString("format", "");
                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                Bundle bundle = new Bundle();
                                if (jSONObjectOptJSONObject2 != null) {
                                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                        jSONArray = jSONArray;
                                    }
                                }
                                JSONArray jSONArray2 = jSONArray;
                                arrayList2.add(new zzblu(strOptString, bundle));
                                i2++;
                                jSONArray = jSONArray2;
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    zzduxVar.zzm(next, false, "", 0);
                    try {
                        final zzfea zzfeaVarZza = zzduxVar.zzh.zza(next, new JSONObject());
                        zzduxVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduu
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzk(next, zzduoVar, zzfeaVarZza, arrayList2);
                            }
                        });
                    } catch (zzfdj e2) {
                        try {
                            String string = "Failed to create Adapter.";
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznP)).booleanValue()) {
                                String message = e2.getMessage();
                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                sb.append("Failed to create Adapter.");
                                sb.append(" ");
                                sb.append(message);
                                string = sb.toString();
                            }
                            zzduoVar.zzf(string);
                        } catch (RemoteException e3) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                        }
                    }
                    i = 5;
                } catch (JSONException e4) {
                    e = e4;
                    zzduxVar = this;
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                    zzduxVar.zzo.zzd("MalformedJson");
                    zzduxVar.zzl.zzd("MalformedJson");
                    zzduxVar.zze.zzd(e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
                    zzfie zzfieVar = zzduxVar.zzp;
                    zzfhrVarZzn.zzj(e);
                    zzfhrVarZzn.zzd(false);
                    zzfieVar.zzb(zzfhrVarZzn.zzm());
                }
            }
            zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdut
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfhrVarZzn);
                    return null;
                }
            }, zzduxVar.zzi);
        } catch (JSONException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzduxVar.zzo.zzd("MalformedJson");
            zzduxVar.zzl.zzd("MalformedJson");
            zzduxVar.zze.zzd(e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
            zzfie zzfieVar2 = zzduxVar.zzp;
            zzfhrVarZzn.zzj(e);
            zzfhrVarZzn.zzd(false);
            zzfieVar2.zzb(zzfhrVarZzn.zzm());
        }
    }

    public final /* synthetic */ void zzn(boolean z) {
        this.zzc = true;
    }

    public final /* synthetic */ long zzo() {
        return this.zzd;
    }

    public final /* synthetic */ zzbzm zzp() {
        return this.zze;
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    public final /* synthetic */ zzdsx zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzdcy zzs() {
        return this.zzo;
    }

    public final /* synthetic */ zzfie zzt() {
        return this.zzp;
    }
}
