package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class zzcmu implements zzcvs, zzcxg, zzcwm, com.google.android.gms.ads.internal.client.zza, zzcwi, zzddq, zzcyn {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfcu zze;
    private final zzfcj zzf;
    private final zzfjr zzg;
    private final zzfdp zzh;
    private final zzauu zzi;
    private final zzbdp zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;

    @Nullable
    private final zzcut zzm;
    private final zzcyh zzn;
    private final zzcum zzo;
    private boolean zzp;
    private final AtomicBoolean zzq = new AtomicBoolean();

    public zzcmu(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfcu zzfcuVar, zzfcj zzfcjVar, zzfjr zzfjrVar, zzfdp zzfdpVar, @Nullable View view, @Nullable zzcek zzcekVar, zzauu zzauuVar, zzbdp zzbdpVar, zzbdr zzbdrVar, zzfib zzfibVar, @Nullable zzcut zzcutVar, zzcyh zzcyhVar, zzcum zzcumVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfcuVar;
        this.zzf = zzfcjVar;
        this.zzg = zzfjrVar;
        this.zzh = zzfdpVar;
        this.zzi = zzauuVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcekVar);
        this.zzj = zzbdpVar;
        this.zzm = zzcutVar;
        this.zzn = zzcyhVar;
        this.zzo = zzcumVar;
    }

    private final void zzx(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i;
        zzfcj zzfcjVar = this.zzf;
        List list = zzfcjVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdW)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaI)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbeh.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfcjVar, false, strZzj, null, zzp(), this.zzo), this.zzn);
            return;
        }
        if (((Boolean) zzbeh.zzg.zze()).booleanValue() && ((i = zzfcjVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgot.zzq((zzgol) zzgot.zzi(zzgol.zzw(zzgot.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbj)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcmo(this, strZzj), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmi)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzF(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer numZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
                if (numZzw != null) {
                    int iMin = Math.min(numZzw.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaI)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbeh.zzd.zze()).booleanValue()) {
            zzgot.zzq((zzgol) zzgot.zzg(zzgol.zzw(this.zzj.zzb()), Throwable.class, zzcmt.zza, zzbzh.zzg), new zzcmn(this), this.zzb);
            return;
        }
        zzfdp zzfdpVar = this.zzh;
        zzfjr zzfjrVar = this.zzg;
        zzfcu zzfcuVar = this.zze;
        zzfcj zzfcjVar = this.zzf;
        zzfdpVar.zzb(zzfjrVar.zza(zzfcuVar, zzfcjVar, zzfcjVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
        zzfjr zzfjrVar = this.zzg;
        zzfdp zzfdpVar = this.zzh;
        zzfcj zzfcjVar = this.zzf;
        zzfdpVar.zza(zzfjrVar.zzc(zzfcjVar, zzfcjVar.zzh, zzbvhVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (this.zzq.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzef)).intValue();
            if (iIntValue > 0) {
                zzx(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeg)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzee)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
        zzfjr zzfjrVar = this.zzg;
        zzfcu zzfcuVar = this.zze;
        zzfdp zzfdpVar = this.zzh;
        zzfcj zzfcjVar = this.zzf;
        zzfdpVar.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar, zzfcjVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
        zzfjr zzfjrVar = this.zzg;
        zzfcu zzfcuVar = this.zze;
        zzfdp zzfdpVar = this.zzh;
        zzfcj zzfcjVar = this.zzf;
        zzfdpVar.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar, zzfcjVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
        zzcut zzcutVar;
        try {
            if (this.zzp) {
                ArrayList arrayList = new ArrayList(zzp());
                zzfcj zzfcjVar = this.zzf;
                arrayList.addAll(zzfcjVar.zzf);
                this.zzh.zza(this.zzg.zzb(this.zze, zzfcjVar, true, null, null, arrayList, null), null);
            } else {
                zzfdp zzfdpVar = this.zzh;
                zzfjr zzfjrVar = this.zzg;
                zzfcu zzfcuVar = this.zze;
                zzfcj zzfcjVar2 = this.zzf;
                zzfdpVar.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar2, zzfcjVar2.zzm), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeb)).booleanValue() && (zzcutVar = this.zzm) != null) {
                    List list = zzcutVar.zzb().zzm;
                    String strZzg = zzcutVar.zzc().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfjr.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZzh = zzcutVar.zzc().zzh();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfjr.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                    }
                    zzfdpVar.zza(zzfjrVar.zza(zzcutVar.zza(), zzcutVar.zzb(), arrayList3), null);
                }
                zzfdpVar.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar2, zzfcjVar2.zzf), null);
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzi() {
        zzfjr zzfjrVar = this.zzg;
        zzfcu zzfcuVar = this.zze;
        zzfdp zzfdpVar = this.zzh;
        zzfcj zzfcjVar = this.zzf;
        zzfdpVar.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar, zzfcjVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbI)).booleanValue()) {
            int i = zzeVar.zza;
            zzfcj zzfcjVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfcjVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfjr.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfcjVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyn
    public final void zzk() {
        zzfcj zzfcjVar = this.zzf;
        if (zzfcjVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfcjVar, zzfcjVar.zzaA), null);
        }
    }

    public final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    public final /* synthetic */ void zzm(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i, i2);
            }
        });
    }

    public final /* synthetic */ void zzn(int i, int i2) {
        zzx(i - 1, i2);
    }

    public final /* synthetic */ Context zzq() {
        return this.zza;
    }

    public final /* synthetic */ zzfcu zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzfcj zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzfjr zzt() {
        return this.zzg;
    }

    public final /* synthetic */ zzfdp zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzcyh zzv() {
        return this.zzn;
    }

    public final /* synthetic */ zzcum zzw() {
        return this.zzo;
    }
}
