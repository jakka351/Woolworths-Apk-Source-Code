package io.branch.referral;

import android.app.UiModeManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.gms.common.GoogleApiAvailability;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
abstract class SystemObserver {

    /* renamed from: a, reason: collision with root package name */
    public String f23866a;
    public int b;

    public interface AdsParamsFetchEvents {
    }

    public interface InstallReferrerFetchEvents {
    }

    public static class UniqueId {

        /* renamed from: a, reason: collision with root package name */
        public String f23867a;
        public boolean b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UniqueId uniqueId = (UniqueId) obj;
            return this.f23867a.equals(uniqueId.f23867a) && this.b == uniqueId.b;
        }

        public final int hashCode() {
            int i = ((this.b ? 1 : 0) + 1) * 31;
            String str = this.f23867a;
            return i + (str == null ? 0 : str.hashCode());
        }
    }

    public static String a(Context context) {
        String strJ = PrefHelper.d(context).j("bnc_anon_id");
        if (!TextUtils.isEmpty(strJ) && !strJ.equals("bnc_no_value")) {
            return strJ;
        }
        String string = UUID.randomUUID().toString();
        PrefHelper.d(context).p("bnc_anon_id", string);
        return string;
    }

    public static String b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        return activeNetworkInfo.getType() == 1 ? "wifi" : "mobile";
    }

    public static String c() {
        String str = "";
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (!inetAddress.isLoopbackAddress()) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                str = hostAddress;
                                break;
                            }
                        }
                    }
                }
            }
            return str;
        } catch (Exception e) {
            BranchLogger.b("Caught Exception SystemObserver getLocalIPAddress: " + e.getMessage());
            return str;
        }
    }

    public static String d() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    public static String e(Context context) {
        return Build.MANUFACTURER.equalsIgnoreCase("amazon") ? context == null ? Build.MODEL.contains("AFT") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE" : context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE" : "Android";
    }

    public static String f(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception e) {
                BranchLogger.b("Caught Exception, error obtaining PackageName " + e.getMessage());
            }
        }
        return "";
    }

    public static DisplayMetrics g(Context context) {
        DisplayManager displayManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = null;
        if (context != null && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display != null) {
            display.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static String h(Context context) {
        UiModeManager uiModeManager;
        if (context != null) {
            try {
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
            } catch (Exception e) {
                BranchLogger.b("Caught Exception SystemObserver getUIMode" + e.getMessage());
            }
        } else {
            uiModeManager = null;
        }
        if (uiModeManager != null) {
            switch (uiModeManager.getCurrentModeType()) {
                case 1:
                    return "UI_MODE_TYPE_NORMAL";
                case 2:
                    return "UI_MODE_TYPE_DESK";
                case 3:
                    return "UI_MODE_TYPE_CAR";
                case 4:
                    return "UI_MODE_TYPE_TELEVISION";
                case 5:
                    return "UI_MODE_TYPE_APPLIANCE";
                case 6:
                    return "UI_MODE_TYPE_WATCH";
            }
        }
        return "UI_MODE_TYPE_UNDEFINED";
    }

    public static boolean i(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
            return false;
        }
        try {
            int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            Object objInvoke = GoogleApiAvailability.class.getDeclaredMethod("isGooglePlayServicesAvailable", Context.class).invoke(GoogleApiAvailability.class.getDeclaredMethod("getInstance", null).invoke(null, null), context);
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue() != 0;
            }
            return true;
        } catch (Exception e) {
            BranchLogger.b("Caught Exception isGooglePlayServicesAvailable: " + e.getMessage());
            return true;
        }
    }
}
