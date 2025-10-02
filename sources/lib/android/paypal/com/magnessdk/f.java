package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class f {

    public static /* synthetic */ class a {
        static {
            try {
                new int[Environment.values().length][1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static String a(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static String b(boolean z) {
        return z ? UUID.randomUUID().toString() : UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String c(Boolean[] boolArr) {
        String str;
        if (boolArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Boolean bool : boolArr) {
            if (bool.booleanValue()) {
                str = "1";
            } else if (!bool.booleanValue()) {
                str = "0";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static JSONObject d(Sensor sensor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", sensor.getName());
        jSONObject.put("v", sensor.getVendor());
        jSONObject.put("pwr", String.format("%.8f", Float.valueOf(sensor.getPower())));
        jSONObject.put("ver", String.valueOf(sensor.getVersion()));
        jSONObject.put("re", String.format("%.8f", Float.valueOf(sensor.getResolution())));
        jSONObject.put("mr", String.format("%.8f", Float.valueOf(sensor.getMaximumRange())));
        jSONObject.put("mec", String.valueOf(sensor.getFifoMaxEventCount()));
        return jSONObject;
    }

    public static void e(Context context, HashMap map) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String packageName = context.getPackageName();
        String strA = a(context);
        if (!h("5.5.1.release")) {
            map.put("comp_version", "5.5.1.release");
        }
        if (!h(str)) {
            map.put("os_version", str);
        }
        if (!h("Android")) {
            map.put("os_type", "Android");
        }
        if (!h(str2)) {
            map.put("device_model", str2);
        }
        if (!h(packageName)) {
            map.put("app_id", packageName);
        }
        if (h(strA)) {
            return;
        }
        map.put(k.a.q, strA);
    }

    public static void f(Class cls, Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                lib.android.paypal.com.magnessdk.log.a.b(e, cls.getClass());
            }
        }
    }

    public static ArrayList g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(String.valueOf(jSONArray.get(i)));
            }
        }
        return arrayList;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof Long ? ((Long) obj).longValue() == 0 : !(obj instanceof Integer) || ((Integer) obj).intValue() == 0;
    }
}
