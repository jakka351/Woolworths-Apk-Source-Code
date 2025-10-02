package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class zzext implements zzely {
    protected final zzcgv zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzeyj zzd;
    private final zzfab zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfie zzh;
    private final zzfdb zzi;

    @Nullable
    private ListenableFuture zzj;

    public zzext(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzeyj zzeyjVar, zzfdb zzfdbVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgvVar;
        this.zze = zzfabVar;
        this.zzd = zzeyjVar;
        this.zzi = zzfdbVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgvVar.zzv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzcuy zzg(zzezz zzezzVar) {
        zzexq zzexqVar = (zzexq) zzezzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziU)).booleanValue()) {
            zzcoh zzcohVar = new zzcoh(this.zzg);
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zza(this.zzb);
            zzcvaVar.zzb(zzexqVar.zza);
            zzcvb zzcvbVarZze = zzcvaVar.zze();
            zzdbr zzdbrVar = new zzdbr();
            zzeyj zzeyjVar = this.zzd;
            Executor executor = this.zzc;
            zzdbrVar.zzd(zzeyjVar, executor);
            zzdbrVar.zzg(zzeyjVar, executor);
            return zzc(zzcohVar, zzcvbVarZze, zzdbrVar.zzn());
        }
        zzeyj zzeyjVarZzn = zzeyj.zzn(this.zzd);
        zzdbr zzdbrVar2 = new zzdbr();
        Executor executor2 = this.zzc;
        zzdbrVar2.zzc(zzeyjVarZzn, executor2);
        zzdbrVar2.zzi(zzeyjVarZzn, executor2);
        zzdbrVar2.zzj(zzeyjVarZzn, executor2);
        zzdbrVar2.zzk(zzeyjVarZzn, executor2);
        zzdbrVar2.zzd(zzeyjVarZzn, executor2);
        zzdbrVar2.zzg(zzeyjVarZzn, executor2);
        zzdbrVar2.zzl(zzeyjVarZzn);
        zzcoh zzcohVar2 = new zzcoh(this.zzg);
        zzcva zzcvaVar2 = new zzcva();
        zzcvaVar2.zza(this.zzb);
        zzcvaVar2.zzb(zzexqVar.zza);
        return zzc(zzcohVar2, zzcvaVar2.zze(), zzdbrVar2.zzn());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzely
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm r10, java.lang.String r11, com.google.android.gms.internal.ads.zzelw r12, com.google.android.gms.internal.ads.zzelx r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzext.zza(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzelw, com.google.android.gms.internal.ads.zzelx):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public abstract zzcuy zzc(zzcoh zzcohVar, zzcvb zzcvbVar, zzdbs zzdbsVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    public final /* synthetic */ void zze() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzeyj zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzfab zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzfie zzk() {
        return this.zzh;
    }

    public final /* synthetic */ void zzl(ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
