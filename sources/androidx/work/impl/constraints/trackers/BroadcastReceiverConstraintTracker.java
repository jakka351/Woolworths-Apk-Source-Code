package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public BroadcastReceiverConstraintTracker(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        super(context, workManagerTaskExecutor);
        this.f = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                Intrinsics.h(context2, "context");
                Intrinsics.h(intent, "intent");
                this.f3970a.f(intent);
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void c() {
        Logger.e().a(BroadcastReceiverConstraintTrackerKt.f3971a, getClass().getSimpleName().concat(": registering receiver"));
        this.b.registerReceiver(this.f, e());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void d() {
        Logger.e().a(BroadcastReceiverConstraintTrackerKt.f3971a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
