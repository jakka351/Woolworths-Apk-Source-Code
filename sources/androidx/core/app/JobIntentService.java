package androidx.core.app;

import YU.a;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    CompatJobEngine mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final ArrayList<CompatWorkItem> mCompatQueue = null;

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                GenericWorkItem genericWorkItemDequeueWork = jobIntentService.dequeueWork();
                if (genericWorkItemDequeueWork == null) {
                    return null;
                }
                jobIntentService.onHandleWork(genericWorkItemDequeueWork.getIntent());
                genericWorkItemDequeueWork.complete();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            JobIntentService.this.processorFinished();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            JobIntentService.this.processorFinished();
        }
    }

    public interface CompatJobEngine {
        IBinder a();

        JobServiceEngineImpl.WrapperWorkItem b();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        public boolean d;
        public boolean e;

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void a(Intent intent) {
            new Intent(intent).setComponent(this.f2397a);
            throw null;
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void c() {
            synchronized (this) {
                try {
                    if (this.e) {
                        if (this.d) {
                            throw null;
                        }
                        this.e = false;
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void d() {
            synchronized (this) {
                try {
                    if (!this.e) {
                        this.e = true;
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void e() {
            synchronized (this) {
                this.d = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f2394a;
        public final int b;

        public CompatWorkItem(Intent intent, int i) {
            this.f2394a = intent;
            this.b = i;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public final void complete() {
            JobIntentService.this.stopSelf(this.b);
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public final Intent getIntent() {
            return this.f2394a;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    @RequiresApi
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: a, reason: collision with root package name */
        public final JobIntentService f2395a;
        public final Object b;
        public JobParameters c;

        public final class WrapperWorkItem implements GenericWorkItem {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f2396a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f2396a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public final void complete() {
                synchronized (JobServiceEngineImpl.this.b) {
                    try {
                        JobParameters jobParameters = JobServiceEngineImpl.this.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f2396a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public final Intent getIntent() {
                return this.f2396a.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.b = new Object();
            this.f2395a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public final IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public final WrapperWorkItem b() {
            synchronized (this.b) {
                try {
                    JobParameters jobParameters = this.c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f2395a.getClassLoader());
                    return new WrapperWorkItem(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.f2395a.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            boolean zDoStopCurrentWork = this.f2395a.doStopCurrentWork();
            synchronized (this.b) {
                this.c = null;
            }
            return zDoStopCurrentWork;
        }
    }

    @RequiresApi
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        public final JobInfo d;
        public final JobScheduler e;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    public static abstract class WorkEnqueuer {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f2397a;
        public boolean b;
        public int c;

        public WorkEnqueuer(ComponentName componentName) {
            this.f2397a = componentName;
        }

        public abstract void a(Intent intent);

        public final void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else {
                if (this.c == i) {
                    return;
                }
                StringBuilder sbR = a.r(i, "Given job ID ", " is different than previous ");
                sbR.append(this.c);
                throw new IllegalArgumentException(sbR.toString());
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, WorkEnqueuer> map = sClassWorkEnqueuer;
        WorkEnqueuer workEnqueuer = map.get(componentName);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        JobWorkEnqueuer jobWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i);
        map.put(componentName, jobWorkEnqueuer);
        return jobWorkEnqueuer;
    }

    public GenericWorkItem dequeueWork() {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.b();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean doStopCurrentWork() {
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && z) {
                workEnqueuer.d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new JobServiceEngineImpl(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.e();
        synchronized (this.mCompatQueue) {
            ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<CompatWorkItem> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            WorkEnqueuer workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.b(i);
            workEnqueuer.a(intent);
        }
    }
}
