package io.branch.referral;

import android.content.Context;
import androidx.compose.runtime.snapshots.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ServerRequestCreateUrl extends ServerRequest {
    public final BranchLinkData i;
    public boolean j;
    public final Branch.BranchLinkCreateListener k;
    public boolean l;

    public ServerRequestCreateUrl(Context context, String str, int i, ArrayList arrayList, String str2, String str3, String str4, String str5, JSONObject jSONObject, a aVar, boolean z) throws JSONException {
        super(context, Defines.RequestPath.GetURL);
        this.k = aVar;
        this.j = z;
        this.l = true;
        BranchLinkData branchLinkData = new BranchLinkData();
        this.i = branchLinkData;
        try {
            if (!this.c.j("bnc_link_click_id").equals("bnc_no_value")) {
                branchLinkData.put("link_click_id", this.c.j("bnc_link_click_id"));
            }
            branchLinkData.l(i);
            branchLinkData.q(arrayList);
            branchLinkData.i(str);
            branchLinkData.k(str2);
            branchLinkData.m(str3);
            branchLinkData.p(str4);
            branchLinkData.j(str5);
            branchLinkData.n(jSONObject);
            branchLinkData.o();
            j(branchLinkData);
            branchLinkData.remove("anon_id");
            branchLinkData.remove("is_hardware_id_real");
            branchLinkData.remove("hardware_id");
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
            this.f = true;
        }
    }

    @Override // io.branch.referral.ServerRequest
    public final void d(int i, String str) {
        if (this.k != null) {
            this.k.e(this.l ? p() : null, new BranchError(YU.a.A("Trouble creating a URL. ", str), i));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean e() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public final void h(ServerResponse serverResponse, Branch branch) throws JSONException {
        try {
            String string = serverResponse.a().getString("url");
            Branch.BranchLinkCreateListener branchLinkCreateListener = this.k;
            if (branchLinkCreateListener != null) {
                branchLinkCreateListener.e(string, null);
            }
        } catch (Exception e) {
            BranchLogger.b("Caught Exception ServerRequestCreateUrl onRequestSucceeded: " + e.getMessage() + " stacktrace: " + BranchLogger.d(e));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean i() {
        return true;
    }

    public final String o(String str) throws UnsupportedEncodingException {
        BranchLinkData branchLinkData = this.i;
        try {
            if (Branch.i().l.f23868a && !str.contains("https://bnc.lt/a/")) {
                str = str.replace(new URL(str).getQuery(), "");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("?") ? "" : "?");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(string.endsWith("?") ? "" : "&");
            String string2 = sb2.toString();
            Collection<String> collectionH = branchLinkData.h();
            if (collectionH != null) {
                for (String str2 : collectionH) {
                    if (str2 != null && str2.length() > 0) {
                        string2 = string2 + Defines.LinkParam.Tags + "=" + URLEncoder.encode(str2, "UTF8") + "&";
                    }
                }
            }
            String strA = branchLinkData.a();
            if (strA != null && strA.length() > 0) {
                string2 = string2 + Defines.LinkParam.Alias + "=" + URLEncoder.encode(strA, "UTF8") + "&";
            }
            String strC = branchLinkData.c();
            if (strC != null && strC.length() > 0) {
                string2 = string2 + Defines.LinkParam.Channel + "=" + URLEncoder.encode(strC, "UTF8") + "&";
            }
            String strE = branchLinkData.e();
            if (strE != null && strE.length() > 0) {
                string2 = string2 + Defines.LinkParam.Feature + "=" + URLEncoder.encode(strE, "UTF8") + "&";
            }
            String strG = branchLinkData.g();
            if (strG != null && strG.length() > 0) {
                string2 = string2 + Defines.LinkParam.Stage + "=" + URLEncoder.encode(strG, "UTF8") + "&";
            }
            String strB = branchLinkData.b();
            if (strB != null && strB.length() > 0) {
                string2 = string2 + Defines.LinkParam.Campaign + "=" + URLEncoder.encode(strB, "UTF8") + "&";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append(Defines.LinkParam.Type);
            sb3.append("=");
            sb3.append(0);
            sb3.append("&");
            String str3 = (sb3.toString() + Defines.LinkParam.Duration + "=" + branchLinkData.d()) + "&source=android";
            JSONObject jSONObjectF = branchLinkData.f();
            if (jSONObjectF == null || jSONObjectF.length() <= 0) {
                return str3;
            }
            return str3 + "&data=" + URLEncoder.encode(Base64.c(jSONObjectF.toString().getBytes()), "UTF8");
        } catch (Exception e) {
            BranchLogger.b("Caught Exception ServerRequestCreateUrl generateLongUrlWithParams: " + e.getMessage() + " stacktrace: " + BranchLogger.d(e));
            this.k.e(null, new BranchError("Trouble creating a URL.", -116));
            return str;
        }
    }

    public final String p() {
        PrefHelper prefHelper = this.c;
        if (!prefHelper.j("bnc_user_url").equals("bnc_no_value")) {
            return o(prefHelper.j("bnc_user_url"));
        }
        return o("https://bnc.lt/a/" + prefHelper.j("bnc_branch_key"));
    }
}
