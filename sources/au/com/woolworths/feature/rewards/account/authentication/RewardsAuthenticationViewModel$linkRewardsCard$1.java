package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.network.NetworkExceptions;
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
final /* synthetic */ class RewardsAuthenticationViewModel$linkRewardsCard$1 extends FunctionReferenceImpl implements Function1<Result<? extends Object>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsLinkErrorWrapper rewardsLinkErrorWrapper;
        RewardsLinkError rewardsLinkError;
        Result p0 = (Result) obj;
        Intrinsics.h(p0, "p0");
        RewardsAuthenticationViewModel rewardsAuthenticationViewModel = (RewardsAuthenticationViewModel) this.receiver;
        PublishSubject publishSubject = rewardsAuthenticationViewModel.l;
        boolean zA = p0.a();
        Throwable th = p0.b;
        if (zA) {
            Intrinsics.e(th);
            NetworkExceptions networkExceptions = rewardsAuthenticationViewModel.g;
            networkExceptions.getClass();
            if (!NetworkExceptions.c(th) || (rewardsLinkErrorWrapper = (RewardsLinkErrorWrapper) networkExceptions.b(th, RewardsLinkErrorWrapper.class)) == null || (rewardsLinkError = rewardsLinkErrorWrapper.e) == null) {
                rewardsAuthenticationViewModel.q6(th);
            } else {
                publishSubject.onNext(new RewardsAuthenticationContract.Actions.DisplayLinkError(rewardsLinkError.d));
            }
        } else {
            publishSubject.onNext(new RewardsAuthenticationContract.Actions.CloseScreen(true));
        }
        return Unit.f24250a;
    }
}
