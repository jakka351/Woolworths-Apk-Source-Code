package com.tealium.core.network;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.salesforce.marketingcloud.messages.iam.j;
import com.tealium.core.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/network/ConnectivityRetriever;", "Lcom/tealium/core/network/Connectivity;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ConnectivityRetriever implements Connectivity {
    public static final Companion b = new Companion();
    public static volatile ConnectivityRetriever c;

    /* renamed from: a, reason: collision with root package name */
    public final Application f19157a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tealium/core/network/ConnectivityRetriever$Companion;", "", "", "UNKNOWN_CONNECTIVITY", "Ljava/lang/String;", "Lcom/tealium/core/network/Connectivity;", "instance", "Lcom/tealium/core/network/Connectivity;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public final Connectivity a(Application application) {
            ConnectivityRetriever connectivityRetriever;
            Intrinsics.h(application, "application");
            ConnectivityRetriever connectivityRetriever2 = ConnectivityRetriever.c;
            if (connectivityRetriever2 != null) {
                return connectivityRetriever2;
            }
            synchronized (this) {
                connectivityRetriever = ConnectivityRetriever.c;
                if (connectivityRetriever == null) {
                    connectivityRetriever = new ConnectivityRetriever(application);
                    ConnectivityRetriever.c = connectivityRetriever;
                }
            }
            return connectivityRetriever;
        }
    }

    public ConnectivityRetriever(Application application) {
        this.f19157a = application;
    }

    @Override // com.tealium.core.network.Connectivity
    public final boolean a() {
        if (isConnected()) {
            NetworkCapabilities networkCapabilitiesC = c();
            if (networkCapabilitiesC != null ? networkCapabilitiesC.hasTransport(1) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tealium.core.network.Connectivity
    public final String b() {
        NetworkCapabilities networkCapabilitiesC = c();
        if (networkCapabilitiesC != null) {
            if (networkCapabilitiesC.hasTransport(1)) {
                return "wifi";
            }
            if (networkCapabilitiesC.hasTransport(0)) {
                return "cellular";
            }
            if (networkCapabilitiesC.hasTransport(3)) {
                return "ethernet";
            }
            if (networkCapabilitiesC.hasTransport(4)) {
                return "vpn";
            }
        }
        return j.h;
    }

    public final NetworkCapabilities c() {
        Application application = this.f19157a;
        try {
            Object systemService = application.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Object systemService2 = application.getSystemService("connectivity");
            if (systemService2 != null) {
                return connectivityManager.getNetworkCapabilities(((ConnectivityManager) systemService2).getActiveNetwork());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception e) {
            Logger.f19124a.h("Tealium-1.6.0", "Error retrieving active network capabilities, " + e.getMessage());
            return null;
        }
    }

    @Override // com.tealium.core.network.Connectivity
    public final boolean isConnected() {
        NetworkCapabilities networkCapabilitiesC = c();
        if (networkCapabilitiesC != null) {
            return networkCapabilitiesC.hasCapability(12);
        }
        return false;
    }
}
