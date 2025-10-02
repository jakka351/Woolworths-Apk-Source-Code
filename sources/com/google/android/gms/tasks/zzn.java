package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class zzn implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();

    @Nullable
    private OnSuccessListener zzc;

    public zzn(@NonNull Executor executor, @NonNull OnSuccessListener onSuccessListener) {
        this.zza = executor;
        this.zzc = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc == null) {
                        return;
                    }
                    this.zza.execute(new zzm(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    public final /* synthetic */ Object zzc() {
        return this.zzb;
    }

    public final /* synthetic */ OnSuccessListener zzd() {
        return this.zzc;
    }
}
