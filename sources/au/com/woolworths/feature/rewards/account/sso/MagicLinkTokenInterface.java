package au.com.woolworths.feature.rewards.account.sso;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/MagicLinkTokenInterface;", "", "", "refreshToken", "()V", "getToken", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagicLinkTokenInterface {

    /* renamed from: a, reason: collision with root package name */
    public final MagicLinkTokenProvider f5796a;

    public MagicLinkTokenInterface(RewardsMagicLinkViewModel magicLinkTokenProvider) {
        Intrinsics.h(magicLinkTokenProvider, "magicLinkTokenProvider");
        this.f5796a = magicLinkTokenProvider;
    }

    @JavascriptInterface
    public final void getToken() {
        this.f5796a.a();
    }

    @JavascriptInterface
    public final void refreshToken() {
        this.f5796a.j0();
    }
}
