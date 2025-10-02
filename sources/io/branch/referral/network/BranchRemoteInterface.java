package io.branch.referral.network;

import android.text.TextUtils;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import io.branch.referral.ServerResponse;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class BranchRemoteInterface {

    public static class BranchRemoteException extends Exception {
        public final int d;
        public final String e;

        public BranchRemoteException(int i, String str) {
            this.d = i;
            this.e = str;
        }
    }

    public static class BranchResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f23871a;
        public final int b;
        public String c;

        public BranchResponse(String str, int i) {
            this.f23871a = str;
            this.b = i;
        }
    }

    public static boolean a(String str, JSONObject jSONObject) throws JSONException {
        try {
            if (!jSONObject.has("user_data")) {
                jSONObject.put("sdk", "android5.12.3");
            }
            if (str.equals("bnc_no_value")) {
                return false;
            }
            jSONObject.put("branch_key", str);
            return true;
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
            return false;
        }
    }

    public static ServerResponse d(BranchResponse branchResponse, String str, String str2) throws JSONException {
        String str3 = branchResponse.f23871a;
        int i = branchResponse.b;
        ServerResponse serverResponse = new ServerResponse(i, "");
        if (TextUtils.isEmpty(str2)) {
            BranchLogger.e("returned " + str3);
        } else {
            String.format(Locale.getDefault(), "Server returned: [%s] Status: [%d]; Data: %s", str2, Integer.valueOf(i), str3);
        }
        if (str3 != null) {
            try {
                try {
                    serverResponse.b = new JSONObject(str3);
                    return serverResponse;
                } catch (JSONException unused) {
                    serverResponse.b = new JSONArray(str3);
                }
            } catch (JSONException e) {
                if (str.contains("qr-code")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("QRCodeString", str3);
                        serverResponse.b = jSONObject;
                    } catch (JSONException e2) {
                        c.z(e2, new StringBuilder("Caught JSONException "));
                    }
                } else {
                    c.z(e, new StringBuilder("Caught JSONException "));
                }
            }
        }
        return serverResponse;
    }

    public abstract BranchResponse b(String str, JSONObject jSONObject);

    public final ServerResponse c(JSONObject jSONObject, String str, String str2, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!a(str3, jSONObject)) {
            return new ServerResponse(-114, "");
        }
        BranchLogger.e("posting to " + str);
        BranchLogger.e("Post value = " + jSONObject.toString());
        try {
            try {
                BranchResponse branchResponseB = b(str, jSONObject);
                ServerResponse serverResponseD = d(branchResponseB, str2, branchResponseB.c);
                if (Branch.i() != null) {
                    Branch.i().e.a(str2.concat("-brtt"), String.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)));
                }
                return serverResponseD;
            } catch (BranchRemoteException e) {
                ServerResponse serverResponse = new ServerResponse(e.d, e.e);
                if (Branch.i() != null) {
                    Branch.i().e.a(str2.concat("-brtt"), String.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)));
                }
                return serverResponse;
            }
        } catch (Throwable th) {
            if (Branch.i() != null) {
                Branch.i().e.a(str2.concat("-brtt"), String.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            throw th;
        }
    }
}
