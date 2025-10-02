package lib.android.paypal.com.magnessdk;

import android.content.Context;
import java.io.File;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b {
    public static JSONObject a(Context context, String str) {
        lib.android.paypal.com.magnessdk.log.a.a("entering getCachedConfig", 0, b.class);
        try {
            lib.android.paypal.com.magnessdk.log.a.a("Loading loadCachedConfigData", 0, b.class);
            String strD = lib.android.paypal.com.magnessdk.filesystem.c.d(new File(context.getFilesDir(), str.concat("_DATA")));
            if (strD.isEmpty()) {
                lib.android.paypal.com.magnessdk.log.a.a("leaving getCachedConfig,cached config loaded empty", 0, b.class);
                return null;
            }
            lib.android.paypal.com.magnessdk.log.a.a("leaving getCachedConfig,cached config loadsuccessfully", 0, b.class);
            return new JSONObject(strD);
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, b.class);
            return null;
        }
    }

    public static void b(Context context, String str, String str2) throws Throwable {
        lib.android.paypal.com.magnessdk.log.a.a("entering saveConfigData", 0, b.class);
        File file = new File(context.getFilesDir(), str2.concat("_DATA"));
        File file2 = new File(context.getFilesDir(), str2.concat("_TIME"));
        lib.android.paypal.com.magnessdk.filesystem.c.a(file, str);
        lib.android.paypal.com.magnessdk.filesystem.c.a(file2, String.valueOf(System.currentTimeMillis()));
    }

    public static boolean c(JSONObject jSONObject, long j, c.EnumC0411c enumC0411c) {
        return System.currentTimeMillis() > (jSONObject.optLong(enumC0411c == c.EnumC0411c.RAMP ? "cr_ti" : enumC0411c == c.EnumC0411c.REMOTE ? "conf_refresh_time_interval" : "", 0L) * 1000) + j;
    }

    public final String d(Context context, String str) {
        lib.android.paypal.com.magnessdk.log.a.a("Loading loadCachedConfigTime", 0, getClass());
        return lib.android.paypal.com.magnessdk.filesystem.c.d(new File(context.getFilesDir(), str.concat("_TIME")));
    }
}
