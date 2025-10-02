package YU;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CYFMonitor;
import com.cyberfend.cyfsecurity.CircleProgressBar;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public static ConnectivityManager.NetworkCallback f13a;
    public static BaseShopApplication b;
    public static LinkProperties c;
    public static final Handler d = new Handler(Looper.getMainLooper());
    public static final Runnable e = new FG();

    class FG implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (!N.a().booleanValue() || N.c.getLinkAddresses().isEmpty()) {
                N.d.postDelayed(this, 100L);
                return;
            }
            if (!CYFMonitor.b()) {
                CYFMonitor.a(false, N.b);
            }
            N.d.removeCallbacks(this);
            N.c();
        }
    }

    /* loaded from: classes2.dex */
    class i extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            try {
                super.onAvailable(network);
                Handler handler = N.d;
                Runnable runnable = N.e;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 200L);
            } catch (Exception unused) {
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            try {
                super.onLinkPropertiesChanged(network, linkProperties);
                linkProperties.getLinkAddresses().isEmpty();
                N.c = linkProperties;
            } catch (Exception unused) {
            }
        }
    }

    public static Boolean a() {
        if (ContextCompat.a(b, CircleProgressBar.a("xk{}B@H\u0005RDRroWQJEW\u0016vm~yhan~jbb{aQv[S|}I")) != 0) {
            return Boolean.TRUE;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService(CircleProgressBar.a("zjqaHJXBTHTf"));
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3)) {
                return Boolean.valueOf(networkCapabilities.hasTransport(4));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static void b() {
        try {
            if (CYFMonitor.b()) {
                return;
            }
            if (f13a == null) {
                f13a = new i();
            }
            ((ConnectivityManager) b.getSystemService(CircleProgressBar.a("zjqaHJXBTHTf"))).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), f13a);
        } catch (Exception unused) {
        }
    }

    public static void c() {
        try {
            if (f13a != null) {
                ((ConnectivityManager) b.getSystemService(CircleProgressBar.a("zjqaHJXBTHTf"))).unregisterNetworkCallback(f13a);
                f13a = null;
            }
        } catch (Exception unused) {
        }
    }
}
