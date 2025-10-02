package au.com.woolworths.shop.checkout.ui.confirmation;

import au.com.woolworths.feature.shop.voc.analytics.VocActions;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestion;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestionType;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocViewModel;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ OrderConfirmationActivity e;

    public /* synthetic */ a(OrderConfirmationActivity orderConfirmationActivity, int i) {
        this.d = i;
        this.e = orderConfirmationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        OrderConfirmationActivity orderConfirmationActivity = this.e;
        switch (i) {
            case 0:
                int i2 = OrderConfirmationActivity.D;
                orderConfirmationActivity.P4().u6();
                return unit;
            case 1:
                int i3 = OrderConfirmationActivity.D;
                return new OrderConfirmationEpoxyController(orderConfirmationActivity.O4());
            case 2:
                int i4 = OrderConfirmationActivity.D;
                orderConfirmationActivity.P4().x6();
                return unit;
            default:
                int i5 = OrderConfirmationActivity.D;
                orderConfirmationActivity.P4().A6();
                VocViewModel vocViewModelP4 = orderConfirmationActivity.P4();
                VocContract.ViewState viewState = (VocContract.ViewState) vocViewModelP4.h.getValue();
                Intrinsics.h(viewState, "<this>");
                int i6 = viewState.f;
                boolean z = viewState.f8234a;
                if ((z && viewState.b && i6 == -1) || (z && viewState.c && i6 == -1)) {
                    SurveyQuestion surveyQuestionS6 = vocViewModelP4.s6();
                    VocActions vocActions = null;
                    SurveyQuestionType surveyQuestionType = surveyQuestionS6 != null ? surveyQuestionS6.c : null;
                    int i7 = surveyQuestionType == null ? -1 : VocViewModel.WhenMappings.f8238a[surveyQuestionType.ordinal()];
                    if (i7 != -1) {
                        if (i7 == 1) {
                            vocActions = VocActions.e;
                        } else if (i7 == 2) {
                            vocActions = VocActions.f;
                        } else if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (vocActions != null) {
                        vocViewModelP4.f.c(vocActions);
                    }
                }
                vocViewModelP4.r6(VocContract.ViewState.a(viewState, false, false, false, false, false, 0, null, null, null, null, null, 4094));
                return unit;
        }
    }
}
