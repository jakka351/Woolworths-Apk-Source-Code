package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class RequirementsWatcher {

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                throw null;
            }
        }
    }

    public interface Listener {
    }

    @RequiresApi
    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3118a;
        public boolean b;

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            throw null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f3118a && this.b == zHasCapability) {
                if (zHasCapability) {
                    throw null;
                }
            } else {
                this.f3118a = true;
                this.b = zHasCapability;
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            throw null;
        }
    }
}
