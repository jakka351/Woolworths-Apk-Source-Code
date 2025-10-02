package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkRequestConstraintController implements ConstraintController {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f3961a;

    public NetworkRequestConstraintController(ConnectivityManager connectivityManager) {
        this.f3961a = connectivityManager;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final Flow a(Constraints constraints) {
        Intrinsics.h(constraints, "constraints");
        return FlowKt.d(new NetworkRequestConstraintController$track$1(constraints, this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        if (c(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(WorkSpec workSpec) {
        Intrinsics.h(workSpec, "workSpec");
        return workSpec.j.a() != null;
    }
}
