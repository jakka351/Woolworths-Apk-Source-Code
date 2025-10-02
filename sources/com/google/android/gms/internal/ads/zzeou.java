package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzeou implements zzeup {
    private final zzgpd zza;
    private final Context zzb;

    public zzeou(zzgpd zzgpdVar, Context context) {
        this.zza = zzgpdVar;
        this.zzb = context;
    }

    @SuppressLint
    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    @SuppressLint
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeot
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 14;
    }

    public final /* synthetic */ zzeov zzc() {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmO)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            Intent intentZzd = zzd();
            boolean zZze = zze(intentZzd);
            intExtra = intentZzd != null ? intentZzd.getIntExtra("level", -1) / intentZzd.getIntExtra("scale", -1) : -1.0d;
            zIsCharging = zZze;
        }
        return new zzeov(intExtra, zIsCharging);
    }
}
