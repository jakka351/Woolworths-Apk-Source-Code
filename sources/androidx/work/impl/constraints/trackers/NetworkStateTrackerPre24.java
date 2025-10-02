package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre24;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker<NetworkState> {
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final Object a() {
        NetworkStateTrackerKt.a(null);
        throw null;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final void f(Intent intent) {
        if (Intrinsics.c(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            Logger.e().a(NetworkStateTrackerKt.f3975a, "Network broadcast received");
            NetworkStateTrackerKt.a(null);
            throw null;
        }
    }
}
