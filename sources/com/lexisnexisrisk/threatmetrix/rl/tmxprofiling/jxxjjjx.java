package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class jxxjjjx extends jxxxjjx {
    private static final String ii00690069006900690069 = lqlqqll.u00750075u00750075u(jxxjjjx.class);

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjjjx
    @TargetApi
    public void fetchVPNInfo(@Nonnull Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManagerWwww0077007700770077 = wwww0077007700770077(context);
            if (connectivityManagerWwww0077007700770077 == null) {
                return;
            }
            this.vpnConnected = false;
            Network activeNetwork = connectivityManagerWwww0077007700770077.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManagerWwww0077007700770077.getNetworkCapabilities(activeNetwork)) == null) {
                return;
            }
            this.vpnConnected = networkCapabilities.hasTransport(4);
        } catch (SecurityException e) {
            lqlqqll.llqqqll.yy00790079007900790079(ii00690069006900690069, e.toString());
            nlnnlnl.d00640064dd0064d(e);
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(ii00690069006900690069, e2.toString());
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjjjx
    public boolean isConnected() {
        return this.vpnConnected;
    }
}
