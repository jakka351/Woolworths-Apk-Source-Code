package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardChallengeOptions;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardChallengeOptions {

    /* renamed from: a, reason: collision with root package name */
    public final String f4650a;
    public final boolean b;
    public final ActionType.AcsWindowSize c;
    public final FramesOptions d;

    public CardChallengeOptions(String sessionId, boolean z, FramesOptions framesOptions) {
        ActionType.AcsWindowSize acsWindowSize = ActionType.AcsWindowSize.f;
        Intrinsics.h(sessionId, "sessionId");
        this.f4650a = sessionId;
        this.b = z;
        this.c = acsWindowSize;
        this.d = framesOptions;
    }
}
