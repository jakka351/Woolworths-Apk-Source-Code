package au.com.woolworths.base.wallet.digipay;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/DigipayToken;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigipayToken {

    /* renamed from: a, reason: collision with root package name */
    public final String f4635a;
    public final long b;

    public DigipayToken(String token, long j) {
        Intrinsics.h(token, "token");
        this.f4635a = token;
        this.b = j;
    }
}
