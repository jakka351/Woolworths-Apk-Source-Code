package au.com.woolworths.feature.shop.myorders.details;

import android.view.MenuItem;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderDetailsBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingSurveyInput;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import com.woolworths.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object objA;
        Object value2;
        OrderDetailsContract.DriverRatingState driverRatingStateA;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                DriverRatingSurveyInput surveyInput = (DriverRatingSurveyInput) obj;
                Intrinsics.h(surveyInput, "surveyInput");
                OrderDetailsViewModel orderDetailsViewModel = ((OrderDetailsController) obj2).viewModel;
                MutableStateFlow mutableStateFlow = orderDetailsViewModel.t;
                StarCount.Companion companion = StarCount.e;
                int i2 = surveyInput.b;
                companion.getClass();
                StarCount starCountA = StarCount.Companion.a(i2);
                int iOrdinal = starCountA.ordinal();
                if (iOrdinal == 0) {
                    mutableStateFlow.setValue(OrderDetailsContract.DriverRatingState.StarRating.NoStarAlert.e);
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    mutableStateFlow.setValue(new OrderDetailsContract.DriverRatingState.FeedbackInput(EmptySet.d, "", starCountA, false));
                } else {
                    if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mutableStateFlow.setValue(new OrderDetailsContract.DriverRatingState.FeedbackInput(null, "", starCountA, false));
                }
                BuildersKt.c(ViewModelKt.a(orderDetailsViewModel), null, null, new OrderDetailsViewModel$onStarRatingButtonClick$1(orderDetailsViewModel, surveyInput, null), 3);
                return unit;
            case 1:
                DriverRatingSurveyInput surveyInput2 = (DriverRatingSurveyInput) obj;
                Intrinsics.h(surveyInput2, "surveyInput");
                OrderDetailsViewModel orderDetailsViewModel2 = ((OrderDetailsController) obj2).viewModel;
                orderDetailsViewModel2.getClass();
                BuildersKt.c(ViewModelKt.a(orderDetailsViewModel2), null, null, new OrderDetailsViewModel$onInputFeedbackButtonClick$1(orderDetailsViewModel2, surveyInput2, null), 3);
                return unit;
            case 2:
                return OrderDetailsController.createLegacyCurrentDeliveryOrderOverview$lambda$50$lambda$46((OrderDetailsController) obj2, (StepsToolTip) obj);
            case 3:
                return OrderDetailsController.createLegacyEpoxyItem$lambda$42$lambda$35((OrderDetailsController) obj2, (StepsToolTip) obj);
            case 4:
                return OrderDetailsController.createLegacyEpoxyItem$lambda$13((OrderDetailsController) obj2, (String) obj);
            case 5:
                return OrderDetailsController.createLegacyEpoxyItem$lambda$14((OrderDetailsController) obj2, (String) obj);
            case 6:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                ((OrderDetailsController) obj2).viewModel.R0(it);
                return unit;
            case 7:
                ((OrderDetailsController) obj2).viewModel.x6((StepsToolTip) obj);
                return unit;
            case 8:
                ButtonApiData it2 = (ButtonApiData) obj;
                Intrinsics.h(it2, "it");
                ((OrderDetailsController) obj2).viewModel.O2(it2);
                return unit;
            case 9:
                StarCount it3 = (StarCount) obj;
                Intrinsics.h(it3, "it");
                OrderDetailsViewModel orderDetailsViewModel3 = ((OrderDetailsController) obj2).viewModel;
                orderDetailsViewModel3.getClass();
                orderDetailsViewModel3.t.setValue(new OrderDetailsContract.DriverRatingState.StarRating.SelectedStar(it3));
                return unit;
            case 10:
                String chipId = (String) obj;
                Intrinsics.h(chipId, "chipId");
                OrderDetailsViewModel orderDetailsViewModel4 = ((OrderDetailsController) obj2).viewModel;
                orderDetailsViewModel4.getClass();
                MutableStateFlow mutableStateFlow2 = orderDetailsViewModel4.t;
                do {
                    value = mutableStateFlow2.getValue();
                    objA = (OrderDetailsContract.DriverRatingState) value;
                    if (objA instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
                        OrderDetailsContract.DriverRatingState.FeedbackInput feedbackInput = (OrderDetailsContract.DriverRatingState.FeedbackInput) objA;
                        Set set = feedbackInput.d;
                        objA = OrderDetailsContract.DriverRatingState.FeedbackInput.a(feedbackInput, set != null ? set.contains(chipId) ? SetsKt.d(set, chipId) : SetsKt.h(set, chipId) : SetsKt.i(chipId), null, false, 14);
                    }
                } while (!mutableStateFlow2.d(value, objA));
                return unit;
            case 11:
                String text = (String) obj;
                Intrinsics.h(text, "text");
                OrderDetailsViewModel orderDetailsViewModel5 = ((OrderDetailsController) obj2).viewModel;
                orderDetailsViewModel5.getClass();
                MutableStateFlow mutableStateFlow3 = orderDetailsViewModel5.t;
                do {
                    value2 = mutableStateFlow3.getValue();
                    OrderDetailsContract.DriverRatingState driverRatingState = (OrderDetailsContract.DriverRatingState) value2;
                    boolean z = driverRatingState instanceof OrderDetailsContract.DriverRatingState.FeedbackInput;
                    driverRatingStateA = driverRatingState;
                    if (z) {
                        OrderDetailsContract.DriverRatingState.FeedbackInput feedbackInput2 = (OrderDetailsContract.DriverRatingState.FeedbackInput) driverRatingState;
                        driverRatingStateA = feedbackInput2;
                        if (text.length() <= orderDetailsViewModel5.D) {
                            driverRatingStateA = OrderDetailsContract.DriverRatingState.FeedbackInput.a(feedbackInput2, null, text, false, 13);
                        }
                    }
                } while (!mutableStateFlow3.d(value2, driverRatingStateA));
                return unit;
            case 12:
                String url = (String) obj;
                Intrinsics.h(url, "url");
                OrderDetailsViewModel orderDetailsViewModel6 = ((OrderDetailsController) obj2).viewModel;
                orderDetailsViewModel6.getClass();
                orderDetailsViewModel6.u.f(new OrderDetailsContract.Actions.OpenChatToOlive(url));
                return unit;
            case 13:
                OrderDetailsController orderDetailsController = (OrderDetailsController) obj2;
                InsetBannerApiData it4 = (InsetBannerApiData) obj;
                Intrinsics.h(it4, "it");
                AnalyticsData analytics = it4.getAnalytics();
                if (analytics != null) {
                    orderDetailsController.trackOrderStatusBannerImpression(analytics);
                }
                return unit;
            case 14:
                ((OrderDetailsController) obj2).viewModel.x6((StepsToolTip) obj);
                return unit;
            case 15:
                ButtonApiData it5 = (ButtonApiData) obj;
                Intrinsics.h(it5, "it");
                ((OrderDetailsController) obj2).viewModel.O2(it5);
                return unit;
            default:
                OrderDetailsActivity orderDetailsActivity = (OrderDetailsActivity) obj2;
                OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) obj;
                int i3 = OrderDetailsActivity.N;
                Intrinsics.e(viewState);
                OrderSummaryData orderSummaryData = viewState.c;
                if (viewState.f7671a == OrderDetailsContract.LoadingState.e) {
                    Views.c(orderDetailsActivity, 0);
                } else {
                    Views.b(orderDetailsActivity);
                }
                OrderDetailsController orderDetailsController2 = orderDetailsActivity.F;
                if (orderDetailsController2 == null) {
                    Intrinsics.p("epoxyController");
                    throw null;
                }
                orderDetailsController2.setData(orderSummaryData);
                ActivityOrderDetailsBinding activityOrderDetailsBinding = orderDetailsActivity.E;
                if (activityOrderDetailsBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                MenuItem menuItemFindItem = activityOrderDetailsBinding.D.getMenu().findItem(R.id.action_help);
                if (menuItemFindItem != null) {
                    menuItemFindItem.setVisible((orderSummaryData != null ? orderSummaryData.b : null) != null);
                }
                return unit;
        }
    }
}
