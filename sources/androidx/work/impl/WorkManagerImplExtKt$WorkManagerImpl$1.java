package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements Function6<Context, Configuration, TaskExecutor, WorkDatabase, Trackers, Processor, List<? extends Scheduler>> {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 d = new WorkManagerImplExtKt$WorkManagerImpl$1(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p0 = (Context) obj;
        Configuration p1 = (Configuration) obj2;
        TaskExecutor p2 = (TaskExecutor) obj3;
        WorkDatabase p3 = (WorkDatabase) obj4;
        Trackers p4 = (Trackers) obj5;
        Processor processor = (Processor) obj6;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        Intrinsics.h(p2, "p2");
        Intrinsics.h(p3, "p3");
        Intrinsics.h(p4, "p4");
        String str = Schedulers.f3930a;
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(p0, p3, p1);
        PackageManagerHelper.a(p0, SystemJobService.class, true);
        Logger.e().a(Schedulers.f3930a, "Created SystemJobScheduler and enabled SystemJobService");
        return CollectionsKt.R(systemJobScheduler, new GreedyScheduler(p0, p1, p4, processor, new WorkLauncherImpl(processor, p2), p2));
    }
}
