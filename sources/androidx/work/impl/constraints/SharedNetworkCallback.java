package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/SharedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final SharedNetworkCallback f3963a = new SharedNetworkCallback();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listG0;
        Intrinsics.h(network, "network");
        Intrinsics.h(networkCapabilities, "networkCapabilities");
        Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            listG0 = CollectionsKt.G0(c.entrySet());
        }
        for (Map.Entry entry : listG0) {
            ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? ConstraintsState.ConstraintsMet.f3958a : new ConstraintsState.ConstraintsNotMet(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listG0;
        Intrinsics.h(network, "network");
        Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            listG0 = CollectionsKt.G0(c.keySet());
        }
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
        }
    }
}
