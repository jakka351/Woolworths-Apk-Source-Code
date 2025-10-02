package au.com.woolworths.base.wallet.digipay;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl;
import au.com.woolworths.android.onesite.jwt.RewardsJwtResponse;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.Gson;
import io.jsonwebtoken.JwtException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/DigipayUtils;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DigipayUtils {

    /* renamed from: a, reason: collision with root package name */
    public final SharedHeaders f4636a;
    public final RewardsAppTokenAuthenticator b;
    public final Gson c;

    public DigipayUtils(SharedHeaders sharedHeaders, RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator, JwtRepositoryImpl jwtRepositoryImpl, Gson gson) {
        Intrinsics.h(sharedHeaders, "sharedHeaders");
        Intrinsics.h(rewardsAppTokenAuthenticator, "rewardsAppTokenAuthenticator");
        Intrinsics.h(gson, "gson");
        this.f4636a = sharedHeaders;
        this.b = rewardsAppTokenAuthenticator;
        this.c = gson;
    }

    public final DigipayToken a(String str) {
        RewardsJwtResponse rejected;
        DigipayPayload digipayPayload;
        try {
            rejected = new RewardsJwtResponse.Verified(JwtRepositoryImpl.b(StringsKt.L("Bearer ", str)));
        } catch (JwtException e) {
            rejected = new RewardsJwtResponse.Rejected(e);
        }
        if (rejected instanceof RewardsJwtResponse.Verified) {
            digipayPayload = (DigipayPayload) this.c.d(DigipayPayload.class, ((RewardsJwtResponse.Verified) rejected).f4262a);
        } else {
            if (rejected instanceof RewardsJwtResponse.Rejected) {
                Bark.Companion companion = Bark.f8483a;
                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.n), "could not decrypt Digipay JWT token: " + ((RewardsJwtResponse.Rejected) rejected).f4261a, null);
            }
            digipayPayload = null;
        }
        if (digipayPayload != null) {
            return new DigipayToken(a.A("Bearer ", digipayPayload.getDigipayToken()), digipayPayload.getDigipayTokenExpiresIn());
        }
        return null;
    }
}
