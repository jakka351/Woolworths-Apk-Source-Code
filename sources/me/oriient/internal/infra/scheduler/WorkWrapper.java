package me.oriient.internal.infra.scheduler;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lme/oriient/internal/infra/scheduler/WorkWrapper;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkWrapper extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkWrapper(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        return ((Boolean) BuildersKt.d(EmptyCoroutineContext.d, new c(this, null))).booleanValue() ? ListenableWorker.Result.a() : new ListenableWorker.Result.Failure();
    }
}
