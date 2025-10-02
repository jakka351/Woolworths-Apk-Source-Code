package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.rewards.base.data.RewardsStaticUrls;
import au.com.woolworths.rewards.base.data.RewardsStaticUrlsKt;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAuthenticationActivityNew$onCreate$1$1$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String contactUsUrl;
        RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew = (RewardsAuthenticationActivityNew) this.receiver;
        int i = RewardsAuthenticationActivityNew.D;
        RewardsStaticUrls rewardsStaticUrls = RewardsStaticUrlsKt.parseRewardsStaticUrls(rewardsAuthenticationActivityNew.N4().e(RewardsRemoteConfig.g, false));
        if (rewardsStaticUrls != null && (contactUsUrl = rewardsStaticUrls.getContactUsUrl()) != null) {
            ContextExtKt.e(rewardsAuthenticationActivityNew, contactUsUrl);
        }
        return Unit.f24250a;
    }
}
