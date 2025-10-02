package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class jjjxjjx extends jxxxjjx {
    private static final String l006Clllll = lqlqqll.u00750075u00750075u(jjjxjjx.class);

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjjjx
    @TargetApi
    public void fetchVPNInfo(@Nonnull Context context) {
        try {
            ConnectivityManager connectivityManagerWwww0077007700770077 = wwww0077007700770077(context);
            if (connectivityManagerWwww0077007700770077 == null) {
                return;
            }
            this.vpnConnected = false;
            for (Network network : connectivityManagerWwww0077007700770077.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManagerWwww0077007700770077.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    this.vpnConnected = true;
                    return;
                }
            }
        } catch (SecurityException e) {
            lqlqqll.llqqqll.yy00790079007900790079(l006Clllll, e.toString());
            nlnnlnl.d00640064dd0064d(e);
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(l006Clllll, e2.toString());
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjjjx
    public boolean isConnected() {
        return this.vpnConnected;
    }
}
