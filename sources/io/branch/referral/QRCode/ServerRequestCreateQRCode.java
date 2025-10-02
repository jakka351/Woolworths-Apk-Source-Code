package io.branch.referral.QRCode;

import YU.a;
import io.branch.referral.Branch;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerResponse;

/* loaded from: classes7.dex */
public class ServerRequestCreateQRCode extends ServerRequest {
    @Override // io.branch.referral.ServerRequest
    public final void d(int i, String str) {
        new Exception(a.e(i, "Failed server request: ", str));
        throw null;
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean e() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public final void g() {
        System.currentTimeMillis();
    }

    @Override // io.branch.referral.ServerRequest
    public final void h(ServerResponse serverResponse, Branch branch) {
        throw null;
    }
}
