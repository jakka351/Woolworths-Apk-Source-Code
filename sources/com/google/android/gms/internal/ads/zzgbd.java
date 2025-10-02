package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzgbd extends zzfoh {
    private final zzfvz zzb;

    public zzgbd(Context context, Executor executor, zzfvz zzfvzVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzfvzVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final Task zzb(int i, long j) {
        this.zzb.zzb(i, j, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final Task zzc(int i, long j, Exception exc) {
        this.zzb.zzb(i, j, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final Task zze(int i, String str) {
        this.zzb.zzb(i, -1L, null, str);
        return zzh();
    }
}
