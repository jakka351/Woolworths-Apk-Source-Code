package com.behaviosec.rl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.behaviosec.rl.yyyylly;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class odddodd {
    private static final String e00650065eee0065;
    public static int v007600760076v00760076v = 0;
    public static int v0076vv007600760076v = 2;
    public static int vv00760076v00760076v = 98;
    public static int vvvv007600760076v = 1;
    private int e0065e0065ee0065;
    private Context eee0065ee0065;

    static {
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716688));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = vv00760076v00760076v;
        if (((vvvv007600760076v + i) * i) % v00760076v007600760076v() != v007600760076v00760076v) {
            vv00760076v00760076v = 25;
            v007600760076v00760076v = 77;
        }
        e00650065eee0065 = uuxuuuu.pppp0070ppp("+dR", cR007200720072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847055)));
    }

    public odddodd(Context context) {
        this(context, 2);
    }

    public static int v00760076v007600760076v() {
        return 2;
    }

    public static int vv0076v007600760076v() {
        return 14;
    }

    @NonNull
    public String s0073ss00730073s(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
        }
        return ss0073s00730073s(jSONArray).toString();
    }

    @NonNull
    public JSONArray ss0073s00730073s(@NonNull JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        int i = vv00760076v00760076v;
        if (((vvvv007600760076v + i) * i) % v0076vv007600760076v != v007600760076v00760076v) {
            vv00760076v00760076v = vv0076v007600760076v();
            v007600760076v00760076v = 58;
        }
        jSONArray2.put(uuxuuuu.pppp0070ppp("\r\b", (char) (yllylll.r007200720072r00720072() ^ (-1146716743)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
        jSONArray2.put(yyyylly.ylyylly.b006200620062b00620062(this.eee0065ee0065, this.e0065e0065ee0065));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(uuxuuuu.pp0070p0070ppp("YGSSHMK", (char) (ylyylll.r0072rrr00720072() ^ (-1691741286)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847260)), (char) (yyyllll.rrrr007200720072() ^ 383821870)), uuxuuuu.pppp0070ppp("VRS", (char) (yllylll.r007200720072r00720072() ^ (-1146716717)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
            jSONArray2.put(jSONObject);
        } catch (JSONException unused) {
        }
        jSONArray.put(jSONArray2);
        return jSONArray;
    }

    public odddodd(Context context, int i) {
        this.eee0065ee0065 = context;
        this.e0065e0065ee0065 = i;
    }
}
