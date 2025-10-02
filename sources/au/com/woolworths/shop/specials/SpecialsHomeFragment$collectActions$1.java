package au.com.woolworths.shop.specials;

import android.content.Context;
import android.content.Intent;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.home.model.Validity;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCardType;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SpecialsHomeFragment$collectActions$1 extends AdaptedFunctionReference implements Function2<SpecialsHomeContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
        SpecialsHomeContract.Action action = (SpecialsHomeContract.Action) obj;
        SpecialsHomeFragment specialsHomeFragment = (SpecialsHomeFragment) this.d;
        specialsHomeFragment.getClass();
        if (action instanceof SpecialsHomeContract.Action.LaunchDeepLink) {
            specialsHomeFragment.startActivity(ShopAppDeepLink.b(((SpecialsHomeContract.Action.LaunchDeepLink) action).f12929a, SpecialsAnalytics.Home.d));
        } else if (action instanceof SpecialsHomeContract.Action.LaunchCatalogueHome) {
            specialsHomeFragment.startActivity(ActivityNavigatorKt.a(Activities.CatalogueHome.f4455a, ApplicationType.e));
        } else if (action instanceof SpecialsHomeContract.Action.LaunchCatalogueDetails) {
            CatalogueCard catalogueCard = ((SpecialsHomeContract.Action.LaunchCatalogueDetails) action).f12927a;
            String id = catalogueCard.getId();
            if (id == null) {
                id = "";
            }
            CatalogueTracking catalogueTracking = new CatalogueTracking(id, catalogueCard.d == CatalogueCardType.e ? Validity.e : Validity.d, catalogueCard.f10140a, "", "", "", "", "");
            int i = CatalogueDetailsActivity.B;
            Context contextRequireContext = specialsHomeFragment.requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            String id2 = catalogueCard.getId();
            CatalogueDetailsActivity.Companion.a(contextRequireContext, new CatalogueDetailsActivity.Extra(catalogueTracking, id2 != null ? id2 : ""));
        } else if (action instanceof SpecialsHomeContract.Action.LaunchProductDetails) {
            String productId = ((SpecialsHomeContract.Action.LaunchProductDetails) action).f12930a.getProductId();
            ShopAppNavigator shopAppNavigator = specialsHomeFragment.k;
            if (shopAppNavigator == null) {
                Intrinsics.p("shopAppNavigator");
                throw null;
            }
            shopAppNavigator.d(productId);
        } else if (action instanceof SpecialsHomeContract.Action.LaunchCartBottomSheet) {
            ProductCard productCard = ((SpecialsHomeContract.Action.LaunchCartBottomSheet) action).f12926a;
            SpecialsAnalytics.Home home = SpecialsAnalytics.Home.d;
            AddToCartBottomSheetFragment.Companion.b(specialsHomeFragment.getParentFragmentManager(), productCard, new Screen() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$toHostScreen$1
                public final String d;

                /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
                {
                    SpecialsAnalytics.Home home2 = SpecialsAnalytics.Home.d;
                    this.d = String.valueOf(SpecialsAnalytics.Home.e.get("app.Section"));
                }

                @Override // au.com.woolworths.android.onesite.analytics.Screen
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.d;
                }

                @Override // au.com.woolworths.android.onesite.analytics.Screen
                /* renamed from: b */
                public final String getF() {
                    SpecialsAnalytics.Home home2 = SpecialsAnalytics.Home.d;
                    return "specials_screen";
                }

                @Override // au.com.woolworths.android.onesite.analytics.Screen
                /* renamed from: d */
                public final String getD() {
                    return "Specials Screen";
                }
            });
        } else {
            if (action instanceof SpecialsHomeContract.Action.LaunchAddToListBottomSheet) {
                ProductCard productCard2 = ((SpecialsHomeContract.Action.LaunchAddToListBottomSheet) action).f12925a;
                SpecialsAnalytics.Home home2 = SpecialsAnalytics.Home.d;
                AddToListBottomSheetFragment.Companion.a(specialsHomeFragment.getParentFragmentManager(), null, new Screen() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$toHostScreen$1
                    public final String d;

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
                    {
                        SpecialsAnalytics.Home home22 = SpecialsAnalytics.Home.d;
                        this.d = String.valueOf(SpecialsAnalytics.Home.e.get("app.Section"));
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: a, reason: from getter */
                    public final String getD() {
                        return this.d;
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: b */
                    public final String getF() {
                        SpecialsAnalytics.Home home22 = SpecialsAnalytics.Home.d;
                        return "specials_screen";
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: d */
                    public final String getD() {
                        return "Specials Screen";
                    }
                }, CollectionsKt.Q(new AddToListProductParameters(productCard2, (String) null, (Float) null, productCard2.getProductVarieties() != null, 14)), null, new ProductInfoViewFactory(productCard2), true, null, null, 914);
            } else if (action instanceof SpecialsHomeContract.Action.LaunchViewList) {
                specialsHomeFragment.startActivity(Activities.ShoppingListDetails.f4535a.b(((SpecialsHomeContract.Action.LaunchViewList) action).f12933a, false));
            } else if (action instanceof SpecialsHomeContract.Action.LaunchWatchlistGuestOnboardingScreen) {
                specialsHomeFragment.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
            } else if (action instanceof SpecialsHomeContract.Action.LaunchPromotionDetails) {
                SpecialsHomeContract.Action.LaunchPromotionDetails launchPromotionDetails = (SpecialsHomeContract.Action.LaunchPromotionDetails) action;
                PromotionCard promotionCard = launchPromotionDetails.f12932a;
                String str = launchPromotionDetails.b;
                String productId2 = promotionCard.getProductCard().getProductId();
                String offerId = promotionCard.getOfferId();
                String source = promotionCard.getProductCard().getSource();
                Intent intentA = ActivityNavigatorKt.a(Activities.CataloguePromotionDetails.f4456a, ApplicationType.e);
                intentA.putExtra("extra_promotion_details", new Activities.CataloguePromotionDetails.Extra(productId2, offerId, source, str));
                specialsHomeFragment.startActivity(intentA);
            } else if (action instanceof SpecialsHomeContract.Action.OpenOliveChat) {
                specialsHomeFragment.startActivity(Activities.AskOliveActivity.b(4, null, ((SpecialsHomeContract.Action.OpenOliveChat) action).f12935a, null));
            } else {
                if (!(action instanceof SpecialsHomeContract.Action.LaunchProductOnMap)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductCard productCard3 = ((SpecialsHomeContract.Action.LaunchProductOnMap) action).f12931a;
                ShopAppNavigator shopAppNavigator2 = specialsHomeFragment.k;
                if (shopAppNavigator2 == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator2.c(productCard3);
            }
        }
        return Unit.f24250a;
    }
}
