package io.branch.referral;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.branch.referral.Branch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ServerRequestRegisterInstall extends ServerRequestInitSession {
    @Override // io.branch.referral.ServerRequest
    public final void d(int i, String str) throws JSONException {
        if (this.i != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                c.z(e, new StringBuilder("Caught JSONException "));
            }
            this.i.b(jSONObject, new BranchError(a.A("Trouble initializing Branch. ", str), i));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean e() {
        return false;
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public final void f() throws JSONException {
        super.f();
        PrefHelper prefHelper = this.c;
        long jE = prefHelper.e("bnc_referrer_click_ts");
        long jE2 = prefHelper.e("bnc_install_begin_ts");
        if (jE > 0) {
            try {
                this.f23862a.put("clicked_referrer_ts", jE);
            } catch (JSONException e) {
                c.z(e, new StringBuilder("Caught JSONException "));
                return;
            }
        }
        if (jE2 > 0) {
            this.f23862a.put("install_begin_ts", jE2);
        }
        if (AppStoreReferrer.f23843a.equals("bnc_no_value")) {
            return;
        }
        this.f23862a.put("link_click_id", AppStoreReferrer.f23843a);
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public final void h(ServerResponse serverResponse, Branch branch) {
        PrefHelper prefHelper = this.c;
        super.h(serverResponse, branch);
        try {
            prefHelper.p("bnc_user_url", serverResponse.a().getString("link"));
            if (serverResponse.a().has("data")) {
                JSONObject jSONObject = new JSONObject(serverResponse.a().getString("data"));
                if (jSONObject.has("+clicked_branch_link") && jSONObject.getBoolean("+clicked_branch_link") && prefHelper.j("bnc_install_params").equals("bnc_no_value")) {
                    prefHelper.p("bnc_install_params", serverResponse.a().getString("data"));
                }
            }
            if (serverResponse.a().has("link_click_id")) {
                prefHelper.p("bnc_link_click_id", serverResponse.a().getString("link_click_id"));
            } else {
                prefHelper.p("bnc_link_click_id", "bnc_no_value");
            }
            if (serverResponse.a().has("data")) {
                prefHelper.p("bnc_session_params", serverResponse.a().getString("data"));
            } else {
                prefHelper.p("bnc_session_params", "bnc_no_value");
            }
            Branch.BranchReferralInitListener branchReferralInitListener = this.i;
            if (branchReferralInitListener != null) {
                branchReferralInitListener.b(branch.j(), null);
            }
            prefHelper.p("bnc_app_version", DeviceInfo.c().a());
        } catch (Exception e) {
            BranchLogger.f("Caught Exception ServerRequestRegisterInstall onRequestSucceeded: " + e.getMessage());
        }
        ServerRequestInitSession.o(branch);
    }
}
