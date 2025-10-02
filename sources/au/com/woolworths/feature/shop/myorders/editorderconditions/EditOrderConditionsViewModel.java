package au.com.woolworths.feature.shop.myorders.editorderconditions;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsContract;
import au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonClickHandler;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionEventHandler;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditOrderConditionsViewModel extends ViewModel implements StatefulButtonClickHandler, EditOrderConditionEventHandler {
    public final EditOrderInteractor e;
    public final CartUpdateInteractor f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final Flow k;
    public final MutableLiveData l;
    public String m;

    public EditOrderConditionsViewModel(EditOrderInteractor interactor, CartUpdateInteractor cartUpdateInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = interactor;
        this.f = cartUpdateInteractor;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.i = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
        this.l = mutableLiveData;
    }

    public static final void p6(EditOrderConditionsViewModel editOrderConditionsViewModel, Text text) {
        editOrderConditionsViewModel.g.c(EditOrderConditionsActions.h);
        editOrderConditionsViewModel.i.m(new EditOrderConditionsContract.ViewState(false, StatefulButtonState.d));
        editOrderConditionsViewModel.j.f(new EditOrderConditionsContract.Actions.ShowSnackbarMessage(text));
    }

    @Override // au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionEventHandler
    public final void N5(boolean z) {
        this.i.m(new EditOrderConditionsContract.ViewState(false, z ? StatefulButtonState.d : StatefulButtonState.f));
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState state) {
        Intrinsics.h(state, "state");
        q6();
    }

    public final void q6() {
        if (this.m == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.i.m(new EditOrderConditionsContract.ViewState(true, StatefulButtonState.e));
        this.g.c(EditOrderConditionsActions.e);
        BuildersKt.c(ViewModelKt.a(this), null, null, new EditOrderConditionsViewModel$onClickLogic$1(this, null), 3);
    }
}
