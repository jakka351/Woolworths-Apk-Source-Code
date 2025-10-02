package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public class SystemJobScheduler implements Scheduler {
    public static final String i = Logger.g("SystemJobScheduler");
    public final Context d;
    public final JobScheduler e;
    public final SystemJobInfoConverter f;
    public final WorkDatabase g;
    public final Configuration h;

    public SystemJobScheduler(Context context, WorkDatabase workDatabase, Configuration configuration) {
        JobScheduler jobSchedulerB = JobSchedulerExtKt.b(context);
        SystemJobInfoConverter systemJobInfoConverter = new SystemJobInfoConverter(context, configuration.d, configuration.l);
        this.d = context;
        this.e = jobSchedulerB;
        this.f = systemJobInfoConverter;
        this.g = workDatabase;
        this.h = configuration;
    }

    public static void d(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            Logger.e().d(i, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = JobSchedulerExtKt.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static WorkGenerationalId f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean a() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.d;
        JobScheduler jobScheduler = this.e;
        ArrayList arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                WorkGenerationalId workGenerationalIdF = f(jobInfo);
                if (workGenerationalIdF != null && str.equals(workGenerationalIdF.f3985a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            d(jobScheduler, ((Integer) it2.next()).intValue());
        }
        this.g.w().g(str);
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        int iIntValue;
        Configuration configuration = this.h;
        WorkDatabase workDatabase = this.g;
        final IdGenerator idGenerator = new IdGenerator(workDatabase);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.c();
            try {
                WorkSpecDao workSpecDaoZ = workDatabase.z();
                String str = workSpec.f3990a;
                WorkSpec workSpecT = workSpecDaoZ.t(str);
                String str2 = i;
                if (workSpecT == null) {
                    Logger.e().h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (workSpecT.b != WorkInfo.State.d) {
                    Logger.e().h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
                    SystemIdInfo systemIdInfoD = workDatabase.w().d(workGenerationalIdA);
                    if (systemIdInfoD != null) {
                        iIntValue = systemIdInfoD.c;
                    } else {
                        configuration.getClass();
                        final int i2 = configuration.i;
                        Object objP = idGenerator.f3998a.p(new Callable() { // from class: androidx.work.impl.utils.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = idGenerator.f3998a;
                                Long lB = workDatabase2.u().b("next_job_scheduler_id");
                                int i3 = 0;
                                int iLongValue = lB != null ? (int) lB.longValue() : 0;
                                workDatabase2.u().a(new Preference("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i2) {
                                    workDatabase2.u().a(new Preference("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i3 = iLongValue;
                                }
                                return Integer.valueOf(i3);
                            }
                        });
                        Intrinsics.g(objP, "workDatabase.runInTransa…d\n            }\n        )");
                        iIntValue = ((Number) objP).intValue();
                    }
                    if (systemIdInfoD == null) {
                        workDatabase.w().b(new SystemIdInfo(workGenerationalIdA.f3985a, workGenerationalIdA.b, iIntValue));
                    }
                    g(workSpec, iIntValue);
                    workDatabase.r();
                }
            } finally {
                workDatabase.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(WorkSpec workSpec, int i2) {
        int i3;
        String str;
        SystemJobInfoConverter systemJobInfoConverter = this.f;
        systemJobInfoConverter.getClass();
        Constraints constraints = workSpec.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = workSpec.f3990a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i2, systemJobInfoConverter.f3956a).setRequiresCharging(constraints.c);
        boolean z = constraints.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = constraints.a();
        int i4 = Build.VERSION.SDK_INT;
        if (networkRequestA != null) {
            SystemJobInfoConverterExtKt.a(extras, networkRequestA);
        } else {
            NetworkType networkType = constraints.f3893a;
            if (i4 < 30 || networkType != NetworkType.i) {
                int iOrdinal = networkType.ordinal();
                if (iOrdinal == 0) {
                    i3 = 0;
                } else if (iOrdinal != 1) {
                    i3 = 2;
                    if (iOrdinal != 2) {
                        i3 = 3;
                        if (iOrdinal != 3) {
                            i3 = 4;
                            if (iOrdinal != 4) {
                                Logger.e().a(SystemJobInfoConverter.d, "API version too low. Cannot convert network type value " + networkType);
                                i3 = 1;
                            }
                        }
                    }
                } else {
                    i3 = 1;
                }
                extras.setRequiredNetworkType(i3);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z) {
            extras.setBackoffCriteria(workSpec.m, workSpec.l == BackoffPolicy.e ? 0 : 1);
        }
        long jMax = Math.max(workSpec.a() - systemJobInfoConverter.b.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.q && systemJobInfoConverter.c) {
            extras.setImportantWhileForeground(true);
        }
        if (constraints.b()) {
            for (Constraints.ContentUriTrigger contentUriTrigger : constraints.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(contentUriTrigger.getF3895a(), contentUriTrigger.getB() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(constraints.g);
            extras.setTriggerContentMaxDelay(constraints.h);
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(constraints.e);
        extras.setRequiresStorageNotLow(constraints.f);
        byte b = workSpec.k > 0;
        boolean z2 = jMax > 0;
        if (i5 >= 31 && workSpec.q && b == false && !z2) {
            extras.setExpedited(true);
        }
        if (i5 >= 35 && (str = workSpec.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        String str3 = i;
        Logger.e().a(str3, "Scheduling work ID " + str2 + "Job ID " + i2);
        try {
            if (this.e.schedule(jobInfoBuild) == 0) {
                Logger.e().h(str3, "Unable to schedule work ID " + str2);
                if (workSpec.q && workSpec.r == OutOfQuotaPolicy.d) {
                    workSpec.q = false;
                    Logger.e().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(workSpec, i2);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = JobSchedulerExtKt.f3955a;
            Context context = this.d;
            Intrinsics.h(context, "context");
            WorkDatabase workDatabase = this.g;
            Intrinsics.h(workDatabase, "workDatabase");
            Configuration configuration = this.h;
            Intrinsics.h(configuration, "configuration");
            int i6 = Build.VERSION.SDK_INT;
            int i7 = i6 >= 31 ? 150 : 100;
            int size = workDatabase.z().s().size();
            String strM = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler jobSchedulerB = JobSchedulerExtKt.b(context);
                List listA = JobSchedulerExtKt.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListE = e(context, jobSchedulerB);
                    int size2 = arrayListE != null ? listA.size() - arrayListE.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListE2 = e(context, (JobScheduler) systemService);
                    int size3 = arrayListE2 != null ? arrayListE2.size() : 0;
                    strM = CollectionsKt.M(ArraysKt.F(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListE3 = e(context, JobSchedulerExtKt.b(context));
                if (arrayListE3 != null) {
                    strM = arrayListE3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbP = androidx.constraintlayout.core.state.a.p("JobScheduler ", i7, " job limit exceeded.\nIn JobScheduler there are ", strM, ".\nThere are ");
            sbP.append(size);
            sbP.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strL = YU.a.l(sbP, configuration.k, JwtParser.SEPARATOR_CHAR);
            Logger.e().c(str3, strL);
            throw new IllegalStateException(strL, e);
        } catch (Throwable th) {
            Logger.e().d(str3, "Unable to schedule " + workSpec, th);
        }
    }
}
