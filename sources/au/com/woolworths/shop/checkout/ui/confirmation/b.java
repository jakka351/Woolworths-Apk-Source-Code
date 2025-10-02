package au.com.woolworths.shop.checkout.ui.confirmation;

import androidx.activity.OnBackPressedCallback;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ OrderConfirmationActivity e;

    public /* synthetic */ b(OrderConfirmationActivity orderConfirmationActivity, int i) {
        this.d = i;
        this.e = orderConfirmationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        OrderConfirmationActivity orderConfirmationActivity = this.e;
        switch (i) {
            case 0:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                int i2 = OrderConfirmationActivity.D;
                Intrinsics.h(addCallback, "$this$addCallback");
                orderConfirmationActivity.O4().k.f(OrderConfirmationContract.Action.NavigateToHome.f10718a);
                break;
            case 1:
                VocContract.ViewState viewState = (VocContract.ViewState) obj;
                int i3 = OrderConfirmationActivity.D;
                OrderConfirmationViewModel orderConfirmationViewModelO4 = orderConfirmationActivity.O4();
                boolean z = viewState.f8234a;
                Integer num = viewState.l;
                int iIntValue = num != null ? num.intValue() : 0;
                MutableStateFlow mutableStateFlow = orderConfirmationViewModelO4.l;
                List list = ((OrderConfirmationContract.ViewState) mutableStateFlow.getValue()).b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((OrderConfirmationContent) obj2) instanceof OrderConfirmationContent.VocPlaceholder)) {
                        arrayList.add(obj2);
                    }
                }
                boolean z2 = ((OrderConfirmationContract.ViewState) mutableStateFlow.getValue()).f10720a;
                if (z) {
                    OrderConfirmationViewModel.s6(orderConfirmationViewModelO4, mutableStateFlow, z2, CollectionsKt.d0(new OrderConfirmationContent.VocPlaceholder(iIntValue), arrayList), null, null, 12);
                    break;
                } else {
                    OrderConfirmationViewModel.s6(orderConfirmationViewModelO4, mutableStateFlow, z2, arrayList, null, null, 12);
                    break;
                }
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                int i4 = OrderConfirmationActivity.D;
                orderConfirmationActivity.P4().y6(iIntValue2);
                break;
            default:
                Integer num2 = (Integer) obj;
                num2.getClass();
                int i5 = OrderConfirmationActivity.D;
                MutableStateFlow mutableStateFlow2 = orderConfirmationActivity.P4().h;
                mutableStateFlow2.setValue(VocContract.ViewState.a((VocContract.ViewState) mutableStateFlow2.getValue(), false, false, false, false, false, 0, null, null, null, null, num2, 2047));
                break;
        }
        return unit;
    }
}
