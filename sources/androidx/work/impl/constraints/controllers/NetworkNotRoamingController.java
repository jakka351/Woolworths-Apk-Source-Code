package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/constraints/controllers/NetworkNotRoamingController;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "Landroidx/work/impl/constraints/NetworkState;", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkNotRoamingController extends BaseConstraintController<NetworkState> {
    public final int b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/constraints/controllers/NetworkNotRoamingController$Companion;", "", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Intrinsics.g(Logger.g("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkNotRoamingController(ConstraintTracker tracker) {
        super(tracker);
        Intrinsics.h(tracker, "tracker");
        this.b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(WorkSpec workSpec) {
        Intrinsics.h(workSpec, "workSpec");
        return workSpec.j.f3893a == NetworkType.g;
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
        return (value.f3962a && value.d) ? false : true;
    }
}
