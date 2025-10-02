package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo
/* loaded from: classes.dex */
public class WorkForegroundUpdater implements ForegroundUpdater {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerTaskExecutor f4006a;
    public final Processor b;
    public final WorkSpecDao c;

    static {
        Logger.g("WMFgUpdater");
    }

    public WorkForegroundUpdater(WorkDatabase workDatabase, Processor processor, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.b = processor;
        this.f4006a = workManagerTaskExecutor;
        this.c = workDatabase.z();
    }

    public final ListenableFuture a(Context context, UUID uuid, ForegroundInfo foregroundInfo) {
        SerialExecutorImpl serialExecutorImpl = this.f4006a.f4014a;
        b bVar = new b(this, uuid, foregroundInfo, context, 0);
        Intrinsics.h(serialExecutorImpl, "<this>");
        return CallbackToFutureAdapter.a(new f(4, serialExecutorImpl, "setForegroundAsync", bVar));
    }
}
