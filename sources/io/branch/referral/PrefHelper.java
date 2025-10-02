package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PrefHelper {
    public static PrefHelper f;
    public static String g;
    public static String h;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f23860a;
    public final SharedPreferences.Editor b;
    public final JSONObject c = new JSONObject();
    public final JSONObject d = new JSONObject();
    public final BranchPartnerParameters e;

    public PrefHelper(Context context) {
        new JSONObject();
        this.e = new BranchPartnerParameters();
        SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.f23860a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static PrefHelper d(Context context) {
        if (f == null) {
            f = new PrefHelper(context);
        }
        return f;
    }

    public final ArrayList a() {
        String strJ = j("bnc_actions");
        if (strJ.equals("bnc_no_value")) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strJ.split(","));
        return arrayList;
    }

    public final boolean b(String str) {
        return this.f23860a.getBoolean(str, false);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.d.get(str).toString();
        } catch (JSONException e) {
            BranchLogger.a(e.getMessage());
            return null;
        }
    }

    public final long e(String str) {
        return this.f23860a.getLong(str, 0L);
    }

    public final String f() {
        String strJ = j("bnc_randomized_bundle_token");
        return (TextUtils.isEmpty(strJ) || strJ.equals("bnc_no_value")) ? j("bnc_identity_id") : strJ;
    }

    public final String g() {
        String strJ = j("bnc_randomized_device_token");
        return (TextUtils.isEmpty(strJ) || strJ.equals("bnc_no_value")) ? j("bnc_device_fingerprint_id") : strJ;
    }

    public final JSONObject h() {
        String strJ = j("bnc_referringUrlQueryParameters");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strJ) && !"bnc_no_value".equals(strJ)) {
            try {
                return new JSONObject(strJ);
            } catch (JSONException e) {
                BranchLogger.f("Unable to get URL query parameters as string: " + e);
            }
        }
        return jSONObject;
    }

    public final int i() {
        return this.f23860a.getInt("bnc_retry_interval", 1000);
    }

    public final String j(String str) {
        return this.f23860a.getString(str, "bnc_no_value");
    }

    public final void k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : this.e.f23854a.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : ((ConcurrentHashMap) entry.getValue()).entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put((String) entry.getKey(), jSONObject3);
        }
        jSONObject.put("partner_data", jSONObject2);
    }

    public final void l(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            p("bnc_actions", "bnc_no_value");
            return;
        }
        Iterator it = arrayList.iterator();
        String strO = "";
        while (it.hasNext()) {
            strO = b.o(strO, (String) it.next(), ",");
        }
        p("bnc_actions", strO.substring(0, strO.length() - 1));
    }

    public final void m(String str) {
        if (j("bnc_branch_key").equals(str)) {
            return;
        }
        String strJ = j("bnc_link_click_id");
        String strJ2 = j("bnc_link_click_identifier");
        String strJ3 = j("bnc_app_link");
        String strJ4 = j("bnc_push_identifier");
        SharedPreferences.Editor editor = this.b;
        editor.clear();
        p("bnc_link_click_id", strJ);
        p("bnc_link_click_identifier", strJ2);
        p("bnc_app_link", strJ3);
        p("bnc_push_identifier", strJ4);
        editor.apply();
        p("bnc_branch_key", str);
        if (Branch.i() != null) {
            Branch.i().f.clear();
            Branch.i().e.c();
        }
    }

    public final void n(long j, String str) {
        this.b.putLong(str, j).apply();
    }

    public final void o(JSONObject jSONObject) {
        if (jSONObject.length() == 0) {
            p("bnc_referringUrlQueryParameters", "bnc_no_value");
        } else {
            p("bnc_referringUrlQueryParameters", jSONObject.toString());
        }
    }

    public final void p(String str, String str2) {
        this.b.putString(str, str2).apply();
    }
}
