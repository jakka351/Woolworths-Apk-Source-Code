package au.com.woolworths.shop.auth.data;

import au.com.woolworths.android.onesite.models.authentication.Member;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-auth_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MemberDataKt {
    public static final Member a(MemberData memberData) {
        long jCurrentTimeMillis;
        Member member = new Member();
        member.setGuestUser(false);
        member.setUserName(memberData.getFirstName());
        member.setDateOfBirth(memberData.getDateOfBirth());
        member.setAccessToken(memberData.getAccessToken());
        try {
            jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(Long.parseLong(memberData.getExpiresIn()));
        } catch (NumberFormatException e) {
            Timber.f27013a.n("Error converting '%s' to expiresIn (Long)", e, memberData.getExpiresIn());
            jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(30000L);
        }
        member.setExpirySinceEpoch(jCurrentTimeMillis);
        member.setShopperId(memberData.getShopperId());
        member.setFulfilmentStoreId(memberData.getFulfilmentStoreId());
        member.setTrolleyHref(memberData.getTrolleyHref());
        member.setPaymentHref(memberData.getPaymentHref());
        return member;
    }
}
