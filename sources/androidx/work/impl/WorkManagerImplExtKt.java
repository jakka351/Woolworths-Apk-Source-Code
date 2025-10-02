package androidx.work.impl;

import android.content.Context;
import android.content.res.Resources;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.work.Configuration;
import androidx.work.SystemClock;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002* \u0002\u0010\u0011\"\u008c\u0001\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00002\u008c\u0001\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/Function6;", "Landroid/content/Context;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "context", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/constraints/trackers/Trackers;", "trackers", "Landroidx/work/impl/Processor;", "processor", "", "Landroidx/work/impl/Scheduler;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkManagerImplExtKt {
    public static final WorkManagerImpl a(Context context, Configuration configuration) throws Resources.NotFoundException {
        RoomDatabase.Builder builderA;
        Intrinsics.h(context, "context");
        Intrinsics.h(configuration, "configuration");
        WorkManagerTaskExecutor workManagerTaskExecutor = new WorkManagerTaskExecutor(configuration.c);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "context.applicationContext");
        SerialExecutorImpl serialExecutorImpl = workManagerTaskExecutor.f4014a;
        Intrinsics.g(serialExecutorImpl, "workTaskExecutor.serialTaskExecutor");
        SystemClock clock = configuration.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Intrinsics.h(clock, "clock");
        if (z) {
            builderA = new RoomDatabase.Builder(applicationContext, WorkDatabase.class, null);
            builderA.j = true;
        } else {
            builderA = Room.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            builderA.i = new androidx.compose.runtime.snapshots.a(applicationContext, 1);
        }
        builderA.g = serialExecutorImpl;
        builderA.d.add(new CleanupCallback(clock));
        builderA.a(Migration_1_2.f3922a);
        builderA.a(new RescheduleMigration(applicationContext, 2, 3));
        builderA.a(Migration_3_4.f3923a);
        builderA.a(Migration_4_5.f3924a);
        builderA.a(new RescheduleMigration(applicationContext, 5, 6));
        builderA.a(Migration_6_7.f3925a);
        builderA.a(Migration_7_8.f3926a);
        builderA.a(Migration_8_9.f3927a);
        builderA.a(new WorkMigration9To10(applicationContext));
        builderA.a(new RescheduleMigration(applicationContext, 10, 11));
        builderA.a(Migration_11_12.f3918a);
        builderA.a(Migration_12_13.f3919a);
        builderA.a(Migration_15_16.f3920a);
        builderA.a(Migration_16_17.f3921a);
        builderA.a(new RescheduleMigration(applicationContext, 21, 22));
        builderA.l = false;
        builderA.m = true;
        WorkDatabase workDatabase = (WorkDatabase) builderA.b();
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.g(applicationContext2, "context.applicationContext");
        Trackers trackers = new Trackers(applicationContext2, workManagerTaskExecutor);
        Processor processor = new Processor(context.getApplicationContext(), configuration, workManagerTaskExecutor, workDatabase);
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workManagerTaskExecutor, workDatabase, (List) WorkManagerImplExtKt$WorkManagerImpl$1.d.invoke(context, configuration, workManagerTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
