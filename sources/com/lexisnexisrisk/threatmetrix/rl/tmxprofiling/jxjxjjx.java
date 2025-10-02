package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class jxjxjjx extends jxxxjjx {
    private static final String ll006Cllll = lqlqqll.u00750075u00750075u(jxjxjjx.class);
    private final jjxxjjx l006C006Cllll = new jjxxjjx();
    private ConnectivityManager lll006Clll = null;

    @TargetApi
    public class jjxxjjx extends ConnectivityManager.NetworkCallback {
        public jjxxjjx() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@Nonnull Network network) {
            super.onAvailable(network);
            if (jxjxjjx.this.lll006Clll == null) {
                return;
            }
            try {
                NetworkCapabilities networkCapabilities = jxjxjjx.this.lll006Clll.getNetworkCapabilities(network);
                if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                    return;
                }
                jxjxjjx.this.vpnConnected = true;
            } catch (SecurityException e) {
                nlnnlnl.d00640064dd0064d(e);
            } catch (Exception e2) {
                lqlqqll.uuu007500750075u(jxjxjjx.ll006Cllll, e2.toString());
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@Nonnull Network network) {
            super.onLost(network);
            jxjxjjx.this.vpnConnected = false;
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjjjx
    @TargetApi
    public void fetchVPNInfo(@Nonnull Context context) {
        try {
            ConnectivityManager connectivityManagerWwww0077007700770077 = wwww0077007700770077(context);
            this.lll006Clll = connectivityManagerWwww0077007700770077;
            if (connectivityManagerWwww0077007700770077 == null) {
                return;
            }
            this.vpnConnected = false;
            if (new nnlllnn.nnnllln(context).fff006600660066f("android.permission.ACCESS_NETWORK_STATE", context.getPackageName())) {
                this.lll006Clll.registerDefaultNetworkCallback(this.l006C006Cllll);
            }
        } catch (SecurityException e) {
            lqlqqll.llqqqll.yy00790079007900790079(ll006Cllll, e.toString());
            nlnnlnl.d00640064dd0064d(e);
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(ll006Cllll, e2.toString());
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjjjx
    @TargetApi
    public boolean isConnected() {
        ConnectivityManager connectivityManager = this.lll006Clll;
        if (connectivityManager == null) {
            return false;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.l006C006Cllll);
        } catch (Exception e) {
            lqlqqll.uuu007500750075u(ll006Cllll, e.toString());
        }
        return this.vpnConnected;
    }
}
