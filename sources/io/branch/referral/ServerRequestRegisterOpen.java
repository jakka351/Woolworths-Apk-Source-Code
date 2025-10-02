package io.branch.referral;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.branch.referral.Branch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ServerRequestRegisterOpen extends ServerRequestInitSession {
    @Override // io.branch.referral.ServerRequest
    public final void d(int i, String str) throws JSONException {
        if (this.i != null) {
            Branch.i().getClass();
            if (Boolean.parseBoolean((String) Branch.i().e.e.get("instant_dl_session"))) {
                return;
            }
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
        if (Branch.i().j) {
            Branch.BranchReferralInitListener branchReferralInitListener = this.i;
            if (branchReferralInitListener != null) {
                branchReferralInitListener.b(Branch.i().j(), null);
            }
            Branch.i().e.a("instant_dl_session", "true");
            Branch.i().j = false;
        }
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public final void h(ServerResponse serverResponse, Branch branch) {
        super.h(serverResponse, branch);
        BranchLogger.e("onRequestSucceeded " + this + " " + serverResponse + " on callback " + this.i);
        try {
            boolean zHas = serverResponse.a().has("link_click_id");
            PrefHelper prefHelper = this.c;
            if (zHas) {
                prefHelper.p("bnc_link_click_id", serverResponse.a().getString("link_click_id"));
            } else {
                prefHelper.p("bnc_link_click_id", "bnc_no_value");
            }
            if (serverResponse.a().has("data")) {
                prefHelper.p("bnc_session_params", serverResponse.a().getString("data"));
            } else {
                prefHelper.p("bnc_session_params", "bnc_no_value");
            }
            if (this.i != null) {
                Branch.i().getClass();
                if (!Boolean.parseBoolean((String) Branch.i().e.e.get("instant_dl_session"))) {
                    this.i.b(branch.j(), null);
                }
            }
            prefHelper.p("bnc_app_version", DeviceInfo.c().a());
        } catch (Exception e) {
            BranchLogger.f("Caught Exception ServerRequestRegisterOpen onRequestSucceeded: " + e.getMessage());
        }
        ServerRequestInitSession.o(branch);
    }
}
