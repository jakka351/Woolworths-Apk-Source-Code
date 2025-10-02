package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {
    public final ConnectivityManager f;
    public final NetworkStateTracker24$networkCallback$1 g;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        super(context, workManagerTaskExecutor);
        Object systemService = this.b.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                Intrinsics.h(network, "network");
                Intrinsics.h(capabilities, "capabilities");
                Logger.e().a(NetworkStateTrackerKt.f3975a, "Network capabilities changed: " + capabilities);
                this.f3974a.b(new NetworkState(capabilities.hasCapability(12), capabilities.hasCapability(16), capabilities.hasCapability(11) ^ true, capabilities.hasCapability(18)));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                Intrinsics.h(network, "network");
                Logger.e().a(NetworkStateTrackerKt.f3975a, "Network connection lost");
                NetworkStateTracker24 networkStateTracker24 = this.f3974a;
                networkStateTracker24.b(NetworkStateTrackerKt.a(networkStateTracker24.f));
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final Object a() {
        return NetworkStateTrackerKt.a(this.f);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void c() {
        try {
            Logger.e().a(NetworkStateTrackerKt.f3975a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            NetworkStateTracker24$networkCallback$1 networkCallback = this.g;
            Intrinsics.h(connectivityManager, "<this>");
            Intrinsics.h(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e) {
            Logger.e().d(NetworkStateTrackerKt.f3975a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            Logger.e().d(NetworkStateTrackerKt.f3975a, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void d() {
        try {
            Logger.e().a(NetworkStateTrackerKt.f3975a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f;
            NetworkStateTracker24$networkCallback$1 networkCallback = this.g;
            Intrinsics.h(connectivityManager, "<this>");
            Intrinsics.h(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e) {
            Logger.e().d(NetworkStateTrackerKt.f3975a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            Logger.e().d(NetworkStateTrackerKt.f3975a, "Received exception while unregistering network callback", e2);
        }
    }
}
