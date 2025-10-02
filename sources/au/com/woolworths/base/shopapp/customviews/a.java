package au.com.woolworths.base.shopapp.customviews;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.f;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrOverlayFragment;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld;
import au.com.woolworths.feature.rewards.card.overlay.ui.b;
import au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.CategoryCardEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.CategoryPageEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.ProductCardEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.ProductCardHeroEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.home.c;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.ChangeStoreEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.TermsEpoxyModel;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel;
import au.com.woolworths.shop.checkout.ui.components.BillingAddressEmptyEpoxyModel;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode;
import au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener;
import au.com.woolworths.shop.lists.ui.lists.sng.SngListsActivity;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonClickListener;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickDeleteProductTracking;
import com.woolworths.scanlibrary.databinding.ActivityOnBoardingBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.PromotionItemHeaderViewHolder;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.ui.home.HomeActivityContract;
import com.woolworths.scanlibrary.ui.home.itemview.views.AssistanceRequiredPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.InterventionItemPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemQuantityPickerDialog;
import com.woolworths.scanlibrary.ui.home.itemview.views.SimpleItemPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.UnknownItemPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.WeightRequiredPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.WeightedItemPSView;
import com.woolworths.scanlibrary.ui.message.singleAction.MessageSingleActionFragment;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import com.woolworths.scanlibrary.ui.onboarding.analytics.OnboardingAnalyticsData;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.util.widget.PromotionListView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(OnBalloonClickListener onBalloonClickListener, Balloon balloon) {
        this.d = 17;
        this.e = onBalloonClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Balloon balloon = (Balloon) obj;
                Callback.g(it);
                try {
                    balloon.c();
                    return;
                } finally {
                }
            case 1:
                RewardsWalletOcrOverlayFragment rewardsWalletOcrOverlayFragment = (RewardsWalletOcrOverlayFragment) obj;
                int i2 = RewardsWalletOcrOverlayFragment.e;
                Callback.g(it);
                try {
                    RewardsWalletOcrOverlayFragment.b(rewardsWalletOcrOverlayFragment);
                    return;
                } finally {
                }
            case 2:
                AccountSettingsFragmentOld accountSettingsFragmentOld = (AccountSettingsFragmentOld) obj;
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                Callback.g(it);
                try {
                    accountSettingsFragmentOld.requireActivity().onBackPressed();
                    return;
                } finally {
                }
            case 3:
                CategoryCardEpoxyModel categoryCardEpoxyModel = (CategoryCardEpoxyModel) obj;
                Callback.g(it);
                try {
                    b bVar = categoryCardEpoxyModel.p;
                    if (bVar != null) {
                        bVar.invoke();
                        return;
                    } else {
                        Intrinsics.p("onCardClickListener");
                        throw null;
                    }
                } finally {
                }
            case 4:
                CategoryPageEpoxyModel categoryPageEpoxyModel = (CategoryPageEpoxyModel) obj;
                Callback.g(it);
                try {
                    Function1 function1 = categoryPageEpoxyModel.q;
                    if (function1 != null) {
                        function1.invoke(categoryPageEpoxyModel.K());
                        return;
                    } else {
                        Intrinsics.p("onButtonClickListener");
                        throw null;
                    }
                } finally {
                }
            case 5:
                ProductCardEpoxyModel productCardEpoxyModel = (ProductCardEpoxyModel) obj;
                Callback.g(it);
                try {
                    f fVar = productCardEpoxyModel.p;
                    if (fVar != null) {
                        fVar.invoke(productCardEpoxyModel.K());
                        return;
                    } else {
                        Intrinsics.p("onClickListener");
                        throw null;
                    }
                } finally {
                }
            case 6:
                ProductCardHeroEpoxyModel productCardHeroEpoxyModel = (ProductCardHeroEpoxyModel) obj;
                Callback.g(it);
                try {
                    f fVar2 = productCardHeroEpoxyModel.o;
                    if (fVar2 != null) {
                        fVar2.invoke(productCardHeroEpoxyModel.K());
                        return;
                    } else {
                        Intrinsics.p("onClickListener");
                        throw null;
                    }
                } finally {
                }
            case 7:
                ChangeStoreEpoxyModel changeStoreEpoxyModel = (ChangeStoreEpoxyModel) obj;
                Callback.g(it);
                try {
                    c cVar = changeStoreEpoxyModel.q;
                    if (cVar != null) {
                        cVar.invoke();
                        return;
                    } else {
                        Intrinsics.p("onChangeStoreClickListener");
                        throw null;
                    }
                } finally {
                }
            case 8:
                TermsEpoxyModel termsEpoxyModel = (TermsEpoxyModel) obj;
                Callback.g(it);
                try {
                    c cVar2 = termsEpoxyModel.n;
                    if (cVar2 != null) {
                        cVar2.invoke();
                        return;
                    } else {
                        Intrinsics.p("onTermsAndConditionsClick");
                        throw null;
                    }
                } finally {
                }
            case 9:
                ProgressStepperInfoActivity progressStepperInfoActivity = (ProgressStepperInfoActivity) obj;
                int i3 = ProgressStepperInfoActivity.z;
                Callback.g(it);
                try {
                    progressStepperInfoActivity.getF().d();
                    return;
                } finally {
                }
            case 10:
                CreateUpdateShoppingListActivity createUpdateShoppingListActivity = (CreateUpdateShoppingListActivity) obj;
                int i4 = CreateUpdateShoppingListActivity.A;
                Callback.g(it);
                try {
                    CreateUpdateShoppingListViewModel createUpdateShoppingListViewModelO4 = createUpdateShoppingListActivity.O4();
                    createUpdateShoppingListViewModelO4.h.c(createUpdateShoppingListViewModelO4.m.a(createUpdateShoppingListViewModelO4.p6()).a());
                    createUpdateShoppingListActivity.finish();
                    return;
                } finally {
                }
            case 11:
                BillingAddressEmptyEpoxyModel billingAddressEmptyEpoxyModel = (BillingAddressEmptyEpoxyModel) obj;
                Callback.g(it);
                try {
                    au.com.woolworths.shop.checkout.ui.details.c cVar3 = billingAddressEmptyEpoxyModel.o;
                    if (cVar3 != null) {
                        cVar3.invoke();
                        return;
                    } else {
                        Intrinsics.p("onClickAddBillingAddress");
                        throw null;
                    }
                } finally {
                }
            case 12:
                ItemCheckoutPromotionCode itemCheckoutPromotionCode = (ItemCheckoutPromotionCode) obj;
                Callback.g(it);
                try {
                    CheckoutPromoCodeListener checkoutPromoCodeListener = itemCheckoutPromotionCode.o;
                    if (checkoutPromoCodeListener != null) {
                        checkoutPromoCodeListener.x2();
                        return;
                    } else {
                        Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                } finally {
                }
            case 13:
                SngListsActivity sngListsActivity = (SngListsActivity) obj;
                int i5 = SngListsActivity.z;
                Callback.g(it);
                try {
                    sngListsActivity.onBackPressed();
                    return;
                } finally {
                }
            case 14:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) obj;
                Callback.g(it);
                try {
                    materialDatePicker.D.setEnabled(materialDatePicker.I1().r0());
                    materialDatePicker.B.toggle();
                    materialDatePicker.q = materialDatePicker.q == 1 ? 0 : 1;
                    materialDatePicker.h2(materialDatePicker.B);
                    materialDatePicker.b2();
                    return;
                } finally {
                }
            case 15:
                SparkScanView.m302instrumented$0$onAttachedToWindow$V((SparkScanView) obj, it);
                return;
            case 16:
                ToggleImageButton.m305x7ac5cb9((ToggleImageButton) obj, it);
                return;
            case 17:
                OnBalloonClickListener onBalloonClickListener = (OnBalloonClickListener) obj;
                Callback.g(it);
                if (onBalloonClickListener != null) {
                    try {
                        Intrinsics.g(it, "it");
                        onBalloonClickListener.a(it);
                    } finally {
                    }
                }
                return;
            case 18:
                PromotionItemHeaderViewHolder promotionItemHeaderViewHolder = (PromotionItemHeaderViewHolder) obj;
                int i6 = PromotionItemHeaderViewHolder.d;
                Callback.g(it);
                try {
                    ImageView imageView = promotionItemHeaderViewHolder.c;
                    PromotionListView promotionList = promotionItemHeaderViewHolder.b;
                    Intrinsics.g(promotionList, "promotionList");
                    if (promotionList.getVisibility() == 0) {
                        promotionList.setVisibility(8);
                        imageView.setImageResource(R.drawable.sng_ic_chevron_down_grey_24dp);
                    } else {
                        promotionList.setVisibility(0);
                        imageView.setImageResource(R.drawable.sng_ic_chevron_up_grey_24dp);
                    }
                    return;
                } finally {
                }
            case 19:
                PayFragment payFragment = (PayFragment) obj;
                Callback.g(it);
                try {
                    it.setVisibility(8);
                    payFragment.p = false;
                    payFragment.n2(true);
                    return;
                } finally {
                }
            case 20:
                HomeActivity homeActivity = (HomeActivity) obj;
                int i7 = HomeActivity.W;
                Callback.g(it);
                try {
                    int i8 = SearchActivity.M;
                    SearchActivity.Companion.a(homeActivity);
                    ((HomeActivityContract.Presenter) homeActivity.S4()).r0();
                    return;
                } finally {
                }
            case 21:
                AssistanceRequiredPSView assistanceRequiredPSView = (AssistanceRequiredPSView) obj;
                Callback.g(it);
                try {
                    assistanceRequiredPSView.c(assistanceRequiredPSView.f21272a);
                    return;
                } finally {
                }
            case 22:
                InterventionItemPSView interventionItemPSView = (InterventionItemPSView) obj;
                Item item = interventionItemPSView.f21271a;
                Callback.g(it);
                try {
                    interventionItemPSView.c(item);
                    AnalyticsProvider analyticsProvider = interventionItemPSView.g;
                    if (analyticsProvider != null) {
                        analyticsProvider.b(new ClickDeleteProductTracking(item.getLinenumber()));
                        return;
                    } else {
                        Intrinsics.p("analyticsAggregator");
                        throw null;
                    }
                } finally {
                }
            case 23:
                ItemQuantityPickerDialog itemQuantityPickerDialog = (ItemQuantityPickerDialog) obj;
                Callback.g(it);
                try {
                    itemQuantityPickerDialog.dismiss();
                    return;
                } finally {
                }
            case 24:
                SimpleItemPSView simpleItemPSView = (SimpleItemPSView) obj;
                Item item2 = simpleItemPSView.f21272a;
                Callback.g(it);
                try {
                    simpleItemPSView.c(item2);
                    AnalyticsProvider analyticsProvider2 = simpleItemPSView.h;
                    if (analyticsProvider2 != null) {
                        analyticsProvider2.b(new ClickDeleteProductTracking(item2.getLinenumber()));
                        return;
                    } else {
                        Intrinsics.p("analyticsAggregator");
                        throw null;
                    }
                } finally {
                }
            case 25:
                UnknownItemPSView unknownItemPSView = (UnknownItemPSView) obj;
                Callback.g(it);
                try {
                    unknownItemPSView.c(unknownItemPSView.f21271a);
                    return;
                } finally {
                }
            case 26:
                WeightRequiredPSView weightRequiredPSView = (WeightRequiredPSView) obj;
                Item item3 = weightRequiredPSView.f21273a;
                Callback.g(it);
                try {
                    weightRequiredPSView.c(item3);
                    AnalyticsProvider analyticsProvider3 = weightRequiredPSView.g;
                    if (analyticsProvider3 != null) {
                        analyticsProvider3.b(new ClickDeleteProductTracking(item3.getLinenumber()));
                        return;
                    } else {
                        Intrinsics.p("analyticsAggregator");
                        throw null;
                    }
                } finally {
                }
            case 27:
                WeightedItemPSView weightedItemPSView = (WeightedItemPSView) obj;
                Item item4 = weightedItemPSView.f21274a;
                Callback.g(it);
                try {
                    weightedItemPSView.c(item4);
                    AnalyticsProvider analyticsProvider4 = weightedItemPSView.h;
                    if (analyticsProvider4 != null) {
                        analyticsProvider4.b(new ClickDeleteProductTracking(item4.getLinenumber()));
                        return;
                    } else {
                        Intrinsics.p("analyticsAggregator");
                        throw null;
                    }
                } finally {
                }
            case 28:
                MessageSingleActionFragment messageSingleActionFragment = (MessageSingleActionFragment) obj;
                Callback.g(it);
                try {
                    MessageSingleActionFragment.h2(messageSingleActionFragment);
                    return;
                } finally {
                }
            default:
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj;
                int i9 = OnBoardingActivity.K;
                Callback.g(it);
                try {
                    OnboardingAnalyticsData onboardingAnalyticsData = OnboardingAnalyticsData.f;
                    ActivityOnBoardingBinding activityOnBoardingBinding = onBoardingActivity.G;
                    if (activityOnBoardingBinding == null) {
                        Intrinsics.p("viewBinding");
                        throw null;
                    }
                    onBoardingActivity.c5(onboardingAnalyticsData, activityOnBoardingBinding.B.getCurrentItem());
                    onBoardingActivity.setResult(0);
                    onBoardingActivity.finish();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
