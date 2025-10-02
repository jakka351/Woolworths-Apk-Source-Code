package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzfbw implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzfbn zzd;
    private final zzfab zze;
    private final zzfcv zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private ListenableFuture zzi;

    public zzfbw(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzfbn zzfbnVar, zzfdb zzfdbVar, zzfcv zzfcvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zze = zzfabVar;
        this.zzd = zzfbnVar;
        this.zzh = zzfdbVar;
        this.zzf = zzfcvVar;
        this.zzg = zzcgvVar.zzv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdoq zze(zzezz zzezzVar) {
        zzdoq zzdoqVarZzn = this.zzc.zzn();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(this.zza);
        zzcvaVar.zzb(((zzfbv) zzezzVar).zza);
        zzcvaVar.zzf(this.zzf);
        zzdoqVarZzn.zzd(zzcvaVar.zze());
        zzdoqVarZzn.zze(new zzdbr().zzn());
        return zzdoqVarZzn;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzely
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm r11, java.lang.String r12, com.google.android.gms.internal.ads.zzelw r13, com.google.android.gms.internal.ads.zzelx r14) throws org.json.JSONException, android.os.RemoteException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbvo r0 = new com.google.android.gms.internal.ads.zzbvo
            r0.<init>(r11, r12)
            com.google.android.gms.internal.ads.zzfbp r13 = (com.google.android.gms.internal.ads.zzfbp) r13
            java.lang.String r11 = r0.zzb
            r12 = 0
            if (r11 != 0) goto L1e
            int r11 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r11 = "Ad unit ID should not be null for rewarded video ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r11)
            java.util.concurrent.Executor r11 = r10.zzb
            com.google.android.gms.internal.ads.zzfbu r13 = new com.google.android.gms.internal.ads.zzfbu
            r13.<init>()
            r11.execute(r13)
            return r12
        L1e:
            com.google.common.util.concurrent.ListenableFuture r13 = r10.zzi
            if (r13 == 0) goto L29
            boolean r13 = r13.isDone()
            if (r13 != 0) goto L29
            return r12
        L29:
            com.google.android.gms.internal.ads.zzbds r12 = com.google.android.gms.internal.ads.zzbeb.zzc
            java.lang.Object r12 = r12.zze()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r13 = 5
            r1 = 0
            if (r12 == 0) goto L5c
            com.google.android.gms.internal.ads.zzfab r12 = r10.zze
            java.lang.Object r2 = r12.zzd()
            if (r2 == 0) goto L5c
            java.lang.Object r12 = r12.zzd()
            com.google.android.gms.internal.ads.zzdor r12 = (com.google.android.gms.internal.ads.zzdor) r12
            com.google.android.gms.internal.ads.zzfib r12 = r12.zzd()
            r12.zzi(r13)
            com.google.android.gms.ads.internal.client.zzm r2 = r0.zza
            java.lang.String r3 = r2.zzp
            r12.zzc(r3)
            android.os.Bundle r2 = r2.zzm
            r12.zzd(r2)
            r6 = r12
            goto L5d
        L5c:
            r6 = r1
        L5d:
            android.content.Context r12 = r10.zza
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zza
            boolean r2 = r0.zzf
            com.google.android.gms.internal.ads.zzfdz.zzb(r12, r2)
            com.google.android.gms.internal.ads.zzbbz r3 = com.google.android.gms.internal.ads.zzbci.zzjI
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r9 = 1
            if (r3 == 0) goto L84
            if (r2 == 0) goto L84
            com.google.android.gms.internal.ads.zzcgv r2 = r10.zzc
            com.google.android.gms.internal.ads.zzdvs r2 = r2.zzu()
            r2.zzc(r9)
        L84:
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdru r3 = com.google.android.gms.internal.ads.zzdru.PUBLIC_API_CALL
            java.lang.String r3 = r3.zza()
            long r4 = r0.zzz
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.<init>(r3, r4)
            android.util.Pair r3 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdru r4 = com.google.android.gms.internal.ads.zzdru.DYNAMITE_ENTER
            java.lang.String r4 = r4.zza()
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzt.zzk()
            long r7 = r5.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r3.<init>(r4, r5)
            android.util.Pair[] r2 = new android.util.Pair[]{r2, r3}
            android.os.Bundle r2 = com.google.android.gms.internal.ads.zzdrw.zza(r2)
            com.google.android.gms.internal.ads.zzfdb r3 = r10.zzh
            r3.zzg(r11)
            com.google.android.gms.ads.internal.client.zzr r11 = com.google.android.gms.ads.internal.client.zzr.zzc()
            r3.zzc(r11)
            r3.zza(r0)
            r3.zzv(r2)
            com.google.android.gms.internal.ads.zzfdc r11 = r3.zzz()
            int r2 = com.google.android.gms.internal.ads.zzfia.zzg(r11)
            com.google.android.gms.internal.ads.zzfhr r7 = com.google.android.gms.internal.ads.zzfhr.zzo(r12, r2, r13, r0)
            com.google.android.gms.internal.ads.zzfbv r8 = new com.google.android.gms.internal.ads.zzfbv
            r8.<init>(r1)
            r8.zza = r11
            com.google.android.gms.internal.ads.zzfab r11 = r10.zze
            com.google.android.gms.internal.ads.zzfac r12 = new com.google.android.gms.internal.ads.zzfac
            r12.<init>(r8, r1)
            com.google.android.gms.internal.ads.zzfbt r13 = new com.google.android.gms.internal.ads.zzfbt
            r13.<init>()
            com.google.common.util.concurrent.ListenableFuture r11 = r11.zzc(r12, r13, r1)
            r10.zzi = r11
            com.google.android.gms.internal.ads.zzfbs r3 = new com.google.android.gms.internal.ads.zzfbs
            r4 = r10
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r12 = r4.zzb
            com.google.android.gms.internal.ads.zzgot.zzq(r11, r3, r12)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbw.zza(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzelw, com.google.android.gms.internal.ads.zzelx):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfbn zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzfab zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzfie zzi() {
        return this.zzg;
    }

    public final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
