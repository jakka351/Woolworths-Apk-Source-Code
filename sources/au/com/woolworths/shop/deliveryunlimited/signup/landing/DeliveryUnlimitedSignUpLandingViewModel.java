package au.com.woolworths.shop.deliveryunlimited.signup.landing;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonClickHandler;", "Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSummaryClickListener;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSignUpLandingViewModel extends ViewModel implements FullPageErrorStateClickHandler, ButtonClickHandler, DeliveryUnlimitedSummaryClickListener {
    public final DeliveryUnlimitedSignUpInteractor e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public DeliveryUnlimitedSignUpErrorState j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10879a;

        static {
            int[] iArr = new int[DeliveryUnlimitedSignUpErrorState.values().length];
            try {
                DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState = DeliveryUnlimitedSignUpErrorState.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState2 = DeliveryUnlimitedSignUpErrorState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10879a = iArr;
        }
    }

    public DeliveryUnlimitedSignUpLandingViewModel(DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = deliveryUnlimitedSignUpInteractor;
        this.f = analyticsManager;
        this.g = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.h = mutableLiveData;
        this.i = mutableLiveData;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSummaryClickListener
    public final void A0(DeliveryUnlimitedSubscribeLink link) {
        Intrinsics.h(link, "link");
        this.g.f(new DeliveryUnlimitedSignUpLandingContract.Actions.LaunchFeatureLink(link.getUrl()));
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe;
        Intrinsics.h(data, "data");
        DeliveryUnlimitedSignUpLandingContract.ViewState viewState = (DeliveryUnlimitedSignUpLandingContract.ViewState) this.i.e();
        if (viewState == null || (deliveryUnlimitedSubscribe = viewState.b) == null) {
            throw new IllegalStateException("No Delivery Unlimited Data Found!");
        }
        this.g.f(new DeliveryUnlimitedSignUpLandingContract.Actions.LaunchSelectPlanPage(deliveryUnlimitedSubscribe.getPlans(), Intrinsics.c(deliveryUnlimitedSubscribe.getIsUserWPayMigrated(), Boolean.TRUE)));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        DeliveryUnlimitedSignUpActions deliveryUnlimitedSignUpActions;
        MutableLiveData mutableLiveData = this.i;
        DeliveryUnlimitedSignUpLandingContract.ViewState viewState = (DeliveryUnlimitedSignUpLandingContract.ViewState) mutableLiveData.e();
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState = viewState != null ? viewState.c : null;
        int i = deliveryUnlimitedSignUpErrorState == null ? -1 : WhenMappings.f10879a[deliveryUnlimitedSignUpErrorState.ordinal()];
        if (i == 1) {
            deliveryUnlimitedSignUpActions = DeliveryUnlimitedSignUpActions.f;
        } else {
            if (i != 2) {
                DeliveryUnlimitedSignUpLandingContract.ViewState viewState2 = (DeliveryUnlimitedSignUpLandingContract.ViewState) mutableLiveData.e();
                throw new IllegalStateException("Unknown error state " + (viewState2 != null ? viewState2.c : null) + " try again clicked");
            }
            deliveryUnlimitedSignUpActions = DeliveryUnlimitedSignUpActions.h;
        }
        this.f.c(deliveryUnlimitedSignUpActions);
        p6();
    }

    public final void p6() {
        this.h.m(new DeliveryUnlimitedSignUpLandingContract.ViewState(true, null, null));
        BuildersKt.c(ViewModelKt.a(this), null, null, new DeliveryUnlimitedSignUpLandingViewModel$fetchDeliveryUnlimitedSignupIntro$1(new Ref.ObjectRef(), this, null), 3);
    }
}
