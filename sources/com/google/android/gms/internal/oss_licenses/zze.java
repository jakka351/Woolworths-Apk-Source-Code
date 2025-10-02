package com.google.android.gms.internal.oss_licenses;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public final class zze {
    public static zzo zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzc zzcVar = new zzc(task, null);
        task.addOnCompleteListener(zzp.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.oss_licenses.zzd
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzc zzcVar2 = zzcVar;
                if (task2.isCanceled()) {
                    zzcVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzcVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzcVar2.zzb(exception);
            }
        });
        return zzcVar;
    }
}
