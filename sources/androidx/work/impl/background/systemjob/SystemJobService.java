package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements ExecutionListener {
    public static final String h = Logger.g("SystemJobService");
    public WorkManagerImpl d;
    public final HashMap e = new HashMap();
    public final StartStopTokens f = StartStopTokens.Companion.a(false);
    public WorkLauncherImpl g;

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    public static class Api28Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api31Impl {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.h;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(YU.a.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static WorkGenerationalId b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void d(WorkGenerationalId workGenerationalId, boolean z) {
        a("onExecuted");
        Logger.e().a(h, workGenerationalId.f3985a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.e.remove(workGenerationalId);
        this.f.b(workGenerationalId);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImplE = WorkManagerImpl.e(getApplicationContext());
            this.d = workManagerImplE;
            Processor processor = workManagerImplE.f;
            this.g = new WorkLauncherImpl(processor, workManagerImplE.d);
            processor.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            Logger.e().h(h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.d;
        if (workManagerImpl != null) {
            workManagerImpl.f.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        WorkManagerImpl workManagerImpl = this.d;
        String str = h;
        if (workManagerImpl == null) {
            Logger.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdB = b(jobParameters);
        if (workGenerationalIdB == null) {
            Logger.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.e;
        if (map.containsKey(workGenerationalIdB)) {
            Logger.e().a(str, "Job is already being executed by SystemJobService: " + workGenerationalIdB);
            return false;
        }
        Logger.e().a(str, "onStartJob for " + workGenerationalIdB);
        map.put(workGenerationalIdB, jobParameters);
        WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
        if (jobParameters.getTriggeredContentUris() != null) {
            runtimeExtras.b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            runtimeExtras.f3915a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        runtimeExtras.c = jobParameters.getNetwork();
        this.g.c(this.f.d(workGenerationalIdB), runtimeExtras);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.d == null) {
            Logger.e().a(h, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdB = b(jobParameters);
        if (workGenerationalIdB == null) {
            Logger.e().c(h, "WorkSpec id not found!");
            return false;
        }
        Logger.e().a(h, "onStopJob for " + workGenerationalIdB);
        this.e.remove(workGenerationalIdB);
        StartStopToken startStopTokenB = this.f.b(workGenerationalIdB);
        if (startStopTokenB != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(jobParameters) : -512;
            WorkLauncherImpl workLauncherImpl = this.g;
            workLauncherImpl.getClass();
            workLauncherImpl.a(startStopTokenB, iA);
        }
        Processor processor = this.d.f;
        String str = workGenerationalIdB.f3985a;
        synchronized (processor.k) {
            zContains = processor.i.contains(str);
        }
        return !zContains;
    }
}
