package com.scandit.datacapture.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class Y4 implements InterfaceC1072n1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f18398a;

    public Y4(ConnectivityManager connectivityManager) {
        Intrinsics.h(connectivityManager, "connectivityManager");
        this.f18398a = connectivityManager;
    }

    @Override // com.scandit.datacapture.core.InterfaceC1072n1
    public final int a() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.f18398a.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = this.f18398a.getNetworkCapabilities(activeNetwork)) == null) {
            return 1;
        }
        return networkCapabilities.hasTransport(0) ? 2 : 3;
    }

    public final String toString() {
        return "RealConnectivity@" + hashCode();
    }
}
