package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkForegroundKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4005a;

    static {
        String strG = Logger.g("WorkForegroundRunnable");
        Intrinsics.g(strG, "tagWithPrefix(\"WorkForegroundRunnable\")");
        f4005a = strG;
    }

    public static final Object a(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, WorkForegroundUpdater workForegroundUpdater, WorkManagerTaskExecutor workManagerTaskExecutor, Continuation continuation) throws Throwable {
        if (workSpec.q && Build.VERSION.SDK_INT < 31) {
            Executor executor = workManagerTaskExecutor.d;
            Intrinsics.g(executor, "taskExecutor.mainThreadExecutor");
            Object objF = BuildersKt.f(ExecutorsKt.a(executor), new WorkForegroundKt$workForeground$2(listenableWorker, workSpec, workForegroundUpdater, context, null), continuation);
            if (objF == CoroutineSingletons.d) {
                return objF;
            }
        }
        return Unit.f24250a;
    }
}
