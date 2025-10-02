package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class w extends t {
    public final /* synthetic */ TaskCompletionSource g;
    public final /* synthetic */ t h;
    public final /* synthetic */ ae i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.i = aeVar;
        this.g = taskCompletionSource2;
        this.h = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.i.f) {
            try {
                final ae aeVar = this.i;
                final TaskCompletionSource taskCompletionSource = this.g;
                aeVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ae aeVar2 = aeVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (aeVar2.f) {
                            aeVar2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.i.l.getAndIncrement() > 0) {
                    this.i.b.b("Already connected to the service.", new Object[0]);
                }
                ae.b(this.i, this.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
