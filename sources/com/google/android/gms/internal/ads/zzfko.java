package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzfko {
    private final zzflc zzc;
    private final zzfkk zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfko(zzflc zzflcVar, zzfkk zzfkkVar, Context context, Clock clock) {
        this.zzc = zzflcVar;
        this.zzd = zzfkkVar;
        this.zze = context;
        this.zzh = clock;
    }

    public static String zzh(String str, @Nullable AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return YU.a.p(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzw)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        try {
            if (z) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzflb) it.next()).zzh();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzflb) it2.next()).zzg();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized java.util.List zzm(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.ads.internal.client.zzft r2 = (com.google.android.gms.ads.internal.client.zzft) r2     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r2.zza     // Catch: java.lang.Throwable -> L48
            int r4 = r2.zzb     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.getAdFormat(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = zzh(r3, r4)     // Catch: java.lang.Throwable -> L48
            r0.add(r3)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.ConcurrentMap r4 = r8.zza     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzflb r5 = (com.google.android.gms.internal.ads.zzflb) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L51
            com.google.android.gms.ads.internal.client.zzft r6 = r5.zze     // Catch: java.lang.Throwable -> L48
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L4b
            java.util.concurrent.ConcurrentMap r6 = r8.zzb     // Catch: java.lang.Throwable -> L48
            r6.put(r3, r5)     // Catch: java.lang.Throwable -> L48
            r4.remove(r3)     // Catch: java.lang.Throwable -> L48
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L48:
            r9 = move-exception
            goto L107
        L4b:
            int r2 = r2.zzd     // Catch: java.lang.Throwable -> L48
            r5.zzr(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L51:
            java.util.concurrent.ConcurrentMap r5 = r8.zzb     // Catch: java.lang.Throwable -> L48
            boolean r6 = r5.containsKey(r3)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzflb r6 = (com.google.android.gms.internal.ads.zzflb) r6     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.ads.internal.client.zzft r7 = r6.zze     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L76
            int r2 = r2.zzd     // Catch: java.lang.Throwable -> L48
            r6.zzr(r2)     // Catch: java.lang.Throwable -> L48
            r6.zzh()     // Catch: java.lang.Throwable -> L48
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L48
            r5.remove(r3)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L76:
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L7a:
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L7e:
            java.util.concurrent.ConcurrentMap r9 = r8.zza     // Catch: java.lang.Throwable -> L48
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        L88:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L48
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L88
            java.util.concurrent.ConcurrentMap r3 = r8.zzb     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzflb r2 = (com.google.android.gms.internal.ads.zzflb) r2     // Catch: java.lang.Throwable -> L48
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L48
            r9.remove()     // Catch: java.lang.Throwable -> L48
            goto L88
        Lb5:
            java.util.concurrent.ConcurrentMap r9 = r8.zzb     // Catch: java.lang.Throwable -> L48
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        Lbf:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L105
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzflb r0 = (com.google.android.gms.internal.ads.zzflb) r0     // Catch: java.lang.Throwable -> L48
            r0.zzf()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzy     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r3.zzd(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto Lf8
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzz     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r3.zzd(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto Lfb
        Lf8:
            r0.zzo()     // Catch: java.lang.Throwable -> L48
        Lfb:
            boolean r0 = r0.zzd()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto Lbf
            r9.remove()     // Catch: java.lang.Throwable -> L48
            goto Lbf
        L105:
            monitor-exit(r8)
            return r1
        L107:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfko.zzm(java.util.List):java.util.List");
    }

    private final synchronized void zzn(String str, zzflb zzflbVar) {
        zzflbVar.zzc();
        this.zza.put(str, zzflbVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z;
        try {
            Clock clock = this.zzh;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzflb zzflbVarZzq = zzq(str, adFormat);
            int iZzn = 0;
            z = zzflbVarZzq != null && zzflbVarZzq.zzd();
            Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfkr zzfkrVar = new zzfkr(new zzfkq(str, adFormat), null);
            zzfkk zzfkkVar = this.zzd;
            int i = zzflbVarZzq == null ? 0 : zzflbVarZzq.zze.zzd;
            if (zzflbVarZzq != null) {
                iZzn = zzflbVarZzq.zzn();
            }
            zzfkkVar.zzd(i, iZzn, jCurrentTimeMillis, lValueOf, zzflbVarZzq != null ? zzflbVarZzq.zzi() : null, zzfkrVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfkr zzfkrVar = new zzfkr(new zzfkq(str, adFormat), null);
        zzfkk zzfkkVar = this.zzd;
        Clock clock = this.zzh;
        zzfkkVar.zzf(clock.currentTimeMillis(), zzfkrVar, -1, -1, "1");
        zzflb zzflbVarZzq = zzq(str, adFormat);
        if (zzflbVarZzq == null) {
            return null;
        }
        try {
            String strZzi = zzflbVarZzq.zzi();
            Object objZze = zzflbVarZzq.zze();
            Object objCast = objZze == null ? null : cls.cast(objZze);
            if (objCast != null) {
                zzfkkVar.zzh(clock.currentTimeMillis(), zzflbVarZzq.zze.zzd, zzflbVarZzq.zzn(), strZzi, zzfkrVar, "1");
            }
            return objCast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    @Nullable
    private final synchronized zzflb zzq(String str, AdFormat adFormat) {
        return (zzflb) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfkn(this));
                    } catch (RuntimeException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfkm(this));
            }
            List<com.google.android.gms.ads.internal.client.zzft> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzm) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzflb zzflbVarZza = this.zzc.zza(zzftVar, zzceVar);
                if (adFormat != null && zzflbVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzflbVarZza.zzk(atomicInteger.get());
                    }
                    zzfkk zzfkkVar = this.zzd;
                    zzflbVarZza.zzj(zzfkkVar);
                    zzn(zzh(str, adFormat), zzflbVarZza);
                    enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfkkVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfkr(new zzfkq(str, adFormat), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzbwa zzc(String str) {
        return (zzbwa) zzp(zzbwa.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbab zze(String str) {
        return (zzbab) zzp(zzbab.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}
