package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

@RestrictTo
/* loaded from: classes.dex */
public class WorkProgressUpdater implements ProgressUpdater {
    public static final String c = Logger.g("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f4007a;
    public final WorkManagerTaskExecutor b;

    public WorkProgressUpdater(WorkDatabase workDatabase, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f4007a = workDatabase;
        this.b = workManagerTaskExecutor;
    }
}
