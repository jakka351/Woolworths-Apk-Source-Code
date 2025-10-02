package au.com.woolworths.shop.deliveryunlimited.signup.selectplan;

import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSelectPlanBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ SelectPlanActivity d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SelectPlanContract.ViewState viewState = (SelectPlanContract.ViewState) obj;
        SelectPlanActivity selectPlanActivity = this.d;
        SelectPlanEpoxyController selectPlanEpoxyController = selectPlanActivity.B;
        if (selectPlanEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        selectPlanEpoxyController.setData(viewState.f10900a);
        ActivityDeliveryUnlimitedSelectPlanBinding activityDeliveryUnlimitedSelectPlanBinding = selectPlanActivity.A;
        if (activityDeliveryUnlimitedSelectPlanBinding != null) {
            activityDeliveryUnlimitedSelectPlanBinding.D.y.setEnabled(SelectPlanContractKt.a(viewState) != null);
            return Unit.f24250a;
        }
        Intrinsics.p("binding");
        throw null;
    }
}
