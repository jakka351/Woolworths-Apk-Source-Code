package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationClickListener;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfirmationViewModel extends ViewModel implements ConfirmationClickListener {
    public final DeliveryUnlimitedSignUpInteractor e;
    public final AnalyticsManager f;
    public final MutableLiveData g;
    public final SharedFlowImpl h;

    public ConfirmationViewModel(DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = deliveryUnlimitedSignUpInteractor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.g = mutableLiveData;
        this.h = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        mutableLiveData.m(new ConfirmationContract.ViewState(true, EmptyList.d));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ConfirmationViewModel$fetchConfirmation$1(this, null), 3);
    }
}
