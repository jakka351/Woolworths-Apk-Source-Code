package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.h(context, "context");
        Intrinsics.h(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        WorkManagerImpl workManagerImplE = WorkManagerImpl.e(getApplicationContext());
        Intrinsics.g(workManagerImplE, "getInstance(applicationContext)");
        WorkDatabase workDatabase = workManagerImplE.c;
        Intrinsics.g(workDatabase, "workManager.workDatabase");
        WorkSpecDao workSpecDaoZ = workDatabase.z();
        WorkNameDao workNameDaoX = workDatabase.x();
        WorkTagDao workTagDaoA = workDatabase.A();
        SystemIdInfoDao systemIdInfoDaoW = workDatabase.w();
        workManagerImplE.b.d.getClass();
        ArrayList arrayListQ = workSpecDaoZ.q(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListB = workSpecDaoZ.B();
        ArrayList arrayListW = workSpecDaoZ.w();
        if (!arrayListQ.isEmpty()) {
            Logger loggerE = Logger.e();
            String str = DiagnosticsWorkerKt.f4016a;
            loggerE.f(str, "Recently completed work:\n\n");
            Logger.e().f(str, DiagnosticsWorkerKt.a(workNameDaoX, workTagDaoA, systemIdInfoDaoW, arrayListQ));
        }
        if (!arrayListB.isEmpty()) {
            Logger loggerE2 = Logger.e();
            String str2 = DiagnosticsWorkerKt.f4016a;
            loggerE2.f(str2, "Running work:\n\n");
            Logger.e().f(str2, DiagnosticsWorkerKt.a(workNameDaoX, workTagDaoA, systemIdInfoDaoW, arrayListB));
        }
        if (!arrayListW.isEmpty()) {
            Logger loggerE3 = Logger.e();
            String str3 = DiagnosticsWorkerKt.f4016a;
            loggerE3.f(str3, "Enqueued work:\n\n");
            Logger.e().f(str3, DiagnosticsWorkerKt.a(workNameDaoX, workTagDaoA, systemIdInfoDaoW, arrayListW));
        }
        return ListenableWorker.Result.a();
    }
}
