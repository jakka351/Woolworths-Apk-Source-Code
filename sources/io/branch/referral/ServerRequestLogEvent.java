package io.branch.referral;

import io.branch.referral.ServerRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ServerRequestLogEvent extends ServerRequest {
    @Override // io.branch.referral.ServerRequest
    public final ServerRequest.BRANCH_API_VERSION b() {
        return ServerRequest.BRANCH_API_VERSION.f;
    }

    @Override // io.branch.referral.ServerRequest
    public void d(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean e() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public void h(ServerResponse serverResponse, Branch branch) {
    }

    @Override // io.branch.referral.ServerRequest
    public final void j(JSONObject jSONObject) throws JSONException {
        super.j(jSONObject);
        this.c.k(jSONObject);
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean k() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean l() {
        return true;
    }
}
