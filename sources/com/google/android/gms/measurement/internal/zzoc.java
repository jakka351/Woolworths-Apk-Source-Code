package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* loaded from: classes.dex */
public final class zzoc extends zzg {
    protected final zzob zza;
    protected final zzoa zzb;
    protected final zzny zzc;
    private Handler zzd;
    private boolean zze;

    public zzoc(zzic zzicVar) {
        super(zzicVar);
        this.zze = true;
        this.zza = new zzob(this);
        this.zzb = new zzoa(this);
        this.zzc = new zzny(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final void zzh(boolean z) {
        zzg();
        this.zze = z;
    }

    @WorkerThread
    public final boolean zzi() {
        zzg();
        return this.zze;
    }

    public final /* synthetic */ void zzk(long j) {
        zzg();
        zzj();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzicVar.zzc().zzp(null, zzfy.zzaU)) {
            if (zzicVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j);
            }
        } else if (zzicVar.zzc().zzv() || zzicVar.zzd().zzn.zza()) {
            this.zzb.zza(j);
        }
        this.zzc.zza();
        zzob zzobVar = this.zza;
        zzoc zzocVar = zzobVar.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzobVar.zzb(zzocVar.zzu.zzaZ().currentTimeMillis(), false);
        }
    }

    public final /* synthetic */ void zzl(long j) {
        zzg();
        zzj();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzb("Activity paused, time", Long.valueOf(j));
        this.zzc.zzb(j);
        if (zzicVar.zzc().zzv()) {
            this.zzb.zzb(j);
        }
    }

    public final /* synthetic */ Handler zzm() {
        return this.zzd;
    }
}
