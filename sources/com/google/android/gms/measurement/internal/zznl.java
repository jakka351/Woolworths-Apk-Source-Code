package com.google.android.gms.measurement.internal;

import YU.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.medallia.digital.mobilesdk.l8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zznl extends zzg {
    private final zznf zza;
    private zzgb zzb;
    private volatile Boolean zzc;
    private final zzay zzd;
    private ScheduledExecutorService zze;
    private final zzog zzf;
    private final List zzg;
    private final zzay zzh;

    public zznl(zzic zzicVar) {
        super(zzicVar);
        this.zzg = new ArrayList();
        this.zzf = new zzog(zzicVar.zzaZ());
        this.zza = new zznf(this);
        this.zzd = new zzmm(this, zzicVar);
        this.zzh = new zzmq(this, zzicVar);
    }

    private final boolean zzad() {
        this.zzu.zzaU();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzV() {
        zzg();
        this.zzf.zza();
        this.zzu.zzc();
        this.zzd.zzb(((Long) zzfy.zzY.zzb(null)).longValue());
    }

    @WorkerThread
    private final void zzaf(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzh()) {
            runnable.run();
            return;
        }
        List list = this.zzg;
        long size = list.size();
        zzic zzicVar = this.zzu;
        zzicVar.zzc();
        if (size >= 1000) {
            c.w(zzicVar, "Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.zzh.zzb(l8.b.b);
        zzI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzX() {
        zzg();
        zzgs zzgsVarZzk = this.zzu.zzaV().zzk();
        List list = this.zzg;
        zzgsVarZzk.zzb("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.zzu.zzaV().zzb().zzb("Task exception while flushing queue", e);
            }
        }
        this.zzg.clear();
        this.zzh.zzd();
    }

    @WorkerThread
    private final zzr zzah(boolean z) {
        Pair pairZzb;
        zzic zzicVar = this.zzu;
        zzicVar.zzaU();
        zzgi zzgiVarZzv = this.zzu.zzv();
        String strP = null;
        if (z) {
            zzic zzicVar2 = zzicVar.zzaV().zzu;
            if (zzicVar2.zzd().zzb != null && (pairZzb = zzicVar2.zzd().zzb.zzb()) != null && pairZzb != zzhh.zza) {
                String strValueOf = String.valueOf(pairZzb.second);
                String str = (String) pairZzb.first;
                strP = a.p(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
            }
        }
        return zzgiVarZzv.zzh(strP);
    }

    @WorkerThread
    public final void zzA(zzpl zzplVar) {
        zzg();
        zzb();
        zzad();
        zzaf(new zzmg(this, zzah(true), this.zzu.zzm().zzj(zzplVar), zzplVar));
    }

    @WorkerThread
    public final void zzB() throws IllegalStateException {
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(false);
        zzad();
        this.zzu.zzm().zzh();
        zzaf(new zzmh(this, zzrVarZzah));
    }

    @WorkerThread
    public final void zzC(AtomicReference atomicReference) {
        zzg();
        zzb();
        zzaf(new zzmi(this, atomicReference, zzah(false)));
    }

    @WorkerThread
    public final void zzD(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzmj(this, zzah(false), zzcuVar));
    }

    @WorkerThread
    public final void zzE() throws IllegalStateException {
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(true);
        zzad();
        this.zzu.zzc().zzp(null, zzfy.zzbb);
        this.zzu.zzm().zzn();
        zzaf(new zzmk(this, zzrVarZzah, true));
    }

    @WorkerThread
    public final void zzF() throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzml(this, zzah(true)));
    }

    @WorkerThread
    public final void zzG(zzlu zzluVar) {
        zzg();
        zzb();
        zzaf(new zzmn(this, zzluVar));
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        zzg();
        zzb();
        zzbe zzbeVar = new zzbe(bundle);
        zzad();
        zzaf(new zzmo(this, true, zzah(false), this.zzu.zzc().zzp(null, zzfy.zzbb) && this.zzu.zzm().zzl(zzbeVar), zzbeVar, bundle));
    }

    @WorkerThread
    public final void zzI() {
        zzg();
        zzb();
        if (zzh()) {
            return;
        }
        if (zzK()) {
            this.zza.zzc();
            return;
        }
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzE()) {
            return;
        }
        zzicVar.zzaU();
        List<ResolveInfo> listQueryIntentServices = zzicVar.zzaY().getPackageManager().queryIntentServices(new Intent().setClassName(zzicVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            c.w(zzicVar, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzaU();
        intent.setComponent(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zza(intent);
    }

    public final Boolean zzJ() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzK() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.zzK():boolean");
    }

    @WorkerThread
    public final void zzL(zzgb zzgbVar) {
        zzg();
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = zzgbVar;
        zzV();
        zzX();
    }

    @WorkerThread
    public final void zzM() {
        zzg();
        zzb();
        zznf zznfVar = this.zza;
        zznfVar.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzu.zzaY(), zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    @WorkerThread
    public final void zzN(com.google.android.gms.internal.measurement.zzcu zzcuVar, zzbg zzbgVar, String str) throws IllegalStateException {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzai(12451000) == 0) {
            zzaf(new zzmp(this, zzbgVar, str, zzcuVar));
        } else {
            zzicVar.zzaV().zze().zza("Not bundling data. Service unavailable or out of date");
            zzicVar.zzk().zzao(zzcuVar, new byte[0]);
        }
    }

    @WorkerThread
    public final boolean zzO() {
        zzg();
        zzb();
        return !zzK() || this.zzu.zzk().zzah() >= ((Integer) zzfy.zzaJ.zzb(null)).intValue();
    }

    @WorkerThread
    public final boolean zzP() {
        zzg();
        zzb();
        return !zzK() || this.zzu.zzk().zzah() >= 241200;
    }

    public final /* synthetic */ void zzQ() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            c.w(this.zzu, "Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgbVar.zzy(zzrVarZzah);
            zzV();
        } catch (RemoteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to send storage consent settings to the service", e);
        }
    }

    public final /* synthetic */ void zzR() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            c.w(this.zzu, "Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgbVar.zzz(zzrVarZzah);
            zzV();
        } catch (RemoteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to send Dma consent settings to the service", e);
        }
    }

    public final /* synthetic */ void zzS(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        zzgb zzgbVar;
        synchronized (atomicReference) {
            try {
                zzgbVar = this.zzb;
            } catch (RemoteException e) {
                this.zzu.zzaV().zzb().zzb("Failed to request trigger URIs; remote exception", e);
                atomicReference.notifyAll();
            }
            if (zzgbVar == null) {
                this.zzu.zzaV().zzb().zza("Failed to request trigger URIs; not connected to service");
                return;
            }
            Preconditions.checkNotNull(zzrVar);
            zzgbVar.zzD(zzrVar, bundle, new zzme(this, atomicReference));
            zzV();
        }
    }

    public final /* synthetic */ void zzT(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        zzgb zzgbVar;
        synchronized (atomicReference) {
            try {
                zzgbVar = this.zzb;
            } catch (RemoteException e) {
                this.zzu.zzaV().zzb().zzb("[sgtm] Failed to get upload batches; remote exception", e);
                atomicReference.notifyAll();
            }
            if (zzgbVar == null) {
                this.zzu.zzaV().zzb().zza("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            Preconditions.checkNotNull(zzrVar);
            zzgbVar.zzB(zzrVar, zzooVar, new zzmf(this, atomicReference));
            zzV();
        }
    }

    public final /* synthetic */ void zzU(zzr zzrVar, zzaf zzafVar) {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            c.w(this.zzu, "[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzgbVar.zzC(zzrVar, zzafVar);
            zzV();
        } catch (RemoteException e) {
            this.zzu.zzaV().zzb().zzc("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.zza), e);
        }
    }

    public final /* synthetic */ void zzW(ComponentName componentName) {
        zzg();
        if (this.zzb != null) {
            this.zzb = null;
            this.zzu.zzaV().zzk().zzb("Disconnected from device MeasurementService", componentName);
            zzg();
            zzI();
        }
    }

    public final /* synthetic */ zznf zzY() {
        return this.zza;
    }

    public final /* synthetic */ zzgb zzZ() {
        return this.zzb;
    }

    public final /* synthetic */ void zzaa(zzgb zzgbVar) {
        this.zzb = null;
    }

    public final /* synthetic */ ScheduledExecutorService zzab() {
        return this.zze;
    }

    public final /* synthetic */ void zzac(ScheduledExecutorService scheduledExecutorService) {
        this.zze = scheduledExecutorService;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final boolean zzh() {
        zzg();
        zzb();
        return this.zzb != null;
    }

    @WorkerThread
    public final void zzi() {
        zzg();
        zzb();
        zzaf(new zzmr(this, zzah(true)));
    }

    @WorkerThread
    public final void zzj(boolean z) {
        zzg();
        zzb();
        if (zzO()) {
            zzaf(new zzms(this, zzah(false)));
        }
    }

    @WorkerThread
    public final void zzk(boolean z) {
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzQ();
            }
        });
    }

    @WorkerThread
    public final void zzl() throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzng
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(com.google.android.gms.measurement.internal.zzgb r59, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r60, com.google.android.gms.measurement.internal.zzr r61) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.zzm(com.google.android.gms.measurement.internal.zzgb, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzr):void");
    }

    @WorkerThread
    public final void zzn(zzbg zzbgVar, String str) {
        Preconditions.checkNotNull(zzbgVar);
        zzg();
        zzb();
        zzad();
        zzaf(new zzmt(this, true, zzah(true), this.zzu.zzm().zzi(zzbgVar), zzbgVar, str));
    }

    @WorkerThread
    public final void zzp(zzah zzahVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzb();
        this.zzu.zzaU();
        zzaf(new zzmu(this, true, zzah(true), this.zzu.zzm().zzk(zzahVar), new zzah(zzahVar), zzahVar));
    }

    @WorkerThread
    public final void zzq(AtomicReference atomicReference, String str, String str2, String str3) throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzmv(this, atomicReference, null, str2, str3, zzah(false)));
    }

    @WorkerThread
    public final void zzs(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2) throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzmw(this, str, str2, zzah(false), zzcuVar));
    }

    @WorkerThread
    public final void zzt(AtomicReference atomicReference, String str, String str2, String str3, boolean z) throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzmx(this, atomicReference, null, str2, str3, zzah(false), z));
    }

    @WorkerThread
    public final void zzu(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2, boolean z) throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzmc(this, str, str2, zzah(false), z, zzcuVar));
    }

    @WorkerThread
    public final void zzv(AtomicReference atomicReference, boolean z) throws IllegalStateException {
        zzg();
        zzb();
        zzaf(new zzmd(this, atomicReference, zzah(false), z));
    }

    @WorkerThread
    public final void zzw(final AtomicReference atomicReference, final Bundle bundle) throws IllegalStateException {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS(atomicReference, zzrVarZzah, bundle);
            }
        });
    }

    @WorkerThread
    public final void zzx(final AtomicReference atomicReference, final zzoo zzooVar) throws IllegalStateException {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT(atomicReference, zzrVarZzah, zzooVar);
            }
        });
    }

    @WorkerThread
    public final void zzy(final zzaf zzafVar) throws IllegalStateException {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(true);
        Preconditions.checkNotNull(zzrVarZzah);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzU(zzrVarZzah, zzafVar);
            }
        });
    }

    @WorkerThread
    public final zzao zzz() {
        zzg();
        zzb();
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzI();
            this.zzu.zzaV().zzj().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr zzrVarZzah = zzah(false);
        Preconditions.checkNotNull(zzrVarZzah);
        try {
            zzao zzaoVarZzw = zzgbVar.zzw(zzrVarZzah);
            zzV();
            return zzaoVarZzw;
        } catch (RemoteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to get consents; remote exception", e);
            return null;
        }
    }
}
