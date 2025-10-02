package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AccountHomeOption;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f9389a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AccountHomeOption$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = AccountHomeOptionItem.f9393a;
        int i2 = AccountHomeOptionLogoutItem.f9394a;
        int i3 = AccountHomeOptionMagicLinkItem.f9396a;
        int i4 = AccountHomeOptionCanCloseAccountItem.f9391a;
        int i5 = AccountHomeOptionMandyItem.f9397a;
        int i6 = AccountHomeAndroidAppReviewLinkItem.f9382a;
        int i7 = AccountHomeIOSAppReviewLinkItem.f9386a;
        int i8 = AccountHomeAndroidMedalliaItem.f9383a;
        int i9 = AccountHomeIOSMedalliaItem.f9387a;
        int i10 = AccountHomeOnboardingItem.f9388a;
        int i11 = AccountHomeOptionDeleteAccountItem.f9392a;
        f9389a = new UnionType("AccountHomeOption");
    }
}
