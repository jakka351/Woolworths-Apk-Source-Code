package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import coil.util.SystemCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NetworkObserverKt {
    public static final NetworkObserver a(Context context, SystemCallbacks systemCallbacks) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || ContextCompat.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new EmptyNetworkObserver();
        }
        try {
            return new RealNetworkObserver(connectivityManager, systemCallbacks);
        } catch (Exception unused) {
            return new EmptyNetworkObserver();
        }
    }
}
