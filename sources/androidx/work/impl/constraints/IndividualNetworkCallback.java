package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f3960a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback$Companion;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public IndividualNetworkCallback(Function1 function1) {
        this.f3960a = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.h(network, "network");
        Intrinsics.h(networkCapabilities, "networkCapabilities");
        Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        ((NetworkRequestConstraintController$track$1$onConstraintState$1) this.f3960a).invoke(ConstraintsState.ConstraintsMet.f3958a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.h(network, "network");
        Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController onLost callback");
        ((NetworkRequestConstraintController$track$1$onConstraintState$1) this.f3960a).invoke(new ConstraintsState.ConstraintsNotMet(7));
    }
}
