package coil.network;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.RealImageLoader;
import coil.util.SystemCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/RealNetworkObserver;", "Lcoil/network/NetworkObserver;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RealNetworkObserver implements NetworkObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f13012a;
    public final SystemCallbacks b;
    public final RealNetworkObserver$networkCallback$1 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.net.ConnectivityManager$NetworkCallback, coil.network.RealNetworkObserver$networkCallback$1] */
    public RealNetworkObserver(ConnectivityManager connectivityManager, SystemCallbacks systemCallbacks) {
        this.f13012a = connectivityManager;
        this.b = systemCallbacks;
        ?? r4 = new ConnectivityManager.NetworkCallback() { // from class: coil.network.RealNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                RealNetworkObserver.b(this.f13013a, network, true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                RealNetworkObserver.b(this.f13013a, network, false);
            }
        };
        this.c = r4;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (ConnectivityManager.NetworkCallback) r4);
    }

    public static final void b(RealNetworkObserver realNetworkObserver, Network network, boolean z) {
        Unit unit;
        boolean z2;
        Network[] allNetworks = realNetworkObserver.f13012a.getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.c(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = realNetworkObserver.f13012a.getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        SystemCallbacks systemCallbacks = realNetworkObserver.b;
        if (((RealImageLoader) systemCallbacks.e.get()) != null) {
            systemCallbacks.g = z3;
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            systemCallbacks.a();
        }
    }

    @Override // coil.network.NetworkObserver
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f13012a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.NetworkObserver
    public final void shutdown() {
        this.f13012a.unregisterNetworkCallback(this.c);
    }
}
