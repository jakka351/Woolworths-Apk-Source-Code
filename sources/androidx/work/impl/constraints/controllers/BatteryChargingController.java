package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/controllers/BatteryChargingController;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BatteryChargingController extends BaseConstraintController<Boolean> {
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryChargingController(ConstraintTracker tracker) {
        super(tracker);
        Intrinsics.h(tracker, "tracker");
        this.b = 6;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(WorkSpec workSpec) {
        Intrinsics.h(workSpec, "workSpec");
        return workSpec.j.c;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public final boolean e(Object obj) {
        return !((Boolean) obj).booleanValue();
    }
}
