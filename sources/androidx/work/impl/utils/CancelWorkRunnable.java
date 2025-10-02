package androidx.work.impl.utils;

import androidx.camera.core.impl.utils.futures.e;
import androidx.camera.core.processing.g;
import androidx.work.ConfigurationKt$createDefaultTracer$tracer$1;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class CancelWorkRunnable {
    public static final void a(WorkManagerImpl workManagerImpl, String str) {
        WorkerWrapper workerWrapperB;
        WorkDatabase workDatabase = workManagerImpl.c;
        Intrinsics.g(workDatabase, "workManagerImpl.workDatabase");
        WorkSpecDao workSpecDaoZ = workDatabase.z();
        DependencyDao dependencyDaoT = workDatabase.t();
        ArrayList arrayListZ = CollectionsKt.Z(str);
        while (!arrayListZ.isEmpty()) {
            String str2 = (String) CollectionsKt.j0(arrayListZ);
            WorkInfo.State stateE = workSpecDaoZ.e(str2);
            if (stateE != WorkInfo.State.f && stateE != WorkInfo.State.g) {
                workSpecDaoZ.g(str2);
            }
            arrayListZ.addAll(dependencyDaoT.b(str2));
        }
        Processor processor = workManagerImpl.f;
        Intrinsics.g(processor, "workManagerImpl.processor");
        synchronized (processor.k) {
            Logger.e().a(Processor.l, "Processor cancelling " + str);
            processor.i.add(str);
            workerWrapperB = processor.b(str);
        }
        Processor.d(str, workerWrapperB, 1);
        Iterator it = workManagerImpl.e.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).b(str);
        }
    }

    public static final Operation b(final WorkManagerImpl workManagerImpl, final UUID id) {
        Intrinsics.h(id, "id");
        Intrinsics.h(workManagerImpl, "workManagerImpl");
        ConfigurationKt$createDefaultTracer$tracer$1 configurationKt$createDefaultTracer$tracer$1 = workManagerImpl.b.m;
        SerialExecutorImpl serialExecutorImplD = workManagerImpl.d.d();
        Intrinsics.g(serialExecutorImplD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.a(configurationKt$createDefaultTracer$tracer$1, "CancelWorkById", serialExecutorImplD, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable$forId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WorkManagerImpl workManagerImpl2 = workManagerImpl;
                WorkDatabase workDatabase = workManagerImpl2.c;
                Intrinsics.g(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.q(new e(19, workManagerImpl2, id));
                Schedulers.b(workManagerImpl2.b, workManagerImpl2.c, workManagerImpl2.e);
                return Unit.f24250a;
            }
        });
    }

    public static final Operation c(final WorkManagerImpl workManagerImpl) {
        Intrinsics.h(workManagerImpl, "workManagerImpl");
        ConfigurationKt$createDefaultTracer$tracer$1 configurationKt$createDefaultTracer$tracer$1 = workManagerImpl.b.m;
        String strConcat = "CancelWorkByName_".concat("SYNC_UNIQUE_WORKER_NAME");
        SerialExecutorImpl serialExecutorImplD = workManagerImpl.d.d();
        Intrinsics.g(serialExecutorImplD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.a(configurationKt$createDefaultTracer$tracer$1, strConcat, serialExecutorImplD, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable$forName$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WorkManagerImpl workManagerImpl2 = workManagerImpl;
                Intrinsics.h(workManagerImpl2, "workManagerImpl");
                WorkDatabase workDatabase = workManagerImpl2.c;
                Intrinsics.g(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.q(new g(8, workDatabase, "SYNC_UNIQUE_WORKER_NAME", workManagerImpl2));
                Schedulers.b(workManagerImpl2.b, workDatabase, workManagerImpl2.e);
                return Unit.f24250a;
            }
        });
    }

    public static final Operation d(final WorkManagerImpl workManagerImpl, final String str) {
        ConfigurationKt$createDefaultTracer$tracer$1 configurationKt$createDefaultTracer$tracer$1 = workManagerImpl.b.m;
        String strConcat = "CancelWorkByTag_".concat(str);
        SerialExecutorImpl serialExecutorImplD = workManagerImpl.d.d();
        Intrinsics.g(serialExecutorImplD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.a(configurationKt$createDefaultTracer$tracer$1, strConcat, serialExecutorImplD, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable$forTag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WorkManagerImpl workManagerImpl2 = workManagerImpl;
                WorkDatabase workDatabase = workManagerImpl2.c;
                Intrinsics.g(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.q(new androidx.work.impl.b(2, workDatabase, str, workManagerImpl2));
                Schedulers.b(workManagerImpl2.b, workDatabase, workManagerImpl2.e);
                return Unit.f24250a;
            }
        });
    }
}
