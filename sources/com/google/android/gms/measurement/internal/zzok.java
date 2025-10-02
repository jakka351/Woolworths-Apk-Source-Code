package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.salesforce.marketingcloud.UrlHandler;

/* loaded from: classes.dex */
public final class zzok extends zzos {
    private final AlarmManager zza;
    private zzay zzb;
    private Integer zzc;

    public zzok(zzpg zzpgVar) {
        super(zzpgVar);
        this.zza = (AlarmManager) this.zzu.zzaY().getSystemService("alarm");
    }

    private final zzay zzf() {
        if (this.zzb == null) {
            this.zzb = new zzoj(this, this.zzg.zzag());
        }
        return this.zzb;
    }

    @TargetApi
    private final void zzh() {
        JobScheduler jobScheduler = (JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi());
        }
    }

    private final int zzi() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzj() {
        Context contextZzaY = this.zzu.zzaY();
        return PendingIntent.getBroadcast(contextZzaY, 0, new Intent().setClassName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcg.zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzh();
        return false;
    }

    public final void zzc(long j) {
        zzaw();
        zzic zzicVar = this.zzu;
        zzicVar.zzaU();
        Context contextZzaY = zzicVar.zzaY();
        if (!zzpp.zzau(contextZzaY)) {
            zzicVar.zzaV().zzj().zza("Receiver not registered/enabled");
        }
        if (!zzpp.zzQ(contextZzaY, false)) {
            zzicVar.zzaV().zzj().zza("Service not registered/enabled");
        }
        zzd();
        zzicVar.zzaV().zzk().zzb("Scheduling upload, millis", Long.valueOf(j));
        zzicVar.zzaZ().elapsedRealtime();
        zzicVar.zzc();
        if (j < Math.max(0L, ((Long) zzfy.zzL.zzb(null)).longValue()) && !zzf().zzc()) {
            zzf().zzb(j);
        }
        zzicVar.zzaU();
        Context contextZzaY2 = zzicVar.zzaY();
        ComponentName componentName = new ComponentName(contextZzaY2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzi = zzi();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(UrlHandler.ACTION, "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzch.zza(contextZzaY2, new JobInfo.Builder(iZzi, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void zzd() {
        zzaw();
        this.zzu.zzaV().zzk().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzf().zzd();
        zzh();
    }
}
