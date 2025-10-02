package au.com.woolworths.feature.shop.onboarding;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OnboardingViewModel$onBeOurGuestClick$3 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p0 = (Throwable) obj;
        Intrinsics.h(p0, "p0");
        OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.receiver;
        onboardingViewModel.h.a();
        onboardingViewModel.j.getClass();
        if (p0 instanceof NoConnectivityException) {
            OnboardingErrorState onboardingErrorState = OnboardingErrorState.d;
            MutableLiveData mutableLiveData = onboardingViewModel.m;
            OnboardingContract.ViewState viewState = (OnboardingContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState != null ? new OnboardingContract.ViewState(false, viewState.b, viewState.c, onboardingErrorState) : null);
        } else {
            onboardingViewModel.n.onNext(OnboardingContract.NavigationActions.NavigateToCollectionMode.f7957a);
        }
        return Unit.f24250a;
    }
}
