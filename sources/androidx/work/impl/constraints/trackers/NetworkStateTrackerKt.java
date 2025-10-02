package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkStateTrackerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3975a;

    static {
        String strG = Logger.g("NetworkStateTracker");
        Intrinsics.g(strG, "tagWithPrefix(\"NetworkStateTracker\")");
        f3975a = strG;
    }

    public static final NetworkState a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.h(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            Logger.e().d(f3975a, "Unable to validate active network", e);
        }
        boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
        return new NetworkState(z, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
