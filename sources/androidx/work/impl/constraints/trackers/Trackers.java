package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/trackers/Trackers;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class Trackers {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3977a;
    public final ConstraintTracker b;
    public final BatteryNotLowTracker c;
    public final ConstraintTracker d;
    public final ConstraintTracker e;

    public Trackers(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "context.applicationContext");
        BatteryChargingTracker batteryChargingTracker = new BatteryChargingTracker(applicationContext, workManagerTaskExecutor);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.g(applicationContext2, "context.applicationContext");
        BatteryNotLowTracker batteryNotLowTracker = new BatteryNotLowTracker(applicationContext2, workManagerTaskExecutor);
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.g(applicationContext3, "context.applicationContext");
        String str = NetworkStateTrackerKt.f3975a;
        NetworkStateTracker24 networkStateTracker24 = new NetworkStateTracker24(applicationContext3, workManagerTaskExecutor);
        Context applicationContext4 = context.getApplicationContext();
        Intrinsics.g(applicationContext4, "context.applicationContext");
        StorageNotLowTracker storageNotLowTracker = new StorageNotLowTracker(applicationContext4, workManagerTaskExecutor);
        this.f3977a = context;
        this.b = batteryChargingTracker;
        this.c = batteryNotLowTracker;
        this.d = networkStateTracker24;
        this.e = storageNotLowTracker;
    }
}
