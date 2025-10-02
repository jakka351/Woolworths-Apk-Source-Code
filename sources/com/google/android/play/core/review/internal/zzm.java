package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class zzm extends zzj {
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ zzj f;
    public final /* synthetic */ zzt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzt zztVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzj zzjVar) {
        super(taskCompletionSource);
        this.e = taskCompletionSource2;
        this.f = zzjVar;
        this.g = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void a() {
        synchronized (this.g.f) {
            try {
                final zzt zztVar = this.g;
                final TaskCompletionSource taskCompletionSource = this.e;
                zztVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.review.internal.zzl
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        zzt zztVar2 = zztVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (zztVar2.f) {
                            zztVar2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.g.k.getAndIncrement() > 0) {
                    this.g.b.a("Already connected to the service.", new Object[0]);
                }
                zzt.b(this.g, this.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
