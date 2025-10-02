package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/controllers/BaseConstraintController;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/work/impl/constraints/controllers/ConstraintController;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseConstraintController<T> implements ConstraintController {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintTracker f3966a;

    public BaseConstraintController(ConstraintTracker tracker) {
        Intrinsics.h(tracker, "tracker");
        this.f3966a = tracker;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final Flow a(Constraints constraints) {
        Intrinsics.h(constraints, "constraints");
        return FlowKt.d(new BaseConstraintController$track$1(this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return c(workSpec) && e(this.f3966a.a());
    }

    public abstract int d();

    public boolean e(Object obj) {
        return false;
    }
}
