package io.branch.referral.validators;

import android.webkit.URLUtil;
import com.medallia.digital.mobilesdk.q2;
import io.branch.referral.Branch;
import io.branch.referral.PrefHelper;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerResponse;

/* loaded from: classes7.dex */
class ServerRequestGetAppConfig extends ServerRequest {

    public interface IGetAppConfigEvents {
    }

    @Override // io.branch.referral.ServerRequest
    public final String c() {
        StringBuilder sb = new StringBuilder();
        PrefHelper prefHelper = this.c;
        prefHelper.getClass();
        sb.append(URLUtil.isHttpsUrl(PrefHelper.g) ? PrefHelper.g : "https://api2.branch.io/");
        sb.append(this.b.d);
        sb.append(q2.c);
        sb.append(prefHelper.j("bnc_branch_key"));
        return sb.toString();
    }

    @Override // io.branch.referral.ServerRequest
    public final void d(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean e() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public final void h(ServerResponse serverResponse, Branch branch) {
    }
}
