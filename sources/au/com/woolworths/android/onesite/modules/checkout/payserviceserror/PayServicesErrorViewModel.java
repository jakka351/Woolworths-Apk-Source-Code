package au.com.woolworths.android.onesite.modules.checkout.payserviceserror;

import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.navigation.a;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorContract;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/payserviceserror/PayServicesErrorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/android/onesite/modules/checkout/payserviceserror/PaymentServicesFullPageErrorActionInterface;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayServicesErrorViewModel extends ViewModel implements FullPageErrorStateClickHandler, PaymentServicesFullPageErrorActionInterface {
    public final PaymentServicesInteractor e;
    public final LiveData f;

    public PayServicesErrorViewModel(PaymentServicesInteractor paymentServicesInteractor, SchedulersProvider schedulersProvider) {
        Intrinsics.h(paymentServicesInteractor, "paymentServicesInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        this.e = paymentServicesInteractor;
        BehaviorSubject behaviorSubjectJ = paymentServicesInteractor.j();
        e eVar = new e(new a(26), 18);
        behaviorSubjectJ.getClass();
        this.f = LiveDataReactiveStreams.a(new ObservableMap(behaviorSubjectJ, eVar).i(schedulersProvider.d()).f(schedulersProvider.b()).l(BackpressureStrategy.e));
    }

    public final void g() {
        this.e.d(true);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        PaymentServicesFullPageErrorState paymentServicesFullPageErrorStateA;
        PayServicesErrorContract.ViewState viewState = (PayServicesErrorContract.ViewState) this.f.e();
        if (viewState == null || (paymentServicesFullPageErrorStateA = viewState.a()) == null) {
            return;
        }
        paymentServicesFullPageErrorStateA.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        PaymentServicesFullPageErrorState paymentServicesFullPageErrorStateA;
        PayServicesErrorContract.ViewState viewState = (PayServicesErrorContract.ViewState) this.f.e();
        if (viewState == null || (paymentServicesFullPageErrorStateA = viewState.a()) == null) {
            return;
        }
        paymentServicesFullPageErrorStateA.b(this);
    }
}
