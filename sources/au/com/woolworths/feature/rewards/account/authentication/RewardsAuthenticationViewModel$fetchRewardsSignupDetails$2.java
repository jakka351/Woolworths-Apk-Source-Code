package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAuthenticationViewModel$fetchRewardsSignupDetails$2 extends FunctionReferenceImpl implements Function1<Result<? extends Component<RewardsLinkCallbackResultData>>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Result p0 = (Result) obj;
        Intrinsics.h(p0, "p0");
        RewardsAuthenticationViewModel rewardsAuthenticationViewModel = (RewardsAuthenticationViewModel) this.receiver;
        rewardsAuthenticationViewModel.getClass();
        Component component = (Component) p0.f4591a;
        if (p0.a() || component == null) {
            rewardsAuthenticationViewModel.q = null;
            rewardsAuthenticationViewModel.r = null;
            rewardsAuthenticationViewModel.p = null;
            rewardsAuthenticationViewModel.q6(p0.b);
        } else {
            RewardsLinkCallbackResultData rewardsLinkCallbackResultData = (RewardsLinkCallbackResultData) component.b();
            rewardsAuthenticationViewModel.q = rewardsLinkCallbackResultData.getSessionToken();
            rewardsAuthenticationViewModel.r = new RewardsAuthenticationViewModel.CallBackUrlMatch(rewardsLinkCallbackResultData.getCallbackUrlPattern(), rewardsLinkCallbackResultData.getCallbackUrlRegexPattern());
            if (rewardsAuthenticationViewModel.p == null) {
                rewardsAuthenticationViewModel.p = rewardsLinkCallbackResultData.getLoginFormUrl();
            }
            PublishSubject publishSubject = rewardsAuthenticationViewModel.l;
            String str = rewardsAuthenticationViewModel.p;
            Intrinsics.e(str);
            publishSubject.onNext(new RewardsAuthenticationContract.Actions.LoadSignUpUrl(str, rewardsAuthenticationViewModel.i));
        }
        return Unit.f24250a;
    }
}
