package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzbx {
    @NotNull
    public static final Deferred zza(@NotNull Task task) {
        final CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                CompletableDeferred completableDeferred = completableDeferredA;
                Exception exception = task2.getException();
                if (exception != null) {
                    completableDeferred.g(exception);
                } else if (task2.isCanceled()) {
                    completableDeferred.cancel((CancellationException) null);
                } else {
                    completableDeferred.h(task2.getResult());
                }
            }
        });
        return new zzbw(completableDeferredA);
    }
}
