package coil.network;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/EmptyNetworkObserver;", "Lcoil/network/NetworkObserver;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyNetworkObserver implements NetworkObserver {
    @Override // coil.network.NetworkObserver
    public final boolean a() {
        return true;
    }

    @Override // coil.network.NetworkObserver
    public final void shutdown() {
    }
}
