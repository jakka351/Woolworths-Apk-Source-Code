package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class JobSchedulerExtKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3955a;

    static {
        String strG = Logger.g("SystemJobScheduler");
        Intrinsics.g(strG, "tagWithPrefix(\"SystemJobScheduler\")");
        f3955a = strG;
    }

    public static final List a(JobScheduler jobScheduler) {
        Intrinsics.h(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            Intrinsics.g(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th) {
            Logger.e().d(f3955a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        Intrinsics.h(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        Intrinsics.g(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }
}
