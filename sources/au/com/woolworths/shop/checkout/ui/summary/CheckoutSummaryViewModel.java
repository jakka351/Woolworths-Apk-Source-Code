package au.com.woolworths.shop.checkout.ui.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$applyPromoCodeError$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCode;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.ApplyPromoCodeBannerTypeData;
import au.com.woolworths.shop.checkout.domain.model.CheckoutInfoDialog;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAction;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsRedeemInfo;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsTotal;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutSummaryActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.StoreCreditContent;
import au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviour;
import au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorActionType;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryViewModel;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentViewModel;", "Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryListener;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSummaryViewModel extends CheckoutContentViewModel implements CheckoutSummaryListener, HorizontalSelectorViewListener {
    public final CheckoutSummaryInteractor o;
    public final AnalyticsManager p;
    public final ProgressId q;
    public final Lazy r;
    public final LinkedHashSet s;
    public final LinkedHashSet t;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10824a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ApplyPromoCodeBannerTypeData.values().length];
            try {
                iArr[ApplyPromoCodeBannerTypeData.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10824a = iArr;
            int[] iArr2 = new int[ProgressId.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr2;
            int[] iArr3 = new int[RewardsQuantitySelectorActionType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType = RewardsQuantitySelectorActionType.d;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType2 = RewardsQuantitySelectorActionType.d;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel(CheckoutSummaryInteractor checkoutSummaryInteractor, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        super(collectionModeInteractor, analyticsManager, featureToggleManager);
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.o = checkoutSummaryInteractor;
        this.p = analyticsManager;
        this.q = ProgressId.f;
        this.r = LazyKt.b(new d(15));
        this.s = new LinkedHashSet();
        this.t = new LinkedHashSet();
    }

    public static final void I6(CheckoutSummaryViewModel checkoutSummaryViewModel, ApplyCheckoutPromoCode applyCheckoutPromoCode) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        ModalBottomSheetData modalBottomSheetDataA;
        AnalyticsManager analyticsManager = checkoutSummaryViewModel.p;
        MutableStateFlow mutableStateFlow = checkoutSummaryViewModel.j;
        do {
            value = mutableStateFlow.getValue();
            viewState = (CheckoutContentContract.ViewState) value;
            modalBottomSheetDataA = viewState.g;
            if (modalBottomSheetDataA == null) {
                modalBottomSheetDataA = null;
            } else if (modalBottomSheetDataA instanceof ModalBottomSheetData.PromoCode) {
                ModalBottomSheetData.PromoCode promoCode = (ModalBottomSheetData.PromoCode) modalBottomSheetDataA;
                ApplyCheckoutPromoCodeResult applyCheckoutPromoCodeResult = applyCheckoutPromoCode.f10556a;
                if (applyCheckoutPromoCodeResult instanceof ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeFail) {
                    CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
                    String str = ((ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeFail) applyCheckoutPromoCodeResult).f10559a;
                    companion.getClass();
                    analyticsManager.g(new CheckoutAnalytics$Summary$Action$Companion$applyPromoCodeError$1(str));
                    modalBottomSheetDataA = ModalBottomSheetData.PromoCode.a(promoCode, null, null, null, new PlainText(str), null, null, 55);
                } else if (applyCheckoutPromoCodeResult instanceof ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeSuccess) {
                    modalBottomSheetDataA = ModalBottomSheetData.PromoCode.a(promoCode, null, "", new ResText(R.string.checkout_promo_code_apply_success), null, null, null, 57);
                } else if (applyCheckoutPromoCodeResult instanceof ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation) {
                    modalBottomSheetDataA = ModalBottomSheetData.PromoCode.a(promoCode, null, null, null, null, (ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation) applyCheckoutPromoCodeResult, null, 47);
                } else {
                    if (!(applyCheckoutPromoCodeResult instanceof ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo applyCheckoutPromoCodeAdditionalInfo = (ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo) applyCheckoutPromoCodeResult;
                    analyticsManager.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, applyCheckoutPromoCodeAdditionalInfo.b.getAnalytics()));
                    modalBottomSheetDataA = ModalBottomSheetData.PromoCode.a(promoCode, null, null, null, null, null, applyCheckoutPromoCodeAdditionalInfo, 31);
                }
            }
        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, modalBottomSheetDataA, 190)));
    }

    @Override // au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener
    public final void A2(String str) {
        this.p.c(new CheckoutSummaryActions.LinkClick(str));
    }

    @Override // au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener
    public final void E0(CheckoutInfoDialog redeemInfo) {
        Intrinsics.h(redeemInfo, "redeemInfo");
        PlainText plainText = new PlainText(redeemInfo.f10562a);
        PlainText plainText2 = new PlainText(redeemInfo.b);
        PlainText plainText3 = new PlainText(redeemInfo.c);
        String str = redeemInfo.d;
        this.i.f(new CheckoutContentContract.Actions.LaunchAlertDialog(plainText, plainText2, plainText3, new b(this, 0), str != null ? new PlainText(str) : null, new b(this, 1)));
        this.p.c(CheckoutSummaryActions.RewardsUseNow.e);
    }

    @Override // au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener
    public final void E5(CheckoutRewardsAndDiscount rewardsItem) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        int i;
        boolean z;
        Object value2;
        Object value3;
        Intrinsics.h(rewardsItem, "rewardsItem");
        boolean z2 = rewardsItem instanceof CheckoutRewardsAndDiscount.StoreCredit;
        AnalyticsManager analyticsManager = this.p;
        if (z2) {
            K6((CheckoutRewardsAndDiscount.StoreCredit) rewardsItem);
        } else {
            boolean z3 = rewardsItem instanceof CheckoutRewardsAndDiscount.PromoCode;
            MutableStateFlow mutableStateFlow = this.j;
            if (z3) {
                CheckoutRewardsAndDiscount.PromoCode promoCode = (CheckoutRewardsAndDiscount.PromoCode) rewardsItem;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value3, false, null, new ModalBottomSheetData.PromoCode(promoCode, "", null, null, null, null), 191)));
            } else {
                if (!(rewardsItem instanceof CheckoutRewardsAndDiscount.CheckoutRewards)) {
                    throw new NoWhenBranchMatchedException();
                }
                CheckoutRewardsAction checkoutRewardsAction = ((CheckoutRewardsAndDiscount.CheckoutRewards) rewardsItem).e;
                if (checkoutRewardsAction != null) {
                    if (checkoutRewardsAction instanceof CheckoutRewardsAction.CheckoutRewardsInfo) {
                        CheckoutRewardsAction.CheckoutRewardsInfo checkoutRewardsInfo = (CheckoutRewardsAction.CheckoutRewardsInfo) checkoutRewardsAction;
                        AnalyticsData analyticsData = checkoutRewardsInfo.g;
                        if (analyticsData != null) {
                            analyticsManager.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData));
                        }
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value2, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value2, false, null, new ModalBottomSheetData.Info(checkoutRewardsInfo.d, checkoutRewardsInfo.e, checkoutRewardsInfo.f, checkoutRewardsInfo.h), 191)));
                    } else if (checkoutRewardsAction instanceof CheckoutRewardsAction.CheckoutRewardsRedeem) {
                        CheckoutRewardsAction.CheckoutRewardsRedeem checkoutRewardsRedeem = (CheckoutRewardsAction.CheckoutRewardsRedeem) checkoutRewardsAction;
                        AnalyticsData analyticsData2 = checkoutRewardsRedeem.g;
                        if (analyticsData2 != null) {
                            analyticsManager.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData2));
                        }
                        do {
                            value = mutableStateFlow.getValue();
                            viewState = (CheckoutContentContract.ViewState) value;
                            CheckoutRewardsRedeemInfo checkoutRewardsRedeemInfo = checkoutRewardsRedeem.d;
                            int i2 = checkoutRewardsRedeemInfo.h;
                            if (i2 <= checkoutRewardsRedeemInfo.f) {
                                i = i2;
                                z = true;
                            } else {
                                i = i2;
                                z = false;
                            }
                        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, new ModalBottomSheetData.RewardsQuantitySelector(checkoutRewardsRedeem, -1, z, i != 0, false), 191)));
                    } else {
                        if (!checkoutRewardsAction.equals(CheckoutRewardsAction.CheckoutRewardsLink.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.i.f(CheckoutContentContract.Actions.LaunchRewardsSetup.f10746a);
                    }
                }
            }
        }
        AnalyticsData f10581a = rewardsItem.getF10581a();
        if (f10581a != null) {
            analyticsManager.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, f10581a));
        }
    }

    public final void J6(final String str, boolean z) {
        CheckoutAnalytics.Summary.Action.d.getClass();
        this.p.g(new Event(str) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$applyPromoCodeButtonClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                spreadBuilder.a(new Pair("event.Action", "discount_activation"));
                androidx.constraintlayout.core.state.a.z("event.Label", "Promo code applied", spreadBuilder, "checkout.promoCodes", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "checkout_promo_code_applied";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "checkout_promo_code_applied".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutSummaryViewModel$applyPromoCode$1(this, str, z, null), 3);
    }

    public final void K6(CheckoutRewardsAndDiscount.StoreCredit storeCredit) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.j;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value, false, null, new ModalBottomSheetData.StoreCredit(new StoreCreditContent.Success(storeCredit.f), null), 191)));
    }

    public final void L6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.j;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value, false, null, null, 191)));
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener
    public final void Z2(String str) {
        D6(CheckoutSummaryActions.PromotionSubmitted.e);
        this.i.f(CheckoutContentContract.Actions.DismissKeyboard.f10730a);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutSummaryViewModel$onAddPromoCode$1(this, str, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int f5() {
        ModalBottomSheetData modalBottomSheetData = ((CheckoutContentContract.ViewState) this.j.getValue()).g;
        ModalBottomSheetData.RewardsQuantitySelector rewardsQuantitySelector = modalBottomSheetData instanceof ModalBottomSheetData.RewardsQuantitySelector ? (ModalBottomSheetData.RewardsQuantitySelector) modalBottomSheetData : null;
        if (rewardsQuantitySelector == null) {
            return -1;
        }
        CheckoutRewardsRedeemInfo checkoutRewardsRedeemInfo = rewardsQuantitySelector.f10761a.d;
        return (checkoutRewardsRedeemInfo.h / checkoutRewardsRedeemInfo.g) - 1;
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener
    public final void k4() {
        this.p.j(CheckoutSummaryActions.HelpRequested.e, TrackingMetadata.Companion.a(TrackableValue.o0, "You'll collect"));
    }

    @Override // au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener
    public final void n0(String str) {
        this.i.f(CheckoutContentContract.Actions.AddBillingAddress.f10729a);
        this.p.c(CheckoutSummaryActions.AddBillingAddress.e);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final Job q6(Function0 function0) {
        return BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutSummaryViewModel$constructFetchContentJob$1(this, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final CheckoutContentViewBehaviour s6() {
        return (CheckoutContentViewBehaviour) this.r.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    /* renamed from: u6, reason: from getter */
    public final ProgressId getQ() {
        return this.q;
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener
    public final void v4(String str) {
        AnalyticsManager analyticsManager = this.p;
        if (str == null || str.length() == 0) {
            analyticsManager.c(CheckoutSummaryActions.HelpAlert.e);
        } else {
            analyticsManager.j(CheckoutSummaryActions.HelpAlert.e, TrackingMetadata.Companion.a(TrackableValue.o0, str));
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final ProgressId w6(CheckoutOrderTotalDetails checkoutOrderTotalDetails) {
        OrderTotalDetailsTotal orderTotalDetailsTotal = checkoutOrderTotalDetails.c;
        ProgressId progressId = orderTotalDetailsTotal.e;
        if ((progressId == null ? -1 : WhenMappings.b[progressId.ordinal()]) != 1) {
            return progressId;
        }
        double d = orderTotalDetailsTotal.c;
        boolean z = d == 0.0d;
        CheckoutContentContract.Actions.LaunchZeroPayment launchZeroPayment = CheckoutContentContract.Actions.LaunchZeroPayment.f10751a;
        SharedFlowImpl sharedFlowImpl = this.i;
        if (z) {
            sharedFlowImpl.f(launchZeroPayment);
            return null;
        }
        if (d >= 0.0d) {
            return null;
        }
        CheckoutRefundInfo checkoutRefundInfo = checkoutOrderTotalDetails.e;
        if (checkoutRefundInfo != null) {
            sharedFlowImpl.f(new CheckoutContentContract.Actions.LaunchRefundBottomSheet(checkoutRefundInfo));
            return null;
        }
        sharedFlowImpl.f(launchZeroPayment);
        return null;
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener
    public final void x2() {
        this.i.f(CheckoutContentContract.Actions.DismissKeyboard.f10730a);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutSummaryViewModel$onRemovePromoCode$1(this, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        ModalBottomSheetData modalBottomSheetData = ((CheckoutContentContract.ViewState) this.j.getValue()).g;
        ModalBottomSheetData.RewardsQuantitySelector rewardsQuantitySelector = modalBottomSheetData instanceof ModalBottomSheetData.RewardsQuantitySelector ? (ModalBottomSheetData.RewardsQuantitySelector) modalBottomSheetData : null;
        if (rewardsQuantitySelector == null) {
            return -1;
        }
        CheckoutRewardsRedeemInfo checkoutRewardsRedeemInfo = rewardsQuantitySelector.f10761a.d;
        int i = checkoutRewardsRedeemInfo.h;
        int i2 = checkoutRewardsRedeemInfo.g;
        if (i == 0) {
            return 0;
        }
        return (i / i2) - 1;
    }

    @Override // au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener
    public final void z1() {
        this.i.f(CheckoutContentContract.Actions.RewardsAuthentication.f10753a);
        this.p.c(CheckoutSummaryActions.AddRewardsCard.e);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        CheckoutRewardsRedeemInfo checkoutRewardsRedeemInfo;
        MutableStateFlow mutableStateFlow = this.j;
        ModalBottomSheetData modalBottomSheetData = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).g;
        ModalBottomSheetData.RewardsQuantitySelector rewardsQuantitySelector = modalBottomSheetData instanceof ModalBottomSheetData.RewardsQuantitySelector ? (ModalBottomSheetData.RewardsQuantitySelector) modalBottomSheetData : null;
        if (rewardsQuantitySelector == null) {
            return;
        }
        do {
            value = mutableStateFlow.getValue();
            viewState = (CheckoutContentContract.ViewState) value;
            checkoutRewardsRedeemInfo = rewardsQuantitySelector.f10761a.d;
        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, ModalBottomSheetData.RewardsQuantitySelector.a(rewardsQuantitySelector, i, (i + 1) * checkoutRewardsRedeemInfo.g <= checkoutRewardsRedeemInfo.f, 25), 191)));
    }
}
