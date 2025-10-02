package androidx.work.impl.constraints.controllers;

import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/controllers/NetworkConnectedController;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkConnectedController extends BaseConstraintController<NetworkState> {
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnectedController(ConstraintTracker tracker) {
        super(tracker);
        Intrinsics.h(tracker, "tracker");
        this.b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(WorkSpec workSpec) {
        Intrinsics.h(workSpec, "workSpec");
        return workSpec.j.f3893a == NetworkType.e;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public final boolean e(Object obj) {
        NetworkState value = (NetworkState) obj;
        Intrinsics.h(value, "value");
        return (value.f3962a && value.b) ? false : true;
    }
}
