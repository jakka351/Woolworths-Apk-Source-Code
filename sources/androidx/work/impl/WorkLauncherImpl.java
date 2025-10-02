package androidx.work.impl;

import androidx.work.WorkerParameters;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkLauncherImpl;", "Landroidx/work/impl/WorkLauncher;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkLauncherImpl implements WorkLauncher {

    /* renamed from: a, reason: collision with root package name */
    public final Processor f3938a;
    public final TaskExecutor b;

    public WorkLauncherImpl(Processor processor, TaskExecutor workTaskExecutor) {
        Intrinsics.h(processor, "processor");
        Intrinsics.h(workTaskExecutor, "workTaskExecutor");
        this.f3938a = processor;
        this.b = workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void a(StartStopToken workSpecId, int i) {
        Intrinsics.h(workSpecId, "workSpecId");
        this.b.b(new StopWorkRunnable(this.f3938a, workSpecId, false, i));
    }

    public final void c(StartStopToken workSpecId, WorkerParameters.RuntimeExtras runtimeExtras) {
        Intrinsics.h(workSpecId, "workSpecId");
        this.b.b(new b(1, this, workSpecId, runtimeExtras));
    }
}
