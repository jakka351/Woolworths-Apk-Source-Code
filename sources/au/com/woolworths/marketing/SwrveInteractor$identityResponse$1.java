package au.com.woolworths.marketing;

import YU.a;
import au.com.woolworths.android.onesite.models.authentication.Member;
import com.swrve.sdk.SwrveIdentityResponse;
import kotlin.Metadata;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/marketing/SwrveInteractor$identityResponse$1", "Lcom/swrve/sdk/SwrveIdentityResponse;", "marketing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwrveInteractor$identityResponse$1 implements SwrveIdentityResponse {
    @Override // com.swrve.sdk.SwrveIdentityResponse
    public final void a(String str, String str2) {
        Timber.Forest forest = Timber.f27013a;
        if (str2 == null) {
            str2 = Member.GUEST_USER;
        }
        forest.h(a.h("Swrve user identification ", str2, " succeeded"), new Object[0]);
    }

    @Override // com.swrve.sdk.SwrveIdentityResponse
    public final void b(int i, String str) {
        Timber.f27013a.h("Swrve user identification failed with : (" + i + ") " + str, new Object[0]);
    }
}
