package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.SystemClock;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "Builder", "Resolution", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WorkerWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final WorkSpec f3941a;
    public final Context b;
    public final String c;
    public final WorkerParameters.RuntimeExtras d;
    public final WorkManagerTaskExecutor e;
    public final Configuration f;
    public final SystemClock g;
    public final Processor h;
    public final WorkDatabase i;
    public final WorkSpecDao j;
    public final DependencyDao k;
    public final ArrayList l;
    public final String m;
    public final JobImpl n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Builder;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Configuration f3942a;
        public final WorkManagerTaskExecutor b;
        public final Processor c;
        public final WorkDatabase d;
        public final WorkSpec e;
        public final ArrayList f;
        public final Context g;
        public WorkerParameters.RuntimeExtras h;

        public Builder(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, Processor processor, WorkDatabase workDatabase, WorkSpec workSpec, ArrayList arrayList) {
            Intrinsics.h(context, "context");
            Intrinsics.h(configuration, "configuration");
            this.f3942a = configuration;
            this.b = workManagerTaskExecutor;
            this.c = processor;
            this.d = workDatabase;
            this.e = workSpec;
            this.f = arrayList;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "context.applicationContext");
            this.g = applicationContext;
            this.h = new WorkerParameters.RuntimeExtras();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution;", "", "Failed", "Finished", "ResetWorkerStatus", "Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Resolution {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Failed extends Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final ListenableWorker.Result f3943a = new ListenableWorker.Result.Failure();

            /* renamed from: a, reason: from getter */
            public final ListenableWorker.Result getF3943a() {
                return this.f3943a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Finished extends Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final ListenableWorker.Result f3944a;

            public Finished(ListenableWorker.Result result) {
                this.f3944a = result;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class ResetWorkerStatus extends Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final int f3945a;

            public ResetWorkerStatus(int i) {
                this.f3945a = i;
            }

            /* renamed from: a, reason: from getter */
            public final int getF3945a() {
                return this.f3945a;
            }

            public /* synthetic */ ResetWorkerStatus() {
                this(-256);
            }
        }
    }

    public WorkerWrapper(Builder builder) {
        WorkSpec workSpec = builder.e;
        this.f3941a = workSpec;
        this.b = builder.g;
        String str = workSpec.f3990a;
        this.c = str;
        this.d = builder.h;
        this.e = builder.b;
        Configuration configuration = builder.f3942a;
        this.f = configuration;
        this.g = configuration.d;
        this.h = builder.c;
        WorkDatabase workDatabase = builder.d;
        this.i = workDatabase;
        this.j = workDatabase.z();
        this.k = workDatabase.t();
        ArrayList arrayList = builder.f;
        this.l = arrayList;
        this.m = YU.a.o(YU.a.u("Work [ id=", str, ", tags={ "), CollectionsKt.M(arrayList, ",", null, null, null, 62), " } ]");
        this.n = JobKt.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.work.impl.WorkerWrapper r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.a(androidx.work.impl.WorkerWrapper, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(int i) {
        WorkSpecDao workSpecDao = this.j;
        WorkInfo.State state = WorkInfo.State.d;
        String str = this.c;
        workSpecDao.j(state, str);
        this.g.getClass();
        workSpecDao.k(System.currentTimeMillis(), str);
        workSpecDao.r(this.f3941a.v, str);
        workSpecDao.p(-1L, str);
        workSpecDao.C(i, str);
    }

    public final void c() {
        this.g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkSpecDao workSpecDao = this.j;
        String str = this.c;
        workSpecDao.k(jCurrentTimeMillis, str);
        workSpecDao.j(WorkInfo.State.d, str);
        workSpecDao.m(str);
        workSpecDao.r(this.f3941a.v, str);
        workSpecDao.o(str);
        workSpecDao.p(-1L, str);
    }

    public final void d(ListenableWorker.Result result) {
        Intrinsics.h(result, "result");
        String str = this.c;
        ArrayList arrayListZ = CollectionsKt.Z(str);
        while (true) {
            boolean zIsEmpty = arrayListZ.isEmpty();
            WorkSpecDao workSpecDao = this.j;
            if (zIsEmpty) {
                Data dataB = ((ListenableWorker.Result.Failure) result).b();
                Intrinsics.g(dataB, "failure.outputData");
                workSpecDao.r(this.f3941a.v, str);
                workSpecDao.A(str, dataB);
                return;
            }
            String str2 = (String) CollectionsKt.j0(arrayListZ);
            if (workSpecDao.e(str2) != WorkInfo.State.i) {
                workSpecDao.j(WorkInfo.State.g, str2);
            }
            arrayListZ.addAll(this.k.b(str2));
        }
    }
}
