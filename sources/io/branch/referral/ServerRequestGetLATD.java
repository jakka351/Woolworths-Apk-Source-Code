package io.branch.referral;

import io.branch.referral.ServerRequest;

/* loaded from: classes7.dex */
public class ServerRequestGetLATD extends ServerRequest {

    public interface BranchLastAttributedTouchDataListener {
    }

    @Override // io.branch.referral.ServerRequest
    public final ServerRequest.BRANCH_API_VERSION b() {
        return ServerRequest.BRANCH_API_VERSION.e;
    }

    @Override // io.branch.referral.ServerRequest
    public final void d(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean e() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public final void h(ServerResponse serverResponse, Branch branch) {
    }
}
