package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.internal.measurement.zzqp;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzw extends BroadcastReceiver {
    private final zzic zza;

    public zzw(zzic zzicVar) {
        this.zza = zzicVar;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) throws IllegalStateException {
        if (intent == null) {
            c.C(this.zza, "App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            c.C(this.zza, "App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                zzic zzicVar = this.zza;
                zzicVar.zzaV().zzk().zza("[sgtm] App Receiver notified batches are available");
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final zzic zzicVar2 = this.zza;
            zzqp.zza();
            if (zzicVar2.zzc().zzp(null, zzfy.zzaQ)) {
                zzicVar2.zzaV().zzk().zza("App receiver notified triggers are available");
                zzicVar2.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzic zzicVar3 = zzicVar2;
                        if (!zzicVar3.zzk().zzS()) {
                            c.C(zzicVar3, "registerTrigger called but app not eligible");
                            return;
                        }
                        zzicVar3.zzj().zzv();
                        final zzlj zzljVarZzj = zzicVar3.zzj();
                        Objects.requireNonNull(zzljVarZzj);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws IllegalStateException {
                                zzljVarZzj.zzw();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        c.C(this.zza, "App receiver called with unknown action");
    }

    public final /* synthetic */ void zza() {
        this.zza.zzx().zzh(((Long) zzfy.zzC.zzb(null)).longValue());
    }
}
