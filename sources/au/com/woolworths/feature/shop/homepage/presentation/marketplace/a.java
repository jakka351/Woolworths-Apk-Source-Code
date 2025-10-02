package au.com.woolworths.feature.shop.homepage.presentation.marketplace;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.recipes.recipedetails.RecipeDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokens;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderView;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.MapFeatureHighlightView;
import au.com.woolworths.feature.shop.marketplace.ui.categories.CategoryTileView;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.HowItWorksCardView;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportScreenKt;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpScreenKt;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpContactTimes;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupLocationTrackingStatus;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadge;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.LocationTrackingStatusItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderHorizontalListItemKt;
import au.com.woolworths.feature.shop.trafficdrivers.ui.TrafficDriverView;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerViewModel;
import au.com.woolworths.foundation.feature.analytics.list.ItemsSeenState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerUiKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferProgressTracker;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.DescItem;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.PermissionDescContentKt;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.sdui.rewards.appmodal.ui.AppModalBulletItemUiKt;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardFooter;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import au.com.woolworths.shop.aem.components.ui.contentcard.ContentCardKt;
import au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterView;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt;
import au.com.woolworths.shop.lists.ui.lists.compose.SuggestedListScreenKt;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object objA;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = MarketplaceCardView.n;
                ((MarketplaceCardView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = ModeSelectorSubHeaderView.t;
                ((ModeSelectorSubHeaderView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                int i4 = MapFeatureHighlightView.n;
                ((MapFeatureHighlightView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 3:
                ((Integer) obj2).getClass();
                int i5 = CategoryTileView.o;
                ((CategoryTileView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                MarketplaceCategoriesScreenKt.a((MarketplaceCategoriesViewModel) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 5:
                ((Integer) obj2).getClass();
                int i6 = HowItWorksCardView.n;
                ((HowItWorksCardView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                HelpAndSupportScreenKt.c((OrderHelpDataList) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                HelpAndSupportScreenKt.b((OrderHelpContactTimes) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                OrderDetailsHelpScreenKt.b((OrderDetailsHelpViewModel) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 9:
                ((Integer) obj2).getClass();
                ApplicableDeliveryMethodScreenKt.d((DeliveryMethodsTooltip) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 10:
                ((Integer) obj2).getClass();
                LocationTrackingStatusItemKt.a((CurrentPickupLocationTrackingStatus) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                OrderHorizontalListItemKt.a((MyGroceriesProductListBadge) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 12:
                ((Integer) obj2).getClass();
                int i7 = TrafficDriverView.n;
                ((TrafficDriverView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 13:
                FullPageVideoPlayerActivity fullPageVideoPlayerActivity = (FullPageVideoPlayerActivity) obj3;
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                int i8 = FullPageVideoPlayerActivity.x;
                fullPageVideoPlayerActivity.N4().p6(jLongValue, jLongValue2, false);
                FullPageVideoPlayerViewModel fullPageVideoPlayerViewModelN4 = fullPageVideoPlayerActivity.N4();
                boolean z = jLongValue >= jLongValue2;
                Job job = fullPageVideoPlayerViewModelN4.j;
                if (job != null) {
                    ((JobSupport) job).cancel((CancellationException) null);
                }
                if (z) {
                    AnalyticsManager analyticsManager = fullPageVideoPlayerViewModelN4.e;
                    RecipeDetailsAnalytics.RecipeDetails.Action.Companion companion = RecipeDetailsAnalytics.RecipeDetails.Action.d;
                    VideoData videoData = fullPageVideoPlayerViewModelN4.i;
                    if (videoData == null) {
                        Intrinsics.p("videoData");
                        throw null;
                    }
                    final String id = videoData.getId();
                    if (id == null) {
                        id = "";
                    }
                    VideoData videoData2 = fullPageVideoPlayerViewModelN4.i;
                    if (videoData2 == null) {
                        Intrinsics.p("videoData");
                        throw null;
                    }
                    final String videoLength = videoData2.getDuration();
                    VideoData videoData3 = fullPageVideoPlayerViewModelN4.i;
                    if (videoData3 == null) {
                        Intrinsics.p("videoData");
                        throw null;
                    }
                    final String videoName = videoData3.getTitle();
                    companion.getClass();
                    Intrinsics.h(videoLength, "videoLength");
                    Intrinsics.h(videoName, "videoName");
                    analyticsManager.g(new Event(id, videoLength, videoName) { // from class: au.com.woolworths.analytics.supers.recipes.recipedetails.RecipeDetailsAnalytics$RecipeDetails$Action$Companion$videoComplete$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                            spreadBuilder.b(RecipeDetailsAnalytics.RecipeDetails.e);
                            spreadBuilder.a(new Pair("event.Category", "videos"));
                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                            spreadBuilder.a(new Pair("event.Label", "video complete"));
                            spreadBuilder.a(new Pair("video.ID", id));
                            a.z("video.Length", videoLength, spreadBuilder, "video.Name", videoName);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "videos_complete";
                        }

                        public final boolean equals(Object obj4) {
                            if (!(obj4 instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj4;
                            return "videos_complete".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                }
                if (jLongValue >= jLongValue2) {
                    jLongValue = 0;
                }
                fullPageVideoPlayerActivity.O4(jLongValue, null);
                return unit;
            case 14:
                ((Integer) obj2).getClass();
                ListItemsSeenEffectKt.b((ListItemsTrackerState) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 15:
                ((Integer) obj2).getClass();
                ListItemsSeenEffectKt.a((ItemsSeenState) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 16:
                ((Integer) obj2).getClass();
                RewardsInfoBannerUiKt.a((RewardsInfoBannerData.IconSpecs) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                RewardsOfferTileKt.g((OfferProgressTracker) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                PermissionDescContentKt.a((DescItem) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 19:
                CoreTypographyTokens coreTypographyTokens = (CoreTypographyTokens) obj3;
                int iIntValue = ((Integer) obj).intValue();
                TextStyle textStyle = (TextStyle) obj2;
                Intrinsics.h(textStyle, "textStyle");
                return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? coreTypographyTokens.f5120a.c.c : coreTypographyTokens.e.b.b : coreTypographyTokens.e.f5133a.b : coreTypographyTokens.d.c.f5132a : coreTypographyTokens.d.b.f5131a : coreTypographyTokens.d.f5129a.f5130a : coreTypographyTokens.d.f5129a.c;
            case 20:
                ((Integer) obj2).getClass();
                int i9 = ProductLocationInfoView.q;
                ((ProductLocationInfoView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 21:
                ((Integer) obj2).getClass();
                AppModalBulletItemUiKt.a((FeatureInfoBulletItem) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                ContentCardKt.b((ContentCardFooter) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 23:
                ((Integer) obj2).getClass();
                int i10 = BuyAgainFooterView.n;
                ((BuyAgainFooterView) obj3).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 24:
                ProductReviewAlternativeFragment productReviewAlternativeFragment = (ProductReviewAlternativeFragment) obj3;
                Bundle bundle = (Bundle) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(bundle, "bundle");
                if (Intrinsics.c(bundle.getString("requestSuccessBundleKey"), "ADD")) {
                    ProductReviewAlternativeViewModel productReviewAlternativeViewModelI1 = productReviewAlternativeFragment.I1();
                    productReviewAlternativeViewModelI1.g.f10527a.setValue(Boolean.TRUE);
                    productReviewAlternativeViewModelI1.j.k(ProductReviewAlternativeContract.Actions.NavigateBack.f10504a);
                }
                return unit;
            case 25:
                ProductReviewFragment productReviewFragment = (ProductReviewFragment) obj3;
                Bundle bundle2 = (Bundle) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(bundle2, "bundle");
                if (Intrinsics.c(bundle2.getString("requestSuccessBundleKey"), "REMOVE")) {
                    productReviewFragment.Q1(R.string.cart_product_removed_message);
                }
                ProductReviewViewModel productReviewViewModelI1 = productReviewFragment.I1();
                Timber.Forest forest = ProductReviewViewModel.q;
                productReviewViewModelI1.p6(false);
                return unit;
            case 26:
                ((Integer) obj2).getClass();
                ((CheckoutDetailsFragment) obj3).E1((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 27:
                String productId = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                Intrinsics.h(productId, "productId");
                SubstitutionViewModel substitutionViewModelN4 = ((SubstitutionActivity) obj3).N4();
                MutableStateFlow mutableStateFlow = substitutionViewModelN4.j;
                do {
                    value = mutableStateFlow.getValue();
                    objA = (SubstitutionContract.ViewState) value;
                    if (objA instanceof SubstitutionContract.ViewState.Content) {
                        SubstitutionContract.ViewState.Content content = (SubstitutionContract.ViewState.Content) objA;
                        LinkedHashMap linkedHashMapS = MapsKt.s(content.d);
                        linkedHashMapS.put(productId, bool);
                        objA = SubstitutionContract.ViewState.Content.a(content, null, substitutionViewModelN4.s6(content, content.b, linkedHashMapS), linkedHashMapS, false, 19);
                    }
                } while (!mutableStateFlow.d(value, objA));
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                TimeSelectorFooterKt.b((FulfilmentWindowSlotSelectionInfo) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            default:
                ((Integer) obj2).getClass();
                SuggestedListScreenKt.a((SuggestedListsViewModel) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
        }
    }

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
