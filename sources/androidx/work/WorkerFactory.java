package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkerFactory;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkerFactory {
    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(workerClassName, "workerClassName");
        Intrinsics.h(workerParameters, "workerParameters");
        ListenableWorker listenableWorkerA = a(appContext, workerClassName, workerParameters);
        if (listenableWorkerA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
                Intrinsics.g(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                    Intrinsics.g(objNewInstance, "{\n                val co…Parameters)\n            }");
                    listenableWorkerA = (ListenableWorker) objNewInstance;
                } catch (Throwable th) {
                    Logger.e().d(WorkerFactoryKt.f3913a, "Could not instantiate ".concat(workerClassName), th);
                    throw th;
                }
            } catch (Throwable th2) {
                Logger.e().d(WorkerFactoryKt.f3913a, "Invalid class: ".concat(workerClassName), th2);
                throw th2;
            }
        }
        if (!listenableWorkerA.isUsed()) {
            return listenableWorkerA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
