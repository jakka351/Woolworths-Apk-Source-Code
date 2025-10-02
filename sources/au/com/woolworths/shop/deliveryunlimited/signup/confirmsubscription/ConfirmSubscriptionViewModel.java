package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription;

import android.app.Application;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState;
import au.com.woolworths.shop.digipay.DigipayContract;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonClickHandler;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionViewModel extends AndroidViewModel implements ConfirmSubscriptionClickListener, FullPageErrorStateClickHandler, StatefulButtonClickHandler {
    public final DigipayInteractor f;
    public final DeliveryUnlimitedSignUpInteractor g;
    public final AnalyticsManager h;
    public String i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final SharedFlowImpl l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10863a;

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
            f10863a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSubscriptionViewModel(Application application, DigipayInteractor digipayInteractor, DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor, AnalyticsManager analyticsManager) {
        super(application);
        Intrinsics.h(digipayInteractor, "digipayInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f = digipayInteractor;
        this.g = deliveryUnlimitedSignUpInteractor;
        this.h = analyticsManager;
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        digipayInteractor.e();
    }

    public static final void q6(ConfirmSubscriptionViewModel confirmSubscriptionViewModel, String str) {
        confirmSubscriptionViewModel.h.j(ConfirmSubscriptionActions.f, TrackingMetadata.Companion.a(TrackableValue.o0, str));
        confirmSubscriptionViewModel.l.f(new ConfirmSubscriptionContract.Actions.ShowSnackbar(str));
        s6(confirmSubscriptionViewModel, confirmSubscriptionViewModel.j, false, StatefulButtonState.f, null, 13);
        confirmSubscriptionViewModel.f.f();
    }

    public static void s6(ConfirmSubscriptionViewModel confirmSubscriptionViewModel, MutableLiveData mutableLiveData, boolean z, StatefulButtonState statefulButtonState, DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState, int i) {
        ConfirmSubscriptionContract.ViewState viewState;
        if ((i & 1) != 0) {
            ConfirmSubscriptionContract.ViewState viewState2 = (ConfirmSubscriptionContract.ViewState) confirmSubscriptionViewModel.j.e();
            z = viewState2 != null ? viewState2.f10862a : false;
        }
        if ((i & 2) != 0 && ((viewState = (ConfirmSubscriptionContract.ViewState) confirmSubscriptionViewModel.j.e()) == null || (statefulButtonState = viewState.b) == null)) {
            statefulButtonState = StatefulButtonState.f;
        }
        ConfirmSubscriptionContract.ViewState viewState3 = (ConfirmSubscriptionContract.ViewState) confirmSubscriptionViewModel.j.e();
        DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment = viewState3 != null ? viewState3.c : null;
        if ((i & 8) != 0) {
            ConfirmSubscriptionContract.ViewState viewState4 = (ConfirmSubscriptionContract.ViewState) confirmSubscriptionViewModel.j.e();
            deliveryUnlimitedSignUpErrorState = viewState4 != null ? viewState4.d : null;
        }
        confirmSubscriptionViewModel.getClass();
        mutableLiveData.m(new ConfirmSubscriptionContract.ViewState(z, statefulButtonState, deliveryUnlimitedSubscribePayment, deliveryUnlimitedSignUpErrorState));
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        Intrinsics.h(data, "data");
        this.h.c(ConfirmSubscriptionActions.g);
        this.f.j.f(DigipayContract.Actions.TriggerIframeSubmitFormIfAllowed.f10907a);
        s6(this, this.j, false, StatefulButtonState.e, null, 12);
        this.l.f(ConfirmSubscriptionContract.Actions.DismissTermsBottomSheet.f10857a);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState state) {
        DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment;
        DeliveryUnlimitedSignUpFooter footer;
        ButtonApiData button;
        Intrinsics.h(state, "state");
        ConfirmSubscriptionActions confirmSubscriptionActions = ConfirmSubscriptionActions.e;
        TrackableValue trackableValue = TrackableValue.o0;
        ConfirmSubscriptionContract.ViewState viewState = (ConfirmSubscriptionContract.ViewState) this.j.e();
        String label = (viewState == null || (deliveryUnlimitedSubscribePayment = viewState.c) == null || (footer = deliveryUnlimitedSubscribePayment.getFooter()) == null || (button = footer.getButton()) == null) ? null : button.getLabel();
        if (label == null) {
            throw new IllegalArgumentException("Submit button clicked with no label");
        }
        this.h.j(confirmSubscriptionActions, TrackingMetadata.Companion.a(trackableValue, label));
        this.l.f(ConfirmSubscriptionContract.Actions.LaunchTermAndConditionsBottomSheet.f10859a);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        ConfirmSubscriptionActions confirmSubscriptionActions;
        r6();
        MutableLiveData mutableLiveData = this.j;
        ConfirmSubscriptionContract.ViewState viewState = (ConfirmSubscriptionContract.ViewState) mutableLiveData.e();
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState = viewState != null ? viewState.d : null;
        int i = deliveryUnlimitedSignUpErrorState == null ? -1 : WhenMappings.f10863a[deliveryUnlimitedSignUpErrorState.ordinal()];
        if (i == 1) {
            confirmSubscriptionActions = ConfirmSubscriptionActions.h;
        } else {
            if (i != 2) {
                ConfirmSubscriptionContract.ViewState viewState2 = (ConfirmSubscriptionContract.ViewState) mutableLiveData.e();
                throw new IllegalStateException("Unknown error state " + (viewState2 != null ? viewState2.d : null) + " try again clicked");
            }
            confirmSubscriptionActions = ConfirmSubscriptionActions.i;
        }
        this.h.c(confirmSubscriptionActions);
    }

    public final void r6() {
        s6(this, this.j, true, null, null, 14);
        BuildersKt.c(ViewModelKt.a(this), null, null, new ConfirmSubscriptionViewModel$fetchDeliveryUnlimitedPayment$1(this, null), 3);
    }
}
