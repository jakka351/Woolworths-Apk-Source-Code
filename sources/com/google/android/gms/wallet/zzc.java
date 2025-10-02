package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

@VisibleForTesting
@Deprecated
/* loaded from: classes2.dex */
final class zzc implements OnCompleteListener, Runnable {

    @VisibleForTesting
    static final Handler zza = new com.google.android.gms.internal.wallet.zzd(Looper.getMainLooper());

    @VisibleForTesting
    static final SparseArray zzb = new SparseArray(2);
    private static final AtomicInteger zzd = new AtomicInteger();
    int zzc;

    @Nullable
    private zzd zze;
    private Task zzf;

    public static zzc zza(Task task) {
        zzc zzcVar = new zzc();
        int iIncrementAndGet = zzd.incrementAndGet();
        zzcVar.zzc = iIncrementAndGet;
        zzb.put(iIncrementAndGet, zzcVar);
        zza.postDelayed(zzcVar, AutoResolveHelper.zzb);
        task.addOnCompleteListener(zzcVar);
        return zzcVar;
    }

    private final void zzd() throws PendingIntent.CanceledException {
        if (this.zzf == null || this.zze == null) {
            return;
        }
        zzb.delete(this.zzc);
        zza.removeCallbacks(this);
        zzd zzdVar = this.zze;
        if (zzdVar != null) {
            zzdVar.zzb(this.zzf);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) throws PendingIntent.CanceledException {
        this.zzf = task;
        zzd();
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb.delete(this.zzc);
    }

    public final void zzb(zzd zzdVar) {
        if (this.zze == zzdVar) {
            this.zze = null;
        }
    }

    public final void zzc(zzd zzdVar) {
        this.zze = zzdVar;
        zzd();
    }
}
