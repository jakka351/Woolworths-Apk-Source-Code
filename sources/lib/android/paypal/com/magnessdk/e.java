package lib.android.paypal.com.magnessdk;

import java.util.BitSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e extends b {
    public static BitSet b = null;
    public static boolean c = false;
    public static JSONArray d;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f24893a;

    public static boolean e(int i) {
        return b.get(i);
    }

    public static void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("nc");
        if (jSONArrayOptJSONArray != null) {
            d = jSONArrayOptJSONArray;
        }
        BitSet bitSet = new BitSet(128);
        b = bitSet;
        bitSet.set(0, 128, true);
        for (int i = 0; jSONArrayOptJSONArray != null && i < jSONArrayOptJSONArray.length(); i++) {
            try {
                b.set(jSONArrayOptJSONArray.getInt(i), false);
            } catch (JSONException e) {
                lib.android.paypal.com.magnessdk.log.a.b(e, e.class);
            }
        }
    }

    public final boolean f(String str) {
        lib.android.paypal.com.magnessdk.log.a.a("entering shouldUseCachedConfiguration", 0, getClass());
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = "5.0".split("\\.");
        lib.android.paypal.com.magnessdk.log.a.a("Comparing Cached version is " + str + " default version is 5.0", 0, getClass());
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        return Integer.valueOf(Integer.signum((i >= strArrSplit.length || i >= strArrSplit2.length) ? strArrSplit.length - strArrSplit2.length : Integer.valueOf(strArrSplit[i]).compareTo(Integer.valueOf(strArrSplit2[i])))).intValue() >= 0;
    }
}
