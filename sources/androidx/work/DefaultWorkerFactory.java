package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/DefaultWorkerFactory;", "Landroidx/work/WorkerFactory;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class DefaultWorkerFactory extends WorkerFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultWorkerFactory f3899a = new DefaultWorkerFactory();

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(workerClassName, "workerClassName");
        Intrinsics.h(workerParameters, "workerParameters");
        return null;
    }
}
