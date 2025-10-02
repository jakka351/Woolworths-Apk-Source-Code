package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import android.net.ConnectivityManager;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public abstract class jxxxjjx implements jjxjjjx {
    public boolean vpnConnected = false;

    public ConnectivityManager wwww0077007700770077(@Nonnull Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }
}
