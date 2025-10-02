package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class zzevj implements zzeup {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgpd zzc;
    private final ScheduledExecutorService zzd;
    private final zzedx zze;
    private final zzfdc zzf;
    private final VersionInfoParcel zzg;

    public zzevj(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzedx zzedxVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedxVar;
        this.zzf = zzfdcVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.zzeup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzlj
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lfb
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzz()
            if (r0 == 0) goto Lfb
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzln
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfdc r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto Lfb
        L3a:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r5.zzg
            int r0 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzlh
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzli
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzlf
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzlg
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto Lfb
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.zzb
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lfb
        La0:
            com.google.android.gms.internal.ads.zzedx r0 = r5.zze     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzll     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzd     // Catch: java.lang.Exception -> Lc1
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgot.zzi(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgot.zzc(r0)
        Lc6:
            com.google.android.gms.internal.ads.zzgpd r1 = r5.zzc
            com.google.android.gms.internal.ads.zzgol r0 = com.google.android.gms.internal.ads.zzgol.zzw(r0)
            com.google.android.gms.internal.ads.zzevi r2 = com.google.android.gms.internal.ads.zzevi.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgot.zzj(r0, r2, r1)
            com.google.android.gms.internal.ads.zzgol r0 = (com.google.android.gms.internal.ads.zzgol) r0
            com.google.android.gms.internal.ads.zzevg r2 = new com.google.android.gms.internal.ads.zzevg
            r2.<init>()
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgot.zzh(r0, r3, r2, r1)
            com.google.android.gms.internal.ads.zzgol r0 = (com.google.android.gms.internal.ads.zzgol) r0
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzll
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgot.zzi(r0, r1, r4, r3)
            return r0
        Lfb:
            com.google.android.gms.internal.ads.zzevk r0 = new com.google.android.gms.internal.ads.zzevk
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgot.zza(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevj.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlk)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgot.zza(th instanceof SecurityException ? new zzevk("", 2, null) : th instanceof IllegalStateException ? new zzevk("", 3, null) : th instanceof IllegalArgumentException ? new zzevk("", 4, null) : th instanceof TimeoutException ? new zzevk("", 5, null) : new zzevk("", 0, null));
    }
}
