package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;

/* loaded from: classes6.dex */
public class lqllqll {
    private static final String p00700070p0070pp = lqlqqll.u00750075u00750075u(lqllqll.class);

    private lqllqll() {
    }

    @TargetApi
    public static String y00790079y007900790079(nlllnnl nlllnnlVar) {
        ProxyInfo defaultProxy;
        Object systemService = nlllnnlVar.ww0077w007700770077.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (defaultProxy = connectivityManager.getDefaultProxy()) == null) {
            return null;
        }
        String host = defaultProxy.getHost();
        int port = defaultProxy.getPort();
        if (!llqllqq.g006700670067006700670067g(host) || port <= 0 || lqlllll.y0079y0079y00790079(host)) {
            Uri pacFileUrl = defaultProxy.getPacFileUrl();
            if (pacFileUrl != null) {
                String string = pacFileUrl.toString();
                lqlqqll.llqqqll.yy00790079007900790079(p00700070p0070pp, "proxy information " + string);
                if (llqllqq.g006700670067006700670067g(string)) {
                    return string;
                }
            }
            return null;
        }
        lqlqqll.llqqqll.yy00790079007900790079(p00700070p0070pp, "proxy information " + host + ":" + port);
        return host + ":" + port;
    }
}
