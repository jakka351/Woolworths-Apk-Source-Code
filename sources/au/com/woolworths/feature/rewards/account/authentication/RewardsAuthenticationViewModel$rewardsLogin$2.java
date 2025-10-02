package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAuthenticationViewModel$rewardsLogin$2 extends FunctionReferenceImpl implements Function1<Result<? extends Object>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Result p0 = (Result) obj;
        Intrinsics.h(p0, "p0");
        RewardsAuthenticationViewModel rewardsAuthenticationViewModel = (RewardsAuthenticationViewModel) this.receiver;
        PublishSubject publishSubject = rewardsAuthenticationViewModel.l;
        if (p0.a()) {
            rewardsAuthenticationViewModel.q6(p0.b);
        } else if (rewardsAuthenticationViewModel.s == RewardsAuthenticationContract.AuthType.d) {
            publishSubject.onNext(new RewardsAuthenticationContract.Actions.CloseScreen(true));
        } else {
            publishSubject.onNext(RewardsAuthenticationContract.Actions.LaunchHomepage.f5652a);
        }
        return Unit.f24250a;
    }
}
