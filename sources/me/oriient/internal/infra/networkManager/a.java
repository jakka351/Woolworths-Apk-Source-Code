package me.oriient.internal.infra.networkManager;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;

/* loaded from: classes7.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkManagerAndroid f24965a;

    public a(NetworkManagerAndroid networkManagerAndroid) {
        this.f24965a = networkManagerAndroid;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.h(network, "network");
        Logger logger = this.f24965a.getLogger();
        if (logger != null) {
            logger.d("NetworkManagerAndroid", "onAvailable() called with: network = [" + network + ']');
        }
        if (((Boolean) this.f24965a.isConnected().getValue()).booleanValue()) {
            return;
        }
        this.f24965a.isConnected().setValue(Boolean.TRUE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.h(network, "network");
        Intrinsics.h(networkCapabilities, "networkCapabilities");
        boolean zHasCapability = networkCapabilities.hasCapability(11);
        if (((Boolean) this.f24965a.isConnectionMetered().getValue()).booleanValue() && zHasCapability) {
            Logger logger = this.f24965a.getLogger();
            if (logger != null) {
                logger.d("NetworkManagerAndroid", "onCapabilitiesChanged: connection metered false");
            }
            this.f24965a.isConnectionMetered().setValue(Boolean.FALSE);
            return;
        }
        if (((Boolean) this.f24965a.isConnectionMetered().getValue()).booleanValue() || zHasCapability) {
            return;
        }
        this.f24965a.isConnectionMetered().setValue(Boolean.TRUE);
        Logger logger2 = this.f24965a.getLogger();
        if (logger2 != null) {
            logger2.d("NetworkManagerAndroid", "onCapabilitiesChanged: connection metered true");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.h(network, "network");
        Logger logger = this.f24965a.getLogger();
        if (logger != null) {
            logger.d("NetworkManagerAndroid", "onLost() called with: network = [" + network + ']');
        }
        if (((Boolean) this.f24965a.isConnected().getValue()).booleanValue()) {
            this.f24965a.isConnected().setValue(Boolean.FALSE);
        }
    }
}
